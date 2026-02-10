package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareDown: ImageVector? = null

val Icons.Bs.CaretSquareDown: ImageVector
    get() = _CaretSquareDown ?: UXIcon(name = "CaretSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.83f, 15.65f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.66f, 0f)
                lineTo(6f, 10f)
                horizontalLineTo(18f)
                close()
                moveTo(24f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                close()
                moveTo(3f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _CaretSquareDown = it}
