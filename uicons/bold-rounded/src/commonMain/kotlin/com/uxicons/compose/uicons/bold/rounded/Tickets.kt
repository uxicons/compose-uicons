package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Br.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 7f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(6f, 19f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(9f, 13f)
            curveToRelative(1.92f, 0f, 3.56f, 1.21f, 4.21f, 2.9f)
            curveToRelative(1.04f, -0.3f, 1.79f, -1.26f, 1.79f, -2.4f)
            lineTo(15f, 5.5f)
            curveToRelative(0f, -1.13f, -0.76f, -2.09f, -1.79f, -2.4f)
            curveToRelative(-0.65f, 1.69f, -2.29f, 2.9f, -4.21f, 2.9f)
            reflectiveCurveToRelative(-3.56f, -1.21f, -4.21f, -2.9f)
            curveToRelative(-1.04f, 0.3f, -1.79f, 1.26f, -1.79f, 2.4f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.13f, 0.76f, 2.09f, 1.79f, 2.4f)
            curveToRelative(0.65f, -1.69f, 2.29f, -2.9f, 4.21f, -2.9f)
            close()
        }
    }.also { _Tickets = it }
