package net.derrick.tutorialmod.effects.gymstatuseffect;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.DamageSourcePredicate;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GymBroStatusEffect extends StatusEffect {
    public GymBroStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFF0000);
    }

    //FUNNY ONE WHERE I GO FLYING
//    @Override
//    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
//        if (entity instanceof PlayerEntity attacker) {
//            double pushbackStrength = 30.0; // Adjust the strength as needed
//            entity.addVelocity(-Math.sin(attacker.getYaw() * (Math.PI / 180.0)) * pushbackStrength, 0.5, Math.cos(attacker.getYaw() * (Math.PI / 180.0)) * pushbackStrength);
//        }
//    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Apply knockback effect when the status effect is active

        double knockbackStrength = 1.5; // Adjust strength as needed

        // Get the entity's look vector (direction it's facing)
        Vec3d lookVec = entity.getRotationVector().normalize();

        // Calculate the new motion based on the knockback direction
        double motionX = -lookVec.x * knockbackStrength;
        double motionY = 0.5; // Adjust upward motion as needed
        double motionZ = -lookVec.z * knockbackStrength;

        //WORKED SOLUTION
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        if (entity != player) {
            entity.addVelocity(motionX, motionY, motionZ);
        }

    }


    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
