package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Rs.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.01f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.94f, 17.09f)
                lineTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.01f)
                close()
                moveTo(17.66f, 15.65f)
                lineTo(12f, 21.2f)
                lineTo(6.34f, 15.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -0.01f)
                close()
                moveTo(16.02f, 7.42f)
                lineToRelative(-2.5f, -1.91f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.04f, 0f)
                lineToRelative(-2.5f, 1.91f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9.41f)
                lineTo(7f, 14f)
                lineTo(17f, 14f)
                lineTo(17f, 9.41f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.02f, 7.42f)
                close()
                moveTo(15f, 12f)
                lineTo(13f, 12f)
                lineTo(13f, 10f)
                lineTo(11f, 10f)
                verticalLineToRelative(2f)
                lineTo(9f, 12f)
                lineTo(9f, 9.41f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, -0.4f)
                lineTo(11.7f, 7.1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, 0f)
                lineToRelative(2.5f, 1.91f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, 0.4f)
                close()
            }
        }.also { _MapMarkerHome = it}
