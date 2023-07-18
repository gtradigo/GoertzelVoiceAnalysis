# GoertzelVoiceAnalysis
A Java software prototype for the application of the Goertzel algorithm to voice signals 

Dysphonia is the impairment of voice production, caused by structural or functional problem affecting the phonatory apparatus. It represents one of the most common pathologies affecting patients and any delay in its diagnosys can lead to serious laryngeal diseases.

Voice signal processing techniques, such as FFT (Fast Fourier Transform) and Goertzel algorithm, can accelerate early detection of potential problems by extracting frequency features from simple voice signal containing few seconds of vowels vocalizations.

The Goertzel algorithm, originally developed for DSP applications for the extraction of the different frequency components of a signal in industrial application, has been shown to be more efficient than FFT also in medical applications, where the computational and memory resources could be suboptimal with respect to the number of voice samples to analyze.

## References
1. Vizza, P., Mirarchi, D., Tradigo, G., Redavide, M., Bossio, R. B., & Veltri, P. (2017). Vocal signal analysis in patients affected by Multiple Sclerosis. _Procedia Computer Science_, _108_, 1205-1214.
2. Cesari, U., De Pietro, G., Marciano, E., Niri, C., Sannino, G., & Verde, L. (2018). A new database of healthy and pathological voices. _Computers & Electrical Engineering_, _68_, 310-321.

## Datasets

* Vocal signal dataset from reference [1]
* VOICED database from reference [2]: https://physionet.org/content/voiced/1.0.0/

## Todo

- [x] create Github repository :tada:
- [ ] add Java source code
