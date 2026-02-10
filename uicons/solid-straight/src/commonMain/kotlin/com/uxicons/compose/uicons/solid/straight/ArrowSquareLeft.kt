package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareLeft: ImageVector? = null

val Icons.Ss.ArrowSquareLeft: ImageVector
    get() = _ArrowSquareLeft ?: UXIcon(name = "ArrowSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(6.58f, 13.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(9f, 11f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _ArrowSquareLeft = it}
