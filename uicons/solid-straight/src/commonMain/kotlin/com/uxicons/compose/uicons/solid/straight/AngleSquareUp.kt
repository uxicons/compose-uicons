package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareUp: ImageVector? = null

val Icons.Ss.AngleSquareUp: ImageVector
    get() = _AngleSquareUp ?: UXIcon(name = "AngleSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(10.61f, 8.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                lineToRelative(4.67f, 4.67f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.02f, 10f)
                lineTo(7.31f, 14.71f)
                lineTo(5.89f, 13.3f)
                close()
            }
        }.also { _AngleSquareUp = it}
