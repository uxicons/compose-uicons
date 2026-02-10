package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusDouble: ImageVector? = null

val Icons.Rr.VenusDouble: ImageVector
    get() = _VenusDouble ?: UXIcon(name = "VenusDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                arcTo(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 1.51f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 14.85f)
                lineTo(6f, 19f)
                lineTo(4f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(6f, 21f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(8f, 21f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(8f, 19f)
                lineTo(8f, 14.98f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, -1.49f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14.97f)
                lineTo(16f, 19f)
                lineTo(14f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(18f, 21f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(18f, 19f)
                lineTo(18f, 14.85f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
                close()
                moveTo(22f, 7.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 2f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7.5f)
                close()
                moveTo(2f, 7.5f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.56f, -4.56f)
                arcToRelative(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.12f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 7.5f)
                close()
            }
        }.also { _VenusDouble = it}
