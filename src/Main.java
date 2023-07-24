public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 рублей;");
        System.out.println("Срок кредитования: 12 месяцев;");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate(9.99, 12, 1_000_000) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 рублей;");
        System.out.println("Срок кредитования: 12 месяцев;");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate(9.99, 24, 1_000_000) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 рублей;");
        System.out.println("Срок кредитования: 12 месяцев;");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate(9.99, 36, 1_000_000) + " рублей");


    }
}
