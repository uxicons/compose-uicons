package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoFolder: ImageVector? = null

val Icons.Bs.VideoFolder: ImageVector
    get() = _VideoFolder ?: UXIcon(name = "VideoFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                verticalLineToRelative(1.64f)
                lineToRelative(3f, -2.14f)
                verticalLineToRelative(7f)
                lineToRelative(-3f, -2.14f)
                verticalLineToRelative(1.64f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                close()
                moveTo(14f, 0f)
                verticalLineToRelative(10.92f)
                lineToRelative(9.71f, -5.46f)
                close()
                moveTo(21f, 9.28f)
                verticalLineToRelative(11.72f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-5.18f)
                lineToRelative(-3.65f, -1.82f)
                horizontalLineToRelative(-4.85f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-16.41f)
                close()
            }
        }.also { _VideoFolder = it}
