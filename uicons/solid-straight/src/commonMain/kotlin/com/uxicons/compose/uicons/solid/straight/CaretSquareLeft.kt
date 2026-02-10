package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft: ImageVector? = null

val Icons.Ss.CaretSquareLeft: ImageVector
    get() = _CaretSquareLeft ?: UXIcon(name = "CaretSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(8.35f, 12.83f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.66f)
                lineTo(14f, 6f)
                lineTo(14f, 18f)
                close()
            }
        }.also { _CaretSquareLeft = it}
