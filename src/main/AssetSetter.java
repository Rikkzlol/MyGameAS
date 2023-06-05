package main;

import object.*;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 38 * gp.tileSize;
        gp.obj[2].worldY = 8 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 10 * gp.tileSize;
        gp.obj[3].worldY = 11 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 8 * gp.tileSize;
        gp.obj[4].worldY = 28 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 12 * gp.tileSize;
        gp.obj[5].worldY = 22 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 10 * gp.tileSize;
        gp.obj[6].worldY = 7 * gp.tileSize;

        gp.obj[7] = new OBJ_GoldCoin();
        gp.obj[7].worldX = 21 * gp.tileSize;
        gp.obj[7].worldY = 8 * gp.tileSize;

        gp.obj[8] = new OBJ_GoldCoin();
        gp.obj[8].worldX = 22 * gp.tileSize;
        gp.obj[8].worldY = 9 * gp.tileSize;

        gp.obj[9] = new OBJ_GoldCoin();
        gp.obj[9].worldX = 22 * gp.tileSize;
        gp.obj[9].worldY = 8 * gp.tileSize;

        gp.obj[10] = new OBJ_PcMobile();
        gp.obj[10].worldX = 9 * gp.tileSize;
        gp.obj[10].worldY = 8 * gp.tileSize;

        gp.obj[11] = new OBJ_Boots();
        gp.obj[11].worldX = 37 * gp.tileSize;
        gp.obj[11].worldY = 42 * gp.tileSize;
    }
}
