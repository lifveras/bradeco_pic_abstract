package io.github.lifveras.bredeco_pic_abstract.required;

import io.github.lifveras.bredeco_pic_abstract.provided.InterfacePort;

/**
 * StandardPortOutbox (caixa de saída padrão de porto): especialização abstrata de PortOutbox voltada 
 * ao envio de invocação de operações requeridas a exatamente um componente. Seu único atributo é voltado 
 * a apontar o porto a que se destinam as invocações.
 */
public abstract class StandardPortOutbox extends PortOutbox{
    protected InterfacePort externalPort;

    public void connect(InterfacePort externalPort){
        this.externalPort = externalPort;
    }
    
    public void disconnect(){
        this.externalPort = null;
    }
}
