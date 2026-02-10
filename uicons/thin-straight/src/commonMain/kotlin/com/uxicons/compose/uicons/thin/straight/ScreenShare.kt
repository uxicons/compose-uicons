package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Ts.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.9f, 9.9f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.76f, -2.76f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.6f, -2.6f)
                verticalLineToRelative(6.7f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7.3f)
                lineToRelative(-2.6f, 2.6f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineTo(2f, 16f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(5.71f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.59f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(5.71f)
                lineTo(21f, 4f)
                lineTo(3f, 4f)
                verticalLineToRelative(12f)
                close()
                moveTo(23f, 17f)
                horizontalLineToRelative(-7.29f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-5.41f)
                lineToRelative(-1f, -1f)
                lineTo(1f, 17f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(21.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _ScreenShare = it}
