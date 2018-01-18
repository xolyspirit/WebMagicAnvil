package WebMagicAnvil.models;

import WebMagicAnvil.utils.Colors;
import WebMagicAnvil.utils.ItemTypes;
import WebMagicAnvil.utils.MaterialQuality;

/**Базовый класс для всех вещей**/
public abstract class AbstractItem {
    //тип премета- мебель, доспех, оружие и тд...
    protected ItemTypes itemType;
    //описание предмета
    protected String description;
    //основной цвет
    protected Colors mainColor;
    //дополнительный цвет
    protected Colors additionalColor;
    //уровень качества предмета
    protected MaterialQuality quality;



    //стандартные геттеры сеттеры

    public MaterialQuality getQuality() {
        return quality;
    }

    public void setQuality(MaterialQuality quality) {
        this.quality = quality;
    }

    public ItemTypes getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypes itemType) {
        this.itemType = itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Colors getMainColor() {
        return mainColor;
    }

    public void setMainColor(Colors mainColor) {
        this.mainColor = mainColor;
    }

    public Colors getAdditionalColor() {
        return additionalColor;
    }

    public void setAdditionalColor(Colors additionalColor) {
        this.additionalColor = additionalColor;
    }
}
