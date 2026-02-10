package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareRight: ImageVector? = null

val Icons.Ss.ArrowSquareRight: ImageVector
    get() = _ArrowSquareRight ?: UXIcon(name = "ArrowSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(17.41f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineToRelative(9f)
                lineTo(11.76f, 7.76f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _ArrowSquareRight = it}
