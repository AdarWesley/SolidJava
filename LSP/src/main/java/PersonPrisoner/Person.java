package PersonPrisoner;

public class Person   
{
    public void walkNorth(int miles) throws Exception {
        System.out.printf("%1$ walked %2$ miles north", this.getClass().getSimpleName(), miles);
    }

    public void walkEast(int miles) throws Exception {
    	System.out.printf("{%1$ walked %2$ miles east", this.getClass().getSimpleName(), miles);
    }

    public void walkSouth(int miles) throws Exception {
    	System.out.printf("%1$ walked %2$ miles south", this.getClass().getSimpleName(), miles);
    }

    public void walkWest(int miles) throws Exception {
    	System.out.printf("%1$ walked %2$ miles west", this.getClass().getSimpleName(), miles);
    }

}


