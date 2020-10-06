public class CPU {
    private double speed;
    private String name;
    CPU(double speed){

        setSpeed(speed);
    }
    CPU(String name){
        setName(name);
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(double speed) {
        if (speed >= 1.8 && speed <= 3.4) {
            this.speed = speed;
        }else{
            System.out.println("输入错误");
        }
    }
    public void setName(String name) {
        if (name =="AMD" || name =="intel") {
            this.name = name;
        }else{
            System.out.println("输入错误");
        }
    }
}

