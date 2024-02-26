package Iterator.Controller;

import Iterator.Model.Model;

public class Controller implements IController {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    @Override
    public void addWord(String word) {
        // Simplesmente adiciona a palavra ao modelo com uma chave que pode ser a própria palavra ou um identificador único.
        model.addWord(word, word);
    }
}

