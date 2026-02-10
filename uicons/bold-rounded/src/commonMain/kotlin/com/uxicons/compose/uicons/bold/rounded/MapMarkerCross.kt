package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Br.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.44f, 12.44f)
            lineTo(9.88f, 11f)
            lineTo(8.44f, 9.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineTo(12f, 8.88f)
            lineToRelative(1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(14.12f, 11f)
            lineToRelative(1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineTo(12f, 13.12f)
            lineToRelative(-1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            close()
            moveTo(4.26f, 18.89f)
            arcTo(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.22f, 3.24f)
            arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.56f, 0f)
            arcToRelative(11.09f, 11.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15.62f)
            lineTo(15.97f, 22.39f)
            arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 22.36f)
            close()
            moveTo(6.35f, 16.74f)
            lineTo(10.07f, 20.19f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, 0.03f)
            lineTo(17.7f, 16.7f)
            arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -11.34f)
            horizontalLineToRelative(0f)
            arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 0f)
            arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.35f, 16.74f)
            close()
        }
    }.also { _MapMarkerCross = it }
