/**
 * Precompiled [ncurrencies.shadow-logic.gradle.kts][Ncurrencies_shadow_logic_gradle] script plugin.
 *
 * @see Ncurrencies_shadow_logic_gradle
 */
public
class Ncurrencies_shadowLogicPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ncurrencies_shadow_logic_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
