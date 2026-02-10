package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Ss.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.94f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.94f, 17.09f)
                lineTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.14f)
                close()
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                lineTo(7f, 9.41f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, -1.99f)
                lineToRelative(2.5f, -1.91f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 0f)
                lineToRelative(2.5f, 1.91f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9.41f)
                close()
                moveTo(14.8f, 9.01f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, 0.4f)
                lineTo(15f, 12f)
                lineTo(13f, 12f)
                lineTo(13f, 10f)
                lineTo(11f, 10f)
                verticalLineToRelative(2f)
                lineTo(9f, 12f)
                lineTo(9f, 9.41f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, -0.4f)
                lineTo(11.7f, 7.1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, 0f)
                close()
            }
        }.also { _MapMarkerHome = it}
