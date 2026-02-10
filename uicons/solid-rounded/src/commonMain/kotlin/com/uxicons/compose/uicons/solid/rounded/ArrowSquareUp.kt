package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareUp: ImageVector? = null

val Icons.Sr.ArrowSquareUp: ImageVector
    get() = _ArrowSquareUp ?: UXIcon(name = "ArrowSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                close()
                moveTo(6.29f, 9.46f)
                lineTo(9.88f, 5.88f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(3.58f, 3.59f)
                lineToRelative(0.02f, 0.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.44f, 1.39f)
                lineTo(13f, 7.59f)
                lineTo(13.01f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 7.59f)
                lineTo(7.71f, 10.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.29f, 9.46f)
                close()
            }
        }.also { _ArrowSquareUp = it}
