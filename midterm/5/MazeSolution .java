import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Cell{
    int x,y;
    Cell(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+this.x +", "+this.y+ "]";
    }
}
public class MazeSolution {
    public ArrayList<Cell> findPath(int[][] maze){
        Queue<Cell> q = new LinkedList<>();
        Queue<ArrayList<Cell>> ls = new LinkedList<>();
        q.offer(new Cell(0, 0));
        ls.offer(new ArrayList<>());
        while (!q.isEmpty()) {
            Cell c = q.poll();
            ArrayList<Cell> temp = ls.poll();
            temp.add(c);
            if (c.x == maze.length - 1 && c.y == maze[0].length - 1) {
                return temp;
            }
            if (c.x < maze.length - 1 && maze[c.x + 1][c.y] == 1) {
                q.offer(new Cell(c.x + 1, c.y));
                ls.offer(new ArrayList<>(temp));
            }
            if (c.y < maze[0].length - 1 && maze[c.x][c.y + 1] == 1) {
                q.offer(new Cell(c.x, c.y + 1));
                ls.offer(new ArrayList<>(temp));
            }
        }
        return new ArrayList<>();
    }
}
