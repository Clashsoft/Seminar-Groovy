make cake         with        sugar, eggs         and        flour
make(cake)       .with       (sugar, eggs)       .and       (flour)
make(cake)      ['with']     (sugar, eggs)      ['and']     (flour)
make(cake).getAt('with').call(sugar, eggs).getAt('and').call(flour)

make cake with sugar, eggs and flour
make(cake).with(sugar, eggs).and(flour)

move forward at 3.km/h
move(forward).at(3.getKm().div(h))

expect that: 5+5 is equal to 10
expect(that: 5+5).is(equal).to(10)
