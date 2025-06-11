package io.github.lifveras.bredeco_pic_abstract.required;

import java.util.List;

import io.github.lifveras.bredeco_pic_abstract.provided.InterfacePort;

public abstract class BroadcastPortOutbox extends PortOutbox{
    protected List<InterfacePort> externalPorts;
    
    public void connect(InterfacePort externalPort){

    }

    public void disconnect(InterfacePort externalPort){

    }
    
    public void disconnect(){

    }
}
