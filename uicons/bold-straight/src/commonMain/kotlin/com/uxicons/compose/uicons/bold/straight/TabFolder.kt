package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Bs.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-0.86f)
                lineToRelative(-0.54f, -1.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-0.54f, -1.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(-0.54f, -1.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.38f)
                curveTo(1.34f, 1f, 0f, 2.34f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _TabFolder = it}
