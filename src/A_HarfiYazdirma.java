public class A_HarfiYazdirma {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];
        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j< letter[i].length; j++){
                if (i == 0 || i ==2){
                    letter[i][j]= " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] ="   ";
                }
            }
        }
        System.out.println("===== Yıldızlarla A Harfi Yazdırma =====");
        System.out.println("________________________________________");
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
