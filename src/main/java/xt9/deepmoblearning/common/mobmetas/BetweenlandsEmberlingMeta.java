package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntityEmberling;

public class BetweenlandsEmberlingMeta extends MobMetaData {
    static String[] mobTrivia = {"Emberling", "Watch out for fire"};

    BetweenlandsEmberlingMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityEmberling getEntity(World world) {
        return new EntityEmberling(world);
    }
}
