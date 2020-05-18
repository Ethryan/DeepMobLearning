package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntityChiromaw;

public class BetweenlandsChiromawMeta extends MobMetaData {
    static String[] mobTrivia = {"Chiromaws", "Nightmares of the sky."};

    BetweenlandsChiromawMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityChiromaw getEntity(World world) {
        return new EntityChiromaw(world);
    }
}
