package yazlab2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Elevator implements Runnable {
    
    public int Active = 0;
    public int Floor = 0;
    public int Destination = 0; // hedef
    public int Direction = 0;   //yön
    public int CountInside = 0; //içindeki insan sayısı
    public int[][] ElevatorMatris = new int[10][2];
    
    static ArrayList<Integer> Asansor1 = new ArrayList<Integer>();
    static ArrayList<Integer> Asansor2 = new ArrayList<Integer>();
    
    @Override
    public synchronized void run() {
        
        int toplam = 0;
        while (true) {
            
            System.out.println("Sunlar asansore alındı  ... ");
            
            for (int i = 0; Yazlab2.GroundFloor1.get(i) != null; i++) {
                toplam += Yazlab2.GroundFloor1.get(i);
                if (toplam < 20) {
                    
                    
                    //Asansor1.set(i, Yazlab2.GroundFloor1.get(i));
                    //Asansor2.set(i, Yazlab2.Groundfloor2.get(i));
                    
                    Yazlab2.GroundFloor1.remove(i);
                    Yazlab2.Groundfloor2.remove(i);
                }
            }
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }
    
    public Elevator() {
        
        System.out.println(" constructer in içinde");
        
    }
    
}
