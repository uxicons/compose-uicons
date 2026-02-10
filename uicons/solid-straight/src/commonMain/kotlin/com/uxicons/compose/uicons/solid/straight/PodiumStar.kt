package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumStar: ImageVector? = null

val Icons.Ss.PodiumStar: ImageVector
    get() = _PodiumStar ?: UXIcon(name = "PodiumStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                lineTo(2.15f, 12f)
                lineToRelative(2f, 12f)
                horizontalLineToRelative(15.69f)
                lineToRelative(2f, -12f)
                horizontalLineToRelative(2.15f)
                verticalLineToRelative(-2f)
                lineTo(4f, 10f)
                close()
                moveTo(16.0f, 16.61f)
                lineToRelative(-2.2f, 1.27f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineToRelative(-2.17f, -1.68f)
                lineToRelative(-2.18f, 1.69f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                lineToRelative(-2.21f, -1.23f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.78f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(0.61f)
                close()
            }
        }.also { _PodiumStar = it}
