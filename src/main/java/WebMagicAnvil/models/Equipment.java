package WebMagicAnvil.models;

import WebMagicAnvil.utils.EquipTypes;
import WebMagicAnvil.utils.ItemTypes;
import WebMagicAnvil.utils.Stats;

import java.util.HashMap;
import java.util.HashSet;

public class Equipment extends AbstractItem {

    /**тип нашего предмета**/
    private EquipTypes equipType;
    /**список статов предмета**/
    private HashMap<Stats,Integer> stats;
    /**список работающих эффектов**/
    private HashSet<Effect> activeEffect;
    /**создание сразу предмета снаряжения соответствующего типа**/
    public Equipment(EquipTypes type){
        this.itemType = ItemTypes.EQUIPMENT;
        this.equipType= type;
    }
    /**конструктор по умолчанию**/
    public Equipment(){
        this.itemType = ItemTypes.EQUIPMENT;
    }
    /**Перечисляем все возможные види снаряжения (не считая оружия и бижутерии)**/


    public EquipTypes getEquipType() {
        return equipType;
    }

    public void setEquipType(EquipTypes equipType) {
        this.equipType = equipType;
    }

    //стандартные геттеры сеттеры

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<Stats,Integer> stats) {
        this.stats = stats;
    }

    public HashSet<Effect> getActiveEffect() {
        return activeEffect;
    }

    public void setActiveEffect(HashSet<Effect> activeEffect) {
        this.activeEffect = activeEffect;
    }
}
