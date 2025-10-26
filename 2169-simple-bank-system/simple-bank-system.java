class Bank {
    private long [] bank;

    public Bank(long[] balance) {
        this.bank = balance;
        
    }
    private boolean check(int n){
        return (n>0 && n<=bank.length)?true: false;
    }
    
    public boolean transfer(int a1, int a2, long money) {
        if(!check(a1) || !check(a2)) return false;
        if(bank[a1-1]>=money){
            bank[a1-1]-=money;
            bank[a2-1]+=money;
            return true;
        }
        return false;
        
    }
    
    public boolean deposit(int account, long money) {
        if(!check(account)) return false;
        bank[account-1]+=money;
        return true;
        
    }
    
    public boolean withdraw(int account, long money) {
        if(!check(account)) return false;
        if(bank[account-1]>=money){
            bank[account-1]-=money;
            return true;
        }
        return false;
        
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */