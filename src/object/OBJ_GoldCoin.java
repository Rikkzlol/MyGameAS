package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_GoldCoin extends SuperObject{

    public OBJ_GoldCoin(){

        name = "GoldCoin";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/gold_coin.png"));

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
