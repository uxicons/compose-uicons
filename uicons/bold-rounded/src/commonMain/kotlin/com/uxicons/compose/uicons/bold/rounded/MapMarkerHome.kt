package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Br.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.22f, 3.24f)
            arcTo(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.26f, 18.9f)
            lineTo(8f, 22.36f)
            arcToRelative(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.98f, 0.03f)
            lineToRelative(3.81f, -3.54f)
            arcToRelative(11.09f, 11.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.62f)
            arcTo(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(17.7f, 16.7f)
            lineTo(13.9f, 20.23f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.83f, -0.03f)
            lineTo(6.35f, 16.74f)
            arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.38f)
            arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
            horizontalLineToRelative(0f)
            arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.7f, 16.7f)
            close()
            moveTo(17f, 10.13f)
            lineTo(17f, 14f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            lineTo(15f, 15f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            lineTo(14f, 12f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            lineTo(11f, 11f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
            verticalLineToRelative(2f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            lineTo(8f, 15f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            lineTo(7f, 10.13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.86f, -1.64f)
            lineToRelative(3f, -2.08f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.28f, 0f)
            lineToRelative(3f, 2.08f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10.13f)
            close()
        }
    }.also { _MapMarkerHome = it }
