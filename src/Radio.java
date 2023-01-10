public class Radio {

    private boolean estaLigado;

    public Radio(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public String playMusic(){
        return "Boom boom boom";
    }
}

