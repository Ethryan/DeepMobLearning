package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntityAngler;

public class BetweenlandsAnglerfishMeta extends MobMetaData {
    static String[] mobTrivia = {"Underwater Creatures", "Anglers, Silt Crabs, Cave Fishes and Lurkers", "Between the surface and the darkness."};

    BetweenlandsAnglerfishMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityAnglerSprite getEntity(World world) {
        return new EntityAnglerSprite(world);
    }

    @Override
    public String getExtraTooltip() {
        return "Gain data by defeating underwater creatures";
    }
}
