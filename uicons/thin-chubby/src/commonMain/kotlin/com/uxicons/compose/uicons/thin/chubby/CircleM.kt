package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Tc.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
                moveTo(15.19f, 6.27f)
                curveToRelative(0.1f, 0.2f, 2.53f, 4.85f, 2.81f, 11.21f)
                curveToRelative(0.01f, 0.28f, -0.2f, 0.51f, -0.48f, 0.52f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                curveToRelative(-0.27f, 0f, -0.49f, -0.21f, -0.5f, -0.48f)
                curveToRelative(-0.2f, -4.59f, -1.6f, -8.33f, -2.3f, -9.94f)
                curveToRelative(-0.59f, 1.1f, -1.59f, 3.24f, -2.22f, 6.03f)
                curveToRelative(-0.05f, 0.23f, -0.25f, 0.39f, -0.49f, 0.39f)
                reflectiveCurveToRelative(-0.44f, -0.16f, -0.49f, -0.39f)
                curveToRelative(-0.62f, -2.78f, -1.63f, -4.93f, -2.22f, -6.03f)
                curveToRelative(-0.7f, 1.61f, -2.1f, 5.35f, -2.3f, 9.94f)
                curveToRelative(-0.01f, 0.28f, -0.24f, 0.51f, -0.52f, 0.48f)
                curveToRelative(-0.28f, -0.01f, -0.49f, -0.24f, -0.48f, -0.52f)
                curveToRelative(0.28f, -6.37f, 2.71f, -11.02f, 2.81f, -11.21f)
                curveToRelative(0.08f, -0.16f, 0.24f, -0.26f, 0.42f, -0.27f)
                curveToRelative(0.18f, -0.01f, 0.34f, 0.08f, 0.44f, 0.23f)
                curveToRelative(0.06f, 0.1f, 1.35f, 2.1f, 2.33f, 5.32f)
                curveToRelative(0.98f, -3.21f, 2.27f, -5.22f, 2.33f, -5.32f)
                curveToRelative(0.1f, -0.15f, 0.27f, -0.23f, 0.44f, -0.23f)
                curveToRelative(0.18f, 0.01f, 0.34f, 0.11f, 0.42f, 0.27f)
                close()
            }
        }.also { _CircleM = it}
