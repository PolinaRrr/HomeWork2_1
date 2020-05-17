import obstacles.Track;
import obstacles.Wall;
import participants.Cat;
import participants.Human;
import participants.Participating;
import participants.Robot;

public class Main {
    public static void main(String[] args) {
        Participating[] participants = {
                new Cat("Барсик", 500, 3),
                new Human("Сергей", 2500, 2),
                new Robot("R2D2", 250, 1)
        };
        Object[] obstacles = {
                new Wall(1),
                new Track(250),
                new Wall(2),
                new Track(500),
                new Wall(3),
                new Track(1200)
        };
        for (Participating p: participants) {
            for (Object o: obstacles) {
                if (o instanceof Wall){
                    p.jump((Wall) o);
                }
                if(o instanceof Track){
                    p.run((Track)o);
                }
            }
        }
    }
}
