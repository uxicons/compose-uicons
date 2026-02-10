package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxFragile: ImageVector? = null

val Icons.Bs.BoxFragile: ImageVector
    get() = _BoxFragile ?: UXIcon(name = "BoxFragile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(13.5f, 14.54f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                lineTo(8f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.43f)
                curveToRelative(-2.05f, -0.62f, -3.5f, -2.53f, -3.5f, -4.79f)
                lineTo(7f, 5f)
                horizontalLineToRelative(4.2f)
                lineToRelative(-2.22f, 5f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-1.22f, 2.34f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(2.66f, -5.23f)
                horizontalLineToRelative(-2.98f)
                lineToRelative(1.33f, -3f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(4.79f)
                curveToRelative(0f, 2.22f, -1.5f, 4.1f, -3.5f, 4.75f)
                close()
            }
        }.also { _BoxFragile = it}
