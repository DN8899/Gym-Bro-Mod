package net.derrick.tutorialmod.stamina;

import net.minecraft.util.math.MathHelper;

public class StaminaCapability implements IStaminaCapability {
    private int stamina = 100;
    @Override
    public int getStamina() {
        return stamina;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = MathHelper.clamp(stamina, 0, getMaxStamina());
    }

    private int getMaxStamina() {
        return 100;
    }
}
