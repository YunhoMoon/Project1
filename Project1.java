public class Project1 {
    public static void main(String[] args){

        int[] numsArray = new int[9];

        System.out.println("[구구단 출력]");
        for (int i = 1; i <= numsArray.length; i++) {
            for (int j = 1; j <= numsArray.length; j++) {
                System.out.print(String.format("%02d X %02d " + " = " + "%02d" + "  ", j, i, i * j));
            }
            System.out.println();
        }
    }
}
