package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grin: ImageVector? = null

val Icons.Ts.Grin: ImageVector
    get() = _Grin ?: UXIcon(name = "Grin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.07f, 1f, 12f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                close()
                moveTo(17.98f, 14.87f)
                lineToRelative(0.28f, -0.88f)
                lineToRelative(-0.89f, 0.24f)
                curveToRelative(-0.03f, 0.01f, -2.81f, 0.76f, -5.37f, 0.76f)
                reflectiveCurveToRelative(-5.33f, -0.75f, -5.36f, -0.76f)
                lineToRelative(-0.89f, -0.24f)
                lineToRelative(0.28f, 0.88f)
                curveToRelative(0.07f, 0.21f, 1.67f, 5.13f, 5.97f, 5.13f)
                horizontalLineToRelative(0.01f)
                curveToRelative(4.3f, 0f, 5.91f, -4.92f, 5.97f, -5.13f)
                close()
                moveTo(12.0f, 16f)
                curveToRelative(1.77f, 0f, 3.59f, -0.33f, 4.67f, -0.56f)
                curveToRelative(-0.62f, 1.29f, -2.09f, 3.56f, -4.66f, 3.56f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-2.56f, 0f, -4.03f, -2.27f, -4.65f, -3.56f)
                curveToRelative(1.08f, 0.23f, 2.89f, 0.56f, 4.66f, 0.56f)
                close()
            }
        }.also { _Grin = it}
