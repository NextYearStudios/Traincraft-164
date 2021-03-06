package src.train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;

public class ItemTrain extends Item {

	public ItemTrain(int i) {
		super(i);
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/" + ItemIDs.getIcon(this.itemID));
	}
}