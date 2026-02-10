package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Ts.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.21f, 19.52f)
                lineToRelative(3.8f, 3.78f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.8f, -3.78f)
                lineToRelative(-3.76f, 3.77f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.76f, -3.78f)
                lineToRelative(-3.8f, -3.78f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.8f, 3.78f)
                lineToRelative(3.8f, -3.82f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.8f, 3.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                horizontalLineTo(12.12f)
                lineTo(8.12f, 1f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineTo(23f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 7f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(7.88f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _RemoveFolder = it}
