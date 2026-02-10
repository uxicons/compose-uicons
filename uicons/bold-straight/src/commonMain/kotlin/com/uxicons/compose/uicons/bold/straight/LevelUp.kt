package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Bs.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 7.56f)
                lineTo(14f, 4.67f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                verticalLineTo(4.67f)
                lineToRelative(-2.9f, 2.9f)
                lineTo(5.98f, 5.44f)
                lineTo(10.66f, 0.76f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.68f, 0f)
                lineToRelative(4.68f, 4.68f)
                close()
            }
        }.also { _LevelUp = it}
