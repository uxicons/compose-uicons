package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleLeft: ImageVector? = null

val Icons.Ss.ArrowCircleLeft: ImageVector
    get() = _ArrowCircleLeft ?: UXIcon(name = "ArrowCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(6.59f, 13.41f)
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
        }.also { _ArrowCircleLeft = it}
