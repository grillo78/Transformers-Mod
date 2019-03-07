package com.marctron.transformersmod.util.handlers;

import com.marctron.transformersmod.entity.EntityVehicon;
import com.marctron.transformersmod.entity.render.RenderVehicon;

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
	}

}