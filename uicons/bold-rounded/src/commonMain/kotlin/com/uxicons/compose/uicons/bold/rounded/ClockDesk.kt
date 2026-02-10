package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Br.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(11f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-9.5f)
            curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
            close()
            moveTo(12f, 3f)
            curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            close()
            moveTo(17.5f, 21f)
            lineTo(6.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.37f)
            curveToRelative(1.8f, 1.77f, 4.28f, 2.87f, 7f, 2.87f)
            reflectiveCurveToRelative(5.2f, -1.09f, 7f, -2.87f)
            verticalLineToRelative(2.37f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(8.2f, 12.17f)
            curveToRelative(-0.41f, -0.72f, -0.16f, -1.64f, 0.56f, -2.05f)
            lineToRelative(1.74f, -1.0f)
            verticalLineToRelative(-2.63f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.54f, -0.29f, 1.03f, -0.76f, 1.3f)
            lineToRelative(-2.5f, 1.43f)
            curveToRelative(-0.23f, 0.13f, -0.49f, 0.2f, -0.74f, 0.2f)
            curveToRelative(-0.52f, 0f, -1.03f, -0.27f, -1.3f, -0.76f)
            close()
        }
    }.also { _ClockDesk = it }
