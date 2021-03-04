import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main (String [] args) {


        //Configuración de Juego
        /*
        crear juego con jugadores, el juego debe tener los limites de kilómetros por cada pista (un jugador puede ser un conductor y un conductor debe tener un carro asociado y un carro debe estar asociado a un carril que a su vez debe estar en una pista)
        */

        //
        //
        // JOptionPane.showMessageDialog(null, Dado(1,6));

        int numberPlayers = Integer.parseInt(JOptionPane.showInputDialog("Type the players number, please"));
        JOptionPane.showMessageDialog(null, numberPlayers);

        ArrayList<Driver> playersN;

        playersN = Users(numberPlayers);
        JOptionPane.showMessageDialog(null, playersN);

        Speedway daytona = new Speedway(1, numberPlayers, 5000, "Daytona", playersN);
        JOptionPane.showMessageDialog(null, daytona);

        //START WE :v
        int i=0, x=0;
        while (true){
            i++;

            for (int j=0 ; j<numberPlayers ; j++){
                playersN.get(j).vehicle.velocidad(Dado(1,6));
                if (playersN.get(j).vehicle.getDistancia()> daytona.getTotalDistance()){
                    x=1;
                }
            }

            if(x==1){
                break;
            }

            if (i> daytona.getTotalDistance() + 20){
                break;
            }
        }

    }

    static int Dado(int Minimo, int Maximo){
        return (int)(Math.floor(Math.random()*(Minimo-Maximo+1)+Maximo));
    }

    static ArrayList Users(int NumberPlayers) {
        ArrayList<Driver> players = new ArrayList<>();

        for(int i=0; i<NumberPlayers ; i++){

            int Choosed = Integer.parseInt(JOptionPane.showInputDialog("#1 Predeterminado \n#2 Simple Perfil"));

            if(Choosed == 1){
                Car car = new Car(i);
                players.add(new Driver(i,car));
                JOptionPane.showMessageDialog(null, "Ok, :v");
            }
            else if (Choosed == 2){
                Car car = new Car(i, JOptionPane.showInputDialog("Please, The Car's Brand"),
                        JOptionPane.showInputDialog("Please, The Car's Color"));

                players.add(new Driver(JOptionPane.showInputDialog("Please, Your Name"),
                        i, Integer.parseInt(JOptionPane.showInputDialog("How old Are You?")),car));

                JOptionPane.showMessageDialog(null, "Ok, :v");
            }
            else{
                JOptionPane.showMessageDialog(null, "No Valid, Try Again");
                i--;
            }
        }
        return players;
    }
}
