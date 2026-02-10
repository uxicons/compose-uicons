package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikingMountain: ImageVector? = null

val Icons.Sr.BikingMountain: ImageVector
    get() = _BikingMountain ?: UXIcon(name = "BikingMountain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, -5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                close()
                moveTo(19f, 13f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                close()
                moveTo(12.65f, 13.24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 14.46f)
                lineTo(9.06f, 12.79f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -1.8f)
                curveTo(8.05f, 11f, 8.02f, 11f, 8f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                curveTo(5f, 5.19f, 8.52f, 4f, 9.92f, 4f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.66f, 1.19f)
                curveToRelative(0.04f, 0.03f, 4.12f, 4.1f, 4.12f, 4.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(12.97f, 7.38f)
                reflectiveCurveToRelative(-2.48f, 2.28f, -2.65f, 2.44f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, 1.46f)
                close()
                moveTo(19f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 2.5f)
                close()
            }
        }.also { _BikingMountain = it}
