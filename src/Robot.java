

    public class Robot {
    private int energia;
    private Bateria bateria;
    private boolean dormido;

    public Robot() {
        this.energia = 1000;
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos) {
        if (!dormido) {
            this.energia -= (pasos / 100) * 10;
        }
    }

    public void retroceder(int pasos) {
        if (!dormido) {
            this.energia -= (pasos / 100) * 10;
        }
    }

    public void dormir() {
        this.dormido = true;
    }

    public void despertar() {
        this.dormido = false;
    }

    public void recargar() {
        this.bateria.setCarga(1000);
        this.energia = 1000;
    }

    public boolean bateriaLLena() {
        return this.bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return this.bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return this.energia;
    }
}
    

