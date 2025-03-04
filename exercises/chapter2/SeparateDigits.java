package exercises.chapter2;

public class SeparateDigits {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a integer w/ 5 digits: ");
        int num = 51667;
        int un, dezMilhar, milhar, cent, dez;

        // divide para encontrar a dezena de milhar
        dezMilhar = num / 10000;

        // remove o primeiro digito e divide pra encontrar o milhar
        milhar = (num % 10000) / 1000;

        // remove os dois primeiros digitos e divide pra encontrar a centena
        cent = (num % 1000) / 100;

        // remove os três primeiros digitos e divide pra encontrar a dezena
        dez = (num % 100) / 10;

        // remove os quatro primeiros digitos
        un = (num % 10);

        System.out.printf("%d   %d   %d   %d   %d", dezMilhar, milhar, cent, dez, un);
    }
}
