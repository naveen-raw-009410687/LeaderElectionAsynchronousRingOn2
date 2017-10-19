package edu.dt;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tphadke on 8/29/17.
 */
public class Main {


    /**
     * asks user for selecting a root value to initiate the program
     * @param args
     */
    public static void main ( String args[]){
        Processor p0 = new Processor(0);
        Processor p1 = new Processor(85);
        Processor p2 = new Processor(72);
        Processor p3 = new Processor(99);
        Processor p4 = new Processor(60);


    }


}

class Executor implements Runnable
{
    Processor p;

    public Executor(Processor p)
    {
        this.p = p;
    }

    @Override
    public void run() {
            this.p.sendMessgeToMyBuffer(new Message(0));
    }
}
