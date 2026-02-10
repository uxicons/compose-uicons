package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterDroplet: ImageVector? = null

val Icons.Ts.MeterDroplet: ImageVector
    get() = _MeterDroplet ?: UXIcon(name = "MeterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(14f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
                moveTo(12.49f, 22.99f)
                curveToRelative(-0.16f, 0.01f, -0.33f, 0.01f, -0.49f, 0.01f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0.13f, -0.0f, 0.27f, -0.01f, 0.4f)
                curveToRelative(0f, 0f, 0.89f, 0.87f, 0.94f, 0.92f)
                curveToRelative(0.05f, -0.43f, 0.07f, -0.87f, 0.07f, -1.32f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.45f, 0f, 0.89f, -0.03f, 1.33f, -0.07f)
                curveToRelative(-0.04f, -0.04f, -0.09f, -0.09f, -0.13f, -0.13f)
                curveToRelative(-0.26f, -0.26f, -0.49f, -0.53f, -0.7f, -0.81f)
                close()
                moveTo(17f, 9.47f)
                verticalLineToRelative(-2.47f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.45f)
                lineToRelative(1f, -0.98f)
                close()
                moveTo(22.39f, 14.6f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                reflectiveCurveToRelative(-0.57f, 2.85f, -1.61f, 3.89f)
                reflectiveCurveToRelative(-2.42f, 1.61f, -3.89f, 1.61f)
                reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
                reflectiveCurveToRelative(-1.61f, -2.42f, -1.61f, -3.89f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                lineToRelative(3.89f, -3.8f)
                lineToRelative(3.88f, 3.8f)
                close()
                moveTo(23f, 18.49f)
                curveToRelative(0f, -1.2f, -0.47f, -2.33f, -1.32f, -3.18f)
                lineToRelative(-3.18f, -3.11f)
                lineToRelative(-3.19f, 3.12f)
                curveToRelative(-0.85f, 0.85f, -1.31f, 1.98f, -1.31f, 3.18f)
                reflectiveCurveToRelative(0.47f, 2.33f, 1.32f, 3.18f)
                reflectiveCurveToRelative(1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.32f)
                reflectiveCurveToRelative(1.32f, -1.98f, 1.32f, -3.18f)
                close()
            }
        }.also { _MeterDroplet = it}
