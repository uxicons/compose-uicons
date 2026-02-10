package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat1: ImageVector? = null

val Icons.Bs.ArrowsRepeat1: ImageVector
    get() = _ArrowsRepeat1 ?: UXIcon(name = "ArrowsRepeat1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(3.79f, -3.5f)
                horizontalLineToRelative(2.21f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                lineTo(20f, 3f)
                lineTo(8f, 3f)
                curveTo(3.59f, 3f, 0f, 6.59f, 0f, 11f)
                lineTo(3f, 11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(16f, 18f)
                lineTo(4f, 18f)
                verticalLineToRelative(-3f)
                lineTo(0.29f, 18.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.71f, 3.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _ArrowsRepeat1 = it}
