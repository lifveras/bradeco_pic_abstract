package io.github.lifveras.bredeco_pic_abstract.provided;

import java.util.ArrayList;
import java.util.List;

/**
 * ComponentInterface (interface de componente): implementação abstrata do elemento da estrutura que agrega
 * os elementos do subsistema de interface de componente. 
 */
public abstract class ComponentInterface{
    protected String id;
    protected List<InterfacePort> ports;

    public ComponentInterface(){
        ports = new ArrayList<>();
    }

    public abstract void initialize();
    
    public String getId(){
        return id;
    }

    public InterfacePort getPort(String id){
        // Recupera a interface correspondente ao id do parâmetro
        return ports.stream().filter(port -> port.id.equals(id)).findFirst().get();
    }

    public void connect(InterfacePort externalPort, String portId){
        // 1.1 recupera a porta de Id coprrespondente
        InterfacePort selectedPort = getPort(portId);
        // 1.2 Conecta à porta externa (no caso de portId="menuPort" a do componente de
        // Operações no caso
        selectedPort.connect(externalPort);
    }

    public void connect(InterfacePort externalPort){

    }

    public void connectNonComponent(Object externalReference, String portId){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectNonComponent'");
    }

    public void disconnect(InterfacePort externalPort, String portId){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disconnect'");
    }

    public void disconnect(String portId){
         // 1.1 recupera a porta de Id coprrespondente
        InterfacePort selectedPort = (InterfacePort) getPort(portId);
        selectedPort.disconnect();
    }
}