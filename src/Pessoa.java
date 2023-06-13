public class Pessoa extends Animal {
    // Atibutos a classe
    String sobrenome;
    // Método da classe
    public void falar(){
        System.out.println("falei");

    }
    public String falar (String volume) {
        return "falei " + volume;
    }
}

