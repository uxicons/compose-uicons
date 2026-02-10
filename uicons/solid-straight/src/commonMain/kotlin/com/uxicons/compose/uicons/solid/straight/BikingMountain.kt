package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikingMountain: ImageVector? = null

val Icons.Ss.BikingMountain: ImageVector
    get() = _BikingMountain ?: UXIcon(name = "BikingMountain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                close()
                moveTo(19f, 13f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                close()
                moveTo(10.02f, 10.53f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.3f, -0.71f)
                curveToRelative(0.17f, -0.16f, 2.66f, -2.44f, 2.66f, -2.44f)
                lineToRelative(4.4f, 4.34f)
                lineToRelative(1.4f, -1.42f)
                lineToRelative(-5.08f, -5f)
                lineToRelative(-0.08f, -0.07f)
                arcTo(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.92f, 4f)
                curveTo(8.52f, 4f, 5f, 5.19f, 5f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                curveToRelative(0.02f, 0f, 0.05f, -0.01f, 0.07f, -0.01f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 1.8f)
                lineTo(11f, 14.46f)
                lineTo(11f, 19f)
                horizontalLineToRelative(2f)
                lineTo(13f, 13.54f)
                lineToRelative(-2.64f, -2.26f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.02f, 10.53f)
                close()
                moveTo(19f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 2.5f)
                close()
            }
        }.also { _BikingMountain = it}
