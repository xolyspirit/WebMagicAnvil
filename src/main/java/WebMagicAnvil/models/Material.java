package WebMagicAnvil.models;

import WebMagicAnvil.utils.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Material {
    /**Имя мятерала, которое мы будем использовать снаружи**/
    private String materialName;
    /**сделано из...**/
    private String craftedOfName;
    /** с добавлениями**/
    private String addedToCraftName;
    /** для каждого экземпляра материала этот показатель может быть разным**/
    private MaterialQuality quality;
    /** шкура дракона явно крепче шкурки кота. Мультипликатор показывает насколько**/
    private double qualityMultiplicator;
    /** стихийные свойства материала - единые для всех экземпляров материала**/
    private HashMap<Elements, Integer> elements;
    /** список эффектов, которые дает материал**/
    private ArrayList<Effect> effects;
    /** указывает на атрибут которые добавляет данный материал**/
    private Stats stat;
    /** указывает на преобладающий цвет материала**/
    private Colors color;
    /** тип материала**/
    private MaterialTypes materialType;

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public MaterialTypes getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialTypes materialType) {
        this.materialType = materialType;
    }

    public String getCraftedOfName() {
        return craftedOfName;
    }

    public void setCraftedOfName(String craftedOfName) {
        this.craftedOfName = craftedOfName;
    }

    public String getAddedToCraftName() {
        return addedToCraftName;
    }

    public void setAddedToCraftName(String addedToCraftName) {
        this.addedToCraftName = addedToCraftName;
    }

    public MaterialQuality getQuality() {
        return quality;
    }

    public void setQuality(MaterialQuality quality) {
        this.quality = quality;
    }

    public double getQualityMultiplicator() {
        return qualityMultiplicator;
    }

    public void setQualityMultiplicator(double qualityMultiplicator) {
        this.qualityMultiplicator = qualityMultiplicator;
    }

    public HashMap<Elements, Integer> getElements() {
        return elements;
    }

    public void setElements(HashMap<Elements, Integer> elements) {
        this.elements = elements;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    public Stats getStat() {
        return stat;
    }

    public void setStat(Stats stat) {
        this.stat = stat;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getMaterialName();
    }
}





