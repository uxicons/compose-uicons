package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Ss.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 10f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(13f)
                lineTo(0f, 23f)
                verticalLineToRelative(-13f)
                close()
                moveTo(21f, 4f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-0.59f, -1.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.05f, 3f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.59f, -1.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(1.05f, 3f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-1.06f, -3f)
                horizontalLineToRelative(-3.82f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _TabFolder = it}
