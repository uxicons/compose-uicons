package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Ss.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                close()
                moveTo(16.95f, 11.96f)
                lineTo(12f, 16.8f)
                lineTo(7.06f, 11.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.89f, -0.01f)
                close()
                moveTo(16f, 7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
                close()
                moveTo(21.87f, 10.61f)
                lineTo(20.43f, 10.13f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 3.24f)
                lineTo(12f, 19.6f)
                lineToRelative(-6.34f, -6.2f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.24f, 9.03f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                verticalLineToRelative(9.75f)
                lineToRelative(7.98f, 2.28f)
                lineToRelative(8.02f, -2f)
                lineToRelative(8f, 1.95f)
                lineTo(24.0f, 13.48f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.87f, 10.61f)
                close()
            }
        }.also { _MapMarker = it}
