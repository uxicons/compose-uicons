package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterBottle: ImageVector? = null

val Icons.Rr.WaterBottle: ImageVector
    get() = _WaterBottle ?: UXIcon(name = "WaterBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7.99f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.48f, 4.3f)
                lineTo(15f, 3.31f)
                lineTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(9f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                lineTo(9f, 3.31f)
                lineTo(6.51f, 4.3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.38f, 11f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, -7f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7.99f)
                close()
                moveTo(18f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(8f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                horizontalLineToRelative(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                close()
                moveTo(18f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(8f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                horizontalLineToRelative(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                close()
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, -3.84f)
                lineToRelative(3.11f, -1.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 3.98f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 0.93f)
                lineToRelative(3.11f, 1.25f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                close()
            }
        }.also { _WaterBottle = it}
