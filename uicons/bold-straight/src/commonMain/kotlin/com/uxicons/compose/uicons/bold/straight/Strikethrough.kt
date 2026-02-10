package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Bs.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.89f)
                curveToRelative(-1.17f, -1.13f, -1.89f, -2.71f, -1.89f, -4.4f)
                curveTo(2f, 2.73f, 4.73f, 0f, 8.1f, 0f)
                horizontalLineToRelative(7.81f)
                curveToRelative(3.36f, 0f, 6.09f, 2.73f, 6.09f, 6.1f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -1.71f, -1.39f, -3.1f, -3.1f, -3.1f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-1.71f, 0f, -3.1f, 1.39f, -3.1f, 3.1f)
                curveToRelative(0f, 1.37f, 0.92f, 2.6f, 2.24f, 2.98f)
                lineToRelative(4.88f, 1.43f)
                horizontalLineToRelative(11.88f)
                close()
                moveTo(18.32f, 16f)
                curveToRelative(0.42f, 0.53f, 0.68f, 1.19f, 0.68f, 1.9f)
                curveToRelative(0f, 1.71f, -1.39f, 3.1f, -3.1f, 3.1f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-1.71f, 0f, -3.1f, -1.39f, -3.1f, -3.1f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 3.36f, 2.73f, 6.1f, 6.09f, 6.1f)
                horizontalLineToRelative(7.81f)
                curveToRelative(3.36f, 0f, 6.09f, -2.73f, 6.09f, -6.1f)
                curveToRelative(0f, -0.66f, -0.12f, -1.3f, -0.32f, -1.9f)
                horizontalLineToRelative(-3.35f)
                close()
            }
        }.also { _Strikethrough = it}
