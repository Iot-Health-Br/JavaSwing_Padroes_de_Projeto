package Iterator.Iterator;

import Iterator.Model.ModeloPilha; // Importe a classe ModeloPilha

public class PilhaIterator implements Iterator {
    private ModeloPilha modeloPilha;
    private int index;

    public PilhaIterator(ModeloPilha modeloPilha) {
        this.modeloPilha = modeloPilha;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        // Considerando que uma pilha é LIFO, começamos do topo
        int nextIndex = index + 1;
        return nextIndex < modeloPilha.getPilha().size();
    }

    @Override
    public String next() {
        index++;
        return modeloPilha.getPilha().get(modeloPilha.getPilha().size() - 1 - index);
    }
}
