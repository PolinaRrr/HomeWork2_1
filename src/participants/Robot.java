package participants;

import obstacles.Track;
import obstacles.Wall;

public class Robot implements Participating {
    int maxDistanceRun;
    int maxHeightJump;
    String name;

    public Robot(String name, int maxDistanceRun, int maxHeightJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxHeightJump = maxHeightJump;
    }

    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    public void setMaxDistanceRun(int maxDistanceRun) {
        this.maxDistanceRun = maxDistanceRun;
    }

    public int getMaxHeightJump() {
        return maxHeightJump;
    }

    public void setMaxHeightJump(int maxHeightJump) {
        this.maxHeightJump = maxHeightJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * метод бега
     *
     * @param track - объект беговая дорожка
     * @return true если участник на дистанции, false - если участник сходит с дистанции
     */
    @Override
    public boolean run(Track track) {
        if (track.getLength() > maxDistanceRun) {
            System.out.println("Участник " + name + " не может пробежать " + track.getLength() + "м и сходит с дистанции.");
            return false;
        }
        if (track.getLength() <= maxDistanceRun) {
            System.out.println("Участник " + name + " успешно пробежал " + track.getLength() + " м.");
            return true;
        }
        return true;
    }

    /**
     * метож прыжка
     * @param wall объект стена
     * @return true если участник на дистанции, false - если участник сходит с дистанции
     */
    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() > maxHeightJump) {
            System.out.println("Участник " + name + " не может подпрыгнуть на  " + wall.getHeight() + " м и сходит с дистанции.");
            return false;
        }
        if (wall.getHeight() <= maxHeightJump) {
            System.out.println("Участник " + name + " успешно перепрыгнул " + wall.getHeight() + " м.");
            return true;
        }
        return true;
    }
}
