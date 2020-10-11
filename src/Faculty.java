public class Faculty {

    private Lab[] labs;
    private final int LABSNUM = 10;
    private int currentLabsNum;

    public Faculty (){
        labs = new Lab[LABSNUM];
        currentLabsNum = 0;
    }

    public void addLab(Lab lab) {
        if (currentLabsNum < LABSNUM) {
            labs[currentLabsNum] = lab;
            currentLabsNum++;
        } else {
            System.out.println("Number of labs can't be more than " + LABSNUM);
        }
    }

    public void printLabs (){
        for (int i = 0 ; i< currentLabsNum ; i++){
            System.out.println("Lab " + (i+1) + " >> day : " + labs[i].getDay() + " >> capacity : " +labs[i].getCapacity());
        }
    }

}
