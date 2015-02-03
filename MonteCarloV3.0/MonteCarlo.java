import java.io.*;
import java.util.*;

/**
 *MonteCarlo project to have a rando raindrop in a circle within a rectangle
 * 
 */
public class MonteCarlo
{
    public double h,k,r;
    private Random rndm = new Random();
    /**@param r= radius of circle
     * @param k= half of length of rectangle
     * @param h= half of width of rectangle
     */
    public MonteCarlo( double h, double k, double r){
        this.h=h;
        this.k=k;
        this.r=r;
    }
    /**
     * predicts the x-coordinate of a random raindrop
     */
    public double nextRainDrop_x(){
        double x = (rndm.nextDouble()*2*r)+(h-r);

        return x;
    }

    /**
     * predicts the y-coordinate of a randoom raindrop
     */public double nextRainDrop_y(){
        double y = (rndm.nextDouble()*2*r)+(k-r);
        return y;
    }
    int cirCount=0;
    int sqrCount=0;
    /**
     * checks to see if a point is in or on the circle
     * @param x = x-coordinate
     * @param y = y-coordinate
     */public boolean insideCircle(double x, double y){
        double w= (Math.pow((x-h),2))+(Math.pow((y-k),2));
        Math.pow(w,2);
        if(w<=Math.pow(r,2)){
            
            return true;
        }else{

            return false;
        }

    }
}
