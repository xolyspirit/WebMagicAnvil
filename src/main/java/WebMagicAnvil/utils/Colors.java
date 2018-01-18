package WebMagicAnvil.utils;

/**список возможных цветов.**/
public enum Colors {
    AIR_YELLOW,
    FIRE_ORANGE,
    EARTH_BROWN,
    WATER_BLUE,
    LIVE_GREEN,
    DEATH_PURPLE,
    LIGHT_WHITE,
    DARK_BLACK,
    CHAOS_SHIFTING,
    ORDER_GRAY,
    BLOOD_RED,
    SHADOW_SMOKY_GRAY;

    @Override
    public String toString() {
        String s = "";
        switch (this) {
            case AIR_YELLOW: s = "желтый";
                break;
            case FIRE_ORANGE: s = "оранжевый";
                break;
            case EARTH_BROWN: s = "коричневый";
                break;
            case WATER_BLUE: s = "синий";
                break;
            case LIVE_GREEN: s = "зеленый";
                break;
            case DEATH_PURPLE: s = "фиолетовый";
                break;
            case LIGHT_WHITE: s = "белый";
                break;
            case DARK_BLACK: s = "черный";
                break;
            case CHAOS_SHIFTING: s = "меняющийся";
                break;
            case ORDER_GRAY: s = "серый";
                break;
            case BLOOD_RED: s = "красный";
                break;
            case SHADOW_SMOKY_GRAY: s = "темно-серый";
                break;
        }
        return s;
    }
    public String addedName(){
        String s = "";
        switch (this) {
            case AIR_YELLOW: s = "желтого";
                break;
            case FIRE_ORANGE: s = "оранжевого";
                break;
            case EARTH_BROWN: s = "коричневого";
                break;
            case WATER_BLUE: s = "синего";
                break;
            case LIVE_GREEN: s = "зеленого";
                break;
            case DEATH_PURPLE: s = "фиолетового";
                break;
            case LIGHT_WHITE: s = "белого";
                break;
            case DARK_BLACK: s = "черного";
                break;
            case CHAOS_SHIFTING: s = "меняющигося";
                break;
            case ORDER_GRAY: s = "серого";
                break;
            case BLOOD_RED: s = "красного";
                break;
            case SHADOW_SMOKY_GRAY: s = "темно-серого";
                break;
        }
        return s;
    }
}