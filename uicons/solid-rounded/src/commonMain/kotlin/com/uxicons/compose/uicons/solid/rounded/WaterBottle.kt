package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterBottle: ImageVector? = null

val Icons.Sr.WaterBottle: ImageVector
    get() = _WaterBottle ?: UXIcon(name = "WaterBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8.02f)
                curveTo(20.15f, 5.42f, 16.87f, 4.85f, 15f, 4f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                verticalLineTo(4f)
                lineTo(6.51f, 5f)
                arcTo(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, 10f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(4.57f)
                arcToRelative(3.83f, 3.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(4.57f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, -7f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8.02f)
                close()
            }
        }.also { _WaterBottle = it}
