import java.util.ArrayList;
/*
Question :  Suppose that we create an array A of GameEntry objects, which has an integer scores field, and we clone A and store the result in an array B. 
If we then immediately set A[4].score equal to 550, what is the score value of the GameEntry object referenced by B[4] ?
*/

//Solution
//create GameEntry class with score as field
class GameEntry {
    private int scores;

    public GameEntry(int scores) {
        this.scores = scores;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "scores=" + scores +
                '}';
    }
}

public class ArrayCopy {
    public static void main(String[] args) {
        System.out.println("Array copy example");
        //create Arraylist A of object type GameEntry
        ArrayList<GameEntry> A = new ArrayList<>();
        A.add(new GameEntry(1));
        A.add(new GameEntry(2));
        A.add(new GameEntry(3));
        A.add(new GameEntry(4));
        A.add(new GameEntry(5));
        //copy A to B
        ArrayList<GameEntry> B = A;
        //print value of B
        System.out.println(B);
        //Now change a value in A and print B again
        A.set(4, new GameEntry(550));
        System.out.println(B);
    }

}
//Answer: Shallow copy still reference to the content of A
