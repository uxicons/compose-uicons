package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareRight: ImageVector? = null

val Icons.Br.CaretSquareRight: ImageVector
    get() = _CaretSquareRight ?: UXIcon(name = "CaretSquareRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            lineTo(5.5f, 24f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            lineTo(0f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.5f)
            close()
            moveTo(3f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            lineTo(21f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            lineTo(5.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            close()
            moveTo(10.6f, 17.73f)
            lineTo(15.75f, 12.64f)
            arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.29f)
            lineTo(10.6f, 6.27f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, 0.64f)
            lineTo(9.03f, 17.09f)
            arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.6f, 17.73f)
            close()
        }
    }.also { _CaretSquareRight = it }
