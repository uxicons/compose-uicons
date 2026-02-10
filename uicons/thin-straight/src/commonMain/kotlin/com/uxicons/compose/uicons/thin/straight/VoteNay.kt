package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteNay: ImageVector? = null

val Icons.Ts.VoteNay: ImageVector
    get() = _VoteNay ?: UXIcon(name = "VoteNay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 12f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(24f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineTo(5f)
                verticalLineTo(4.5f)
                close()
                moveTo(23f, 21f)
                horizontalLineTo(1f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5f)
                horizontalLineTo(20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(15.35f, 7.35f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _VoteNay = it}
