
    public class SmartTV {
        private boolean ligada;
        private int volume;
        private int canal;

        // Construtor
        public SmartTV() {
            this.ligada = false;
            this.volume = 10; // Volume inicial
            this.canal = 1;   // Canal inicial
        }

        // Método para ligar a TV
        public void ligar() {
            if (!ligada) {
                ligada = true;
                System.out.println("A TV foi ligada.");
            } else {
                System.out.println("A TV já está ligada.");
            }
        }

        // Método para aumentar o volume
        public void aumentarVolume() {
            if (ligada) {
                if (volume < 100) { // Supondo que o volume máximo é 100
                    volume++;
                    System.out.println("Volume aumentado para: " + volume);
                } else {
                    System.out.println("Volume já está no máximo.");
                }
            } else {
                System.out.println("A TV está desligada.");
            }
        }

        // Método para mudar de canal
        public void mudarCanal(int novoCanal) {
            if (ligada) {
                if (novoCanal > 0) { // Supondo que os canais são números positivos
                    canal = novoCanal;
                    System.out.println("Canal mudado para: " + canal);
                } else {
                    System.out.println("Número de canal inválido.");
                }
            } else {
                System.out.println("A TV está desligada.");
            }
        }

        // Método para mostrar o estado atual da TV
        public void mostrarEstado() {
            System.out.println("TV Ligada: " + (ligada ? "Sim" : "Não"));
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }

}
