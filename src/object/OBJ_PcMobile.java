package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_PcMobile extends SuperObject{

    public OBJ_PcMobile(){

        name = "PcMobile";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/pc_mobile.png"));

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
