package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Bs.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 9.53f)
                lineTo(18.36f, 4.94f)
                lineTo(16.24f, 7.06f)
                lineToRelative(3.41f, 3.41f)
                lineTo(5f, 10.5f)
                lineTo(5f, 13.5f)
                lineToRelative(14.7f, -0.03f)
                lineToRelative(-3.47f, 3.47f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.95f, 9.53f)
                close()
            }
        }.also { _Exit = it}
