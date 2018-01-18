package WebMagicAnvil.utils;

/**список возможных стихий.**/
public enum Elements {
    BASE,
    AIR,
    FIRE,
    EARTH,
    WATER,
    LIVE,
    DEATH,
    LIGHT,
    DARK,
    CHAOS,
    ORDER,
    BLOOD,
    SHADOW;

    public Stats getAssociatedStat(){
        Stats st = null;
        switch (this) {
            case BASE: st = Stats.CONSTITUTION;
                break;
            case AIR: st = Stats.AGILITY;
                break;
            case FIRE: st = Stats.INTELLIGENCE;
                break;
            case EARTH: st = Stats.STRENGTH;
                break;
            case WATER: st = Stats.WISDOM;
                break;
            case LIVE: st = Stats.ENDURANCE;
                break;
            case DEATH: st = Stats.PENETRATION;
                break;
            case LIGHT: st = Stats.MAGIC_CRIT_CHANCE;
                break;
            case DARK: st = Stats.MAGIC_CRIT_RATE;
                break;
            case CHAOS: st = Stats.LUCK;
                break;
            case ORDER: st = Stats.ACCURACY;
                break;
            case BLOOD: st = Stats.PHISIC_CRIT_RATE;
                break;
            case SHADOW: st = Stats.PHISIC_CRIT_CHANCE;
                break;
        }
        return st;
    }
}
