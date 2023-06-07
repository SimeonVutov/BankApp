package Loans;

public class Loan extends PlannedPayment {
    public LoanType _type;
    
    public Loan(LoanType type, LocalDate paymentDate, String bankAccountIban,BigDecimal money, String name) {
        super(paymentDate, bankAccountIban, money, name);
        _type = type;
    }
}