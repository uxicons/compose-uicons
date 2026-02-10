package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareRight: ImageVector? = null

val Icons.Sr.ArrowSquareRight: ImageVector
    get() = _ArrowSquareRight ?: UXIcon(name = "ArrowSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                close()
                moveTo(14.54f, 6.29f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineToRelative(-3.59f, 3.58f)
                lineToRelative(-0.03f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.39f, -1.44f)
                lineTo(16.41f, 13f)
                lineTo(6f, 13.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                lineTo(16.41f, 11f)
                lineTo(13.12f, 7.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, -1.41f)
                close()
            }
        }.also { _ArrowSquareRight = it}
