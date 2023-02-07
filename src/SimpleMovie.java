import java.util.ArrayList;

public class SimpleMovie {
    private String title;
    private String actorsData;
    private ArrayList<String> actors;

    public SimpleMovie(String t, String a) {
        title = t;
        actorsData = a;
        actors = new ArrayList<String>();
        String[] tempActors = actorsData.split(":");
        for (int i = 0; i < tempActors.length; i++) {
            actors.add(tempActors[i]);
        }

    }
    public ArrayList<String> getActors(){
        return actors;
    }

    public ArrayList<String> findActorStarting(String startingLetter){
        ArrayList<String> actorStartingWith = new ArrayList<String>();
        String[] tempActors = actorsData.split(":");
        for(int i = 0; i < tempActors.length; i++){
            if(tempActors[i].substring(0,1).equals(startingLetter)){
                actorStartingWith.add(tempActors[i]);
            }
        }
        return actorStartingWith;
    }

    public String toString() {
        return "Title: " + title + "\n" + "Actors: " + actors + "\n";
    }
}