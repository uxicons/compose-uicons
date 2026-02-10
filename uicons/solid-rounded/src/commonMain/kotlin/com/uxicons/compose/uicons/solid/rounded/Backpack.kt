package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Backpack: ImageVector? = null

val Icons.Sr.Backpack: ImageVector
    get() = _Backpack ?: UXIcon(name = "Backpack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                lineTo(8f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.89f, -2.23f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.77f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 24f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 13.42f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18f)
                verticalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.92f, 4.88f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 21f)
                close()
                moveTo(21f, 13.42f)
                lineTo(21f, 21f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, 2.88f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                lineTo(24f, 18f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13.42f)
                close()
                moveTo(19f, 11f)
                verticalLineToRelative(6.36f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                lineTo(5f, 11f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5.26f)
                lineTo(8f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                lineTo(16f, 5.26f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
                close()
                moveTo(10f, 4.3f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                lineTo(14f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(10f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                lineTo(9f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                close()
            }
        }.also { _Backpack = it}
