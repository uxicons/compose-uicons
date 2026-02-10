package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat: ImageVector? = null

val Icons.Bs.ArrowsRepeat: ImageVector
    get() = _ArrowsRepeat ?: UXIcon(name = "ArrowsRepeat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                lineTo(0f, 11f)
                curveTo(0f, 6.59f, 3.59f, 3f, 8f, 3f)
                horizontalLineToRelative(12f)
                lineTo(20f, 0f)
                lineToRelative(3.71f, 3.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.71f, 3.79f)
                verticalLineToRelative(-3f)
                lineTo(8f, 6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
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
        }.also { _ArrowsRepeat = it}
