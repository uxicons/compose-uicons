package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Sr.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 22.03f)
                curveToRelative(-0.39f, 0f, -0.78f, -0.08f, -1.16f, -0.23f)
                curveToRelative(-1.13f, -0.47f, -1.84f, -1.52f, -1.85f, -2.75f)
                verticalLineToRelative(-2.06f)
                horizontalLineTo(3.97f)
                curveToRelative(-2.19f, 0f, -3.97f, -1.8f, -3.97f, -4.01f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -2.21f, 1.78f, -4.01f, 3.97f, -4.01f)
                horizontalLineToRelative(7.03f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0f, -1.23f, 0.71f, -2.28f, 1.85f, -2.75f)
                curveToRelative(1.13f, -0.47f, 2.38f, -0.22f, 3.24f, 0.65f)
                lineToRelative(6.72f, 6.33f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(1.55f, 1.55f, 1.55f, 4.07f, 0f, 5.62f)
                lineToRelative(-6.77f, 6.37f)
                curveToRelative(-0.56f, 0.56f, -1.3f, 0.86f, -2.06f, 0.86f)
                close()
            }
        }.also { _Right = it}
