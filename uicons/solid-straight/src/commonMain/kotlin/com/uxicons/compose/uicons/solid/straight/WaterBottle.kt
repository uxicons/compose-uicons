package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterBottle: ImageVector? = null

val Icons.Ss.WaterBottle: ImageVector
    get() = _WaterBottle ?: UXIcon(name = "WaterBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 15f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, 2f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.78f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -2f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                verticalLineTo(13f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -2f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                verticalLineTo(8.03f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.89f, -2.79f)
                lineTo(15f, 4f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                lineTo(5.88f, 5.25f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.03f)
                verticalLineTo(8f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, 2f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.78f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14f)
                close()
            }
        }.also { _WaterBottle = it}
