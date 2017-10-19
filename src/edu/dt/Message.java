package edu.dt;

/**
 * Created by tphadke on 8/29/17.
 */
public class  Message {
    private int id;
    private String terminate;

    public Message(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerminate() {
        return terminate;
    }

    public void setTerminate(String terminate) {
        this.terminate = terminate;
    }

}
