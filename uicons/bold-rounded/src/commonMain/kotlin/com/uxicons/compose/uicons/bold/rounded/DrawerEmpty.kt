package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Br.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.81f, 11.51f)
            lineToRelative(-1.64f, -7.23f)
            curveToRelative(-0.57f, -2.52f, -2.78f, -4.28f, -5.36f, -4.28f)
            lineTo(7.19f, -0f)
            curveTo(4.61f, 0f, 2.4f, 1.76f, 1.83f, 4.28f)
            lineTo(0.19f, 11.51f)
            curveToRelative(-0.12f, 0.54f, -0.19f, 1.1f, -0.19f, 1.66f)
            verticalLineToRelative(5.33f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-5.33f)
            curveToRelative(0f, -0.56f, -0.06f, -1.12f, -0.19f, -1.66f)
            close()
            moveTo(16.81f, 3f)
            curveToRelative(0.43f, 0f, 0.84f, 0.11f, 1.19f, 0.3f)
            verticalLineToRelative(1.7f)
            lineTo(6f, 5f)
            verticalLineToRelative(-1.7f)
            curveToRelative(0.36f, -0.19f, 0.76f, -0.3f, 1.19f, -0.3f)
            horizontalLineToRelative(9.61f)
            close()
            moveTo(5.58f, 8f)
            horizontalLineToRelative(12.84f)
            lineToRelative(0.69f, 3f)
            lineTo(4.88f, 11f)
            lineToRelative(0.69f, -3f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            reflectiveCurveToRelative(0f, 0f, 0.0f, 0f)
            curveToRelative(0f, 0f, 0.0f, 0f, 0.0f, 0f)
            lineTo(21.0f, 14f)
            reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            verticalLineToRelative(4.5f)
            close()
            moveTo(15f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _DrawerEmpty = it }
