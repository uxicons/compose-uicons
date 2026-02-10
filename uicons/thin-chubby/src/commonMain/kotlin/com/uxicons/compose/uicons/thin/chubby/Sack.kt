package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Tc.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 11.68f)
                curveToRelative(-1.07f, -1.86f, -3.33f, -4.83f, -7.1f, -5.5f)
                curveToRelative(0.8f, -0.61f, 1.83f, -1.65f, 2.85f, -3.44f)
                curveToRelative(0.13f, -0.23f, 0.06f, -0.52f, -0.16f, -0.66f)
                curveToRelative(-0.07f, -0.04f, -1.66f, -1.08f, -4.28f, -1.08f)
                reflectiveCurveToRelative(-4.21f, 1.04f, -4.28f, 1.08f)
                curveToRelative(-0.22f, 0.15f, -0.29f, 0.44f, -0.16f, 0.66f)
                curveToRelative(1.02f, 1.78f, 2.05f, 2.83f, 2.85f, 3.44f)
                curveToRelative(-3.77f, 0.67f, -6.03f, 3.64f, -7.1f, 5.5f)
                curveToRelative(-1.24f, 2.15f, -1.62f, 4.53f, -1.08f, 6.68f)
                curveToRelative(0.83f, 3.3f, 3.66f, 4.64f, 9.76f, 4.64f)
                reflectiveCurveToRelative(8.93f, -1.34f, 9.76f, -4.64f)
                curveToRelative(0.54f, -2.15f, 0.16f, -4.52f, -1.08f, -6.68f)
                close()
                moveTo(8.7f, 2.69f)
                curveToRelative(0.58f, -0.27f, 1.74f, -0.69f, 3.3f, -0.69f)
                reflectiveCurveToRelative(2.72f, 0.42f, 3.3f, 0.69f)
                curveToRelative(-1.48f, 2.39f, -2.88f, 3.11f, -3.3f, 3.28f)
                curveToRelative(-0.42f, -0.17f, -1.83f, -0.89f, -3.3f, -3.28f)
                close()
                moveTo(20.79f, 18.11f)
                curveToRelative(-0.59f, 2.33f, -2.31f, 3.89f, -8.79f, 3.89f)
                reflectiveCurveToRelative(-8.2f, -1.55f, -8.79f, -3.89f)
                curveToRelative(-0.48f, -1.9f, -0.13f, -4.0f, 0.98f, -5.93f)
                curveToRelative(1.1f, -1.92f, 3.58f, -5.14f, 7.81f, -5.14f)
                reflectiveCurveToRelative(6.71f, 3.22f, 7.81f, 5.14f)
                curveToRelative(1.11f, 1.93f, 1.46f, 4.04f, 0.98f, 5.93f)
                close()
            }
        }.also { _Sack = it}
