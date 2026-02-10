package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B3M: ImageVector? = null

val Icons.Brand._3M: ImageVector
    get() = _B3M ?: UXIcon(name = "3M") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.91f, 5.97f)
            lineToRelative(-1.73f, 7.05f)
            lineToRelative(-1.74f, -7.05f)
            horizontalLineToRelative(-5.1f)
            verticalLineToRelative(2.6f)
            curveTo(9.72f, 6.3f, 7.56f, 5.73f, 5.56f, 5.69f)
            curveTo(3.12f, 5.66f, 0.56f, 6.72f, 0.47f, 9.94f)
            horizontalLineToRelative(3.37f)
            curveToRelative(0f, -0.97f, 0.75f, -1.53f, 1.59f, -1.52f)
            curveToRelative(1.03f, -0.01f, 1.51f, 0.43f, 1.53f, 1.12f)
            curveToRelative(-0.04f, 0.6f, -0.39f, 1.01f, -1.52f, 1.01f)
            horizontalLineTo(4.31f)
            verticalLineToRelative(2.34f)
            horizontalLineToRelative(1.03f)
            curveToRelative(0.58f, 0f, 1.4f, 0.32f, 1.43f, 1.15f)
            curveToRelative(0.04f, 0.99f, -0.65f, 1.43f, -1.5f, 1.44f)
            curveToRelative(-1.52f, -0.06f, -1.76f, -1.22f, -1.76f, -2.22f)
            horizontalLineTo(0f)
            curveToRelative(0.02f, 0.68f, -0.15f, 5.08f, 5.34f, 5.04f)
            curveToRelative(2.63f, 0.02f, 4.46f, -1.08f, 5.0f, -2.6f)
            verticalLineToRelative(2.33f)
            horizontalLineToRelative(3.46f)
            verticalLineToRelative(-7.61f)
            lineToRelative(1.87f, 7.61f)
            horizontalLineToRelative(3.02f)
            lineToRelative(1.87f, -7.6f)
            verticalLineToRelative(7.61f)
            horizontalLineTo(24f)
            verticalLineTo(5.97f)
            horizontalLineTo(18.91f)
            close()
            moveTo(10.34f, 13.01f)
            curveToRelative(-0.43f, -0.89f, -1.03f, -1.28f, -1.38f, -1.4f)
            curveToRelative(0.71f, -0.32f, 1.09f, -0.75f, 1.38f, -1.61f)
            verticalLineTo(13.01f)
            close()
        }
    }.also { _B3M = it }
