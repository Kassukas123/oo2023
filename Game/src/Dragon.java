public class Dragon extends Character{
    int xCoordinaate; // taisarvuline number
    int yCoordinaate;
    char symbol;

    // constructor
    public Dragon(int worldWidth, int worldHeight) {
        // super on parenti constructor
        super(worldWidth, worldHeight, 'D');
    }
}