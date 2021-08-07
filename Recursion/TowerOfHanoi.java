public class TowerOfHanoi {
    static void toh(int disk, char from_rod, char to_rod, char aux_rod) {
        if (disk == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to  rod " + to_rod);
            return;
        }
        toh(disk-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + disk + " from rod " + from_rod + " to  rod " + to_rod);
        toh(disk-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        int disk = 2;
        toh(disk, 'A', 'C', 'B');
    }
}
