package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntitySludge;

public class BetweenlandsSludgeMeta extends MobMetaData {
    static String[] mobTrivia = {"Sludge and Tarbeasts", "The corrupted heart of the world"};

    BetweenlandsSludgeMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntitySludgeSprite getEntity(World world) {
        return new EntitySludgeSprite(world);
    }

    @Override
    public String getExtraTooltip() {
        return "Gain data by defeating animated sludge.";
    }
}
