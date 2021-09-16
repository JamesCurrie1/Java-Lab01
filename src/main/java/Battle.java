public class Battle  {
    private String chikapuName;
    private float chikapuAttack;
    private float chikapuHP;
    private float chikapuDefense;
    private String zarichardName;
    private float zarichardAttack;
    private float zarichardHP;
    private float zarichardDefense;
    int roundNum = 1;
    float damage;
    public Battle(String chikapuName, float chikapuAttack, float chikapuDefense, float chikapuHP
    , String zarichardName, float zarichardAttack, float zarichardDefense, float zarichardHP){
    this.chikapuName = chikapuName;
    this.chikapuAttack = chikapuAttack;
    this.chikapuHP = chikapuHP;
    this.chikapuDefense = chikapuDefense;
    this.zarichardName = zarichardName;
    this.zarichardAttack = zarichardAttack;
    this.zarichardHP = zarichardHP;
    this.zarichardDefense = zarichardDefense;
    }

    public boolean isMonster1Dead(){
        if(chikapuHP <= 0) {
            return true;
        } else{ return false; }
    }

    public boolean isMonster2Dead(){
        if(zarichardHP <= 0){
            return true;
        }else{ return false; }
    }

    public void simulateRound(){
        System.out.println("\nRound "+ roundNum);
        //Monster1 turn
        damage = chikapuAttack - zarichardDefense;
        System.out.println("Chikapu does " + damage + "points of damage to Zarichard");
        zarichardHP = zarichardHP - damage;
        //Monster2 turn
        damage = zarichardAttack - chikapuDefense;
        System.out.println("Zarichard does " + damage + "points of damage to Chikapu");
        chikapuHP = chikapuHP - damage;
        //print monster HP
        System.out.println("Chikapu: "+ chikapuHP);
        System.out.println("Zarichard: "+ zarichardHP );
        roundNum++;

    }
    public String getMonster1Name(){
        return this.chikapuName;
    }
    public String getMonster2Name(){
        return this.zarichardName;
    }
}
