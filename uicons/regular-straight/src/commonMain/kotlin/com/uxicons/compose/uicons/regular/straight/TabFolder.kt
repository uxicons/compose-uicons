package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabFolder: ImageVector? = null

val Icons.Rs.TabFolder: ImageVector
    get() = _TabFolder ?: UXIcon(name = "TabFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-0.21f, -0.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(0.67f, 2f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-0.21f, -0.63f)
                curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(0.67f, 2f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(-0.85f, -2f)
                horizontalLineToRelative(-3.82f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(2.49f)
                lineToRelative(0.85f, 2f)
                horizontalLineToRelative(14.66f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 21f)
                close()
            }
        }.also { _TabFolder = it}
