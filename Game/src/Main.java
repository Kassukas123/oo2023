import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; //kui see import peaks ära kaduma millegi pärast siis scanneri peala alt+enter
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); //nii ütled javas print

        //Random rand = new Random(); // uus instants
        //Math.random(); //static
        // need siin järgmised on primitiivid
        //String sonaline = "Sõnaline muutuja"; Strin on tegeligult hoopis class, erinavalt tes
        //char taheline = 's'; // üks täht
        //double komakohaga = 4234.1314; // komakohaga arv, enamasti alati double mitte float
        //float komakohaga2 = 342324.2323F;
        // boolean kahendV22rtus = true; // 0 on false ja 1 on true, true false on õigem kasutada kui arve, "y" "n"
        // byte pisikeNumber = 100; // täisarv alates -128 kuni 127
        // short lyhikeNumber = 312; // täisarv alates -32 768 kuni 32 767
        // long pikkNumber = 31231314212L;
        Scanner scanner = new Scanner(System.in);

        World world = new World(10, 5);

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        List<Character> characters = new ArrayList<>(Arrays.asList(player, dragon, orc));

        Item sword = new Item(10, 1,"Mõõk", world.width, world.height);
        Item hammer = new Item(5, 6,"Haamer", world.width, world.height);
        Item boot = new Item(1, 10,"Saabas", world.width, world.height);

        //listi jaoks: import java.util.List
        // import: java.util.ArrayList
        // import: java.util.Arrays
        // list on muudetav ja pakub palju rohkem võimalusi kui array
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));

        //Item[] items1 = {sword, hammer, boot}; see on array ja ei ole muudetav (read-only), seetõttu kasutame ülemist varianti

        world.printMap(world.width, world.height, player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
        String input = scanner.nextLine(); //nt int või double vms muud ei saa panna, sest scanner väljastab ainult stringi

        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
            System.out.println();
            for (Item i : items) {
                if (i.xCoordinate == player.xCoordinaate && i.yCoordinate == player.yCoordinaate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
    
}