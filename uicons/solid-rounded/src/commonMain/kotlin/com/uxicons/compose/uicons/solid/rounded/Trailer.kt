package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Sr.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                lineTo(0f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                lineTo(17f, 0f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(7f)
                lineTo(18f, 12f)
                lineTo(18f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(7f)
                lineTo(14f, 12f)
                lineTo(14f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(7f)
                lineTo(10f, 12f)
                lineTo(10f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                verticalLineToRelative(7f)
                lineTo(6f, 12f)
                lineTo(6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                verticalLineToRelative(7f)
                close()
                moveTo(8f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                close()
                moveTo(23f, 19f)
                lineTo(22f, 19f)
                lineTo(22f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.02f, 4.59f)
                curveTo(3.65f, 14.3f, 12.87f, 14.65f, 13f, 21f)
                lineTo(23f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                close()
            }
        }.also { _Trailer = it}
