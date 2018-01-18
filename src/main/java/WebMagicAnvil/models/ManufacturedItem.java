package WebMagicAnvil.models;

import WebMagicAnvil.utils.EquipTypes;

/**Этот класс пригодится в будущем, пока недоработан**/
public class ManufacturedItem {
    private EquipTypes type;
    private Material mainMaterial;
    private Material additionalMaterial;
    private Decoration decor;

    public EquipTypes getType() {
        return type;
    }

    public void setType(EquipTypes type) {
        this.type = type;
    }

    public Material getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Material mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public Material getAdditionalMaterial() {
        return additionalMaterial;
    }

    public void setAdditionalMaterial(Material additionalMaterial) {
        this.additionalMaterial = additionalMaterial;
    }

    public Decoration getDecor() {
        return decor;
    }

    public void setDecor(Decoration decor) {
        this.decor = decor;
    }
}
