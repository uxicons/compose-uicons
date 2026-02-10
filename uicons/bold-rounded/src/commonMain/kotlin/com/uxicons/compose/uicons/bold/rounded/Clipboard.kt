package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Br.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 2f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(-0.56f, -1.18f, -1.76f, -2f, -3.15f, -2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.39f, 0f, -2.59f, 0.82f, -3.15f, 2f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(0.35f)
            curveToRelative(0.56f, 1.18f, 1.76f, 2f, 3.15f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.39f, 0f, 2.59f, -0.82f, 3.15f, -2f)
            horizontalLineToRelative(0.35f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.also { _Clipboard = it }
