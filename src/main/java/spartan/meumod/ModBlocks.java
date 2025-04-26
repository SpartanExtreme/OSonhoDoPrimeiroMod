package spartan.meumod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import spartan.meumod.blocks.RubyOre;

public class ModBlocks { 
    public static final String MOD_ID = "meumod";
     
     public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, "meumod");
     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID );

     public static final RegistryObject<Block> RUBY_ORE = 
        BLOCKS.register("ruby_ore", RubyOre::new);

     public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", 
        () -> new BlockItem(RUBY_ORE.get(), new Item.Properties()));

        public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        
        }
    
}
