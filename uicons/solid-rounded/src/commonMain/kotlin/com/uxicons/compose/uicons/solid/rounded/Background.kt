package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Sr.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.59f)
                lineTo(6.59f, 24f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-1.02f, 0f, -1.97f, -0.31f, -2.76f, -0.83f)
                lineTo(23.17f, 2.24f)
                curveToRelative(0.52f, 0.79f, 0.83f, 1.74f, 0.83f, 2.76f)
                verticalLineToRelative(1.59f)
                close()
                moveTo(0f, 14.59f)
                lineTo(14.59f, 0f)
                horizontalLineToRelative(-5.17f)
                lineTo(0f, 9.41f)
                verticalLineToRelative(5.17f)
                close()
                moveTo(24f, 9.42f)
                lineToRelative(-14.59f, 14.59f)
                horizontalLineToRelative(5.17f)
                lineToRelative(9.41f, -9.41f)
                verticalLineToRelative(-5.17f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-1.59f)
                lineTo(0f, 17.41f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 1.02f, 0.31f, 1.97f, 0.83f, 2.76f)
                lineTo(21.76f, 0.83f)
                curveToRelative(-0.79f, -0.52f, -1.74f, -0.83f, -2.76f, -0.83f)
                close()
                moveTo(6.59f, 0f)
                horizontalLineToRelative(-1.59f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(1.59f)
                lineTo(6.59f, 0f)
                close()
                moveTo(17.42f, 24f)
                horizontalLineToRelative(1.59f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-6.59f, 6.59f)
                close()
            }
        }.also { _Background = it}
