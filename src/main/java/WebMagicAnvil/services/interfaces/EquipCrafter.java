package WebMagicAnvil.services.interfaces;

import WebMagicAnvil.models.Decoration;
import WebMagicAnvil.models.Equipment;
import WebMagicAnvil.models.Material;
import WebMagicAnvil.utils.EquipTypes;

public interface EquipCrafter {

    Equipment equipCraft(EquipTypes equipType,
                         Material mainMaterial,
                         Material additionalMaterial,
                         Decoration decor);
}
