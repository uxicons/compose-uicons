package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoonRain: ImageVector? = null

val Icons.Ss.CloudMoonRain: ImageVector
    get() = _CloudMoonRain ?: UXIcon(name = "CloudMoonRain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.99f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(13.99f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.99f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11.99f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24.01f, 17f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21.02f)
                verticalLineToRelative(-2.01f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.99f, 17f)
                horizontalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.99f)
                lineTo(8f, 21.45f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, -7.32f)
                curveToRelative(0.33f, -5.5f, 7.95f, -7.04f, 10.4f, -2.11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.01f, 17f)
                close()
                moveTo(20f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                close()
                moveTo(16f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                close()
                moveTo(22f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8f)
                close()
                moveTo(4.19f, 16.6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.05f, -3.92f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8.53f)
                lineTo(10f, 8.52f)
                arcToRelative(6.65f, 6.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.35f, -5.64f)
                lineTo(14.9f, 1.99f)
                lineToRelative(-1.55f, -0.86f)
                curveTo(2.99f, -4.17f, -5.36f, 10.16f, 4.18f, 16.6f)
                close()
            }
        }.also { _CloudMoonRain = it}
