import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arena {
    private int height;
    private int width;

    public Arena(int width, int height) {
        this.height = height;
        this.width = width;
        borders = createBorders();
        isles = createIsle();
    }

    //VIEW

    //public arena (Arena arena, TerminalScreen screen){
    //this.screen = screen;
    //this.arena = arena; }

    public void draw(Screen screen) throws IOException {
        TextGraphics tg = screen.newTextGraphics();;
        screen.clear();
        tg.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        tg.fill(' ');
        //tg.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        //viewComponents.drawIsland();
        //viewComponents.drawBoat();
        //viewComponent.drawPowerup();

        for(Border border : borders)
            border.draw(tg);



        isle.draw(tg);
        screen.refresh();
    }

    private List<Border> createBorders(){
        List<Border> borders = new ArrayList<>();

        for(int c=0; c < width; c++){
            borders.add(new Border(c, 0));
            borders.add(new Border(c, height-1));
        }

        for(int r=0; r < height; r++){
            borders.add(new Border(0, r));
            borders.add(new Border(width-1, r));
        }

        return borders;
    }

    public List<Isle> createIsle(){
        List<Isle> isles = new ArrayList<>();
        //isles.add(new Isle(20,20));
        //isles.add(new Isle(10,10));
        isles.add(new Isle(1,32));
        isles.add(new Isle(1,33));
        isles.add(new Isle(2,32));
        isles.add(new Isle(2,33));

        return isles;
    }

    private List<Border> borders;
    private List<Isle> isles;
}
