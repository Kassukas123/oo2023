import java.util.List;

public class World {
    int width;
    int height;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                         int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                         int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, List<Item> items){
        // algväärtus   kuni   iga tsükkel
        char symbol = ' '; //luuakse uus muutuja (deklareerimine), esmakordne väärtuse andmine initsialiseerimine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth - 1) {
                    symbol = '|';
                } else {
                    // ctrl + alt + m
                    // right click -> refactor -> extract method
                    for (Item i: items) {
                        if (i.yCoordinate == y && i.xCoordinate == x) {
                            symbol = 'I';
                            break;
                        }
                    }
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
                        symbol = playerSymbol;
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                        symbol = dragonSymbol;
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                        symbol = orcSymbol;
                    }
                    /*for (Character c: characters) {
                        if (c.xCoordinaate === x && c.yCoordinaate === y) {
                            symbol = c.symbol;
                        }*/
                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }
}