package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JarAlt: ImageVector? = null

val Icons.Bs.JarAlt: ImageVector
    get() = _JarAlt ?: UXIcon(name = "JarAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 3.26f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(3.26f)
                curveToRelative(-1.22f, 1.01f, -2f, 2.54f, -2f, 4.24f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22f, 7.5f)
                curveToRelative(0f, -1.7f, -0.78f, -3.23f, -2f, -4.24f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                lineTo(5f, 15f)
                verticalLineToRelative(-4f)
                close()
                moveTo(19f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-10f)
                lineTo(5f, 8f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _JarAlt = it}
