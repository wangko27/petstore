# petstore
petsotre,build nuls start contract

## 项目背景
> Leo Wanta有一个宠物店，有16只宠物，他想开发一个去中心化应用，把宠物放到网上，让大家来购买宠物。 

```shell
/**
 * 构造函数测试
 */
BigDecimal _int = new BigDecimal(19);
BigDecimal _double = new BigDecimal(4.56);
BigDecimal _long = new BigDecimal(5634345L);
BigDecimal _String = new BigDecimal("1000022");

/**
 * 基本方法
 */
BigDecimal amount = BigDecimal.TEN;
BigDecimal fee = BigDecimal.ONE;

BigDecimal add = amount.add(fee);
BigDecimal subtract = amount.subtract(fee);
BigDecimal multiply = amount.multiply(fee);

BigDecimal divisor = new BigDecimal("4.5678");
/**
 * 保留3位小数，且四舍五入
 * ROUND_CEILING  向正无穷方向舍入
 * ROUND_DOWN   向零方向舍入
 * ROUND_FLOOR   向负无穷方向舍入
 * ROUND_HALF_DOWN  向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向下舍入, 例如1.55 保留一位小数结果为1.5
 * ROUND_HALF_EVEN  向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，如果保留位数是奇数，使用ROUND_HALF_UP，如果是偶数，使用ROUND_HALF_DOWN
 * ROUND_HALF_UP    向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向上舍入, 1.55保留一位小数结果为1.6
 * ROUND_UNNECESSARY  计算结果是精确的，不需要舍入模式
 * ROUND_UP 向远离0的方向舍入
 */
BigDecimal result = amount.divide(divisor, 3, RoundingMode.HALF_UP);

/**
 * 普通方法
 */
String _toString = amount.toString();
Double _doubleValue = amount.doubleValue();
Float _floatValue = amount.floatValue();
Long _longValue = amount.longValue();
Integer _intValue = amount.intValue();

/**
 * 科学计数法问题
 */
BigDecimal hex = new BigDecimal("192320012000000000000000");
String hex2 = hex.toString();
String plain = hex.toPlainString();

/**
 * 比较测试
 */
```