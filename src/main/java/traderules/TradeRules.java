package traderules;

public class TradeRules {
    private double amount;
    private int quantity;
    private String type;
    private String ticker;

    public TradeRules(String ticker, int quantity, double amount, String type) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.amount = amount;
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
    
    public String getTicker() {
        return ticker;
    }

    public int getQuantity() {
        return quantity;
    }
}
