package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleUp: ImageVector? = null

val Icons.Rs.ArrowCircleUp: ImageVector
    get() = _ArrowCircleUp ?: UXIcon(name = "ArrowCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(7.76f, 12.24f)
                lineTo(6.34f, 10.83f)
                lineToRelative(4.24f, -4.24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(13f, 9f)
                verticalLineToRelative(9f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                close()
            }
        }.also { _ArrowCircleUp = it}
