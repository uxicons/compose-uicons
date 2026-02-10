package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTimeTracking: ImageVector? = null

val Icons.Ss.ClockTimeTracking: ImageVector
    get() = _ClockTimeTracking ?: UXIcon(name = "ClockTimeTracking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.29f, 20.79f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(12.71f, 24f)
                lineTo(1f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(17f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.05f, 4.53f, 2.71f, 6f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 8f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _ClockTimeTracking = it}
