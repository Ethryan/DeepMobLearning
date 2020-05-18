package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntityDarkDruid;

public class BetweenlandsDruidsMeta extends MobMetaData {
    static String[] mobTrivia = {"Nightmares, Bonefiends and", "Dark Druids galore."};

    BetweenlandsDruidsMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityDarkDruid getEntity(World world) {
        return new EntityDarkDruid(world);
    }

    @Override
    public String getExtraTooltip() {
        return "Gain data by defeating the remnants of druids.";
    }
}
