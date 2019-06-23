package com.hcl.services;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanServiceTest {
	
	@Autowired
    private PersonRepository persons;

    @Autowired
    private CountryRepository countries;

    @Autowired
    private LoanService service;

    @Test
    public void whenApplyLoadThenSaveInDb() {
        Person person = this.persons.save(new Person("Petr", "Arsentev"));
        Country country = this.countries.save(new Country("Russia"));
        Loan loan = this.service.apply(new Loan("", 0D, country, person));
        List<Loan> result = this.service.getAll();
        assertTrue(result.contains(loan));
    }

    @Test
    public void whenFindByPersonThenReturnListOnlyForRerson() {
        Person person = this.persons.save(new Person("Petr", "Arsentev"));
        Country country = this.countries.save(new Country("Russia"));
        Loan loan = this.service.apply(new Loan("", 0D, country, person));
        List<Loan> result = this.service.getByPerson(person.getId());
        assertThat(result.iterator().next(), is(loan));
    }

}
