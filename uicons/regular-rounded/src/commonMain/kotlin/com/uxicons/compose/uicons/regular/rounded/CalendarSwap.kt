package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Rr.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                lineTo(8f, 2f)
                lineTo(8f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveTo(2.69f, 2f, 0f, 4.69f, 0f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                lineTo(24f, 8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(2f, 8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(2f, 10f)
                lineTo(22f, 10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(7f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.59f)
                lineToRelative(-0.29f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2f, 2f)
                curveToRelative(0.29f, 0.29f, 0.37f, 0.72f, 0.22f, 1.09f)
                curveToRelative(-0.15f, 0.37f, -0.52f, 0.62f, -0.92f, 0.62f)
                lineTo(8f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(0.29f, 0.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.29f, -0.29f, -0.37f, -0.72f, -0.22f, -1.09f)
                reflectiveCurveToRelative(0.52f, -0.62f, 0.92f, -0.62f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CalendarSwap = it}
