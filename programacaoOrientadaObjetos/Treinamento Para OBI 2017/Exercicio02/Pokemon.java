import java.util.*;

public class Pokemon {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, x, z, y;
		int doces = 0;
		int aux;
		do {
			n = read.nextInt();
		} while (n < 0 || n > 1000);
		do {
			x = read.nextInt();
		} while (x < 0 || x > 1000);
		do {
			z = read.nextInt();
		} while (z < 0 || z > 1000);
		do {
			y = read.nextInt();
		} while (y < 0 || y > 1000);
		if ((x < z) && (x < y)) {
			if (x <= n) {
				doces++;
				n = n - x;
			}
			if (z < y) {
				if (z <= n) {
					doces++;
					n = n - z;
				}
				if (y <= n) {
					doces++;
					n = n - y;
				}
			} else {
				if (y <= n) {
					doces++;
					n = n - y;
				}
				if (z <= n) {
					doces++;
					n = n - z;
				}
			}
		}
		if ((z < x) && (z < y)) {
			if (z <= n) {
				doces++;
				n = n - z;
			}
			if (x < y) {
				if (x <= n) {
					doces++;
					n = n - x;
				}
				if (y <= n) {
					doces++;
					n = n - y;
				}
			} else {
				if (y <= n) {
					doces++;
					n = n - y;
				}
				if (x <= n) {
					doces++;
					n = n - x;
				}
			}
		}
		if ((y < x) && (y < z)) {
			if (y <= n) {
				doces++;
				n = n - y;
			}
			if (x < z) {
				if (x <= n) {
					doces++;
					n = n - x;
				}
				if (z <= n) {
					doces++;
					n = n - z;
				}
			} else {
				if (z <= n) {
					doces++;
					n = n - z;
				}
				if (x <= n) {
					doces++;
					n = n - x;
				}
			}
		}
		System.out.println(doces);
	}
}