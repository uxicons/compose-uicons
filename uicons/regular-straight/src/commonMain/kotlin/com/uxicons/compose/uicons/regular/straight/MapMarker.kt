package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Rs.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                close()
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(16f, 22.03f)
                lineToRelative(8f, 1.95f)
                lineTo(24f, 13.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.13f, -2.87f)
                lineToRelative(-2.1f, -0.7f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8.01f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 1.21f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                verticalLineToRelative(9.75f)
                lineToRelative(7.98f, 2.28f)
                close()
                moveTo(7.76f, 3.76f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.49f, 8.48f)
                lineTo(12f, 16.4f)
                lineTo(7.76f, 12.25f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8.48f)
                close()
                moveTo(2f, 12f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, -0.83f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.43f, 11.1f)
                lineToRelative(1.43f, 0.52f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 2.06f)
                lineTo(12f, 19.2f)
                lineToRelative(5.66f, -5.53f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, -1.88f)
                lineToRelative(2.22f, 0.74f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, 0.96f)
                verticalLineToRelative(7.95f)
                lineTo(16f, 19.97f)
                lineToRelative(-7.98f, 2f)
                lineTo(2f, 20.25f)
                close()
            }
        }.also { _MapMarker = it}
