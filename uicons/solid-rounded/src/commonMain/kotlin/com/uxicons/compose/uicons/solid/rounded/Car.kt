package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Sr.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.33f, 12f)
                curveToRelative(0.03f, -0.09f, 0.04f, -0.19f, 0.07f, -0.28f)
                lineTo(3.1f, 4.29f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 1f)
                horizontalLineToRelative(8.4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.7f, 3.29f)
                lineToRelative(2.7f, 7.43f)
                curveToRelative(0.03f, 0.09f, 0.05f, 0.19f, 0.07f, 0.28f)
                close()
                moveTo(20f, 14f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.58f)
                verticalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineTo(20.58f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
                verticalLineTo(14f)
                close()
            }
        }.also { _Car = it}
