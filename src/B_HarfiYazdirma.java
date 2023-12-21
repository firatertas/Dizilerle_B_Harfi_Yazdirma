public class B_HarfiYazdirma {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        // i = 0 ve i = 3 ve i= 5 --> *
        // j = 0 ve j = 4 --> *

        /*
        [i][j] [i][j] [i][j] [i][j]

        [0][0] [0][1] [0][2] [0][3]
        [1][0]               [1][3]
        [2][0]               [2][3]
        [3][0] [3][1] [3][2]
        [4][0]               [4][3]
        [5][0]               [5][3]
        [6][0] [6][1] [6][2] [6][3]
         */


        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if(i == 0 || i == 3 || i == 6){
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] =" * ";
                }else {
                    letter[i][j] ="    ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}
