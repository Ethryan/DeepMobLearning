package xt9.deepmoblearning.common.mobmetas;

import cofh.thermalfoundation.entity.monster.EntityBlitz;
import net.minecraft.world.World;
import net.minecraft.item.Item;

/**
 * Created by xt9 on 2017-06-12.
 */
public class ThermalBlitzMeta extends MobMetaData {
    static String[] mobTrivia = {"Blitzes", "The white sibling of the Blaze", "Their master really liked words starting with B"};

    ThermalBlitzMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityBlitz getEntity(World world) {
        return new EntityBlitz(world);
    }
}
