package org.avp.client.model.entities.living;

import com.asx.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;

public class ModelMyceliomorph extends Model
{
    public ModelRenderer chest;
    public ModelRenderer abdomen;
    public ModelRenderer backSpines1;
    public ModelRenderer backSpines2;
    public ModelRenderer neck;
    public ModelRenderer headBase;
    public ModelRenderer lThigh;
    public ModelRenderer rThigh;
    public ModelRenderer lArm1;
    public ModelRenderer rArm1;
    public ModelRenderer tail1;
    public ModelRenderer shoom1a;
    public ModelRenderer shoom2a;
    public ModelRenderer shoom4a;
    public ModelRenderer shoom6a;
    public ModelRenderer headTop;
    public ModelRenderer rHead;
    public ModelRenderer lHead;
    public ModelRenderer jaw2;
    public ModelRenderer jawLower;
    public ModelRenderer innerJaw;
    public ModelRenderer faceMycelium;
    public ModelRenderer mushroomSprouts;
    public ModelRenderer mushroomSprouts2;
    public ModelRenderer lShin1;
    public ModelRenderer lShin2;
    public ModelRenderer lFoot;
    public ModelRenderer lLegMycelium;
    public ModelRenderer rShin1;
    public ModelRenderer mushroomSprouts3;
    public ModelRenderer rShin2;
    public ModelRenderer rFoot;
    public ModelRenderer rLegMycelium;
    public ModelRenderer lArm2;
    public ModelRenderer lClaw1;
    public ModelRenderer armMycelium;
    public ModelRenderer lClaw2;
    public ModelRenderer rArm2;
    public ModelRenderer rClaw1;
    public ModelRenderer rClaw2;
    public ModelRenderer tail2;
    public ModelRenderer tailSpines1;
    public ModelRenderer shoom3a;
    public ModelRenderer shoom5a;
    public ModelRenderer tailSpines2;
    public ModelRenderer tail3;
    public ModelRenderer tailSpines3;
    public ModelRenderer tail4;
    public ModelRenderer tailSpines4;
    public ModelRenderer tail5;
    public ModelRenderer tailSpines5;
    public ModelRenderer tailMycelium;
    public ModelRenderer shoom3b;
    public ModelRenderer shoom5b;
    public ModelRenderer shoom1b;
    public ModelRenderer shoom2b;
    public ModelRenderer shoom4b;
    public ModelRenderer shoom6b;

