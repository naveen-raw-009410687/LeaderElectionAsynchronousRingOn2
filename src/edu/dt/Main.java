package edu.dt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tphadke on 8/29/17.
 */
public class Main {
    Map <Processor, List<Processor> > graph ;

    public  Main(){

        init();

    }

    public static void main ( String args[]){
        Main m = new Main();

        //TODO: Choose a processor as a Root
        //TODO: Send an initial message Message.M to this processor.



    }

    public void init(){
        Processor p0 = new Processor();
        p0.id = 0;
        Processor p1 = new Processor();
        p1.id = 1;
        Processor p2 = new Processor();
        p2.id = 2;
        Processor p3 = new Processor();
        p3.id = 3;
        Processor p4 = new Processor();
        p4.id = 4;
        Processor p5 = new Processor();
        p5.id = 5;

        List<Processor> p0neighbors = new ArrayList<Processor>();
        p0neighbors.add(p1);
        p0neighbors.add(p2);
        p0neighbors.add(p3);

        List<Processor> p1neighbors = new ArrayList<Processor>();
        p1neighbors.add(p2);
        p1neighbors.add(p4);
        p1neighbors.add(p0);

        List<Processor> p2neighbors = new ArrayList<Processor>();
        p2neighbors.add(p5);
        p2neighbors.add(p0);
        p2neighbors.add(p1);

        List<Processor> p3neighbors = new ArrayList<Processor>();
        p3neighbors.add(p0);

        List<Processor> p4neighbors = new ArrayList<Processor>();
        p4neighbors.add(p1);
        p4neighbors.add(p5);

        List<Processor> p5neighbors = new ArrayList<Processor>();
        p5neighbors.add(p4);
        p5neighbors.add(p2);
        
        p0.unexplored = p0neighbors;
        p1.unexplored = p1neighbors;
        p2.unexplored = p2neighbors;
        p3.unexplored = p3neighbors;
        p4.unexplored = p4neighbors;
        p5.unexplored = p5neighbors;
        
        
        p0.sendMessgeToMyBuffer(Message.M,p0);

        graph = new HashMap<>();

        graph.put(p0, p0neighbors);
        graph.put(p1, p1neighbors);
        graph.put(p2, p2neighbors);
        graph.put(p3, p3neighbors);
        graph.put(p4, p4neighbors);
        graph.put(p5, p5neighbors);

    }
}
