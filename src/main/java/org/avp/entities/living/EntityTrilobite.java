package org.avp.entities.living;

import org.avp.client.Sounds;
import org.avp.entities.ai.EntityAICustomAttackOnCollide;
import org.avp.entities.ai.alien.EntitySelectorXenomorph;

import com.asx.mdx.lib.world.entity.animations.Animation;
import com.asx.mdx.lib.world.entity.animations.IAnimated;
import com.asx.mdx.lib.world.entity.animations.ai.AIAttack;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityTrilobite extends EntitySpeciesAlien implements IMob, IAnimated
{
    public static final Animation ATTACK_ANIMATION = Animation.create(50);

    public int                    frame;
    private int                   animationTick;
    private Animation             animation        = NO_ANIMATION;
    
    public EntityTrilobite(World world)
    {
        super(world);

        this.setSize(1.5F, 1.65F);
        this.experienceValue = 32;

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new AIAttack<EntityTrilobite>(this, ATTACK_ANIMATION, null, null, 2 /** knockback **/, 4.5F /** range **/, 1.0F /** damageMultiplier **/, 3 /** damageFrame **/));
        this.tasks.addTask(3, new EntityAICustomAttackOnCollide(this, 0.800000011920929D, true));
        this.tasks.addTask(8, new EntityAIWander(this, 0.800000011920929D));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAILeapAtTarget(this, 1.0F));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, EntitySelectorXenomorph.instance));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(44.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5499999761581421D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1F);
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        frame++;
        
        if (getActiveAnimation() != NO_ANIMATION)
        {
            animationTick++;
            
            if (world.isRemote && animationTick >= animation.getDuration())
            {
                setActiveAnimation(NO_ANIMATION);
            }
        }
        
        // int s = 2;
        // long ms = this.world.getWorldTime() % (80 * s);
        // float speed = 0.1F;
        // travel(0, 0, speed);
        //
        // if (ms < 20 * s)
        // {
        // this.rotationYaw = 0;
        // }
        // if (ms > 20 * s && ms < 40 * s)
        // {
        // this.rotationYaw = 270;
        // }
        // if (ms > 40 * s && ms < 60 * s)
        // {
        // this.rotationYaw = 180;
        //
        // if (ms == (40 * s + 1))
        // {
        // this.setPosition(-525, 3, 453);
        // }
        // }
        // if (ms > 60 * s && ms < 80 * s)
        // {
        // this.rotationYaw = 90;
        // }
        
        if (this.collidedHorizontally)
        {
            this.motionY += 0.25F;
        }

        this.fallDistance = 0F;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return Sounds.FACEHUGGER_HURT.event();
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return Sounds.CHESTBURSTER_BURST.event();
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return Sounds.FACEHUGGER_LIVING.event();
    }

    @Override
    protected boolean canTriggerWalking()
    {
        return true;
    }

    @Override
    public boolean isOnLadder()
    {
        return this.collidedHorizontally;
    }

    public boolean isClimbing()
    {
        return this.isOnLadder() && this.motionY > 1.0099999997764826D;
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potionEffect)
    {
        return potionEffect.getPotion() == MobEffects.POISON ? false : super.isPotionApplicable(potionEffect);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        return false;
    }
    
    @Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return super.attackEntityFrom(source, amount);
    }
    
    /** Animation Dependent **/

    @Override
    public int getAnimationTick()
    {
        return this.animationTick;
    }

    @Override
    public void setAnimationTick(int tick)
    {
        this.animationTick = tick;
    }

    @Override
    public Animation getActiveAnimation()
    {
        return this.animation;
    }

    @Override
    public void setActiveAnimation(Animation animation)
    {
        if (animation == NO_ANIMATION)
        {
            onAnimationFinish(this.animation);
        }
        
        this.animation = animation;
        setAnimationTick(0);
    }

    @Override
    public Animation[] getAnimations()
    {
        return new Animation[] { ATTACK_ANIMATION };
    }

    protected void onAnimationFinish(Animation animation)
    {
        ;
    }
}
