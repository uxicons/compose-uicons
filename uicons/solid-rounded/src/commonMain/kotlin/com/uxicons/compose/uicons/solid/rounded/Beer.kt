package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beer: ImageVector? = null

val Icons.Sr.Beer: ImageVector
    get() = _Beer ?: UXIcon(name = "Beer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                lineTo(2f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.76f, 2.01f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.32f, -0.21f)
                arcToRelative(0.59f, 0.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 0.22f)
                arcToRelative(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.36f, 0.5f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 6f)
                lineTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(7f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                close()
                moveTo(23f, 13.5f)
                verticalLineToRelative(3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 20f)
                horizontalLineToRelative(-0.6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                lineTo(6f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(1f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8f)
                lineTo(4f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 9f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(11f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 13.5f)
                close()
                moveTo(21f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 12f)
                lineTo(19f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.5f)
                close()
            }
        }.also { _Beer = it}
