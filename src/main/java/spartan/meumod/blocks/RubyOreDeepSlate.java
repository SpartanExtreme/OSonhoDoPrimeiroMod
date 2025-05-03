package spartan.meumod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class RubyOreDeepSlate extends Block {
    public RubyOreDeepSlate() {
        super(BlockBehaviour.Properties.of()
            .mapColor(MapColor.DEEPSLATE)
            .strength(3.0f, 3.0f)
            .requiresCorrectToolForDrops());}}
    

