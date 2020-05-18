package xt9.deepmoblearning.common.mobmetas;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import thebetweenlands.common.entity.mobs.EntityBarrishee;

public class BetweenlandsSludgeonMeta extends MobMetaData {
    static String[] mobTrivia = {"Creatures from the depths", "The corrupted heart of the world"};

    BetweenlandsSludgeonMeta(String key, String name, String pluralName, int numberOfHearts, int interfaceScale, int interfaceOffsetX, int interfaceOffsetY, Item livingMatter, Item pristineMatter) {
        super(key, name, pluralName, numberOfHearts, interfaceScale, interfaceOffsetX, interfaceOffsetY, livingMatter, pristineMatter, mobTrivia);
    }

    public EntityBarrishee getEntity(World world) {
        return new EntityBarrishee(world);
    }

    @Override
    public String getExtraTooltip() {
        return "Gain data by defeating creatures from the sealed vaults.";
    }
}
