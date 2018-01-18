package WebMagicAnvil.utils;

/**список возможных уровней качества материала.**/
public enum MaterialQuality {
    BAD,
    COMMON,
    GOOD,
    IDEAL;

    @Override
    public String toString() {
        String s = "";
        switch (this) {

            case BAD: s = "плохое";
                break;
            case COMMON: s = "обычное";
                break;
            case GOOD: s = "редкое";
                break;
            case IDEAL: s = "идеальное!";
                break;
        }
        return s;
    }

    public Byte getQualityDivider(){
        Byte b= 0;
        switch (this){
            case BAD: b = 10;
                break;
            case COMMON: b = 5;
                break;
            case GOOD: b = 2;
                break;
            case IDEAL: b = 1;
        }
        return b;
    }

}
