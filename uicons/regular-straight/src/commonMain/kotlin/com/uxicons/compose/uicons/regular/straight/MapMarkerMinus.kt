package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Rs.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                close()
                moveTo(4.94f, 17.08f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.13f, -0.01f)
                lineTo(12f, 23.99f)
                close()
                moveTo(4f, 10f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                lineTo(12f, 21.19f)
                lineToRelative(5.67f, -5.54f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 10f)
                close()
            }
        }.also { _MapMarkerMinus = it}
