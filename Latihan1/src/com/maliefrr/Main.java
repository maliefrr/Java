package com.maliefrr;

// membuat player class
class Player {
    String nama;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String nama,double health){
        this.nama = nama;
        this.health = health;
    }

    void EquipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void EquipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nPlayer\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        this.weapon.display();
        this.armor.display();
    }


}

// membuat weapon class
class Weapon {
    String nama;
    double attackpower;

    Weapon(String nama,double attackpower){
        this.nama = nama;
        this.attackpower = attackpower;
    }

    void display(){
        System.out.println("Weapon\t: " + this.nama);
    }
}

// membuat armor class
class Armor {

    String nama;
    double defense;

    Armor(String nama,double defensepower){
        this.nama = nama;
        this.defense = defensepower;
    }
    void display(){
        System.out.println("Armor\t: " + this.nama);
    }
}



public class Main {
    public static void main(String[] args) {

        //  player 1
        Player player1 = new Player("maliefrr",100);

        // membuat object weapon

        Weapon Excalibur = new Weapon("Excalibur",35.7);

        // membuat object armor

        Armor LightningBodyTemper = new Armor("Lightning Body Temper",4000);

        // equip weapon ke player 
        player1.EquipWeapon(Excalibur);

        
        // equip Armor ke playerl
        player1.EquipArmor(LightningBodyTemper);

        // player2

        Player player2 = new Player("YvesGeorge",100);

        Weapon AthenaBlade = new Weapon("Athena's Blade", 50); 

        Armor GoldenDragon = new Armor("Golden Dragon",400);

        player2.EquipWeapon(AthenaBlade);
        player2.EquipArmor(GoldenDragon);


        player1.display();
        player2.display();
    }
    
}
