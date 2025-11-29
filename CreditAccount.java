public class CreditAccount extends Account{
    long creditLimit;
    public CreditAccount(long sum,long creditLimit){
        super(sum);
        this.creditLimit = creditLimit;
    }


    @Override
    boolean add(long amount) {

        if (sum < 0) {
            sum += amount;
            return true;
        } else {
            return false;
        }
    }
    @Override
    boolean pay(long amount) {

        if (sum > creditLimit) {
            sum -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount){

        if(sum < 0 && sum > creditLimit){
            sum-=amount;
            account.sum+=amount;
            return true;
        }  else
            return false;
    }
}