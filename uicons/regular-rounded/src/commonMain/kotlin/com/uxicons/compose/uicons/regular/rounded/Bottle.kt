package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Rr.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.86f, 8.06f)
                lineTo(15f, 7.32f)
                lineTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(9f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                lineTo(9f, 7.32f)
                lineToRelative(-1.86f, 0.74f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12.71f)
                lineTo(4f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(20f, 12.71f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.86f, 8.06f)
                close()
                moveTo(18f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(9f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(6f, 12.71f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.89f, 9.92f)
                lineToRelative(2.49f, -0.99f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 0.93f)
                lineToRelative(2.48f, 0.99f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12.71f)
                close()
                moveTo(15f, 13f)
                lineTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(16f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13f)
                close()
                moveTo(14f, 17f)
                lineTo(10f, 17f)
                lineTo(10f, 15f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Bottle = it}
