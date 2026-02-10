package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowUpRight: ImageVector? = null

val Icons.Rs.VideoArrowUpRight: ImageVector
    get() = _VideoArrowUpRight ?: UXIcon(name = "VideoArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.29f, -5.29f)
                horizontalLineToRelative(-3.61f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.02f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 19.91f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(4.09f)
                lineTo(0f, 20f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.09f)
                lineToRelative(4f, -4f)
                verticalLineToRelative(15.83f)
                close()
                moveTo(18f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                lineTo(18f, 18f)
                lineTo(18f, 7f)
                close()
                moveTo(22f, 8.91f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(2.17f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-6.17f)
                close()
            }
        }.also { _VideoArrowUpRight = it}
