package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Rs.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.03f, 12.55f)
                lineTo(10.59f, 10f)
                lineTo(8.03f, 7.45f)
                lineTo(9.45f, 6.03f)
                lineTo(12f, 8.59f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.41f, 10f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12f, 11.41f)
                lineTo(9.45f, 13.97f)
                close()
                moveTo(4.93f, 17.08f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.07f, 2.93f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.14f)
                lineTo(12f, 23.99f)
                close()
                moveTo(4f, 10f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                lineTo(12f, 21.19f)
                lineToRelative(5.67f, -5.54f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 10f)
                close()
            }
        }.also { _MapMarkerCross = it}
