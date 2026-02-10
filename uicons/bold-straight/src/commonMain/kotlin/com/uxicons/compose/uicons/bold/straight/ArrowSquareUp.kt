package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareUp: ImageVector? = null

val Icons.Bs.ArrowSquareUp: ImageVector
    get() = _ArrowSquareUp ?: UXIcon(name = "ArrowSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(8.11f, 13.1f)
                lineTo(5.99f, 10.97f)
                lineToRelative(4.24f, -4.24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 0f)
                lineToRelative(4.24f, 4.24f)
                lineTo(15.89f, 13.1f)
                lineTo(13.5f, 10.71f)
                verticalLineToRelative(7.33f)
                horizontalLineToRelative(-3f)
                verticalLineTo(10.71f)
                close()
            }
        }.also { _ArrowSquareUp = it}
