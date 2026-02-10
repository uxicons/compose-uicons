package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft: ImageVector? = null

val Icons.Br.CaretSquareLeft: ImageVector
    get() = _CaretSquareLeft ?: UXIcon(name = "CaretSquareLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 12f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
            close()
            moveTo(12.4f, 6.27f)
            lineTo(7.25f, 11.36f)
            arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.29f)
            lineTo(12.4f, 17.73f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, -0.64f)
            lineTo(13.97f, 6.91f)
            arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.4f, 6.27f)
            close()
        }
    }.also { _CaretSquareLeft = it }
