package spartan.meumod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import spartan.meumod.blocks.RubyOreEndStone;
import spartan.meumod.blocks.RubyOreDeepSlate;
import spartan.meumod.blocks.RubyOreNetherrack;
import spartan.meumod.blocks.RubyOreStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("meumod")
public class Meumod {
    public static final String MOD_ID = "meumod";
    
    public Meumod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(modEventBus);
       

        System.out.println("Meumod foi carregado!");
    }
}