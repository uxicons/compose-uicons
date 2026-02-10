package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Rs.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.26f, -0.09f, -0.41f, -0.26f, -0.47f)
                curveToRelative(-0.15f, -0.05f, -0.38f, -0.02f, -0.55f, 0.22f)
                lineToRelative(-9.19f, 14.1f)
                lineTo(2.79f, 2.23f)
                curveToRelative(-0.15f, -0.21f, -0.38f, -0.24f, -0.53f, -0.2f)
                curveToRelative(-0.17f, 0.05f, -0.26f, 0.21f, -0.26f, 0.47f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(2.5f)
                curveTo(0f, 1.37f, 0.65f, 0.44f, 1.66f, 0.12f)
                curveToRelative(1.03f, -0.32f, 2.15f, 0.07f, 2.79f, 0.98f)
                lineToRelative(7.55f, 11.59f)
                lineTo(19.53f, 1.13f)
                curveToRelative(0.66f, -0.94f, 1.77f, -1.33f, 2.81f, -1.01f)
                curveToRelative(1.0f, 0.32f, 1.66f, 1.25f, 1.66f, 2.38f)
                verticalLineTo(24f)
                close()
            }
        }.also { _M = it}
