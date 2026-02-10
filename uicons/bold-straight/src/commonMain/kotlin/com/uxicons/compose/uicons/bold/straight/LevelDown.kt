package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Bs.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 16.44f)
                lineToRelative(-2.9f, 2.9f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(19.34f)
                lineToRelative(-2.9f, -2.9f)
                lineTo(5.98f, 18.56f)
                lineToRelative(4.68f, 4.68f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.68f, 0f)
                lineToRelative(4.68f, -4.68f)
                close()
            }
        }.also { _LevelDown = it}
