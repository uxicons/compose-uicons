package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareY: ImageVector? = null

val Icons.Br.SquareY: ImageVector
    get() = _SquareY ?: UXIcon(name = "SquareY") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(17.7f, 7.4f)
            lineToRelative(-4.2f, 5.6f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            lineToRelative(-4.2f, -5.6f)
            curveToRelative(-0.5f, -0.66f, -0.36f, -1.6f, 0.3f, -2.1f)
            curveToRelative(0.66f, -0.49f, 1.6f, -0.36f, 2.1f, 0.3f)
            lineToRelative(3.3f, 4.4f)
            lineToRelative(3.3f, -4.4f)
            curveToRelative(0.5f, -0.66f, 1.44f, -0.8f, 2.1f, -0.3f)
            curveToRelative(0.66f, 0.5f, 0.8f, 1.44f, 0.3f, 2.1f)
            close()
        }
    }.also { _SquareY = it }
