package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Rs.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(22f, 19f)
                lineTo(22f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(4.13f, 21f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 0f)
                lineTo(24f, 21f)
                close()
                moveTo(3f, 2f)
                lineTo(19f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(9f)
                lineTo(18f, 12f)
                lineTo(18f, 4f)
                lineTo(16f, 4f)
                verticalLineToRelative(8f)
                lineTo(14f, 12f)
                lineTo(14f, 4f)
                lineTo(12f, 4f)
                verticalLineToRelative(8f)
                lineTo(10f, 12f)
                lineTo(10f, 4f)
                lineTo(8f, 4f)
                verticalLineToRelative(8f)
                lineTo(6f, 12f)
                lineTo(6f, 4f)
                lineTo(4f, 4f)
                verticalLineToRelative(8f)
                lineTo(2f, 12f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                close()
                moveTo(8f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 22f)
                close()
                moveTo(8f, 16f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.87f, 3f)
                lineTo(3f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(2f, 14f)
                lineTo(20f, 14f)
                verticalLineToRelative(5f)
                lineTo(11.87f, 19f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16f)
                close()
            }
        }.also { _Trailer = it}
