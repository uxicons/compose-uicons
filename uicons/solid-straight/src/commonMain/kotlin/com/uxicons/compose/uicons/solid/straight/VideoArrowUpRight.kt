package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowUpRight: ImageVector? = null

val Icons.Ss.VideoArrowUpRight: ImageVector
    get() = _VideoArrowUpRight ?: UXIcon(name = "VideoArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.01f)
                verticalLineToRelative(13.98f)
                lineToRelative(-3f, -2.24f)
                lineTo(21f, 7.24f)
                lineToRelative(3f, -2.24f)
                close()
                moveTo(19f, 7f)
                verticalLineToRelative(13f)
                lineTo(0f, 20f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(7.98f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.61f)
                lineToRelative(-6.79f, 6.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.79f, -6.79f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _VideoArrowUpRight = it}
