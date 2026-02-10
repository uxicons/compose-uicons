package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft1: ImageVector? = null

val Icons.Br.CaretSquareLeft1: ImageVector
    get() = _CaretSquareLeft1 ?: UXIcon(name = "CaretSquareLeft1") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 18.5f)
            lineTo(0f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            lineTo(5.5f, 24f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            close()
            moveTo(21f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            lineTo(5.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            close()
            moveTo(13.4f, 6.27f)
            lineTo(8.25f, 11.36f)
            arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.29f)
            lineTo(13.4f, 17.73f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, -0.64f)
            lineTo(14.97f, 6.91f)
            arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.4f, 6.27f)
            close()
        }
    }.also { _CaretSquareLeft1 = it }
