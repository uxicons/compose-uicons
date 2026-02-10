package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorTextAlt: ImageVector? = null

val Icons.Sr.CursorTextAlt: ImageVector
    get() = _CursorTextAlt ?: UXIcon(name = "CursorTextAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(13f, 14f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.78f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(11f, 14f)
                lineTo(10f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                lineTo(11f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0.78f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                close()
                moveTo(24f, 21f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, 1f)
                lineTo(5.82f, 22f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 18.18f)
                lineTo(2f, 5.82f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.82f, 2f)
                lineTo(18.18f, 2f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 5.82f)
                lineTo(22f, 18.18f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21f)
                close()
                moveTo(20f, 18.18f)
                lineTo(20f, 5.82f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.18f, 4f)
                lineTo(5.82f, 4f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5.82f)
                lineTo(4f, 18.18f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.82f, 20f)
                lineTo(18.18f, 20f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18.18f)
                close()
            }
        }.also { _CursorTextAlt = it}
