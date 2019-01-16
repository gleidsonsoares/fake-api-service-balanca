package br.com.pactosolucoes.api.fake.service.balanca.factory;

import br.com.pactosolucoes.api.fake.config.properties.FakeBalancaServiceProperties;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Responsável por retornar uma instância de {@link BalancaService} conforme definido na propriedade {@link FakeBalancaServiceProperties#getOption()}.
 *
 * @author Bruno Cattany
 * @since 07/01/2019
 */
public class BalancaServiceFactory implements FactoryBean<BalancaService> {

    @Autowired
    private FakeBalancaServiceProperties fakeBalancaServiceProperties;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public BalancaService getObject() {
        return (BalancaService) applicationContext.getBean(fakeBalancaServiceProperties.getOption());
    }

    @Override
    public Class<?> getObjectType() {
        return BalancaService.class;
    }
}
