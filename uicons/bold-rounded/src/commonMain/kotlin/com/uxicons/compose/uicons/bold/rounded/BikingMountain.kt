package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikingMountain: ImageVector? = null

val Icons.Br.BikingMountain: ImageVector
    get() = _BikingMountain ?: UXIcon(name = "BikingMountain") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 14f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 18.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 14f)
            close()
            moveTo(4.5f, 20f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 20f)
            close()
            moveTo(19.5f, 14f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 18.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 14f)
            close()
            moveTo(19.5f, 20f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 20f)
            close()
            moveTo(14f, 3.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 6f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3.5f)
            close()
            moveTo(13.5f, 15f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(10.5f, 15.77f)
            reflectiveCurveToRelative(-2.25f, -1.61f, -2.28f, -1.64f)
            arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 9.9f)
            arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
            curveTo(6f, 6f, 8.82f, 5f, 9.92f, 5f)
            arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.92f, 1.37f)
            curveToRelative(0.07f, 0.05f, 4.64f, 4f, 4.64f, 4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.97f, 2.26f)
            lineToRelative(-3.79f, -3.3f)
            lineToRelative(-2.61f, 1.83f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, 0.33f)
            arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, 0.34f)
            lineToRelative(2.73f, 1.96f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 15f)
            close()
        }
    }.also { _BikingMountain = it }
