package com.marctron.transformersmod.util.handlers;

import com.marctron.transformersmod.blocks.BlockEnergonCrate;
import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.entity.EntityLargeRocket;
import com.marctron.transformersmod.entity.EntitySwindle;
import com.marctron.transformersmod.entity.EntityVehicon;
import com.marctron.transformersmod.entity.render.RenderBullet;
import com.marctron.transformersmod.entity.render.RenderRocket;
import com.marctron.transformersmod.entity.render.RenderSwindle;
import com.marctron.transformersmod.entity.render.RenderVehicon;
import com.marctron.transformersmod.init.ModItems;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicon.class, new IRenderFactory<EntityVehicon>()
		{
			@Override
			public Render<? super EntityVehicon> createRenderFor(RenderManager manager)
			{
				return new RenderVehicon(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySwindle.class, new IRenderFactory<EntitySwindle>()
		{
			@Override
			public Render<? super EntitySwindle> createRenderFor(RenderManager manager)
			{
				return new RenderSwindle(manager);
			}
		});
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new IRenderFactory<EntityBullet>()
		{
			@Override
			public Render<? super EntityBullet> createRenderFor(RenderManager manager) 
			{
				return new RenderBullet(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLargeRocket.class, new IRenderFactory<EntityLargeRocket>()
		{
			@Override
			public Render<? super EntityLargeRocket> createRenderFor(RenderManager manager) 
			{
				return new RenderRocket(manager);
			}
		});
		
	}

}
