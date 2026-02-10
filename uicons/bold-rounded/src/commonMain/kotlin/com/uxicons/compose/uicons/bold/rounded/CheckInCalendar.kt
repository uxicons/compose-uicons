package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckInCalendar: ImageVector? = null

val Icons.Br.CheckInCalendar: ImageVector
    get() = _CheckInCalendar ?: UXIcon(name = "CheckInCalendar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.51f, 0f, -4.7f, -1.7f, -5.33f, -4.13f)
            curveToRelative(-0.21f, -0.8f, 0.28f, -1.62f, 1.08f, -1.83f)
            curveToRelative(0.8f, -0.21f, 1.62f, 0.28f, 1.83f, 1.08f)
            curveToRelative(0.28f, 1.1f, 1.28f, 1.87f, 2.42f, 1.87f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            lineTo(3f, 9f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(8.65f, 18.25f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.99f, 0f, -1.37f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.61f, -0.61f, -1.65f, -0.18f, -1.65f, 0.69f)
            verticalLineToRelative(1.56f)
            lineTo(1.5f, 13.0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(1.56f)
            curveToRelative(0f, 0.86f, 1.04f, 1.29f, 1.65f, 0.69f)
            close()
        }
    }.also { _CheckInCalendar = it }
