package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumStar: ImageVector? = null

val Icons.Bs.PodiumStar: ImageVector
    get() = _PodiumStar ?: UXIcon(name = "PodiumStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.81f, 0f, -1.53f, 0.4f, -1.99f, 1f)
                horizontalLineToRelative(-0.76f)
                curveTo(4.47f, 1f, 2f, 3.47f, 2f, 6.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 9f)
                verticalLineToRelative(3f)
                lineTo(2.07f, 12f)
                lineToRelative(2.18f, 12f)
                lineTo(20.31f, 24f)
                lineToRelative(1.64f, -12f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17.69f, 21f)
                lineTo(6.75f, 21f)
                lineToRelative(-1.64f, -9f)
                horizontalLineToRelative(13.8f)
                lineToRelative(-1.23f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.51f, 19.17f)
                lineToRelative(0.78f, 0.57f)
                lineToRelative(1.7f, -1.24f)
                lineToRelative(1.71f, 1.24f)
                lineToRelative(0.78f, -0.57f)
                lineToRelative(-0.65f, -2.01f)
                lineToRelative(1.71f, -1.24f)
                lineToRelative(-0.3f, -0.92f)
                lineToRelative(-2.11f, 0f)
                lineToRelative(-0.65f, -2.01f)
                lineToRelative(-0.96f, 0.01f)
                lineToRelative(-0.65f, 2.0f)
                lineToRelative(-2.11f, 0f)
                lineToRelative(-0.3f, 0.92f)
                lineToRelative(1.71f, 1.24f)
                lineToRelative(-0.65f, 2.01f)
                close()
            }
        }.also { _PodiumStar = it}
