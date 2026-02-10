package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeEdit: ImageVector? = null

val Icons.Br.CustomizeEdit: ImageVector
    get() = _CustomizeEdit ?: UXIcon(name = "CustomizeEdit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.49f, 11.73f)
            curveToRelative(0.16f, 1.78f, -1.24f, 3.27f, -2.99f, 3.27f)
            horizontalLineToRelative(-3.35f)
            curveToRelative(-0.77f, 0f, -1.33f, -0.75f, -1.09f, -1.48f)
            curveToRelative(0.53f, -1.61f, 1.5f, -4.02f, 3.73f, -4.45f)
            curveToRelative(1.75f, -0.34f, 3.54f, 0.88f, 3.7f, 2.66f)
            close()
            moveTo(23.3f, 0.71f)
            curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
            curveToRelative(-0.03f, 0.03f, -5.95f, 6.53f, -5.95f, 6.53f)
            curveToRelative(1.49f, 0.45f, 2.69f, 1.56f, 3.23f, 3.01f)
            lineToRelative(6.13f, -6.13f)
            curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
            close()
            moveTo(19.5f, 12f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(10f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _CustomizeEdit = it }
