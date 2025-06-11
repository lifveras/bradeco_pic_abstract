package io.github.lifveras.bredeco_pic_abstract.required;

/**
 * PortOutbox (caixa de saída de porto): implementação abstrata de uma caixa de saída, 
 * que é o elemento da estrutura, associado ao porto, responsável por invocar as 
 * operações requeridas pelo componente de elemento externo a ele conectado.
 */
public abstract class PortOutbox {
    abstract public void disconnect();
}
