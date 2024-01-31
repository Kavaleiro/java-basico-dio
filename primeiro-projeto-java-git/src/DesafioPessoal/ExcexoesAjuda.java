package DesafioPessoal;

public class ExcexoesAjuda {
    
    private Integer number;//
    private String holder;//titular da conta
    private Double balance;//saldo
    private Double whithdrawLimit;//Limite de saque

    public void Account() {
        /*um consultor */
    }
    public void Account(Integer number, String holder, Double balance, Double whithdrowLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.whithdrawLimit = whithdrowLimit;
    }

    public Integer getNumber(){
        return number;
    }
    public void setNumber(Integer number){
        this.number = number;
    }

    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }

    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public Double getWithdrawLimit(){
        return whithdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit){
        this.whithdrawLimit = whithdrawLimit;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount) {
    balance -= amount;
    }    




}
