package WebMagicAnvil.models;

import WebMagicAnvil.utils.EffectTypes;
import WebMagicAnvil.utils.Elements;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "effects")
public class Effect implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long effectId;
    /**Название эффекта**/
    private String effectName;
    /**Описание эффекта**/
    private String effectDescription;
    /**Шанс прока эффекта**/
    private Integer chance;
    /**Действительный шанс прока эффекта. Высчитывается уже на изготовленном предмете**/
    private Integer realChance;
    /**Тип эффекта**/
    @Enumerated(EnumType.STRING)
    private EffectTypes effectType;
    /**стихия эффекта**/
    @Enumerated(EnumType.STRING)
    private Elements element;

    /**этот метод используется для создания описания эффекта на созданном предмете**/
    public String getNameWithPercentages(Integer multiplier){
        StringBuilder s = new StringBuilder();
        this.realChance = chance*multiplier;
        Integer res = realChance;
        if(res!=0) {
            s.append(effectName + ":\n");
            s.append(effectDescription + "\n");
            s.append(" Шанс срабатывания " + res + " процентов \n ******** \n");
        }
        return s.toString();
    }

    //стандартные геттеры сеттеры

    public Long getEffectId() {
        return effectId;
    }

    public void setEffectId(Long id) {
        this.effectId = id;
    }

    public String getEffectName() {
        return effectName;
    }

    public void setEffectName(String effectName) {
        this.effectName = effectName;
    }

    public String getEffectDescription() {
        return effectDescription;
    }

    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public Integer getRealChance() {
        return realChance;
    }

    public void setRealChance(Integer realChance) {
        this.realChance = realChance;
    }

    public EffectTypes getEffectType() {
        return effectType;
    }

    public void setEffectType(EffectTypes effectType) {
        this.effectType = effectType;
    }

    public Elements getElement() {
        return element;
    }

    public void setElement(Elements element) {
        this.element = element;
    }
}
