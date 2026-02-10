package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Br.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 22.36f)
            arcToRelative(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.98f, 0.03f)
            lineToRelative(3.81f, -3.54f)
            arcToRelative(11.09f, 11.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.62f)
            arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.56f, 0f)
            arcToRelative(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 15.66f)
            close()
            moveTo(6.35f, 5.35f)
            arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
            arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.7f, 16.7f)
            lineToRelative(-3.8f, 3.52f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.83f, -0.03f)
            lineTo(6.35f, 16.74f)
            arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.35f, 5.35f)
            close()
            moveTo(7f, 11f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 9.5f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
            close()
        }
    }.also { _MapMarkerMinus = it }
