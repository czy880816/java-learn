package com.cipher.algorithms4.chapter1_1;

/**
 * @Author: CipherCui
 * @Description: 使用数学归纳法证明欧几里德算法能够计算任意一对非负整数p和q的最大公约数。
 * @Date: Created in 11:30 2018/7/10
 */
public class Ex25 {

    /**
     * 设两数为a、b(a > b)，求它们最大公约数的步骤如下：
     *
     * 设q = a / b，r = a % b, 得a＝bq＋r（0≤r＜b）。
     *
     * 1)若r = 0, 则b是a和b的最大公约数。
     *
     * 2)若r≠0,则继续考虑。首先，应该明白的一点是任何 a 和 b 的公约数都是 r 的公约数。要想证明这一点，就要考虑把 r 写成 r=a-bq。
     * 现在，如果 a 和 b 有一个公约数 d，而且设 a=sd , b=td, 那么 r = sd-tdq = (s-tq)d。
     * 因为这个式子中，所有的数（包括 s-tq )都为整数，所以 r 可以被 d 整除。对于所有的 d 的值，这都是正确的；
     * 所以 a 和 b 的最大公约数也是 b 和 r 的最大公约数。因此我们可以继续对 b 和 r 进行上述取余的运算。
     * 这个过程在有限的重复后，可以最终得到 r=0 的结果，我们也就得到了 a 和 b 的最大公约数。
     */
}
