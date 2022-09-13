public class Superhero {
    // Attributer
    private String heroName;
    private String superpower;
    private int birthyear;
    private String realName;
    private double height;
    private int weight;
    private int overallStrenght;

    // Konstruktør
    public Superhero (String heroName, String superpower, int birthyear, String realName, double height, int weight){
        this.heroName = heroName;
        this.superpower = superpower;
        this.birthyear = birthyear;
        this.realName = realName;
        this.height = height;
        this.weight = weight;
        this.overallStrenght = overallStrenght;
    }

    // Getter
    public String getheroName() {
        return heroName;
    }
    public String getSuperpower() {
        return  superpower;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public String getRealName() {
        return realName;
    }
    public double getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public int getOverallStrenght() {
        return overallStrenght;
    }

    // Setter
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setOverallStrenght(int overallStrenght) {
        this.overallStrenght = overallStrenght;
    }
}
