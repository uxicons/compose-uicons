package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnimatedIcon: ImageVector? = null

val Icons.Bs.AnimatedIcon: ImageVector
    get() = _AnimatedIcon ?: UXIcon(name = "AnimatedIcon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.5f)
                lineTo(8f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(3f, 20.5f)
                verticalLineToRelative(-4.5f)
                lineTo(0f, 16f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(14.7f, 12.83f)
                lineToRelative(3.3f, -1.91f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-1.18f, -4.5f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.18f, 4.5f)
                lineTo(6f, 10f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.32f, 1.85f)
                lineToRelative(-1.3f, 4.08f)
                lineToRelative(0.72f, 0.54f)
                lineToRelative(3.27f, -2.53f)
                lineToRelative(3.26f, 2.52f)
                lineToRelative(0.75f, -0.52f)
                lineToRelative(-1.33f, -4.03f)
                close()
                moveTo(17f, 0f)
                lineTo(17f, 8f)
                lineToRelative(7f, -4f)
                lineTo(17f, 0f)
                close()
            }
        }.also { _AnimatedIcon = it}
