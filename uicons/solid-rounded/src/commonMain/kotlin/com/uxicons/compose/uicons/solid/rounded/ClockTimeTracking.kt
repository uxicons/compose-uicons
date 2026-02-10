package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTimeTracking: ImageVector? = null

val Icons.Sr.ClockTimeTracking: ImageVector
    get() = _ClockTimeTracking ?: UXIcon(name = "ClockTimeTracking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                lineTo(3f, 8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.59f, 20.09f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.59f)
                lineToRelative(1f, 1f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
                moveTo(1f, 9.58f)
                verticalLineToRelative(9.42f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6.72f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                lineTo(3f, 10f)
                curveToRelative(-0.71f, 0f, -1.39f, -0.15f, -2f, -0.42f)
                close()
            }
        }.also { _ClockTimeTracking = it}
