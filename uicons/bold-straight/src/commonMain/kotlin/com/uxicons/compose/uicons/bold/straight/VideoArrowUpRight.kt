package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowUpRight: ImageVector? = null

val Icons.Bs.VideoArrowUpRight: ImageVector
    get() = _VideoArrowUpRight ?: UXIcon(name = "VideoArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                verticalLineToRelative(5f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-1.94f, -1.94f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 18.88f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(5.12f)
                lineTo(0f, 21f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(14f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.62f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(13.75f)
                close()
                moveTo(18f, 6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(15f)
                lineTo(18f, 6.5f)
                close()
            }
        }.also { _VideoArrowUpRight = it}
