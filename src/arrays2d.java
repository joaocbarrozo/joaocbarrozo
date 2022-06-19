import java.util.Random;

public class arrays2d {
    public static void main(String[] args) {
        
        //fill with sequences

        double[][] m = new double[5][5];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = i + j;
            }
        }
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //fill with random ints

        int[][] v = new int[6][6];
        Random r = new Random();
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v[i].length; j++){
                v[i][j] = r.nextInt(100);
            }
        }
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v[i].length; j++){
                System.out.printf("%3d",v[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // find max
        int max = v[0][0];
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v[i].length; j++){
                if (v[i][j] > max){
                    max = v[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
