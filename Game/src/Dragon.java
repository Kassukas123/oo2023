public class Dragon {
    int xCoordinaate; // taisarvuline number
    int yCoordinaate;
    char symbol;

    // constructor
    public Dragon(int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'D';
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}