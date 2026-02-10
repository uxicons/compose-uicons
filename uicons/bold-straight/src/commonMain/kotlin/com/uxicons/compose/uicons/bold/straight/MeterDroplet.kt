package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterDroplet: ImageVector? = null

val Icons.Bs.MeterDroplet: ImageVector
    get() = _MeterDroplet ?: UXIcon(name = "MeterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(22.38f, 14.6f)
                curveToRelative(1.05f, 1.05f, 1.62f, 2.43f, 1.62f, 3.9f)
                reflectiveCurveToRelative(-0.57f, 2.85f, -1.61f, 3.89f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
                curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                lineToRelative(3.89f, -3.81f)
                lineToRelative(3.88f, 3.79f)
                close()
                moveTo(21f, 18.5f)
                curveToRelative(0f, -0.67f, -0.26f, -1.29f, -0.73f, -1.77f)
                lineToRelative(-1.77f, -1.73f)
                lineToRelative(-1.78f, 1.74f)
                curveToRelative(-0.46f, 0.46f, -0.72f, 1.09f, -0.72f, 1.76f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.77f)
                curveToRelative(0.94f, 0.94f, 2.59f, 0.95f, 3.54f, 0f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                close()
                moveTo(11.42f, 20.97f)
                curveToRelative(-4.69f, -0.3f, -8.42f, -4.2f, -8.42f, -8.97f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(4.38f, 0f, 8.03f, 3.14f, 8.83f, 7.29f)
                lineToRelative(2.94f, 2.88f)
                curveToRelative(0.05f, 0.05f, 0.1f, 0.11f, 0.15f, 0.16f)
                curveToRelative(0.05f, -0.44f, 0.08f, -0.88f, 0.08f, -1.33f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.45f, 0f, 0.89f, -0.03f, 1.33f, -0.08f)
                curveToRelative(-0.04f, -0.04f, -0.09f, -0.08f, -0.13f, -0.12f)
                curveToRelative(-0.81f, -0.81f, -1.4f, -1.78f, -1.77f, -2.83f)
                close()
                moveTo(18f, 8.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.43f)
                lineToRelative(3f, -2.94f)
                close()
            }
        }.also { _MeterDroplet = it}
