package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    // Screen settings
    final int originalTileSize = 16;
    final int scale = 3;

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12; //разрешение 4 на 3
    final int screenWeight = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;



    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWeight, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);


    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {


        
    }
}
