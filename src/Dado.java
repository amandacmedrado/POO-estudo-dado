public class Dado {
   public int ValorFace;

    // CONSTRUTOR
    public Dado() {
        this.ValorFace = 1;
    }

    public Dado(int ValorFace) {
        if (ValorFace > 0) {
            this.ValorFace = ValorFace;
        } else {
            this.ValorFace = 1; // Valor padrão se ValorFace for negativo
        }
    }

    public int getValorFace() {
        return ValorFace;
    }

    public void setValorFace(int ValorFace) {
        if (ValorFace > 0) {
            this.ValorFace = ValorFace;
        }
    }

    public int rolar() {
        return (int) (Math.random() * ValorFace) + 1;
    }

    public int getQuantidadeFaces() {
        return ValorFace;
    }

    public static class Main {
        public static void main(String[] args) {
            Dado d1 = new Dado();
            System.out.println(d1.rolar());
            System.out.println(d1.rolar());

            d1.setValorFace(8);
        }
    }
}