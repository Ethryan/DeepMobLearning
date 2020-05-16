package xt9.deepmoblearning.common.items;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xt9.deepmoblearning.common.config.Config;
import xt9.deepmoblearning.common.mobmetas.MobKey;

/**
 * Created by xt9 on 2017-12-20.
 */
public class ItemPristineMatter extends ItemBase {
    private String mobKey;

    private ItemPristineMatter(String name, String mobKey) {
        super(name, 64);
        this.mobKey = mobKey;
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public String getMobKey() {
        return mobKey;
    }

    public NonNullList<ItemStack> getLootTable() {
        return Config.LootParser.getPristineLootEntries(getMobKey());
    }

    public static class Blaze extends ItemPristineMatter {
        public Blaze() {
            super("pristine_matter_blaze", MobKey.BLAZE);
        }
    }

    public static class Creeper extends ItemPristineMatter {
        public Creeper() {
            super("pristine_matter_creeper", MobKey.CREEPER);
        }
    }

    public static class Dragon extends ItemPristineMatter {
        public Dragon() {
            super("pristine_matter_dragon", MobKey.DRAGON);
        }
    }

    public static class Enderman extends ItemPristineMatter {
        public Enderman() {
            super("pristine_matter_enderman", MobKey.ENDERMAN);
        }
    }

    public static class Ghast extends ItemPristineMatter {
        public Ghast() {
            super("pristine_matter_ghast", MobKey.GHAST);
        }
    }

    public static class Guardian extends ItemPristineMatter {
        public Guardian() {
            super("pristine_matter_guardian", MobKey.GUARDIAN);
        }
    }

    public static class Shulker extends ItemPristineMatter {
        public Shulker() {
            super("pristine_matter_shulker", MobKey.SHULKER);
        }
    }

    public static class Skeleton extends ItemPristineMatter {
        public Skeleton() {
            super("pristine_matter_skeleton", MobKey.SKELETON);
        }
    }

    public static class Slime extends ItemPristineMatter {
        public Slime() {
            super("pristine_matter_slime", MobKey.SLIME);
        }
    }

    public static class Spider extends ItemPristineMatter {
        public Spider() {
            super("pristine_matter_spider", MobKey.SPIDER);
        }
    }

    public static class Witch extends ItemPristineMatter {
        public Witch() {
            super("pristine_matter_witch", MobKey.WITCH);
        }
    }

    public static class Wither extends ItemPristineMatter {
        public Wither() {
            super("pristine_matter_wither", MobKey.WITHER);
        }
    }

    public static class WitherSkeleton extends ItemPristineMatter {
        public WitherSkeleton() {
            super("pristine_matter_wither_skeleton", MobKey.WITHERSKELETON);
        }
    }

    public static class Zombie extends ItemPristineMatter {
        public Zombie() {
            super("pristine_matter_zombie", MobKey.ZOMBIE);
        }
    }

    public static class TEBlizz extends ItemPristineMatter {
        public TEBlizz() {
            super("pristine_matter_thermal_blizz", MobKey.BLIZZ);
        }
    }
	
    public static class TEBlitz extends ItemPristineMatter {
        public TEBlitz() {
            super("pristine_matter_thermal_blitz", MobKey.BLITZ);
        }
    }

    public static class TEBasalz extends ItemPristineMatter {
        public TEBasalz() {
            super("pristine_matter_thermal_basalz", MobKey.BASALZ);
        }
    }

    public static class TwilightForest extends ItemPristineMatter {
        public TwilightForest() {
            super("pristine_matter_twilight_forest", MobKey.TWILIGHTFOREST);
        }
    }

    public static class TwilightSwamp extends ItemPristineMatter {
        public TwilightSwamp() {
            super("pristine_matter_twilight_swamp", MobKey.TWILIGHTSWAMP);
        }
    }

    public static class TwilightDarkwood extends ItemPristineMatter {
        public TwilightDarkwood() {
            super("pristine_matter_twilight_darkwood", MobKey.TWILIGHTDARKWOOD);
        }
    }

    public static class TwilightGlacier extends ItemPristineMatter {
        public TwilightGlacier() {
            super("pristine_matter_twilight_glacier", MobKey.TWILIGHTGLACIER);
        }
    }

    public static class BetweenlandsBoulder extends ItemPristineMatter {
        public BetweenlandsBoulder() {
            super("pristine_matter_betweenlands_boulder", MobKey.BWBOULDER);
        }
    }

    public static class BetweenlandsDruids extends ItemPristineMatter {
        public BetweenlandsDruids() {
            super("pristine_matter_betweenlands_druids", MobKey.BWDRUIDS);
        }
    }

    public static class BetweenlandsAnglerfish extends ItemPristineMatter {
        public BetweenlandsAnglerfish() {
            super("pristine_matter_betweenlands_anglerfish", MobKey.BWANGLERFISH);
        }
    }

    public static class BetweenlandsChiromaw extends ItemPristineMatter {
        public BetweenlandsChiromaw() {
            super("pristine_matter_betweenlands_chiromaw", MobKey.BWCHIROMAW);
        }
    }

    public static class BetweenlandsSludge extends ItemPristineMatter {
        public BetweenlandsSludge() {
            super("pristine_matter_betweenlands_sludge", MobKey.BWSLUDGE);
        }
    }

    public static class BetweenlandsSludgeon extends ItemPristineMatter {
        public BetweenlandsSludgeon() {
            super("pristine_matter_betweenlands_sludgeon", MobKey.BWSLUDGEON);
        }
    }

    public static class BetweenlandsEmberling extends ItemPristineMatter {
        public BetweenlandsEmberling() {
            super("pristine_matter_betweenlands_emberling", MobKey.BWEMBERLING);
        }
    }

    public static class BetweenlandsSpiritTree extends ItemPristineMatter {
        public BetweenlandsSpiritTree() {
            super("pristine_matter_betweenlands_spirittree", MobKey.BWSPIRITTREE);
        }
    }

    public static class TinkerSlime extends ItemPristineMatter {
        public TinkerSlime() {
            super("pristine_matter_tinker_slime", MobKey.TINKERSLIME);
        }
    }

    public static class MOAndroid extends ItemPristineMatter {
        public MOAndroid() {
            super("pristine_matter_mo_android", MobKey.MO_ANDROID);
        }
    }
}
