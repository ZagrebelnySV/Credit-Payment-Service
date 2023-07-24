public class CreditPaymentService {
    public double calculate(double rate, int loanTerm, int loanAmount) {
        double monthRate = rate / 1200;
        double monthPayment = loanAmount * ((monthRate * Math.pow((1 + monthRate), loanTerm)) / (Math.pow((1 + monthRate), loanTerm) - 1));
        return monthPayment;
    }
}
