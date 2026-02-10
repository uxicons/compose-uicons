package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Rs.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, -0.18f, 0.03f, -0.35f, 0.07f, -0.51f)
                lineToRelative(-4.28f, -4.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.28f, 4.28f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.51f, -0.07f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(5.65f, 19.71f)
                curveToRelative(-2.3f, -1.89f, -3.65f, -4.72f, -3.65f, -7.71f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 1.21f, -0.23f, 2.39f, -0.65f, 3.49f)
                lineToRelative(1.24f, 2.12f)
                curveToRelative(0.91f, -1.71f, 1.41f, -3.63f, 1.41f, -5.62f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 3.9f, 1.91f, 7.57f, 5.11f, 9.82f)
                lineToRelative(0.64f, 0.45f)
                lineToRelative(2.9f, -2.51f)
                lineToRelative(-1.31f, -1.51f)
                lineToRelative(-1.7f, 1.47f)
                close()
                moveTo(17f, 12f)
                lineToRelative(7f, 12f)
                horizontalLineToRelative(-14f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _LimitSpeedometer = it}
