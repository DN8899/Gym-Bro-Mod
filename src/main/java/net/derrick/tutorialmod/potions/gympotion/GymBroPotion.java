package net.derrick.tutorialmod.potions.gympotion;

import net.derrick.tutorialmod.effects.ModStatusEffects;
import net.derrick.tutorialmod.effects.gymstatuseffect.GymBroStatusEffect;
import net.derrick.tutorialmod.potions.ModPotions;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;

public class GymBroPotion extends Potion {
    public GymBroPotion () {
        super("gym_bro_potion", new StatusEffectInstance(ModStatusEffects.GYMBRO, 100, 2));
    }

    public static Item createItem() {
        return Items.POTION;
    }

    public static ItemStack createStack() {
        return PotionUtil.setPotion(new ItemStack(createItem()), ModPotions.GYMBRO_POTION);
    }

}
