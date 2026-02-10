package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Sr.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.79f, 1.79f, 1f, 4f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.9f, 0.55f)
                lineToRelative(1.22f, 2.45f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.0f, -2.02f)
                curveToRelative(-0.22f, -0.45f, 0.1f, -0.97f, 0.6f, -0.97f)
                horizontalLineToRelative(1.77f)
                curveToRelative(0.86f, 0f, 1.62f, 0.55f, 1.9f, 1.37f)
                lineToRelative(0.81f, 1.63f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-1.0f, -2.02f)
                curveToRelative(-0.22f, -0.45f, 0.1f, -0.97f, 0.6f, -0.97f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.86f, 0f, 1.62f, 0.55f, 1.9f, 1.37f)
                lineToRelative(0.88f, 1.68f)
                curveToRelative(1.98f, 0.24f, 3.53f, 1.91f, 3.53f, 3.95f)
                lineTo(0f, 8f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                lineTo(0f, 10f)
                close()
            }
        }.also { _TabFolder = it}
