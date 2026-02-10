package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Bs.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                verticalLineToRelative(13f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(21f, 21f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14.77f, 17f)
                horizontalLineToRelative(-5.54f)
                lineToRelative(-0.92f, -1f)
                horizontalLineToRelative(-3.31f)
                lineTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3.31f)
                lineToRelative(-0.92f, 1f)
                close()
                moveTo(16.5f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                close()
            }
        }.also { _ScreenShare = it}
