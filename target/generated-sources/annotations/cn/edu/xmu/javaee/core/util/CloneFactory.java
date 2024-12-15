package cn.edu.xmu.javaee.core.util;

import cn.edu.xmu.oomall.product.controller.dto.CategoryDto;
import cn.edu.xmu.oomall.product.controller.dto.CouponActDto;
import cn.edu.xmu.oomall.product.controller.dto.GrouponActDto;
import cn.edu.xmu.oomall.product.controller.dto.OnSaleDto;
import cn.edu.xmu.oomall.product.controller.dto.ProductDraftDto;
import cn.edu.xmu.oomall.product.controller.dto.ProductDto;
import cn.edu.xmu.oomall.product.controller.vo.CategoryVo;
import cn.edu.xmu.oomall.product.controller.vo.CouponActVo;
import cn.edu.xmu.oomall.product.controller.vo.DiscountVo;
import cn.edu.xmu.oomall.product.controller.vo.FullGrouponActVo;
import cn.edu.xmu.oomall.product.controller.vo.FullProductVo;
import cn.edu.xmu.oomall.product.controller.vo.GrouponActVo;
import cn.edu.xmu.oomall.product.controller.vo.OnsaleVo;
import cn.edu.xmu.oomall.product.controller.vo.ProductDraftVo;
import cn.edu.xmu.oomall.product.controller.vo.ProductVo;
import cn.edu.xmu.oomall.product.controller.vo.SimpleCouponActVo;
import cn.edu.xmu.oomall.product.controller.vo.SimpleGrouponActVo;
import cn.edu.xmu.oomall.product.controller.vo.SimpleOnsaleVo;
import cn.edu.xmu.oomall.product.controller.vo.SimpleProductDraftVo;
import cn.edu.xmu.oomall.product.controller.vo.SimpleProductVo;
import cn.edu.xmu.oomall.product.dao.bo.Activity;
import cn.edu.xmu.oomall.product.dao.bo.Category;
import cn.edu.xmu.oomall.product.dao.bo.CouponAct;
import cn.edu.xmu.oomall.product.dao.bo.GrouponAct;
import cn.edu.xmu.oomall.product.dao.bo.OnSale;
import cn.edu.xmu.oomall.product.dao.bo.Product;
import cn.edu.xmu.oomall.product.dao.bo.ProductDraft;
import cn.edu.xmu.oomall.product.mapper.po.ActivityPo;
import cn.edu.xmu.oomall.product.mapper.po.CategoryPo;
import cn.edu.xmu.oomall.product.mapper.po.CouponActPo;
import cn.edu.xmu.oomall.product.mapper.po.GrouponActPo;
import cn.edu.xmu.oomall.product.mapper.po.OnsalePo;
import cn.edu.xmu.oomall.product.mapper.po.ProductDraftPo;
import cn.edu.xmu.oomall.product.mapper.po.ProductPo;
import cn.edu.xmu.oomall.product.model.strategy.Item;

