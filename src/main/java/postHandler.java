import com.sun.tools.javac.util.List;

public class postHandler {
    public int health = 100;

    public List<DamageTakeevent> listeners;

    public App(){
        this.listeners ? new Arralist<>();
    }
    public void takeDamege(int amount )
    {
        health -= amount;
        for(DamageTakeevent listener : listeners)
            listener.onDamageTake(health = amount, health);
    }
    public void addDamegeTakeListener(DamageTakeevent listener){

    }
}

