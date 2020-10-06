import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2.4);
        cpu.setName("intel");

        HardDisk HD = new HardDisk(512);
        HD.setNa(16);

        PC pc = new PC(HD);
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();

    }
}