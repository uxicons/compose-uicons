package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareRight: ImageVector? = null

val Icons.Ss.CaretSquareRight: ImageVector
    get() = _CaretSquareRight ?: UXIcon(name = "CaretSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(15.64f, 11.18f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.66f)
                lineTo(9.99f, 18.01f)
                verticalLineToRelative(-12f)
                close()
            }
        }.also { _CaretSquareRight = it}
