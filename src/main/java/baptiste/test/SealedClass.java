package baptiste.test;

public sealed class SealedClass permits FirstSealed, FinalClass, NonSealed{ }

sealed class FirstSealed extends SealedClass permits SecondSealed{ }

final class SecondSealed extends FirstSealed{ }

final class FinalClass extends SealedClass{ }

non-sealed class NonSealed extends SealedClass{ }

class ExtendNonSealed extends NonSealed{ };


sealed interface SealedInterface permits RecordIsFinal, AnotherSealedInterface{}

record RecordIsFinal() implements SealedInterface {}

sealed interface AnotherSealedInterface extends SealedInterface permits AnotherRecord{}

record AnotherRecord() implements AnotherSealedInterface {}
