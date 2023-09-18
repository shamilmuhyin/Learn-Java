package Problems;

public class patternnumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1;j<i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=3;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
