package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Bs.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.99f)
                lineToRelative(7.07f, -6.92f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.14f)
                horizontalLineToRelative(0f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.94f, 17.08f)
                close()
                moveTo(7.05f, 5.05f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 9.89f)
                lineTo(12f, 19.79f)
                lineTo(7.05f, 14.95f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9.9f)
                close()
                moveTo(16f, 11.5f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _MapMarkerMinus = it}
