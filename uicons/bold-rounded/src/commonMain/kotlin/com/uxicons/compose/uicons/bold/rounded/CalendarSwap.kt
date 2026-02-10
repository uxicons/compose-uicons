package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Br.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.5f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 9f)
            lineTo(21f, 9f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(7f, 13f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(5.59f)
            lineToRelative(-0.29f, -0.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.29f, 0.29f, 0.37f, 0.72f, 0.22f, 1.09f)
            curveToRelative(-0.15f, 0.37f, -0.52f, 0.62f, -0.92f, 0.62f)
            lineTo(8f, 14f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            close()
            moveTo(17f, 17f)
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
    }.also { _CalendarSwap = it }
