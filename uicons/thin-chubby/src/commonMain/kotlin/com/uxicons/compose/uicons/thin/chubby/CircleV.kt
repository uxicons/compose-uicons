package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Tc.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 6.53f)
                curveToRelative(-0.41f, 6.4f, -3.95f, 11.08f, -4.1f, 11.27f)
                curveToRelative(-0.1f, 0.12f, -0.24f, 0.2f, -0.4f, 0.2f)
                reflectiveCurveToRelative(-0.3f, -0.07f, -0.4f, -0.2f)
                curveToRelative(-0.15f, -0.2f, -3.7f, -4.87f, -4.1f, -11.27f)
                curveToRelative(-0.02f, -0.28f, 0.19f, -0.51f, 0.47f, -0.53f)
                curveToRelative(0.26f, -0.03f, 0.51f, 0.19f, 0.53f, 0.47f)
                curveToRelative(0.31f, 4.85f, 2.57f, 8.74f, 3.5f, 10.16f)
                curveToRelative(0.93f, -1.41f, 3.19f, -5.31f, 3.5f, -10.16f)
                curveToRelative(0.02f, -0.28f, 0.25f, -0.49f, 0.53f, -0.47f)
                curveToRelative(0.28f, 0.02f, 0.48f, 0.26f, 0.47f, 0.53f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.81f, -3.19f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -2.8f, 10f, -10f)
                close()
            }
        }.also { _CircleV = it}
