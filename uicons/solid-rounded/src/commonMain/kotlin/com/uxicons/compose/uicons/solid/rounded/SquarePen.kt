package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Sr.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.65f, 10.88f)
                lineToRelative(-5.19f, 5.19f)
                curveToRelative(-0.6f, 0.6f, -1.39f, 0.93f, -2.24f, 0.93f)
                horizontalLineToRelative(-0.22f)
                verticalLineToRelative(-0.22f)
                curveToRelative(0f, -0.85f, 0.33f, -1.64f, 0.93f, -2.24f)
                lineToRelative(5.19f, -5.19f)
                lineToRelative(1.53f, 1.53f)
                close()
                moveTo(16.42f, 6.5f)
                curveToRelative(-0.29f, 0f, -0.56f, 0.11f, -0.76f, 0.32f)
                lineToRelative(-1.12f, 1.12f)
                lineToRelative(1.53f, 1.53f)
                lineToRelative(1.12f, -1.12f)
                curveToRelative(0.41f, -0.37f, 0.41f, -1.15f, 0.01f, -1.52f)
                curveToRelative(-0.22f, -0.22f, -0.49f, -0.33f, -0.78f, -0.33f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(19.5f, 7.58f)
                curveToRelative(0f, -0.84f, -0.33f, -1.64f, -0.9f, -2.18f)
                curveToRelative(-1.15f, -1.2f, -3.21f, -1.2f, -4.36f, 0f)
                lineToRelative(-7.72f, 7.72f)
                curveToRelative(-0.98f, 0.98f, -1.51f, 2.27f, -1.51f, 3.65f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.84f, 0.68f, 1.52f, 1.52f, 1.52f)
                horizontalLineToRelative(0.7f)
                curveToRelative(1.38f, 0f, 2.68f, -0.54f, 3.65f, -1.51f)
                lineToRelative(7.71f, -7.71f)
                curveToRelative(0.58f, -0.56f, 0.91f, -1.36f, 0.91f, -2.19f)
                close()
            }
        }.also { _SquarePen = it}
