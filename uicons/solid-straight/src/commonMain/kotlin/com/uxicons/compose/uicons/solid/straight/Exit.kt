package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Ss.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.88f)
                lineTo(18.54f, 5.29f)
                lineTo(17.12f, 6.71f)
                lineToRelative(4.26f, 4.26f)
                lineTo(5f, 11f)
                lineToRelative(0f, 2f)
                lineToRelative(16.44f, -0.03f)
                lineToRelative(-4.32f, 4.32f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.88f)
                close()
            }
        }.also { _Exit = it}
