package WebMagicAnvil.utils;

/**список возможных статов.**/
public enum Stats {
    ARMOR,
    AGILITY,
    ENDURANCE,
    STRENGTH,
    CONSTITUTION,
    INTELLIGENCE,
    WISDOM,
    LUCK,
    PHISIC_CRIT_RATE,
    MAGIC_CRIT_RATE,
    PHISIC_CRIT_CHANCE,
    MAGIC_CRIT_CHANCE,
    ACCURACY,
    PENETRATION;

    public String addedStat(){
        String s = "";
        switch (this) {
            case ARMOR: s = " к броне";
                break;
            case AGILITY: s = " к ловкости";
                break;
            case ENDURANCE: s = " к выносливости";
                break;
            case STRENGTH: s = " к силы";
                break;
            case CONSTITUTION: s = " к телосложения";
                break;
            case INTELLIGENCE: s = " к интеллекта";
                break;
            case WISDOM: s = " к мудрости";
                break;
            case LUCK: s = " к удачи";
                break;
            case PHISIC_CRIT_RATE: s = " к критическому физ. урону";
                break;
            case MAGIC_CRIT_RATE: s = " к критическому маг. урону";
                break;
            case PHISIC_CRIT_CHANCE: s = " к шансу физ. крита";
                break;
            case MAGIC_CRIT_CHANCE: s = " к шансу маг. крита";
                break;
            case ACCURACY: s = " к точности";
                break;
            case PENETRATION: s = " к проникновению магии";
                break;
        }
        return s;
    }
}