package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StopCircle: ImageVector? = null

val Icons.Tc.StopCircle: ImageVector
    get() = _StopCircle ?: UXIcon(name = "StopCircle") {
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
                moveTo(15.26f, 8.36f)
                curveToRelative(-0.07f, -0.01f, -1.67f, -0.36f, -3.26f, -0.36f)
                reflectiveCurveToRelative(-3.19f, 0.35f, -3.26f, 0.36f)
                curveToRelative(-0.19f, 0.04f, -0.34f, 0.19f, -0.38f, 0.38f)
                curveToRelative(-0.01f, 0.07f, -0.36f, 1.67f, -0.36f, 3.26f)
                reflectiveCurveToRelative(0.35f, 3.19f, 0.36f, 3.26f)
                curveToRelative(0.04f, 0.19f, 0.19f, 0.34f, 0.38f, 0.38f)
                curveToRelative(0.07f, 0.01f, 1.67f, 0.36f, 3.26f, 0.36f)
                reflectiveCurveToRelative(3.19f, -0.35f, 3.26f, -0.36f)
                curveToRelative(0.19f, -0.04f, 0.34f, -0.19f, 0.38f, -0.38f)
                curveToRelative(0.01f, -0.07f, 0.36f, -1.67f, 0.36f, -3.26f)
                reflectiveCurveToRelative(-0.35f, -3.19f, -0.36f, -3.26f)
                curveToRelative(-0.04f, -0.19f, -0.19f, -0.34f, -0.38f, -0.38f)
                close()
                moveTo(14.72f, 14.72f)
                curveToRelative(-0.53f, 0.1f, -1.64f, 0.28f, -2.73f, 0.28f)
                reflectiveCurveToRelative(-2.19f, -0.18f, -2.73f, -0.28f)
                curveToRelative(-0.1f, -0.53f, -0.28f, -1.65f, -0.28f, -2.72f)
                reflectiveCurveToRelative(0.18f, -2.19f, 0.28f, -2.72f)
                curveToRelative(0.53f, -0.1f, 1.64f, -0.28f, 2.73f, -0.28f)
                reflectiveCurveToRelative(2.19f, 0.18f, 2.73f, 0.28f)
                curveToRelative(0.1f, 0.53f, 0.28f, 1.65f, 0.28f, 2.72f)
                reflectiveCurveToRelative(-0.18f, 2.19f, -0.28f, 2.72f)
                close()
            }
        }.also { _StopCircle = it}
