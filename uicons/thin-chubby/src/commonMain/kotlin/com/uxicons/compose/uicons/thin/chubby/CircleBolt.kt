package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Tc.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 4.7f, -4.03f, 7.77f, -4.2f, 7.9f)
                curveToRelative(-0.22f, 0.17f, -0.53f, 0.12f, -0.7f, -0.1f)
                curveToRelative(-0.17f, -0.22f, -0.12f, -0.53f, 0.1f, -0.7f)
                curveToRelative(0.04f, -0.03f, 3.5f, -2.68f, 3.78f, -6.6f)
                horizontalLineToRelative(-6.48f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -4.7f, 4.03f, -7.77f, 4.2f, -7.9f)
                curveToRelative(0.22f, -0.17f, 0.53f, -0.12f, 0.7f, 0.1f)
                curveToRelative(0.17f, 0.22f, 0.12f, 0.53f, -0.1f, 0.7f)
                curveToRelative(-0.04f, 0.03f, -3.5f, 2.68f, -3.78f, 6.6f)
                horizontalLineToRelative(6.48f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
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
        }.also { _CircleBolt = it}
