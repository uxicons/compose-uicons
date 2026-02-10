package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckOutCalendar: ImageVector? = null

val Icons.Br.CheckOutCalendar: ImageVector
    get() = _CheckOutCalendar ?: UXIcon(name = "CheckOutCalendar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-1.34f, 0f, -2.63f, -0.49f, -3.64f, -1.38f)
            curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.13f, -2.12f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.68f, 2.12f, -0.13f)
            curveToRelative(0.46f, 0.4f, 1.04f, 0.62f, 1.65f, 0.62f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
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
            moveTo(5.0f, 17.56f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, -1.04f, -1.29f, -1.65f, -0.69f)
            lineTo(0.28f, 13.81f)
            curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.61f, 0.61f, 1.65f, 0.18f, 1.65f, -0.69f)
            close()
        }
    }.also { _CheckOutCalendar = it }
