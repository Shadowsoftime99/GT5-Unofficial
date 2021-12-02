package gregtech.common.tileentities.storage;

import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class GT_MetaTileEntity_QuantumChest extends GT_MetaTileEntity_DigitalChestBase {
    public int mItemCount = 0;
    public ItemStack mItemStack = null;
    NBTTagList mInvData = null;

    public GT_MetaTileEntity_QuantumChest(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier);
    }

    public GT_MetaTileEntity_QuantumChest(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_QuantumChest(mName, mTier, mDescriptionArray, mTextures);
    }

    @Override
    public void setItemNBT(NBTTagCompound aNBT) {
        mInvData = new NBTTagList();
        for (int i = 0; i < 3; i++) {
            if (mInventory[i] != null) {
                NBTTagCompound tNBT = new NBTTagCompound();
                tNBT.setByte("Count", (byte) mInventory[i].stackSize);
                tNBT.setShort("Damage", (short) mInventory[i].getItemDamage());
                tNBT.setShort("id", (short) Item.getIdFromItem(mInventory[i].getItem()));
                tNBT.setInteger("IntSlot", i);
                if (mInventory[i].hasTagCompound()) {
                    tNBT.setTag("tag", mInventory[i].getTagCompound());
                }
                mInvData.appendTag(tNBT);
            }
        }
        if (mItemStack != null)
            aNBT.setTag("mItemStack", getItemStack().writeToNBT(new NBTTagCompound()));
        aNBT.setTag("Inventory", mInvData);
        aNBT.setInteger("mItemCount", getItemCount());
        aNBT.setBoolean("mVoidOverflow", mVoidOverflow);
        super.setItemNBT(aNBT);
    }

    @Override
    protected String chestName() {
        return  "Quantum Chest";
    }

    @Override
    public int getItemCount() {
        return mItemCount;
    }

    @Override
    public void setItemCount(int aCount) {
        mItemCount = aCount;
    }

    @Override
    public ItemStack getItemStack() {
        return  mItemStack;
    }

    @Override
    public void setItemStack(ItemStack s) {
        mItemStack = s;
    }
}
