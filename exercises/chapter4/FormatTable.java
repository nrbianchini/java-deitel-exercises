package exercises.chapter4;

public class FormatTable {

        public static void main(String[] args) {

            /* para formatar em tabelas usa-se o específicador da
              variável e o número de espaços que deseja obter. */

            System.out.printf("%s%10s %10s %10s %n", "N", "10*N", "100*N", "1000*N");

            for (int n = 1; n <= 5; ++n) {
                System.out.printf("%d %9d %10d %10d%n", n, n * 10, n * 100, n * 1000);
            }
        }
    }

