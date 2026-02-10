package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareUp: ImageVector? = null

val Icons.Rs.AngleSquareUp: ImageVector
    get() = _AngleSquareUp ?: UXIcon(name = "AngleSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                close()
                moveTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.41f, 9.59f)
                lineTo(18.13f, 14.3f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12f, 11f)
                lineTo(7.33f, 15.68f)
                lineTo(5.91f, 14.26f)
                lineToRelative(4.67f, -4.67f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                close()
            }
        }.also { _AngleSquareUp = it}
