package OCP17.Chapter7.Enum;


public enum Coffee  //1
{
    ESPRESSO("Very Strong");
    public String strength; //3
    Coffee(String strength) //4
    {
        this.strength = strength; //5
    }
    public String toString(){   return strength + ordinal(); } //6
}
