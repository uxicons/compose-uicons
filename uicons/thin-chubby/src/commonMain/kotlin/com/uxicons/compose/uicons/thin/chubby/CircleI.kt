package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleI: ImageVector? = null

val Icons.Tc.CircleI: ImageVector
    get() = _CircleI ?: UXIcon(name = "CircleI") {
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
                moveTo(12.5f, 6.99f)
                verticalLineToRelative(10.02f)
                curveToRelative(1.26f, 0.04f, 2.08f, 0.24f, 2.12f, 0.26f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.6f)
                curveToRelative(-0.06f, 0.23f, -0.26f, 0.38f, -0.48f, 0.38f)
                curveToRelative(-0.22f, -0.01f, -0.93f, -0.24f, -2.5f, -0.25f)
                curveToRelative(-1.41f, 0f, -2.37f, 0.23f, -2.38f, 0.23f)
                curveToRelative(-0.27f, 0.06f, -0.54f, -0.1f, -0.61f, -0.36f)
                reflectiveCurveToRelative(0.1f, -0.54f, 0.36f, -0.6f)
                curveToRelative(0.04f, -0.01f, 0.86f, -0.21f, 2.12f, -0.26f)
                verticalLineToRelative(-10.02f)
                curveToRelative(-1.26f, -0.04f, -2.08f, -0.24f, -2.12f, -0.26f)
                curveToRelative(-0.27f, -0.07f, -0.43f, -0.34f, -0.36f, -0.6f)
                curveToRelative(0.07f, -0.27f, 0.34f, -0.43f, 0.61f, -0.36f)
                curveToRelative(0.01f, 0.0f, 0.97f, 0.23f, 2.38f, 0.23f)
                reflectiveCurveToRelative(2.37f, -0.23f, 2.38f, -0.23f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.1f, 0.61f, 0.36f)
                reflectiveCurveToRelative(-0.1f, 0.54f, -0.36f, 0.6f)
                curveToRelative(-0.04f, 0.01f, -0.86f, 0.21f, -2.12f, 0.26f)
                close()
            }
        }.also { _CircleI = it}
