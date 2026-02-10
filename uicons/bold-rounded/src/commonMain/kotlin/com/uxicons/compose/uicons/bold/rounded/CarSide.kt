package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Br.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.17f, 10.32f)
            lineTo(17.01f, 4.35f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 2f)
            horizontalLineTo(9.16f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 5.55f)
            lineTo(2.06f, 10.72f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.5f)
            verticalLineToRelative(2f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 19f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(19f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(19f)
            horizontalLineToRelative(0.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineToRelative(-2f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.17f, 10.32f)
            close()
            moveTo(14.55f, 6.07f)
            lineTo(17.29f, 10f)
            horizontalLineTo(12f)
            verticalLineTo(5f)
            horizontalLineToRelative(0.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.55f, 6.07f)
            close()
            moveTo(9f, 5.01f)
            verticalLineTo(10f)
            horizontalLineTo(5.54f)
            lineTo(6.83f, 6.61f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5.01f)
            close()
            moveTo(21f, 16f)
            horizontalLineTo(3f)
            verticalLineTo(14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 13f)
            horizontalLineToRelative(15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.5f)
            close()
        }
    }.also { _CarSide = it }
