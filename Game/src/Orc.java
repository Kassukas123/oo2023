// ALAMKLASS
public class Orc extends Character{
    int xCoordinaate; // taisarvuline number
    int yCoordinaate;
    char symbol;

    // constructor
    public Orc(int worldWidth, int worldHeight) {
        // super on parenti constructor
        super(worldWidth, worldHeight, 'O');
    }


}