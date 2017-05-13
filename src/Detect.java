/*
 */
public class Detect {



    public static void main(String[] args) {

        int  row = 50, column = 50;

        int[][] place = new int[row][column];
        int[][] template = {{0,0,0,0,0}, {0,0,1,0,0}, {0,1,1,1,0}, {0,0,1,0,0}, {0,0,0,0,0}};
        int[][] placeBuffer = new int[row][column];

        //записываем случайно начальные значения
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                place[i][j] =  Math.random() >= 0.5 ? 1 : 0;

            }

        }


        System.out.println("Эталонное изображение:");
        for (int i = 0; i < template.length; i++) {
            for (int j = 0; j < template[i].length; j++) {
                System.out.print(template[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Исходное изображение:");
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[j].length; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();

        }


        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if(place[i][j] == 1){

                }


            }

        }




    }

}
