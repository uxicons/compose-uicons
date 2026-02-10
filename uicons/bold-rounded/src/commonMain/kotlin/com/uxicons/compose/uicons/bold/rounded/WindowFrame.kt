package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Br.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.5f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(15.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(19f, 21f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(7.5f)
            close()
            moveTo(19f, 5.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5.5f)
            lineTo(13.5f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(7.5f, 3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(5f, 13.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.also { _WindowFrame = it }
