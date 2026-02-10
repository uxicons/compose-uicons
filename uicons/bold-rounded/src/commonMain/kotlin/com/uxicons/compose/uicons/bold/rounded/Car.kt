package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Br.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.0f, 3.5f)
            arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -3.5f)
            horizontalLineTo(7.99f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.5f)
            lineTo(0.42f, 10.59f)
            arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.95f)
            verticalLineToRelative(2.73f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.76f)
            verticalLineTo(22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            verticalLineTo(21f)
            horizontalLineTo(17f)
            verticalLineToRelative(1f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            verticalLineTo(20.45f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -4.76f)
            verticalLineTo(12.95f)
            arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, -2.36f)
            close()
            moveTo(5.81f, 4.53f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.99f, 3f)
            horizontalLineToRelative(8.02f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.18f, 1.53f)
            lineTo(20.54f, 11f)
            horizontalLineTo(3.46f)
            close()
            moveTo(18.68f, 18f)
            horizontalLineTo(5.32f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.68f)
            verticalLineTo(14f)
            horizontalLineTo(5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(14f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(14f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.68f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.68f, 18f)
            close()
        }
    }.also { _Car = it }
