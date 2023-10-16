

    public abstract class Instrument {

        private String nom;
        private double preu;

        public Instrument() {
        }

        public Instrument(String nom, double preu) {
            this.nom = nom;
            this.preu = preu;
        }

        abstract void tocar();



        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public double getPreu() {
            return preu;
        }

        public void setPreu(int preu) {
            this.preu = preu;
        }
    }


