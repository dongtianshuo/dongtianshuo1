public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("CPU种类:"+cpu.getName());
        System.out.println("硬盘容量:"+HD.getAmount());
        System.out.println("内存:"+HD.getNa());
    }
}
