package testL;

/**
 * Created by n on 06.05.17.
 */
public class TField {
    int SIZE = 3;
    enum A { X,O,NONE; }//inner class -enum
    A[][] sells;

    public TField() {
        System.out.println(" - Init table with enums");
        sells = new A[SIZE][SIZE];
        for(int i=0; i<SIZE;i++){
            for(int j =0; j<SIZE; j++){
                sells[i][j] = A.NONE;
            }
        }
        System.out.println(" - Ready");
        System.out.println(" - Show field");

    }//constr
public void show(){
    for(int i=0; i<SIZE;i++){
        for(int j =0; j<SIZE; j++){
            System.out.print(sells[i][j]+ " ");
        }
        System.out.println();
    }

}


}
