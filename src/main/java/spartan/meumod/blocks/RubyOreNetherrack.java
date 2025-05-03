package spartan.meumod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class RubyOreNetherrack extends Block {
    public RubyOreNetherrack() {
        super(BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE)
            .strength(3.0f, 3.0f)
            .requiresCorrectToolForDrops());}}
            
    

