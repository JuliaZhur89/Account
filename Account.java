public abstract class Account {
    long sum = 0;
    long amount = this.amount;

    public Account (long sum){
        this.sum = sum;
    }

    abstract boolean add(long amount);

    abstract boolean pay(long amount);

    abstract boolean transfer(Account account, long amount);

    public long getBalance(){
        return sum;
    }

}



