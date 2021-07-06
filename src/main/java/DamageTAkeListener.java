public class DamageTAkeListener implements DamageTakeevent{

    @Override
    public void onDamegeTake(int befopre, int after) {
        System.out.println("you took damage. before it was"+", now it is "+ after);
    }
}
