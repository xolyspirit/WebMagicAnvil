package WebMagicAnvil.utils;

public enum EquipTypes{
    HELMET,
    SHOULDERS,
    BODY,
    ARMS,
    PANTS,
    FEET;

    @Override
    public String toString() {
        String s = "";
        switch (this) {
            case HELMET: s = "Шлем";
                break;
            case SHOULDERS: s = "Наплечники";
                break;
            case BODY: s = "Доспех";
                break;
            case ARMS: s = "Перчатки";
                break;
            case PANTS: s = "Штаны";
                break;
            case FEET: s = "Обувь";
                break;
        }
        return s;
    }
}