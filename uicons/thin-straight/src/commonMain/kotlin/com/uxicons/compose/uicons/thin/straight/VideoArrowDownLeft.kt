package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowDownLeft: ImageVector? = null

val Icons.Ts.VideoArrowDownLeft: ImageVector
    get() = _VideoArrowDownLeft ?: UXIcon(name = "VideoArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6.58f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 4.08f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(20f, 20.08f)
                verticalLineToRelative(-4.79f)
                lineToRelative(4f, 4f)
                lineTo(24f, 4.87f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-2.29f)
                close()
                moveTo(19f, 19.08f)
                lineTo(1f, 19.08f)
                lineTo(1f, 6.58f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(23f, 7.28f)
                verticalLineToRelative(9.59f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(-3.59f)
                lineToRelative(3f, -3f)
                close()
                moveTo(14.85f, 7.93f)
                lineTo(6.71f, 16.08f)
                horizontalLineToRelative(5.29f)
                verticalLineToRelative(1f)
                lineTo(6.5f, 17.08f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.29f)
                lineTo(14.15f, 7.22f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _VideoArrowDownLeft = it}
