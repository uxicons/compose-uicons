package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareRight: ImageVector? = null

val Icons.Rs.AngleSquareRight: ImageVector
    get() = _AngleSquareRight ?: UXIcon(name = "AngleSquareRight") {
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
                moveTo(14.43f, 13.4f)
                lineTo(9.72f, 18.11f)
                lineTo(8.3f, 16.69f)
                lineToRelative(4.71f, -4.71f)
                lineTo(8.34f, 7.31f)
                lineTo(9.76f, 5.89f)
                lineToRelative(4.67f, 4.67f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                close()
            }
        }.also { _AngleSquareRight = it}
