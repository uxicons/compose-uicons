package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Bs.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.01f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.94f, 17.09f)
                lineTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.01f)
                close()
                moveTo(16.96f, 14.94f)
                lineTo(12f, 19.8f)
                lineTo(7.05f, 14.96f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, -9.9f)
                horizontalLineToRelative(0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 9.89f)
                close()
                moveTo(16f, 9.41f)
                lineTo(16f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 11f)
                lineTo(11f, 11f)
                verticalLineToRelative(2f)
                lineTo(8f, 13f)
                lineTo(8f, 9.41f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.59f, -1.19f)
                lineToRelative(2.5f, -1.91f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, 0f)
                lineToRelative(2.5f, 1.91f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9.41f)
                close()
            }
        }.also { _MapMarkerHome = it}
