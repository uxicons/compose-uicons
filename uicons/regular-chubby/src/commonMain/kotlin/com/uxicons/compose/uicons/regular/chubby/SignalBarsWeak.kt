package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsWeak: ImageVector? = null

val Icons.Rc.SignalBarsWeak: ImageVector
    get() = _SignalBarsWeak ?: UXIcon(name = "SignalBarsWeak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.58f, 14.01f)
                curveToRelative(-0.07f, -0.34f, -0.31f, -0.61f, -0.63f, -0.73f)
                curveToRelative(-0.08f, -0.03f, -0.8f, -0.28f, -1.95f, -0.28f)
                reflectiveCurveToRelative(-1.86f, 0.25f, -1.94f, 0.28f)
                curveToRelative(-0.33f, 0.12f, -0.57f, 0.4f, -0.64f, 0.73f)
                curveToRelative(-0.02f, 0.08f, -0.42f, 2.02f, -0.42f, 3.99f)
                reflectiveCurveToRelative(0.39f, 3.89f, 0.4f, 3.97f)
                curveToRelative(0.07f, 0.34f, 0.31f, 0.62f, 0.63f, 0.74f)
                curveToRelative(0.08f, 0.03f, 0.82f, 0.29f, 1.97f, 0.29f)
                curveToRelative(1.12f, 0f, 1.87f, -0.23f, 1.95f, -0.25f)
                curveToRelative(0.35f, -0.11f, 0.62f, -0.41f, 0.69f, -0.78f)
                curveToRelative(0.01f, -0.08f, 0.36f, -2.02f, 0.36f, -3.97f)
                curveToRelative(0f, -1.97f, -0.4f, -3.9f, -0.42f, -3.99f)
                close()
                moveTo(6.77f, 20.95f)
                curveToRelative(-0.42f, 0.06f, -1.11f, 0.06f, -1.52f, -0.01f)
                curveToRelative(-0.11f, -0.68f, -0.25f, -1.82f, -0.25f, -2.95f)
                reflectiveCurveToRelative(0.15f, -2.27f, 0.27f, -2.95f)
                curveToRelative(0.4f, -0.06f, 1.08f, -0.06f, 1.47f, 0f)
                curveToRelative(0.11f, 0.68f, 0.27f, 1.82f, 0.27f, 2.95f)
                curveToRelative(0f, 1.12f, -0.13f, 2.26f, -0.23f, 2.95f)
                close()
            }
        }.also { _SignalBarsWeak = it}
