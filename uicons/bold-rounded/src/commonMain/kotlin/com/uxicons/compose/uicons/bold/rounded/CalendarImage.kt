package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Br.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 2f)
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
            curveToRelative(0f, 1.91f, 0.98f, 3.6f, 2.46f, 4.58f)
            curveToRelative(0.18f, 0.17f, 0.4f, 0.29f, 0.63f, 0.36f)
            curveToRelative(0.73f, 0.36f, 1.55f, 0.56f, 2.41f, 0.56f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(3.45f, 19.93f)
            curveToRelative(-0.28f, -0.41f, -0.45f, -0.9f, -0.45f, -1.43f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(1.38f)
            lineToRelative(-5.38f, 5.38f)
            curveToRelative(-0.33f, 0.33f, -0.91f, 0.33f, -1.24f, 0f)
            lineToRelative(-0.63f, -0.64f)
            curveToRelative(-1.47f, -1.47f, -4.02f, -1.47f, -5.49f, 0f)
            lineToRelative(-4.81f, 4.81f)
            close()
            moveTo(18.5f, 21f)
            lineTo(6.62f, 21f)
            lineToRelative(3.76f, -3.76f)
            curveToRelative(0.33f, -0.33f, 0.91f, -0.33f, 1.24f, 0f)
            lineToRelative(0.63f, 0.64f)
            curveToRelative(1.47f, 1.47f, 4.02f, 1.47f, 5.49f, 0f)
            lineToRelative(3.26f, -3.26f)
            verticalLineToRelative(3.88f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(8f, 12.5f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _CalendarImage = it }
