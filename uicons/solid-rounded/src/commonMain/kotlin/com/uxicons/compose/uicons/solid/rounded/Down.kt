package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Sr.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-1.02f, 0f, -2.03f, -0.39f, -2.81f, -1.16f)
                lineToRelative(-6.37f, -6.77f)
                curveToRelative(-0.85f, -0.85f, -1.1f, -2.09f, -0.63f, -3.22f)
                curveToRelative(0.47f, -1.13f, 1.52f, -1.84f, 2.75f, -1.85f)
                horizontalLineToRelative(2.06f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineTo(11f)
                horizontalLineToRelative(2.06f)
                curveToRelative(1.23f, 0f, 2.28f, 0.71f, 2.75f, 1.85f)
                curveToRelative(0.47f, 1.13f, 0.22f, 2.38f, -0.65f, 3.24f)
                curveToRelative(0f, 0f, -6.34f, 6.74f, -6.35f, 6.75f)
                curveToRelative(-0.77f, 0.77f, -1.79f, 1.16f, -2.81f, 1.16f)
                close()
            }
        }.also { _Down = it}
