import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateTo
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlinx.coroutines.delay

//step = -1
var step by mutableStateOf(0)

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(Modifier.fillMaxSize()) {
            when (step) {
                0 -> Step0()
                1 -> Step1()
                2 -> Step2()
                3 -> Step3()
                4 -> Step4()
                5 -> Step5()
                6 -> Step6()
                7 -> Step7()
                8 -> Step8()
                9 -> Step9()
                -1 -> Final()
            }
        }
    }
}

@Composable
fun BoxScope.Step0() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step1() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.offset(600.dp, 500.dp).background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step2() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.offset(-500.dp, 200.dp).background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step3() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.offset(200.dp, -400.dp).background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 32.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step4() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.offset(-170.dp, -500.dp).background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step5() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        Box(Modifier.offset(200.dp, 400.dp).background(color = MaterialTheme.colors.secondary).clickable { step ++ }) {
            Text("不合理", fontSize = 12.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step6() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Column(Modifier.align(Alignment.Center)) {
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.primary).clickable { step ++ }) {
                Text("不合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
        Row(Modifier.padding(12.dp)) {
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Box(Modifier.padding(6.dp).background(color = MaterialTheme.colors.secondary).clickable { step = -1 }) {
                Text("合理", fontSize = 20.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
    }
}


@Composable
fun BoxScope.Step7() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Box(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.secondary).size(190.dp, 140.dp).clickable { step ++ }) {
            Text("不合理", fontSize = 32.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Box(Modifier.background(color = MaterialTheme.colors.primary).size(180.dp, 130.dp).clickable { step = -1 }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
    }
}

@Composable
fun BoxScope.Step8() {
    Text("你觉得\uD83D\uDC14\uD83D\uDCA9今天开学合理吗", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    var clicked by remember { mutableStateOf(false) }
    var posX = remember { AnimationState(Int.VectorConverter, 0) }
    var posY = remember { AnimationState(Int.VectorConverter, 0) }
    var vis by remember { mutableStateOf(true) }
    LaunchedEffect(clicked) {
        if (clicked) {
            posX.animateTo(200)
            posY.animateTo(300)
            delay(200)
            posX.animateTo(500)
            posY.animateTo(-200)
            delay(200)
            posX.animateTo(-200)
            posY.animateTo(480)
            delay(200)
            posX.animateTo(-684)
            posY.animateTo(-194)
            vis = false
        }
    }
    Row(Modifier.align(Alignment.Center)) {
        Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step ++ }) {
            Text("合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
        }
        Spacer(Modifier.width(16.dp))
        AnimatedVisibility(visible = vis) {
            Box(Modifier.offset(posX.value.dp, posY.value.dp).background(color = MaterialTheme.colors.secondary).clickable { clicked = true }) {
                Text("不合理", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
    }
}

@Composable
fun BoxScope.Step9() {
    Image(painterResource("a.jpg"), contentDescription = null)
    var count by remember { mutableStateOf(1) }
    Text("真的吗？", Modifier.align(Alignment.TopCenter).padding(60.dp), fontSize = 50.sp)
    Row(Modifier.align(Alignment.Center)) {
        if (count % 2 != 0) {
            Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
                Text("真的", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
            Spacer(Modifier.width(16.dp))
            if (count < 6) {
                Box(Modifier.background(color = MaterialTheme.colors.secondary).clickable {
                    count ++
                }) {
                    Text("假的", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
                }
            }
        } else {
            if (count < 6) {
                Box(Modifier.background(color = MaterialTheme.colors.secondary).clickable {
                    count++
                }) {
                    Text("假的", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
                }
            }
            Spacer(Modifier.width(16.dp))
            Box(Modifier.background(color = MaterialTheme.colors.primary).clickable { step = -1 }) {
                Text("真的", fontSize = 52.sp, modifier = Modifier.padding(6.dp).padding(horizontal = 14.dp))
            }
        }
    }
}

@Composable
fun BoxScope.Final() {
    Image(painterResource("b.jpg"), contentDescription = null)
    Column(Modifier.align(Alignment.TopCenter).padding(60.dp)) {
        Text("你真棒\uD83D\uDC4D", Modifier.padding(12.dp), fontSize = 50.sp)
        Text("我们就知道你想念学校了", Modifier.padding(12.dp), fontSize = 50.sp)
        Text("暑假作业记得上交哦！", Modifier.padding(12.dp), fontSize = 50.sp, color = Color.Red)
    }

}


fun main() = application {
    Window(onCloseRequest = ::exitApplication, state = rememberWindowState(width = 1920.dp, height = 1080.dp)) {
        App()
    }
}
