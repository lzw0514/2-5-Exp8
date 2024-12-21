//不调用商铺模块的ShopMapper方法


//School of Informatics Xiamen University, GPL-3.0 license
package cn.edu.xmu.oomall.product.mapper.openfeign;

import cn.edu.xmu.javaee.core.model.InternalReturnObject;
import cn.edu.xmu.oomall.product.mapper.openfeign.po.Shop;
import cn.edu.xmu.oomall.product.mapper.openfeign.po.Template;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("shop-service")
public interface ShopMapper {

    @GetMapping("/shops/{id}")
    InternalReturnObject<Shop> getShopById1(@PathVariable Long id);
    @GetMapping("/shops/{shopId}/templates/{id}")
    InternalReturnObject<Template> getTemplateById1(@PathVariable Long shopId, @PathVariable Long id);

    public default InternalReturnObject<Shop> getShopById(Long id) {
        // 返回空的 Shop 对象
        Shop shop = new Shop();
        shop.setId(id);
        shop.setStatus((byte) 0);
        shop.setConsignee(null);
        shop.setDeposit(0L);
        shop.setDepositThreshold(0L);
        shop.setName("");
        return new InternalReturnObject<>(shop);
    }

    public default InternalReturnObject<Template> getTemplateById(Long shopId, Long id) {
        // 返回空的 Template 对象
        Template template = new Template();
        template.setId(id);
        template.setName("");
        return new InternalReturnObject<>(template);
    }



}
