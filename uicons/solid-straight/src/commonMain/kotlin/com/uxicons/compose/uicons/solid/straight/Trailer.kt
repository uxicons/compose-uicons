package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Ss.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 21f)
                close()
                moveTo(22f, 19f)
                lineTo(22f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                curveToRelative(0.17f, -6.6f, 9.83f, -6.59f, 10f, 0f)
                lineTo(24f, 21f)
                lineTo(24f, 19f)
                close()
                moveTo(4f, 4f)
                lineTo(6f, 4f)
                verticalLineToRelative(8f)
                lineTo(8f, 12f)
                lineTo(8f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                lineTo(12f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                lineTo(16f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                lineTo(22f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineToRelative(9f)
                lineTo(4f, 12f)
                close()
            }
        }.also { _Trailer = it}
