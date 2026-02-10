package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Bs.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.62f, 19.5f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                close()
                moveTo(3f, 8f)
                horizontalLineTo(21f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(12.35f)
                lineTo(8.35f, 1f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineToRelative(-3f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                close()
            }
        }.also { _RemoveFolder = it}
