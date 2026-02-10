package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlag: ImageVector? = null

val Icons.Br.BrazilFlag: ImageVector
    get() = _BrazilFlag ?: UXIcon(name = "BrazilFlag") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.85f, 10.74f)
            lineToRelative(-5.7f, -4.36f)
            curveToRelative(-0.68f, -0.52f, -1.62f, -0.52f, -2.3f, 0f)
            lineToRelative(-5.7f, 4.36f)
            curveToRelative(-0.83f, 0.64f, -0.83f, 1.89f, 0f, 2.52f)
            lineToRelative(5.7f, 4.36f)
            curveToRelative(0.68f, 0.52f, 1.62f, 0.52f, 2.3f, 0f)
            lineToRelative(5.7f, -4.36f)
            curveToRelative(0.83f, -0.64f, 0.83f, -1.89f, 0f, -2.52f)
            close()
            moveTo(12f, 15.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
            curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
            curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
            close()
            moveTo(15.49f, 12.14f)
            curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
            curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
            close()
            moveTo(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 16.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 19f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
        }
    }.also { _BrazilFlag = it }
