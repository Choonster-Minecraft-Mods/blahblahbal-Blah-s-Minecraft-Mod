package blahmod.items;

import blahmod.Main;
import net.minecraft.item.ItemSpade;

public class ItemModShovel extends ItemSpade {

	public ItemModShovel(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(Main.blahTab);
	}
}