package net.derrick.tutorialmod.effects;

import net.derrick.tutorialmod.TutorialMod;
import net.derrick.tutorialmod.effects.gymstatuseffect.GymBroStatusEffect;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final StatusEffect GYMBRO = registerStatusEffect("gymbro", new GymBroStatusEffect());


    private static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TutorialMod.MOD_ID, name), effect);
    }

    public static void registerStatusEffects() {
        TutorialMod.LOGGER.info("Registering Mod Status Effects for " + TutorialMod.MOD_ID);
        // Register a callback for the AttackEntityEvent
        AttackEntityCallback.EVENT.register((player, world, hand, entity, entityHitResult) -> {
            // Check if the attacked entity is a living entity
            if (entity instanceof LivingEntity && entity != player) {
                // Apply your custom effect to the entity
                StatusEffectInstance gymBro = new StatusEffectInstance(GYMBRO, 600, 1);
                ((LivingEntity) entity).addStatusEffect(gymBro);
            }
            return ActionResult.PASS; // Return ActionResult.PASS to allow other mods to handle the event
        });
    }
}
