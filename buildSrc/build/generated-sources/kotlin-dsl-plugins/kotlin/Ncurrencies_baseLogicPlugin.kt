/**
 * Precompiled [ncurrencies.base-logic.gradle.kts][Ncurrencies_base_logic_gradle] script plugin.
 *
 * @see Ncurrencies_base_logic_gradle
 */
public
class Ncurrencies_baseLogicPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ncurrencies_base_logic_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
