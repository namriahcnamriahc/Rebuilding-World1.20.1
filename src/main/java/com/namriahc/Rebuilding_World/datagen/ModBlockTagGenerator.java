package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Tags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Rebuilding_World.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(Rebuilding_World_Tags.Blocks.NEEDS_SHELL_STONE_TOOL)
                .add(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Rebuilding_World_Blocks.Blocks.SHELL_ROCK.get())
                .add(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(Rebuilding_World_Blocks.Blocks.FIRST_SOIL.get())
                .add(Rebuilding_World_Blocks.Blocks.SPONGE_SAND.get())
                .add(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND.get());

        this.tag(BlockTags.WALLS)
                .add(Rebuilding_World_Blocks.Blocks.SHELL_STONE_WALL.get());
    }


}



































