package net.derrick.tutorialmod;

import net.derrick.tutorialmod.effects.gymstatuseffect.GymBroStatusEffect;
import net.derrick.tutorialmod.effects.ModStatusEffects;
import net.derrick.tutorialmod.item.ModItems;
import net.derrick.tutorialmod.potions.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final StatusEffect GYMBRO = new GymBroStatusEffect();

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModStatusEffects.registerStatusEffects();
		ModPotions.registerPotions();

	}
}