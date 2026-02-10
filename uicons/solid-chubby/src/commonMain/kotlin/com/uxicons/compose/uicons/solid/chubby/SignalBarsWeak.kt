package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsWeak: ImageVector? = null

val Icons.Sc.SignalBarsWeak: ImageVector
    get() = _SignalBarsWeak ?: UXIcon(name = "SignalBarsWeak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.09f, 23f)
                curveToRelative(-0.73f, 0f, -1.21f, -0.2f, -1.3f, -0.24f)
                curveToRelative(-0.32f, -0.15f, -0.54f, -0.45f, -0.58f, -0.8f)
                curveToRelative(-0.01f, -0.08f, -0.21f, -2.03f, -0.21f, -3.95f)
                reflectiveCurveToRelative(0.22f, -3.91f, 0.23f, -4.0f)
                curveToRelative(0.04f, -0.39f, 0.3f, -0.71f, 0.67f, -0.84f)
                curveToRelative(0.08f, -0.03f, 0.52f, -0.16f, 1.2f, -0.16f)
                curveToRelative(0.68f, 0f, 1.12f, 0.14f, 1.21f, 0.17f)
                curveToRelative(0.36f, 0.13f, 0.62f, 0.45f, 0.66f, 0.83f)
                curveToRelative(0.01f, 0.08f, 0.23f, 2.07f, 0.23f, 3.99f)
                reflectiveCurveToRelative(-0.19f, 3.88f, -0.19f, 3.97f)
                curveToRelative(-0.04f, 0.39f, -0.29f, 0.71f, -0.66f, 0.85f)
                curveToRelative(-0.09f, 0.03f, -0.56f, 0.19f, -1.24f, 0.19f)
                close()
            }
        }.also { _SignalBarsWeak = it}
