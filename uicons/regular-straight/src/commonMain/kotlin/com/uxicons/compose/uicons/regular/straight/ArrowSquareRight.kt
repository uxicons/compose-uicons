package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareRight: ImageVector? = null

val Icons.Rs.ArrowSquareRight: ImageVector
    get() = _ArrowSquareRight ?: UXIcon(name = "ArrowSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(11.76f, 7.76f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.24f, 4.24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 11f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _ArrowSquareRight = it}
