package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareLeft: ImageVector? = null

val Icons.Ss.AngleSquareLeft: ImageVector
    get() = _AngleSquareLeft ?: UXIcon(name = "AngleSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(8.59f, 13.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineTo(13.26f, 6f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10f, 12.09f)
                lineTo(14.71f, 16.8f)
                lineTo(13.3f, 18.21f)
                close()
            }
        }.also { _AngleSquareLeft = it}
