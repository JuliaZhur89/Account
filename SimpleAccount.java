public class SimpleAccount extends Account {
    public SimpleAccount (long sum){
        super(sum);
    }
    @Override
    boolean add(long amount) {
        if (sum + amount >= 0) {
            sum += amount;
            return true;

        } else {
            return false;

        }

    }

    @Override
    boolean pay(long amount) {
        if (sum - amount >= 0) {
            sum -= amount;
            return true;
        } else {
            return false;
        }
    }



    @Override
    boolean transfer(Account account, long amount){

        if(sum >= 0 && account.sum>=0){
            sum-=amount;
            account.sum+=amount;
            return true;
        } else if (sum >= 0 && account.sum < 0){
            sum-=amount;
            account.sum+=amount;
            return true;
        }  else
            return false;
        }
    }


