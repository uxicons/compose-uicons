package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleRight: ImageVector? = null

val Icons.Ss.ArrowCircleRight: ImageVector
    get() = _ArrowCircleRight ?: UXIcon(name = "ArrowCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                close()
                moveTo(17.41f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 11f)
                horizontalLineToRelative(9f)
                lineTo(11.76f, 7.76f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _ArrowCircleRight = it}
