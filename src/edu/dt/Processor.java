package edu.dt;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by tphadke on 8/29/17.
 * processor has its own message buffer, id, children if applicable,
 * a parent process if itself is not root, and a neighbor pj which may
 * or may not be the parent, but sends the message to this processor.
 */
public class Processor implements Observer {
    //Each processsor has a message Buffer to store messages
    Buffer messageBuffer ;
    Integer id ;
    Integer currentLeader;
    public Processor next;
    

    /**
     * initialize processor's params
     */
    public Processor(Integer id) {
        messageBuffer = new Buffer();
        this.id = id; //This is an invalid value. Since only +ve values are acceptable as processor Ids.
        //Each processor is observing itself;
        messageBuffer.addObserver(this);
        this.currentLeader = id;

    }

    /**
     * send message to this processor with reference to sender as pj
     * @param message
     */
    //This method will add a message to this processors buffer.
    //Other processors will invoke this method to send a message to this Processor
    public void sendMessgeToMyBuffer(Message message){
        messageBuffer.setMessage(message);
    }


    /**
     * this method is called when the message buffer is updated with a new message
     * @param observable
     * @param arg
     */
    //This is analogous to recieve method.Whenever a message is dropped in its buffer this Pocesssor will respond
    //TODO: implement the logic of receive method here
    //      Hint: Add switch case for each of the conditions given in receive
    public void update(Observable observable, Object arg) {
            Message m = (Message) arg;
            if(!m.getTerminate().equals("terminate")) {
                if (m.getId() == this.id) {
                    // begin sending terminating message to all nodes
                } else if (m.getId() > this.id) {
                    this.currentLeader = m.getId();


                } else {
                    // gobble gobble
                }
            }
    }



}
