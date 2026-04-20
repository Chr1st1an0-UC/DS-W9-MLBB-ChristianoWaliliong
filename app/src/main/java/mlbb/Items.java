package mlbb;

public class Items {

    public static Node vitalityCrystal() {
        return new Node("Vitality Crystal", "HP dasar");
    }

    public static Node leatherJerkin() {
        return new Node("Leather Jerkin", "Physical Defense kecil");
    }

    public static Node magicResistCloak() {
        return new Node("Magic Resist Cloak", "Magic Defense kecil");
    }

    public static Node heroRing() {
        return new Node("Hero's Ring", "Cooldown reduction");
    }

    public static Node expertGloves() {
        return new Node("Expert Gloves", "Attack speed");
    }

    public static Node healingNecklace() {
        return new Node("Healing Necklace", "HP regen");
    }

    public static Node moltenEssence() {
        Node m = new Node("Molten Essence", "Burn damage area");
        m.addChild(vitalityCrystal());
        return m;
    }

    public static Node aresBelt() {
        Node a = new Node("Ares Belt", "HP tambahan");
        a.addChild(vitalityCrystal());
        return a;
    }

    public static Node dreadnaughtArmor() {
        Node d = new Node("Dreadnaught Armor", "Anti physical burst");
        d.addChild(leatherJerkin());
        d.addChild(leatherJerkin());
        return d;
    }

    public static Node silenceRobe() {
        Node s = new Node("Silence Robe", "Anti magic");
        s.addChild(vitalityCrystal());
        s.addChild(magicResistCloak());
        return s;
    }

    public static Node steelLegplates() {
        Node s = new Node("Steel Legplates", "Physical defense tinggi");
        s.addChild(leatherJerkin());
        return s;
    }

    public static Node chastisePauldron() {
        Node c = new Node("Chastise Pauldron", "Defense tambahan");
        c.addChild(Items.steelLegplates());
        c.addChild(Items.aresBelt());
        return c;
    }

    public static Node fleetingTime() {
        Node f = new Node("Fleeting Time", "Cooldown skill");
        f.addChild(Items.heroRing());
        f.addChild(Items.heroRing());
        f.addChild(Items.expertGloves());
        return f;
    }

    public static Node dominanceIce() {
        Node d = new Node("Dominance Ice", "Anti-heal & attack speed slow");
        d.addChild(new Node("Black Ice Shield", "Defense tambahan"));
        d.addChild(Items.leatherJerkin());
        d.addChild(Items.magicResistCloak());
        return d;
    }

    public static Node antiqueCuirass() {
        Node a = new Node("Antique Cuirass", "Anti physical damage");
        a.addChild(Items.dreadnaughtArmor());
        a.addChild(Items.aresBelt());
        return a;
    }

    public static Node athenaShield() {
        Node a = new Node("Athena Shield", "Anti burst magic");
        a.addChild(Items.silenceRobe());
        a.addChild(Items.vitalityCrystal());
        return a;
    }

    public static Node radiantArmor() {
        Node r = new Node("Radiant Armor", "Anti magic DPS");
        r.addChild(Items.silenceRobe());
        r.addChild(Items.magicResistCloak());
        r.addChild(Items.healingNecklace());
        return r;
    }

    public static Node bladeArmor() {
        Node b = new Node("Blade Armor", "Reflect physical damage");
        b.addChild(Items.steelLegplates());
        b.addChild(Items.leatherJerkin());
        b.addChild(Items.leatherJerkin());
        return b;
    }

    public static Node bruteForceBreastplate() {
        Node b = new Node("Brute Force Breastplate", "Defense + Movement speed");
        b.addChild(Items.aresBelt());
        b.addChild(Items.heroRing());
        b.addChild(Items.leatherJerkin());
        return b;
    }

    public static Node immortality() {
        Node i = new Node("Immortality", "Resurrection");
        i.addChild(Items.aresBelt());
        i.addChild(Items.vitalityCrystal());
        i.addChild(Items.leatherJerkin());
        return i;
    }

    public static Node thunderBelt() {
        Node t = new Node("Thunder Belt", "True damage + slow");
        t.addChild(Items.aresBelt());
        t.addChild(Items.leatherJerkin());
        t.addChild(Items.magicResistCloak());
        return t;
    }

    public static Node guardianHelmet() {
        Node g = new Node("Guardian Helmet", "HP regen besar");
        g.addChild(Items.aresBelt());
        g.addChild(Items.aresBelt());
        g.addChild(Items.aresBelt());
        return g;
    }

    public static Node queensWings() {
        Node q = new Node("Queen's Wings", "Damage reduction");
        q.addChild(Items.aresBelt());
        q.addChild(Items.heroRing());
        q.addChild(Items.expertGloves());
        return q;
    }

    public static Node oracle() {
        Node o = new Node("Oracle", "Boost shield & regen");
        o.addChild(Items.heroRing());
        o.addChild(Items.heroRing());
        o.addChild(Items.vitalityCrystal());
        return o;
    }

    public static Node cursedHelmet() {
        Node c = new Node("Cursed Helmet", "Burn damage aura");
        c.addChild(Items.moltenEssence());
        c.addChild(Items.aresBelt());
        c.addChild(Items.magicResistCloak());
        return c;
    }
}