public final class CloneFactory {
  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CategoryVo copy(CategoryVo target, Category source) {
    target.setId(source.getId());
    target.setCommissionRatio(source.getCommissionRatio());
    target.setName(source.getName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponActVo copy(CouponActVo target, CouponAct source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setQuantity(source.getQuantity());
    target.setCouponTime(source.getCouponTime());
    target.setQuantityType(source.getQuantityType());
    target.setValidTerm(source.getValidTerm());
    target.setStrategy(source.getStrategy());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static DiscountVo copy(DiscountVo target, Item source) {
    target.setId(source.getId());
    target.setQuantity(source.getQuantity());
    target.setPrice(source.getPrice());
    target.setDiscount(source.getDiscount());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static FullGrouponActVo copy(FullGrouponActVo target, GrouponAct source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setThresholds(source.getThresholds());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static FullGrouponActVo copy(FullGrouponActVo target, OnSale source) {
    target.setId(source.getId());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static FullProductVo copy(FullProductVo target, Product source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setSkuSn(source.getSkuSn());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setWeight(source.getWeight());
    target.setStatus(source.getStatus());
    target.setUnit(source.getUnit());
    target.setOriginPlace(source.getOriginPlace());
    target.setFreeThreshold(source.getFreeThreshold());
    target.setCommissionRatio(source.getCommissionRatio());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponActVo copy(GrouponActVo target, GrouponAct source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setThresholds(source.getThresholds());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponActVo copy(GrouponActVo target, OnSale source) {
    target.setId(source.getId());
    target.setShop(source.getShop());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static OnsaleVo copy(OnsaleVo target, OnSale source) {
    target.setId(source.getId());
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setType(source.getType());
    target.setShop(source.getShop());
    target.setProduct(source.getProduct());
    target.setActList(source.getActList());
    target.setDeposit(source.getDeposit());
    target.setPayTime(source.getPayTime());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductDraftVo copy(ProductDraftVo target, ProductDraft source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setOriginPlace(source.getOriginPlace());
    target.setShop(source.getShop());
    target.setCategory(source.getCategory());
    target.setProduct(source.getProduct());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setUnit(source.getUnit());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductVo copy(ProductVo target, Product source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setStatus(source.getStatus());
    target.setSkuSn(source.getSkuSn());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setWeight(source.getWeight());
    target.setBarcode(source.getBarcode());
    target.setUnit(source.getUnit());
    target.setOriginPlace(source.getOriginPlace());
    target.setOtherProduct(source.getOtherProduct());
    target.setPrice(source.getPrice());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setShop(source.getShop());
    target.setCategory(source.getCategory());
    target.setFreeThreshold(source.getFreeThreshold());
    target.setActList(source.getActList());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductVo copy(ProductVo target, OnSale source) {
    target.setPrice(source.getPrice());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setShop(source.getShop());
    target.setActList(source.getActList());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleCouponActVo copy(SimpleCouponActVo target, CouponAct source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setQuantity(source.getQuantity());
    target.setCouponTime(source.getCouponTime());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleGrouponActVo copy(SimpleGrouponActVo target, OnSale source) {
    target.setId(source.getId());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleGrouponActVo copy(SimpleGrouponActVo target, GrouponAct source) {
    target.setId(source.getId());
    target.setName(source.getName());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleOnsaleVo copy(SimpleOnsaleVo target, OnSale source) {
    target.setId(source.getId());
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setType(source.getType());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleProductDraftVo copy(SimpleProductDraftVo target, ProductDraft source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setOriginPlace(source.getOriginPlace());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setUnit(source.getUnit());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleProductVo copy(SimpleProductVo target, Product source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setPrice(source.getPrice());
    target.setStatus(source.getStatus());
    target.setQuantity(source.getQuantity());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static SimpleProductVo copy(SimpleProductVo target, OnSale source) {
    target.setId(source.getId());
    target.setPrice(source.getPrice());
    target.setQuantity(source.getQuantity());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Category copy(Category target, CategoryPo source) {
    target.setName(source.getName());
    target.setPid(source.getPid());
    target.setCommissionRatio(source.getCommissionRatio());
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Category copy(Category target, CategoryDto source) {
    target.setName(source.getName());
    target.setCommissionRatio(source.getCommissionRatio());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponAct copy(CouponAct target, ActivityPo source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setName(source.getName());
    target.setObjectId(source.getObjectId());
    target.setActClass(source.getActClass());
    target.setStatus(source.getStatus());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponAct copy(CouponAct target, CouponActPo source) {
    target.setObjectId(source.getObjectId());
    target.setCouponTime(source.getCouponTime());
    target.setQuantity(source.getQuantity());
    target.setQuantityType(source.getQuantityType());
    target.setValidTerm(source.getValidTerm());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponAct copy(CouponAct target, CouponActDto source) {
    target.setName(source.getName());
    target.setCouponTime(source.getCouponTime());
    target.setQuantity(source.getQuantity());
    target.setQuantityType(source.getQuantityType());
    target.setValidTerm(source.getValidTerm());
    target.setStrategy(source.getStrategy());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponAct copy(GrouponAct target, GrouponActDto source) {
    target.setName(source.getName());
    target.setThresholds(source.getThresholds());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponAct copy(GrouponAct target, GrouponActPo source) {
    target.setObjectId(source.getObjectId());
    target.setThresholds(source.getThresholds());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponAct copy(GrouponAct target, ActivityPo source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setName(source.getName());
    target.setObjectId(source.getObjectId());
    target.setActClass(source.getActClass());
    target.setStatus(source.getStatus());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static OnSale copy(OnSale target, OnsalePo source) {
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setShopId(source.getShopId());
    target.setProductId(source.getProductId());
    target.setType(source.getType());
    target.setDeposit(source.getDeposit());
    target.setPayTime(source.getPayTime());
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static OnSale copy(OnSale target, OnSaleDto source) {
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setType(source.getType());
    target.setDeposit(source.getDeposit());
    target.setPayTime(source.getPayTime());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static OnSale copy(OnSale target, GrouponActDto source) {
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setQuantity(source.getQuantity());
    target.setMaxQuantity(source.getMaxQuantity());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Product copy(Product target, ProductDraft source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setUnit(source.getUnit());
    target.setOriginPlace(source.getOriginPlace());
    target.setCategoryId(source.getCategoryId());
    target.setShopId(source.getShopId());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Product copy(Product target, ProductDto source) {
    target.setSkuSn(source.getSkuSn());
    target.setWeight(source.getWeight());
    target.setBarcode(source.getBarcode());
    target.setTemplateId(source.getTemplateId());
    target.setFreeThreshold(source.getFreeThreshold());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Product copy(Product target, ProductPo source) {
    target.setStatus(source.getStatus());
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setSkuSn(source.getSkuSn());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setWeight(source.getWeight());
    target.setBarcode(source.getBarcode());
    target.setUnit(source.getUnit());
    target.setOriginPlace(source.getOriginPlace());
    target.setShopLogisticId(source.getShopLogisticId());
    target.setGoodsId(source.getGoodsId());
    target.setCategoryId(source.getCategoryId());
    target.setShopId(source.getShopId());
    target.setTemplateId(source.getTemplateId());
    target.setFreeThreshold(source.getFreeThreshold());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductDraft copy(ProductDraft target, ProductDraftDto source) {
    target.setUnit(source.getUnit());
    target.setCategoryId(source.getCategoryId());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setOriginPlace(source.getOriginPlace());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductDraft copy(ProductDraft target, ProductDraftPo source) {
    target.setUnit(source.getUnit());
    target.setShopId(source.getShopId());
    target.setCategoryId(source.getCategoryId());
    target.setProductId(source.getProductId());
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setOriginPlace(source.getOriginPlace());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ActivityPo copy(ActivityPo target, Activity source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setName(source.getName());
    target.setObjectId(source.getObjectId());
    target.setActClass(source.getActClass());
    target.setStatus(source.getStatus());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CategoryPo copy(CategoryPo target, Category source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setName(source.getName());
    target.setCommissionRatio(source.getCommissionRatio());
    target.setPid(source.getPid());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponActPo copy(CouponActPo target, CouponAct source) {
    target.setObjectId(source.getObjectId());
    target.setCouponTime(source.getCouponTime());
    target.setQuantity(source.getQuantity());
    target.setQuantityType(source.getQuantityType());
    target.setValidTerm(source.getValidTerm());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static CouponActPo copy(CouponActPo target, Activity source) {
    target.setObjectId(source.getObjectId());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static GrouponActPo copy(GrouponActPo target, GrouponAct source) {
    target.setObjectId(source.getObjectId());
    target.setThresholds(source.getThresholds());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static OnsalePo copy(OnsalePo target, OnSale source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setProductId(source.getProductId());
    target.setPrice(source.getPrice());
    target.setBeginTime(source.getBeginTime());
    target.setEndTime(source.getEndTime());
    target.setQuantity(source.getQuantity());
    target.setType(source.getType());
    target.setMaxQuantity(source.getMaxQuantity());
    target.setPayTime(source.getPayTime());
    target.setDeposit(source.getDeposit());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductDraftPo copy(ProductDraftPo target, ProductDraft source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setProductId(source.getProductId());
    target.setCategoryId(source.getCategoryId());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setOriginPlace(source.getOriginPlace());
    target.setUnit(source.getUnit());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static ProductPo copy(ProductPo target, Product source) {
    target.setId(source.getId());
    target.setCreatorId(source.getCreatorId());
    target.setCreatorName(source.getCreatorName());
    target.setModifierId(source.getModifierId());
    target.setModifierName(source.getModifierName());
    target.setGmtCreate(source.getGmtCreate());
    target.setGmtModified(source.getGmtModified());
    target.setShopId(source.getShopId());
    target.setGoodsId(source.getGoodsId());
    target.setCategoryId(source.getCategoryId());
    target.setTemplateId(source.getTemplateId());
    target.setSkuSn(source.getSkuSn());
    target.setName(source.getName());
    target.setOriginalPrice(source.getOriginalPrice());
    target.setWeight(source.getWeight());
    target.setBarcode(source.getBarcode());
    target.setUnit(source.getUnit());
    target.setOriginPlace(source.getOriginPlace());
    target.setShopLogisticId(source.getShopLogisticId());
    target.setCommissionRatio(source.getCommissionRatio());
    target.setStatus(source.getStatus());
    target.setFreeThreshold(source.getFreeThreshold());
    return target;
  }

  /**
   * Copy all fields from source to target
   * @param target the target object
   * @param source the source object
   * @return the copied target object
   */
  public static Item copy(Item target, Product source) {
    target.setId(source.getId());
    target.setName(source.getName());
    target.setCategoryId(source.getCategoryId());
    target.setQuantity(source.getQuantity());
    target.setPrice(source.getPrice());
    return target;
  }
}
