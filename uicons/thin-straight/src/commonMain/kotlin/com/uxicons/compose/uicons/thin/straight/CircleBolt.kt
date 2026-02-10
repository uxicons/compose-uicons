package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Ts.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(15.81f, 13.21f)
                curveToRelative(0.23f, -0.34f, 0.25f, -0.77f, 0.05f, -1.13f)
                curveToRelative(-0.19f, -0.36f, -0.57f, -0.58f, -0.97f, -0.58f)
                horizontalLineToRelative(-5.78f)
                reflectiveCurveToRelative(-0.08f, -0.03f, -0.09f, -0.05f)
                curveToRelative(-0.02f, -0.02f, -0.03f, -0.06f, -0.05f, -0.02f)
                lineToRelative(3.47f, -6.76f)
                lineToRelative(-0.89f, -0.46f)
                lineToRelative(-3.51f, 6.84f)
                curveToRelative(-0.1f, 0.34f, -0.04f, 0.7f, 0.17f, 0.99f)
                curveToRelative(0.21f, 0.29f, 0.54f, 0.45f, 0.9f, 0.45f)
                horizontalLineToRelative(5.78f)
                reflectiveCurveToRelative(0.07f, 0.02f, 0.09f, 0.05f)
                reflectiveCurveToRelative(0.02f, 0.07f, -0.03f, 0.15f)
                lineToRelative(-3.4f, 6.52f)
                lineToRelative(0.89f, 0.46f)
                lineToRelative(3.37f, -6.48f)
                close()
            }
        }.also { _CircleBolt = it}
