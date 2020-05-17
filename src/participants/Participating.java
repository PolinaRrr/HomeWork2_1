package participants;

import obstacles.Track;
import obstacles.Wall;

public interface Participating {
    boolean run(Track track);
    boolean jump(Wall wall);
}
