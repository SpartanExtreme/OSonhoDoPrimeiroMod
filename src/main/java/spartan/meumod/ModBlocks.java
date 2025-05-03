package spartan.meumod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import spartan.meumod.blocks.RubyOreStone;
import spartan.meumod.blocks.RubyOreEndStone;
import spartan.meumod.blocks.RubyOreDeepSlate;
import spartan.meumod.blocks.RubyOreNetherrack;

public class ModBlocks { 
    public static final String MOD_ID = "meumod";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
           

public static final RegistryObject<Block> RUBY_ORE_STONE = 
   BLOCKS.register("ruby_ore_stone", RubyOreStone::new);
  
public static final RegistryObject<Item> RUBY_ORE_STONE_ITEM = ITEMS.register("ruby_ore_stone", 
   () -> new BlockItem(RUBY_ORE_STONE.get(), new Item.Properties()));

public static final RegistryObject<Block> RUBY_ORE_ENDSTONE = 
   BLOCKS.register("ruby_ore_endstone", RubyOreEndStone::new);
public static final RegistryObject<Item> RUBY_ORE_ENDSTONE_ITEM = ITEMS.register("ruby_ore_endstone", 
   () -> new BlockItem(RUBY_ORE_ENDSTONE.get(), new Item.Properties()));

public static final RegistryObject<Block> RUBY_ORE_DEEPSLATE = 
   BLOCKS.register("ruby_ore_deepslate", RubyOreDeepSlate::new);
public static final RegistryObject<Item> RUBY_ORE_DEEPSLATE_ITEM = ITEMS.register("ruby_ore_deepslate", 
   () -> new BlockItem(RUBY_ORE_DEEPSLATE.get(), new Item.Properties()));

public static final RegistryObject<Block> RUBY_ORE_NETHERRACK = 
   BLOCKS.register("ruby_ore_netherrack", RubyOreNetherrack::new);
  
public static final RegistryObject<Item> RUBY_ORE_NETHERRACK_ITEM = ITEMS.register("ruby_ore_netherrack", 
   () -> new BlockItem(RUBY_ORE_NETHERRACK.get(), new Item.Properties()));
   
 public static final RegistryObject<CreativeModeTab> MEUMOD_TAB = TABS.register("meumod_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.meumod"))
            .icon(() -> new ItemStack(RUBY_ORE_STONE_ITEM.get()))
            .displayItems((params, output) -> {
               output.accept(RUBY_ORE_STONE_ITEM.get());
               output.accept(RUBY_ORE_ENDSTONE_ITEM.get());
               output.accept(RUBY_ORE_DEEPSLATE_ITEM.get());
               output.accept(RUBY_ORE_NETHERRACK_ITEM.get());
            
           })
           .build());
        public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);

        
        }
      }
   
   

