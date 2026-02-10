package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _France: ImageVector? = null

val Icons.Ss.France: ImageVector
    get() = _France ?: UXIcon(name = "France") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-1f, -1.5f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(-1.5f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-2.67f, 2f)
                verticalLineToRelative(1f)
                lineToRelative(-1.33f, 1f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.64f, -1.36f)
                lineToRelative(-1.72f, 2.37f)
                lineToRelative(-4.34f, 1.24f)
                verticalLineToRelative(2.17f)
                lineToRelative(1.98f, 0.66f)
                lineToRelative(2.27f, 2.1f)
                lineToRelative(1.91f, 2.54f)
                lineToRelative(-1.01f, 5.13f)
                lineToRelative(-1.15f, 1.19f)
                verticalLineToRelative(1.72f)
                lineToRelative(4.22f, 1.21f)
                lineToRelative(2.63f, 0.04f)
                lineToRelative(3.37f, 0.96f)
                lineToRelative(1.5f, 0.04f)
                lineToRelative(1f, -3f)
                horizontalLineToRelative(1.14f)
                lineToRelative(3.59f, 0.99f)
                lineToRelative(2.38f, -3.02f)
                lineToRelative(-1.83f, -1.87f)
                verticalLineToRelative(-0.71f)
                lineToRelative(1.01f, -1.12f)
                lineToRelative(-0.81f, -2.88f)
                lineToRelative(-0.78f, -0.14f)
                lineToRelative(0.54f, -1.24f)
                horizontalLineToRelative(2.01f)
                lineToRelative(-1.15f, -2.03f)
                lineToRelative(1.16f, -2.77f)
                close()
            }
        }.also { _France = it}
