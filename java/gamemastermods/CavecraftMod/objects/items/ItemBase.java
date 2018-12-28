package gamemastermods.CavecraftMod.objects.items;

import gamemastermods.CavecraftMod.Main;
import gamemastermods.CavecraftMod.init.ItemInit;
import gamemastermods.CavecraftMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRender(this, 0, "inventory");
	}
	
}