    public ModelMyceliomorph()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.headTop = new ModelRenderer(this, 28, 10);
        this.headTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headTop.addBox(-2.5F, -11.8F, -4.7F, 5, 10, 5, 0.0F);
        this.setRotation(headTop, -0.31869712141416456F, -0.0F, 0.0F);
        this.jawLower = new ModelRenderer(this, 88, 1);
        this.jawLower.setRotationPoint(0.0F, 6.7F, 2.3F);
        this.jawLower.addBox(-1.5F, -0.5F, -5.2F, 3, 1, 5, 0.0F);
        this.setRotation(jawLower, 0.7740535232594852F, 0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.setRotationPoint(1.0F, 8.2F, 0.0F);
        this.lFoot.addBox(-1.0F, -1.0F, -4.4F, 2, 2, 5, 0.0F);
        this.setRotation(lFoot, 0.5462880558742251F, 0.0F, 0.136659280431156F);
        this.rShin1 = new ModelRenderer(this, 79, 33);
        this.rShin1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.rShin1.addBox(-1.0F, 0.0F, -0.5F, 3, 3, 12, 0.0F);
        this.shoom5b = new ModelRenderer(this, 146, 0);
        this.shoom5b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom5b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.backSpines1 = new ModelRenderer(this, 0, 67);
        this.backSpines1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backSpines1.addBox(0.0F, -5.8F, 0.0F, 0, 6, 10, 0.0F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.setRotationPoint(-0.9F, 12.9F, 0.6F);
        this.rArm2.addBox(-1.2F, -1.1F, -10.6F, 2, 2, 11, 0.0F);
        this.setRotation(rArm2, 0.9560913642424937F, -0.0F, -0.045553093477052F);
        this.tailSpines3 = new ModelRenderer(this, 118, 94);
        this.tailSpines3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines3.addBox(0.0F, -2.9F, 1.3F, 0, 6, 10, 0.0F);
        this.shoom6a = new ModelRenderer(this, 131, 0);
        this.shoom6a.setRotationPoint(-4.1F, 2.2F, 5.7F);
        this.shoom6a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.setRotation(shoom6a, 0.0F, 0.0F, -0.6829473363053812F);
        this.tailSpines2 = new ModelRenderer(this, 90, 93);
        this.tailSpines2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines2.addBox(0.0F, -4.5F, 0.2F, 0, 8, 11, 0.0F);
        this.shoom2a = new ModelRenderer(this, 131, 0);
        this.shoom2a.setRotationPoint(-1.9F, 0.5F, 10.4F);
        this.shoom2a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.setRotation(shoom2a, -0.27314402793711257F, 0.0F, -0.36425021489121656F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lClaw2.addBox(-1.9F, 1.0F, -5.8F, 3, 0, 6, 0.0F);
        this.tailSpines1 = new ModelRenderer(this, 58, 93);
        this.tailSpines1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines1.addBox(0.0F, -4.7F, 0.0F, 0, 8, 11, 0.0F);
        this.tail3 = new ModelRenderer(this, 118, 66);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail3.addBox(-1.5F, -1.8F, 0.0F, 3, 3, 11, 0.0F);
        this.setRotation(tail3, 0.10175269539126941F, -0.0F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.rFoot.addBox(-1.0F, -1.0F, -4.4F, 2, 2, 5, 0.0F);
        this.setRotation(rFoot, 0.5462880558742251F, 0.0F, -0.136659280431156F);
        this.armMycelium = new ModelRenderer(this, 133, 19);
        this.armMycelium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armMycelium.addBox(0.0F, 0.0F, -9.9F, 0, 8, 11, 0.0F);
        this.lArm1 = new ModelRenderer(this, 40, 29);
        this.lArm1.setRotationPoint(3.5F, 3.5F, 3.5F);
        this.lArm1.addBox(0.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(lArm1, 0.12217304763960307F, -0.0F, -0.24434609527920614F);
        this.shoom1b = new ModelRenderer(this, 146, 0);
        this.shoom1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom1b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.setRotationPoint(4.5F, 3.5F, 16.0F);
        this.lThigh.addBox(-2.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(lThigh, -0.4923573819876004F, -0.2228785454796759F, -0.43022366061660217F);
        this.rClaw1 = new ModelRenderer(this, 72, 24);
        this.rClaw1.setRotationPoint(0.0F, -0.1F, -10.3F);
        this.rClaw1.addBox(-1.1F, 0.0F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotation(rClaw1, -1.0471975511965976F, -0.091106186954104F, -0.22759093446006054F);
        this.tailMycelium = new ModelRenderer(this, 205, 66);
        this.tailMycelium.setRotationPoint(0.0F, 0.3F, 2.9F);
        this.tailMycelium.addBox(0.0F, -0.4F, -9.1F, 0, 14, 19, 0.0F);
        this.shoom1a = new ModelRenderer(this, 131, 0);
        this.shoom1a.setRotationPoint(3.6F, 0.6F, 8.0F);
        this.shoom1a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.shoom4b = new ModelRenderer(this, 146, 0);
        this.shoom4b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom4b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.faceMycelium = new ModelRenderer(this, 168, 0);
        this.faceMycelium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.faceMycelium.addBox(-1.5F, 3.9F, -7.1F, 4, 16, 9, 0.0F);
        this.setRotation(faceMycelium, 0.5918411493512771F, 0.0F, 0.0F);
        this.lHead = new ModelRenderer(this, 53, 0);
        this.lHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHead.addBox(-0.5F, 4.1F, -6.7F, 3, 3, 5, 0.0F);
        this.setRotation(lHead, 0.5009094953223726F, -0.0F, 0.0F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rClaw2.addBox(-1.1F, 1.0F, -5.8F, 3, 0, 6, 0.0F);
        this.rShin2 = new ModelRenderer(this, 113, 53);
        this.rShin2.setRotationPoint(0.3F, 1.5F, 10.4F);
        this.rShin2.addBox(-1.0F, -0.2F, -1.1F, 2, 9, 2, 0.0F);
        this.setRotation(rShin2, 0.0F, 0.0F, -0.36425021489121656F);
        this.tail2 = new ModelRenderer(this, 85, 66);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail2.addBox(-2.0F, -2.5F, -0.1F, 4, 4, 11, 0.0F);
        this.setRotation(tail2, 0.091106186954104F, -0.0F, 0.0F);
        this.mushroomSprouts2 = new ModelRenderer(this, 133, 19);
        this.mushroomSprouts2.mirror = true;
        this.mushroomSprouts2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mushroomSprouts2.addBox(-5.5F, -9.0F, -0.5F, 6, 6, 0, 0.0F);
        this.tailSpines4 = new ModelRenderer(this, 148, 96);
        this.tailSpines4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines4.addBox(0.0F, -2.1F, 0.5F, 0, 4, 10, 0.0F);
        this.shoom6b = new ModelRenderer(this, 146, 0);
        this.shoom6b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom6b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.rArm1 = new ModelRenderer(this, 50, 29);
        this.rArm1.setRotationPoint(-3.5F, 3.5F, 3.5F);
        this.rArm1.addBox(-2.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(rArm1, 0.12217304763960307F, -0.0F, 0.24434609527920614F);
        this.chest = new ModelRenderer(this, 0, 46);
        this.chest.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.chest.addBox(-4.5F, 0.0F, 0.0F, 9, 8, 10, 0.0F);
        this.rLegMycelium = new ModelRenderer(this, 151, 33);
        this.rLegMycelium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLegMycelium.addBox(0.0F, -1.6F, -0.5F, 0, 10, 8, 0.0F);
        this.tail1 = new ModelRenderer(this, 50, 66);
        this.tail1.setRotationPoint(0.0F, 3.5F, 18.5F);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotation(tail1, -0.40142572795869574F, -0.0F, 0.0F);
        this.innerJaw = new ModelRenderer(this, 0, 18);
        this.innerJaw.setRotationPoint(0.0F, 6.4F, 1.2F);
        this.innerJaw.addBox(-1.0F, -0.7F, -4.6F, 2, 2, 5, 0.0F);
        this.setRotation(innerJaw, 0.7740535232594852F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 27);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.abdomen.addBox(-3.5F, 0.5F, 8.0F, 7, 6, 12, 0.0F);
        this.shoom3b = new ModelRenderer(this, 146, 0);
        this.shoom3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom3b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.lLegMycelium = new ModelRenderer(this, 133, 33);
        this.lLegMycelium.mirror = true;
        this.lLegMycelium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLegMycelium.addBox(0.0F, -1.6F, -0.5F, 0, 10, 8, 0.0F);
        this.lArm2 = new ModelRenderer(this, 71, 9);
        this.lArm2.setRotationPoint(0.9F, 12.9F, 0.6F);
        this.lArm2.addBox(-0.9F, -1.1F, -10.6F, 2, 2, 11, 0.0F);
        this.setRotation(lArm2, 0.9560913642424937F, -0.0F, -0.045553093477052F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addBox(-1.5F, 5.0F, -8.4F, 3, 1, 5, 0.0F);
        this.setRotation(jaw2, 0.7740535232594852F, -0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotation(neck, -0.19198621771937624F, -0.0F, 0.0F);
        this.lShin1 = new ModelRenderer(this, 79, 49);
        this.lShin1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.lShin1.addBox(-2.0F, 0.0F, -0.5F, 3, 3, 12, 0.0F);
        this.mushroomSprouts = new ModelRenderer(this, 133, 19);
        this.mushroomSprouts.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mushroomSprouts.addBox(0.8F, -5.3F, -0.5F, 6, 6, 0, 0.0F);
        this.shoom3a = new ModelRenderer(this, 131, 0);
        this.shoom3a.setRotationPoint(-1.9F, -2.8F, 7.5F);
        this.shoom3a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.setRotation(shoom3a, 0.0F, 0.0F, -0.27314402793711257F);
        this.lClaw1 = new ModelRenderer(this, 83, 24);
        this.lClaw1.setRotationPoint(0.0F, -0.1F, -10.3F);
        this.lClaw1.addBox(-0.9F, 0.0F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotation(lClaw1, -1.0471975511965976F, 0.18203784098300857F, 0.22759093446006054F);
        this.shoom5a = new ModelRenderer(this, 131, 0);
        this.shoom5a.setRotationPoint(1.4F, -1.5F, 9.2F);
        this.shoom5a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.setRotation(shoom5a, 0.0F, 0.0F, 0.7285004297824331F);
        this.shoom2b = new ModelRenderer(this, 146, 0);
        this.shoom2b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoom2b.addBox(0.0F, -6.0F, -3.0F, 0, 6, 6, 0.0F);
        this.lShin2 = new ModelRenderer(this, 113, 40);
        this.lShin2.setRotationPoint(-1.3F, 1.5F, 10.4F);
        this.lShin2.addBox(0.0F, -0.2F, -1.1F, 2, 9, 2, 0.0F);
        this.setRotation(lShin2, 0.0F, 0.0F, 0.36425021489121656F);
        this.shoom4a = new ModelRenderer(this, 131, 0);
        this.shoom4a.setRotationPoint(2.6F, 0.5F, 16.3F);
        this.shoom4a.addBox(-3.0F, -6.0F, 0.0F, 6, 6, 0, 0.0F);
        this.setRotation(shoom4a, 0.0F, 0.0F, 0.22759093446006054F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.setRotationPoint(-4.5F, 3.5F, 16.0F);
        this.rThigh.addBox(-1.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(rThigh, -0.4923573819876004F, 0.2228785454796759F, 0.43022366061660217F);
        this.backSpines2 = new ModelRenderer(this, 23, 65);
        this.backSpines2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backSpines2.addBox(0.0F, -5.5F, 8.5F, 0, 6, 12, 0.0F);
        this.tail5 = new ModelRenderer(this, 178, 66);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addBox(-0.5F, -0.2F, 0.0F, 1, 1, 11, 0.0F);
        this.setRotation(tail5, 0.091106186954104F, -0.0F, 0.0F);
        this.rHead = new ModelRenderer(this, 34, 0);
        this.rHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHead.addBox(-2.51F, 4.1F, -6.7F, 3, 3, 5, 0.0F);
        this.setRotation(rHead, 0.5009094953223726F, -0.0F, 0.0F);
        this.mushroomSprouts3 = new ModelRenderer(this, 160, 25);
        this.mushroomSprouts3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.mushroomSprouts3.addBox(1.8F, -0.9F, 2.8F, 0, 6, 6, 0.0F);
        this.setRotation(mushroomSprouts3, 0.0F, -0.8196066167365371F, 0.0F);
        this.tailSpines5 = new ModelRenderer(this, 177, 96);
        this.tailSpines5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines5.addBox(0.0F, -0.9F, 0.4F, 0, 3, 11, 0.0F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.setRotationPoint(0.0F, 0.4F, -1.4F);
        this.headBase.addBox(-2.5F, -3.2F, -3.9F, 5, 10, 5, 0.0F);
        this.setRotation(headBase, -0.6017895260876448F, -0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 149, 66);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F);
        this.setRotation(tail4, 0.091106186954104F, -0.0F, 0.0F);
        this.headBase.addChild(this.headTop);
        this.headBase.addChild(this.jawLower);
        this.lShin2.addChild(this.lFoot);
        this.rThigh.addChild(this.rShin1);
        this.shoom5a.addChild(this.shoom5b);
        this.chest.addChild(this.backSpines1);
        this.rArm1.addChild(this.rArm2);
        this.tail3.addChild(this.tailSpines3);
        this.chest.addChild(this.shoom6a);
        this.tail2.addChild(this.tailSpines2);
        this.chest.addChild(this.shoom2a);
        this.lClaw1.addChild(this.lClaw2);
        this.tail1.addChild(this.tailSpines1);
        this.tail2.addChild(this.tail3);
        this.rShin2.addChild(this.rFoot);
        this.lArm2.addChild(this.armMycelium);
        this.chest.addChild(this.lArm1);
        this.shoom1a.addChild(this.shoom1b);
        this.chest.addChild(this.lThigh);
        this.rArm2.addChild(this.rClaw1);
        this.tail5.addChild(this.tailMycelium);
        this.chest.addChild(this.shoom1a);
        this.shoom4a.addChild(this.shoom4b);
        this.headBase.addChild(this.faceMycelium);
        this.headBase.addChild(this.lHead);
        this.rClaw1.addChild(this.rClaw2);
        this.rShin1.addChild(this.rShin2);
        this.tail1.addChild(this.tail2);
        this.headBase.addChild(this.mushroomSprouts2);
        this.tail4.addChild(this.tailSpines4);
        this.shoom6a.addChild(this.shoom6b);
        this.chest.addChild(this.rArm1);
        this.rShin2.addChild(this.rLegMycelium);
        this.chest.addChild(this.tail1);
        this.headBase.addChild(this.innerJaw);
        this.chest.addChild(this.abdomen);
        this.shoom3a.addChild(this.shoom3b);
        this.lShin2.addChild(this.lLegMycelium);
        this.lArm1.addChild(this.lArm2);
        this.headBase.addChild(this.jaw2);
        this.chest.addChild(this.neck);
        this.lThigh.addChild(this.lShin1);
        this.headBase.addChild(this.mushroomSprouts);
        this.tail1.addChild(this.shoom3a);
        this.lArm2.addChild(this.lClaw1);
        this.tail1.addChild(this.shoom5a);
        this.shoom2a.addChild(this.shoom2b);
        this.lShin1.addChild(this.lShin2);
        this.chest.addChild(this.shoom4a);
        this.chest.addChild(this.rThigh);
        this.chest.addChild(this.backSpines2);
        this.tail4.addChild(this.tail5);
        this.headBase.addChild(this.rHead);
        this.rThigh.addChild(this.mushroomSprouts3);
        this.tail5.addChild(this.tailSpines5);
        this.chest.addChild(this.headBase);
        this.tail3.addChild(this.tail4);
    }

    @Override
    public void render(Object obj)
    {
        draw(chest);
    }
}
