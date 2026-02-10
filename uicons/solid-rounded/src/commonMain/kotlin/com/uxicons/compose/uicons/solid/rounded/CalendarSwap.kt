package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Sr.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                lineTo(0f, 8f)
                curveTo(0f, 4.69f, 2.69f, 2f, 6f, 2f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                lineTo(6f, 24f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                lineTo(0f, 10f)
                lineTo(24f, 10f)
                close()
                moveTo(7f, 15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.4f, 0f, 0.77f, -0.24f, 0.92f, -0.62f)
                curveToRelative(0.15f, -0.37f, 0.07f, -0.8f, -0.22f, -1.09f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.29f, 0.29f)
                horizontalLineToRelative(-5.59f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(17f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 18f)
                curveToRelative(-0.4f, 0f, -0.77f, 0.24f, -0.92f, 0.62f)
                reflectiveCurveToRelative(-0.07f, 0.8f, 0.22f, 1.09f)
                lineToRelative(2f, 2f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.29f, -0.29f)
                horizontalLineToRelative(5.59f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _CalendarSwap = it}
