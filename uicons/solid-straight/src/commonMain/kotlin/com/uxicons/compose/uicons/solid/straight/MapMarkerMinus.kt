package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Ss.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.93f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.94f, 17.08f)
                lineTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.07f, 2.93f)
                close()
                moveTo(16f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _MapMarkerMinus = it}
