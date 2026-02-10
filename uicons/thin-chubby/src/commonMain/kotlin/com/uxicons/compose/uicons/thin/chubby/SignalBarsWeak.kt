package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsWeak: ImageVector? = null

val Icons.Tc.SignalBarsWeak: ImageVector
    get() = _SignalBarsWeak ?: UXIcon(name = "SignalBarsWeak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.59f, 14.12f)
                curveToRelative(-0.04f, -0.17f, -0.15f, -0.31f, -0.32f, -0.37f)
                curveToRelative(-0.03f, -0.01f, -0.7f, -0.25f, -1.77f, -0.25f)
                reflectiveCurveToRelative(-1.74f, 0.24f, -1.77f, 0.25f)
                curveToRelative(-0.16f, 0.06f, -0.28f, 0.2f, -0.32f, 0.37f)
                curveToRelative(-0.02f, 0.08f, -0.41f, 1.97f, -0.41f, 3.89f)
                reflectiveCurveToRelative(0.38f, 3.79f, 0.39f, 3.87f)
                curveToRelative(0.04f, 0.17f, 0.15f, 0.31f, 0.32f, 0.37f)
                curveToRelative(0.03f, 0.01f, 0.72f, 0.26f, 1.79f, 0.26f)
                curveToRelative(1.06f, 0f, 1.77f, -0.22f, 1.8f, -0.23f)
                curveToRelative(0.18f, -0.06f, 0.31f, -0.2f, 0.34f, -0.39f)
                curveToRelative(0.01f, -0.08f, 0.35f, -1.97f, 0.35f, -3.88f)
                reflectiveCurveToRelative(-0.39f, -3.8f, -0.41f, -3.88f)
                close()
                moveTo(6.71f, 21.39f)
                curveToRelative(-0.26f, 0.05f, -0.69f, 0.11f, -1.21f, 0.11f)
                reflectiveCurveToRelative(-0.94f, -0.07f, -1.18f, -0.13f)
                curveToRelative(-0.1f, -0.59f, -0.32f, -1.99f, -0.32f, -3.37f)
                reflectiveCurveToRelative(0.22f, -2.79f, 0.33f, -3.38f)
                curveToRelative(0.24f, -0.05f, 0.65f, -0.12f, 1.17f, -0.12f)
                reflectiveCurveToRelative(0.93f, 0.07f, 1.17f, 0.12f)
                curveToRelative(0.11f, 0.59f, 0.33f, 2.0f, 0.33f, 3.38f)
                curveToRelative(0f, 1.38f, -0.19f, 2.77f, -0.29f, 3.39f)
                close()
            }
        }.also { _SignalBarsWeak = it}
