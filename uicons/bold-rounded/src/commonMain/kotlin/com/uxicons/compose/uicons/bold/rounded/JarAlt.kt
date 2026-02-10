package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Br.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 3.81f)
            verticalLineToRelative(-1.31f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(6.5f, 0f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1.31f)
            curveToRelative(-1.23f, 1.18f, -2f, 2.85f, -2f, 4.68f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -1.84f, -0.77f, -3.5f, -2f, -4.68f)
            close()
            moveTo(5f, 11f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(4f)
            lineTo(5f, 15f)
            verticalLineToRelative(-4f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.04f, 8f)
            curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(10f)
            close()
        }
    }.also { _JarAlt = it }
