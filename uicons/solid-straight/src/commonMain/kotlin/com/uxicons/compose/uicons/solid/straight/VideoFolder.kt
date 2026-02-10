package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoFolder: ImageVector? = null

val Icons.Ss.VideoFolder: ImageVector
    get() = _VideoFolder ?: UXIcon(name = "VideoFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(23.71f, 5.46f)
                lineTo(14f, -0f)
                verticalLineToRelative(10.92f)
                lineToRelative(9.71f, -5.46f)
                close()
                moveTo(12f, 3.88f)
                lineTo(8.24f, 2.0f)
                horizontalLineToRelative(-5.24f)
                curveToRelative(-1.65f, 0.0f, -3f, 1.35f, -3f, 3.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4.12f)
                close()
                moveTo(19.71f, 10.0f)
                lineTo(15f, 12.65f)
                verticalLineToRelative(8.35f)
                lineToRelative(-3f, -2.22f)
                verticalLineToRelative(2.22f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-4.29f)
                close()
            }
        }.also { _VideoFolder = it}
