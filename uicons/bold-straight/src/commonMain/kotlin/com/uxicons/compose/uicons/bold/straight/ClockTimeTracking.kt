package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTimeTracking: ImageVector? = null

val Icons.Bs.ClockTimeTracking: ImageVector
    get() = _ClockTimeTracking ?: UXIcon(name = "ClockTimeTracking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11.72f)
                curveToRelative(-0.93f, -0.81f, -1.66f, -1.84f, -2.13f, -3f)
                horizontalLineToRelative(-6.59f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.26f)
                curveToRelative(1.11f, 0.29f, 2.13f, 0.8f, 3f, 1.5f)
                verticalLineToRelative(-2.76f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 6f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.79f, 21.21f)
                lineToRelative(-2.79f, -2.79f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.59f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _ClockTimeTracking = it}
