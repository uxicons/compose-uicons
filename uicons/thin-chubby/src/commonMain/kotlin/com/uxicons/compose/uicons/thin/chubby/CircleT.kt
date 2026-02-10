package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleT: ImageVector? = null

val Icons.Tc.CircleT: ImageVector
    get() = _CircleT ?: UXIcon(name = "CircleT") {
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
                moveTo(16.98f, 7.16f)
                curveToRelative(-0.07f, 0.21f, -0.27f, 0.34f, -0.48f, 0.34f)
                curveToRelative(-0.3f, -0.03f, -1.26f, -0.43f, -4.0f, -0.49f)
                verticalLineToRelative(10.49f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-10.49f)
                curveToRelative(-2.52f, 0.05f, -3.83f, 0.46f, -3.84f, 0.47f)
                curveToRelative(-0.26f, 0.09f, -0.55f, -0.06f, -0.63f, -0.32f)
                curveToRelative(-0.09f, -0.26f, 0.06f, -0.54f, 0.32f, -0.63f)
                curveToRelative(0.06f, -0.02f, 1.61f, -0.53f, 4.66f, -0.53f)
                reflectiveCurveToRelative(4.59f, 0.5f, 4.66f, 0.53f)
                curveToRelative(0.26f, 0.09f, 0.4f, 0.37f, 0.32f, 0.63f)
                close()
            }
        }.also { _CircleT = it}
