/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*                                                                      SCRIPT DE CRIAÇÃO DAS TABELA DA BASE DE DADOS LIGA DE FUTEBOL                                                                                   */
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
Use [Curso]

print 'Criação das tabelas com suas restrições'

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela patrocinadores'

create table patrocinadores( 
     cod_pat    int           not null  check( cod_pat>0 ),
     nom_pat    varchar(40)  not null,
     pais       varchar(30)  not null,
     constraint patrocinadores_pk primary key( cod_pat ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela times'

create table times( 
     cod_time   int           not null  check( cod_time>0 ),
     uf_time    char(2)       not null  check( uf_time in( 'PR','SC','RS','SP','RJ','MG','ES',
                                                           'MT','MS','GO','DF','BA','SE','AL',
                                                           'PE','RN','PB','CE','MA','PI','PA',
                                                           'TO','AM','AC','RR','RO' ) ),
     nom_time   varchar(40)  not null,
     constraint times_pk primary key( cod_time ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela patrocinios'

create table patrocinios( 
     ano        int          not null  check( ano>1972 ),
     cod_time   int          not null  check( cod_time>0 ),
     cod_pat    int          not null  check( cod_pat>0 ),
     valor      numeric(9,2) not null  check( valor>0 ),
     constraint patrocinios_pk primary key( ano, cod_time, cod_pat ),
     constraint patrocinios_fk_times foreign key( cod_time )
                                     references times( cod_time ),
     constraint patrocinios_fk_patrocinadores foreign key( cod_pat )
                                              references patrocinadores( cod_pat ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela campeonatos'

create table campeonatos( 
     cod_camp   int           not null  check( cod_camp>0 ),
     dsc_camp   varchar(40)   not null,
     ano        int           not null  check( ano>1972 ),
     tipo       char(1)       not null  check( tipo in( 'E','N','R' ) ),
     dat_ini    smalldatetime not null,
     dat_fim    smalldatetime not null,
     def_tipo   char(2),
     constraint campeonatos_pk primary key( cod_camp ),
     constraint campeonatos_ck_datas check( dat_ini < dat_fim ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela participacoes'

create table participacoes( 
     cod_camp   int   not null  check( cod_camp>0 ),
     cod_time   int   not null  check( cod_time>0 ),
     pontos     int   not null  check( pontos>=0 ),
     classif    int   not null  check( classif>=0 ),
     constraint participacoes_pk primary key( cod_camp, cod_time ),
     constraint participacoes_fk_times foreign key( cod_time )
                                       references times( cod_time ),
     constraint participacoes_fk_campeonatos foreign key( cod_camp )
                                             references campeonatos( cod_camp ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela posicoes'

create table posicoes( 
     cod_pos   int          not null  check( cod_pos>0 ),
     dsc_pos   varchar(40)  not null,
     constraint posicoes_pk primary key( cod_pos ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela jogadores'

create table jogadores( 
     cod_jog    int            not null  check( cod_jog>0 ),
     dat_nasc   smalldatetime  not null,
     salario    numeric(8,2)   not null  check( salario>=0 ),
     cod_pos    int            not null,
     nom_jog    varchar(40)    not null,
     cod_time   int                      check( cod_time>0 ),
     constraint jogadores_pk primary key( cod_jog ),
     constraint jogadores_fk_times foreign key( cod_time )
                                   references times( cod_time ),
     constraint jogadores_fk_posicoes foreign key( cod_pos )
                                      references posicoes( cod_pos ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela historicos'

create table historicos( 
     cod_jog    int              not null  check( cod_jog>0 ),
     dat_ini    smalldatetime    not null,
     cod_time   int              not null  check( cod_time>0 ),
     dat_fim    smalldatetime,
     constraint historicos_pk primary key( cod_jog, dat_ini ),
     constraint historicos_fk_times foreign key( cod_time )
                                    references times( cod_time ),
     constraint historicos_fk_jogadores foreign key( cod_jog )
                                        references jogadores( cod_jog ) );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação da tabela jogos'

create table jogos( 
     cod_camp    int             not null  check( cod_camp>0 ),
     cod_time1   int             not null  check( cod_time1>0 ),
     cod_time2   int             not null  check( cod_time2>0 ),
     data        smalldatetime   not null,
     resultado   int                       check( resultado in( 0, 1, 2 ) ),
     constraint jogos_pk primary key( cod_camp, cod_time1, cod_time2 ),
     constraint jogos_fk_times_1 foreign key( cod_time1 )
                                      references times( cod_time ),
     constraint jogos_fk_times_2 foreign key( cod_time2 )
                                      references times( cod_time ),
     constraint jogos_fk_campeonatos foreign key( cod_camp )
                                     references campeonatos( cod_camp ) );


/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*                                                                      SCRIPT DE CRIAÇÃO DOS ÍNDICES DAS TABELA DA BASE DE DADOS LIGA DE FUTEBOL                                                                                                        */
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

print 'Criação dos índices para as tabelas'

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela patrocinadores'

create index patrocinadores_idx_nome on patrocinadores( nom_pat );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela times'

create index times_idx_nome on times( nom_time );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de patrcinios'

create index patrocinios_idx_cod_pat on patrocinios( cod_pat );

create index patrocinios_idx_cod_time on patrocinios( cod_time );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de campeonatos'

create index campeonatos_idx_dsc_camp on campeonatos( dsc_camp );

create index campeonatos_idx_ano on campeonatos( ano );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de participacoes'

create index participacoes_idx_cod_time on participacoes( cod_time );

create index participacoes_idx_ano on participacoes( cod_camp );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de jogadores'

create index jogadores_idx_cod_time on jogadores( cod_time );

create index jogadores_idx_nom_jog on jogadores( nom_jog );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de jogadores'

create index historicos_idx_cod_time on historicos( cod_time );

create index historicos_idx_cod_jog on historicos( cod_jog );

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
print 'Criação dos índices para a tabela de jogos'

create index jogos_idx_cod_time1 on jogos( cod_time1 );

create index jogos_idx_cod_time2 on jogos( cod_time2 );

create index campeonatos_idx_cod_camp on jogos( cod_camp );

create index campeonatos_idx_data on jogos( cod_camp, data );
