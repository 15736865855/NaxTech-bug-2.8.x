package com.onlyex.naxtech.mixin.gregtech;


import com.onlyex.naxtech.api.items.metaitem.IRenderer;
import com.onlyex.naxtech.api.items.metaitem.stats.renderer.IItemRendererManager;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.stats.IItemComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value = MetaItem.MetaValueItem.class, remap = false)
public abstract class MixinMetaValueItem implements IRenderer {

    private IItemRendererManager rendererManager;

    @Override
    public IItemRendererManager getRendererManager() {
        return rendererManager;
    }

    @Inject(
            method = "addItemComponentsInternal([Lgregtech/api/items/metaitem/stats/IItemComponent;)V",
            at = @At(
                    value = "FIELD",
                    target = "Lgregtech/api/items/metaitem/MetaItem$MetaValueItem;allStats:Ljava/util/List;"
            ),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void addItemComponentsInternal(IItemComponent[] stats, CallbackInfo ci, IItemComponent[] var2, int var3, int var4, IItemComponent itemComponent) {
        if (itemComponent instanceof  IItemRendererManager manager) {
            rendererManager = manager;
        }
    }
}
