public class TestMoodyGroup{
    public static void main(String[] args){
        MoodyGroup<Teenager> teenagersGroup = new MoodyGroup<Teenager>();

        teenagersGroup.addMoodyPerson(new Teenager("T1"));
        teenagersGroup.addMoodyPerson(new Teenager("T2"));
        teenagersGroup.addMoodyPerson(new Teenager("T3"));

        System.out.printf("%s%n%n", teenagersGroup);
        teenagersGroup.setHappy(true);
        System.out.printf("%s%n%n", teenagersGroup);

        MoodyGroup<MoodyPerson> commonGroup = new MoodyGroup<MoodyPerson>();
        commonGroup.addMoodyPerson(new Worker("W1"));
        commonGroup.addMoodyPerson(teenagersGroup.getMoodyPerson(0));
        commonGroup.addMoodyPerson(teenagersGroup.getMoodyPerson(1));
        commonGroup.addMoodyPerson(teenagersGroup.getMoodyPerson(2));
        
        commonGroup.setHappy(true);
        System.out.printf("%s%n%n", commonGroup);
        commonGroup.setHappy(false);
        System.out.printf("%s%n%n", commonGroup);
    } // main
} // class