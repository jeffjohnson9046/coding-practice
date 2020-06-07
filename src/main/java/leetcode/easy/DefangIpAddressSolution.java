package leetcode.easy;

/**
 * Given a valid (IPv4) IP {@code address}, return a defanged version of that IP address.
 * <p></p>
 * A defanged IP address replaces every period {@code "."} with {@code "[.]"}.
 * <p></p>
 * <strong>Example 1:</strong>
 * <ul>
 *     <li>Input: address = "1.1.1.1"</li>
 *     <li>Output: "1[.]1[.]1[.]1"</li>
 * </ul>
 * <p></p>
 * <strong>Example 2:</strong>
 * <ul>
 *     <li>Input: address = "255.100.50.0"</li>
 *     <li>Output: "255[.]100[.]50[.]0"</li>
 * </ul>
 * <p></p>
 * <strong>Constraints</strong>
 * <ul>
 *     <li>The given address is a valid IPv4 address.</li>
 * </ul>
 */
public class DefangIpAddressSolution {

    /**
     * "Defang" an IPv4 address.
     * <p></p>
     * This means replacing all instances of the dot (".") with a "[.]".
     *
     * @param address The IPv4 address to defang.
     * @return A "defanged" (i.e. re-formatted) IPv4 address.
     */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
