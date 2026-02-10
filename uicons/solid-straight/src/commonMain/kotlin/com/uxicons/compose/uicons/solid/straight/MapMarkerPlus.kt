package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerPlus: ImageVector? = null

val Icons.Ss.MapMarkerPlus: ImageVector
    get() = _MapMarkerPlus ?: UXIcon(name = "MapMarkerPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.93f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.94f, 17.08f)
                lineTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.14f)
                close()
                moveTo(16f, 11f)
                horizontalLineTo(13f)
                verticalLineToRelative(3f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _MapMarkerPlus = it}
