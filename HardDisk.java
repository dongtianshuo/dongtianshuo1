public class HardDisk {
    private int amount;
    private double na;

    HardDisk(int amount){
        setAmount(amount);
    }

    HardDisk(double na){
        setNa(na);
    }

    public int getAmount() {
        return amount;
    }


    public double getNa() {
        return na;
    }

    public void setAmount(int amount) {
        if (amount >= 256 && amount <= 1024) {
            this.amount = amount;
        }else{
            System.out.println("输入错误");
        }
    }
    public void setNa(double na) {
        if (na >=8 && na <= 32) {
            this.na = na;
        }else{
            System.out.println("输入错误");
        }
    }

}