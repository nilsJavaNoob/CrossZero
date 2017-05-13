package testL;
/**
 * Created by n on 06.05.17.
 */
public class Game {
    TField tField;
    TUser tUser;
    Point point;
     public void init(){
        tField = new TField();//will create enum and init enum with NONE values
         tField.show();
         //==============
        tUser = new TUser();
    }

    public void start(){
        while(true){
            //get users move
              point = tUser.getMove();
            //place user's shoot in field
            //tField.place(point,)
            //get comp's move
            //place comp's shoot in field
            // if anybodyWin? -- break
        }
    }
}//game
