package net.derrick.tutorialmod.potions;

import net.derrick.tutorialmod.TutorialMod;
import net.derrick.tutorialmod.effects.ModStatusEffects;
import net.derrick.tutorialmod.effects.gymstatuseffect.GymBroStatusEffect;
import net.derrick.tutorialmod.potions.gympotion.GymBroPotion;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final Potion GYMBRO_POTION =
            Registry.register(Registries.POTION, new Identifier("tutorialmod", "gym_bro_potion"),
                    new GymBroPotion()
            );

    public static void registerPotions() {
        TutorialMod.LOGGER.info("Registering Mod Status Effects for " + TutorialMod.MOD_ID);

    }

    public static void registerPotionsRecipes() {

    }
}
