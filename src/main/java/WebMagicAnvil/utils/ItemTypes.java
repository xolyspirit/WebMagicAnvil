package WebMagicAnvil.utils;

/**какие могут быть вещи в принципе. для каждого типа будет своя реализация**/
public enum ItemTypes {
    EQUIPMENT,
    FURNITURE,
    TOOL,
    MATERIAL;
    public String toString() {
            String s = "";
            switch (this) {
                case EQUIPMENT: s = "Снаряжение";
                    break;
                case FURNITURE: s = "Мебель";
                    break;
                case TOOL: s = "Инструмент";
                    break;
                case MATERIAL: s = "Материал";
                    break;
            }
            return s;
        }
}

