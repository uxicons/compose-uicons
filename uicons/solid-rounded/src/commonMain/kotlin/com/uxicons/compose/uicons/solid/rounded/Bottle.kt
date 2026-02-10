package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Sr.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(10f, 17f)
                close()
                moveTo(20f, 12.71f)
                lineTo(20f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(9f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(4f, 12.71f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.14f, 8.06f)
                lineTo(9f, 7.32f)
                lineTo(9f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(15f, 7.32f)
                lineToRelative(1.86f, 0.74f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12.71f)
                close()
                moveTo(16f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _Bottle = it}
