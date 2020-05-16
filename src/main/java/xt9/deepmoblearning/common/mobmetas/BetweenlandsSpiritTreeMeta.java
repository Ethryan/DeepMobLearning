package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntitySpiritTreeFaceLarge;

public class BetweenlandsSpiritTreeMeta extends MobMetaData {
    static String[] mobTrivia = {"Corrupted Spirits", "In an tree form."};

    BetweenlandsSpiritTreeMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntitySpiritTreeFaceLargeSprite getEntity(World world) {
        return new EntitySpiritTreeFaceLargeSprite(world);
    }

    @Override
    public String getExtraTooltip() {
        return "Gain data by defeating the corrupted spirit tree.";
    }
}
