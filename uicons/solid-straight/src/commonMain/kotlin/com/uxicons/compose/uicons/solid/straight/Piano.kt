package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Ss.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(-0.05f, 15f)
                verticalLineToRelative(-6.35f)
                curveTo(-0.05f, 3.88f, 3.85f, 0f, 8.63f, 0f)
                curveToRelative(4.0f, 0f, 7.4f, 2.72f, 8.27f, 6.61f)
                lineToRelative(0.23f, 1.04f)
                curveToRelative(0.24f, 1.07f, 1.18f, 1.82f, 2.28f, 1.82f)
                curveToRelative(2.56f, 0f, 4.63f, 2.07f, 4.63f, 4.62f)
                verticalLineToRelative(0.91f)
                lineTo(-0.05f, 15f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(-0.05f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(24.1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-5.05f)
                close()
            }
        }.also { _Piano = it}
