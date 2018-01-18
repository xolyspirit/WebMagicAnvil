package WebMagicAnvil.services.interfaces;

import WebMagicAnvil.models.Material;

import java.util.HashMap;

public interface MaterialPropertyReader {
    HashMap<String, Material> getMaterials();

}
