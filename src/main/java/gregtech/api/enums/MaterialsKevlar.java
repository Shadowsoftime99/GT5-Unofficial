package gregtech.api.enums;

import gregtech.api.objects.MaterialStack;

import java.util.Arrays;

public class MaterialsKevlar {
    public static Materials DiphenylmethaneDiisocyanate = new MaterialBuilder(796, TextureSet.SET_DULL, "Diphenylmethane 4,4′-diisocyanate").setName("DiphenylmethaneDiisocyanate").addDustItems().setRGB(255, 230, 50).setColor(Dyes.dyeYellow).setMeltingPoint(310).setMaterialList(new MaterialStack(Materials.Carbon, 15), new MaterialStack(Materials.Hydrogen, 10), new MaterialStack(Materials.Nitrogen, 2), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VENENUM, 1))).constructMaterial();//C15H10N2O2
    public static Materials DiaminodiphenylmethanMixture = new MaterialBuilder(795, TextureSet.SET_FLUID, "4,4′-Diaminodiphenylmethan Mixture").setName("DiaminodiphenylmethanMixture").addCell().addFluid().setRGB(255, 243, 122).setColor(Dyes.dyeYellow).setMeltingPoint(365).setMaterialList(new MaterialStack(Materials.Carbon, 13), new MaterialStack(Materials.Hydrogen, 14), new MaterialStack(Materials.Nitrogen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VENENUM, 1))).constructMaterial();//C13H14N2
    public static Materials DiphenylmethaneDiisocyanateMixture = new MaterialBuilder(794, TextureSet.SET_FLUID, "Diphenylmethane 4,4′-diisocyanate Mixture").setName("DiphenylmethaneDiisocyanateMixture").addCell().addFluid().setRGB(255, 230, 50).setColor(Dyes.dyeYellow).setMeltingPoint(310).setMaterialList(new MaterialStack(Materials.Carbon, 15), new MaterialStack(Materials.Hydrogen, 10), new MaterialStack(Materials.Nitrogen, 2), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VENENUM, 1))).constructMaterial();//C15H10N2O2
    public static Materials Butyraldehyde = new MaterialBuilder(793, TextureSet.SET_FLUID, "Butyraldehyde").setName("Butyraldehyde").addCell().addFluid().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(176).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(Materials.Oxygen, 1)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.IGNIS, 1))).constructMaterial();//C4H8O
    public static Materials Isobutyraldehyde = new MaterialBuilder(792, TextureSet.SET_FLUID, "Isobutyraldehyde").setName("Isobutyraldehyde").addCell().addFluid().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(208).setExtraData(1).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(Materials.Oxygen, 1)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.IGNIS, 1))).constructMaterial();//C4H8O
    public static Materials NickelTetracarbonyl = new MaterialBuilder(791, TextureSet.SET_FLUID, "Nickel Tetracarbonyl").setName("NickelTetracarbonyl").addCell().addFluid().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(256).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Nickel, 1), new MaterialStack(Materials.Oxygen, 4)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 1))).constructMaterial();//C4NiO4
    public static Materials KevlarCatalyst = new MaterialBuilder(790, TextureSet.SET_DULL, "Kevlar Catalyst").setName("KevlarCatalyst").addDustItems().setRGB(50, 50, 50).setColor(Dyes.dyeBlack).setMeltingPoint(300).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.LUCRUM, 1))).constructMaterial();
    public static Materials EthylenOxide = new MaterialBuilder(789, TextureSet.SET_FLUID, "Ethylen Oxide").setName("EthylenOxide").addCell().addGas().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(160).setMaterialList(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Oxygen, 1)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.IGNIS, 1))).constructMaterial();//C2H4O
    public static Materials SiliconOil = new MaterialBuilder(788, TextureSet.SET_FLUID, "Silicon Oil").setName("SiliconOil").addCell().addFluid().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(473).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.MACHINA, 1))).constructMaterial();
    public static Materials Ethyleneglycol = new MaterialBuilder(787, TextureSet.SET_FLUID, "Ethylene Glycol").setName("EthyleneGlycol").addCell().addFluid().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(260).setMaterialList(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.IGNIS, 1))).constructMaterial();//C2H6O2
    public static Materials Acetaldehyde = new MaterialBuilder(786, TextureSet.SET_FLUID, "Acetaldehyde").setName("Acetaldehyde").addCell().addGas().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(150).setMaterialList(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Oxygen, 1)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.AQUA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.IGNIS, 1))).constructMaterial();//C2H4O
    public static Materials Pentaerythritol = new MaterialBuilder(785, TextureSet.SET_DULL, "Pentaerythritol").setName("Pentaerythritol").addDustItems().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(533).setMaterialList(new MaterialStack(Materials.Carbon, 5), new MaterialStack(Materials.Hydrogen, 12), new MaterialStack(Materials.Oxygen, 4)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.LUCRUM, 1))).constructMaterial();//C5H12O4
    public static Materials IIINitrochlorobenzene = new MaterialBuilder(784, TextureSet.SET_DULL, "3-Nitrochlorobenzene").setName("3Nitrochlorobenzene").addDustItems().setRGB(247, 247, 126).setColor(Dyes.dyeYellow).setMeltingPoint(316).setExtraData(1).setMaterialList(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Chlorine, 1), new MaterialStack(Materials.Nitrogen, 1), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VENENUM, 1))).constructMaterial();//C6H4ClNO2
    public static Materials IVNitrochlorobenzene = new MaterialBuilder(783, TextureSet.SET_DULL, "4-Nitrochlorobenzene").setName("4Nitrochlorobenzene").addDustItems().setRGB(247, 247, 126).setColor(Dyes.dyeYellow).setMeltingPoint(357).setExtraData(1).setMaterialList(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 4), new MaterialStack(Materials.Chlorine, 1), new MaterialStack(Materials.Nitrogen, 1), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VENENUM, 1))).constructMaterial();//C6H4ClNO2
    public static Materials IIButenIIVdiol = new MaterialBuilder(782, TextureSet.SET_POWDER, "2-Buten-1,4-diol").setName("2Buten14diol").addDustItems().setRGB(247, 247, 134).setColor(Dyes.dyeYellow).setMeltingPoint(283).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 8), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VITREUS, 1))).constructMaterial();//C4H8O2
    public static Materials Acetylen = new MaterialBuilder(781, TextureSet.SET_FLUID, "Acetylen").setName("Acetylen").addCell().addGas().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(192).setMaterialList(new MaterialStack(Materials.Carbon, 2), new MaterialStack(Materials.Hydrogen, 2)).constructMaterial();//C2H2 TODO Add to JUPITER Athmosphere and Enceladus and to moon of Saturn
    public static Materials IVNitroaniline = new MaterialBuilder(780, TextureSet.SET_POWDER, "4-Nitroaniline").setName("4Nitroaniline").addDustItems().setRGB(255, 135, 51).setColor(Dyes.dyeOrange).setMeltingPoint(420).setMaterialList(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Nitrogen, 2), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VITREUS, 1))).constructMaterial();//C6H6N2O2
    public static Materials ParaPhenylenediamine = new MaterialBuilder(779, TextureSet.SET_POWDER, "p-Phenylenediamine").setName("pPhenylenediamine").addDustItems().setRGB(255, 255, 255).setColor(Dyes.dyeWhite).setMeltingPoint(293).setMaterialList(new MaterialStack(Materials.Carbon, 6), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Nitrogen, 2), new MaterialStack(Materials.Oxygen, 2)).setAspects(Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.TERRA, 1), new TC_Aspects.TC_AspectStack(TC_Aspects.VITREUS, 1))).constructMaterial();//C6H6N2O2
    public static Materials Methylamine = new MaterialBuilder(778, TextureSet.SET_FLUID, "Methylamine").setName("Methylamine").addCell().addGas().setRGB(65, 68, 105).setColor(Dyes.dyeGray).setMeltingPoint(180).setMaterialList(new MaterialStack(Materials.Carbon, 1), new MaterialStack(Materials.Hydrogen, 1), new MaterialStack(Materials.Nitrogen, 5)).constructMaterial();//CH5N
    public static Materials Trimethylamine = new MaterialBuilder(777, TextureSet.SET_FLUID, "Trimethylamine").setName("Trimethylamine").addCell().addGas().setRGB(105, 68, 105).setColor(Dyes.dyeGray).setMeltingPoint(156).setMaterialList(new MaterialStack(Materials.Carbon, 3), new MaterialStack(Materials.Hydrogen, 9), new MaterialStack(Materials.Nitrogen, 1)).constructMaterial();//C3H9N
    public static Materials GammaButyrolactone = new MaterialBuilder(776, TextureSet.SET_FLUID, "γ-Butyrolactone").setName("GammaButyrolactone").addCell().addFluid().setRGB(255, 255, 151).setColor(Dyes.dyeYellow).setMeltingPoint(229).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)).constructMaterial();//C4H6O2
    public static Materials CalciumCarbide = new MaterialBuilder(775, TextureSet.SET_DULL, "Calcium Carbide").setName("CacliumCarbide").addDustItems().setRGB(235, 235, 235).setColor(Dyes.dyeGray).setMeltingPoint(2430).setMaterialList(new MaterialStack(Materials.Calcium, 1), new MaterialStack(Materials.Carbon, 2)).constructMaterial();//CaC2
    public static Materials CalciumHydroxide = new MaterialBuilder(774, TextureSet.SET_DULL, "Calcium Hydroxide").setName("CalciumHydroxide").addCell().addGas().setRGB(255, 255, 155).setColor(Dyes.dyeWhite).setMeltingPoint(853).setMaterialList(new MaterialStack(Materials.Calcium, 1), new MaterialStack(Materials.Carbon, 2)).constructMaterial();//Ca(OH)2
    public static Materials IIButinIIVdiol = new MaterialBuilder(773, TextureSet.SET_POWDER, "2-Butin-1,4-diol").setName("2Butin14diol").addDustItems().setRGB(247, 247, 180).setColor(Dyes.dyeYellow).setMeltingPoint(331).setMaterialList(new MaterialStack(Materials.Carbon, 4), new MaterialStack(Materials.Hydrogen, 6), new MaterialStack(Materials.Oxygen, 2)).constructMaterial();//C4H6O2
    public static Materials NickelAluminide = new MaterialBuilder(772, TextureSet.SET_METALLIC, "Nickel Aluminide").setName("NickelAluminide").addDustItems().addMetalItems().setRGB(230, 230, 230).setColor(Dyes.dyeGray).setMeltingPoint(1668).setBlastFurnaceTemp(1668).setBlastFurnaceRequired(true).setMaterialList(new MaterialStack(Materials.Nickel, 1), new MaterialStack(Materials.Aluminium, 3)).constructMaterial().disableAutoGeneratedBlastFurnaceRecipes();//NiAl3
    public static Materials RaneyNickelActivated = new MaterialBuilder(771, TextureSet.SET_POWDER, "Raney Nickel").setName("RaneyNickelActivated").addDustItems().setRGB(230, 230, 230).setColor(Dyes.dyeGray).setMeltingPoint(1955).setMaterialList(new MaterialStack(Materials.Nickel, 1), new MaterialStack(Materials.Aluminium, 1)).constructMaterial();//NiAl
    public static Materials CopperIIOxide = new MaterialBuilder(769, TextureSet.SET_POWDER, "Copper(II)oxide").setName("CopperIIOxide").addDustItems().setRGB(50, 50, 50).setColor(Dyes.dyeBlack).setMeltingPoint(1599).setMaterialList(new MaterialStack(Materials.Copper, 1), new MaterialStack(Materials.Oxygen, 1)).constructMaterial();//CuO
    public static Materials BismuthIIIOxide = new MaterialBuilder(768, TextureSet.SET_POWDER, "Bismuth(III) oxide").setName("BismuthIIIOxide").addDustItems().setRGB(50, 50, 50).setColor(Dyes.dyeBlack).setMeltingPoint(1090).setMaterialList(new MaterialStack(Materials.Bismuth, 2), new MaterialStack(Materials.Oxygen, 3)).constructMaterial();//Bi2O3

    //774-771 ok
    //769-760 ok
    /**
     * called by Materials. Can be safely called multiple times. exists to allow Materials ensure this class is initialized
     */
    public static void init() {
        // no-op. all work is done by <clinit>
    }
}
