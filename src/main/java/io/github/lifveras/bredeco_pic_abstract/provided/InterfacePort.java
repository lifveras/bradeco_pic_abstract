package io.github.lifveras.bredeco_pic_abstract.provided;

import io.github.lifveras.bredeco_pic_abstract.required.PortOutbox;
import io.github.lifveras.bredeco_pic_abstract.required.StandardPortOutbox;

/**
 * InterfacePort (porto de interface): implementação abstrata de um porto de interface, 
 * que é o elemento da estrutura responsável por receber as invocações das operações fornecidas pelo componente.
 */
public abstract class InterfacePort {
    protected String id;
    protected PortOutbox outbox;

    public abstract void initialize();
    
    public String getId(){
        return id;
    }

    public PortOutbox getOutbox(){
        return outbox;
    }

    public void connect(InterfacePort externalPort){
        StandardPortOutbox standardOutbox = (StandardPortOutbox) outbox;
        standardOutbox.connect(externalPort);
    }

    public void connectNonComponent(Object externalReference){

    }

    public void disconnect(InterfacePort externalPort){

    }

    public void disconnect(){
        // 1.2.1 Remove a referência ao outbox que acesso componente externo
        this.outbox = null;
    }
}
