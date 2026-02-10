package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareDown: ImageVector? = null

val Icons.Ss.AngleSquareDown: ImageVector
    get() = _AngleSquareDown ?: UXIcon(name = "AngleSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(13.41f, 15.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineTo(5.91f, 10.74f)
                lineTo(7.33f, 9.33f)
                lineTo(12f, 14f)
                lineToRelative(4.71f, -4.71f)
                lineTo(18.13f, 10.7f)
                close()
            }
        }.also { _AngleSquareDown = it}
