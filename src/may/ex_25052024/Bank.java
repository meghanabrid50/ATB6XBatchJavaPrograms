package may.ex_25052024;

public class Bank {
    private String currency;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public Integer add(Bank bankName) throws Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency does not match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}
