package br.com.pactosolucoes.api.fake.service.balanca;

/**
 * Deve lidar com a annotation {@link BalancaServiceScenarioDescriptor}.
 *
 * @author Bruno Cattany
 * @since 27/01/2019
 */
public interface BalancaServiceScenarioDescriptorReader {

    /**
     * @return a descrição completa do cenário fornecido por {@link BalancaServiceScenarioDescriptor}.
     */
    default String getScenarioDescription() {
        BalancaServiceScenarioDescriptor balancaServiceScenarioDescriptor = this.getClass().getAnnotation(BalancaServiceScenarioDescriptor.class);

        return "Implementação BalancaService ativa -> " + this.getClass().getName() + "\n" +
                "Descrição do cenário: { \n" +
                "\tPrimeira ação: " + balancaServiceScenarioDescriptor.firstActionDescription() + "\n" +
                "\tSegunda ação: " + balancaServiceScenarioDescriptor.secondActionDescription() + "\n" +
                "}";
    }

}