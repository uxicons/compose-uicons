package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkeletonRibs: ImageVector? = null

val Icons.Br.SkeletonRibs: ImageVector
    get() = _SkeletonRibs ?: UXIcon(name = "SkeletonRibs") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(13.5f, 3f)
            lineTo(13.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            lineTo(1.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(3.91f, 6f)
            curveToRelative(-1.32f, 3.23f, -2.3f, 7.14f, -2.84f, 11.43f)
            curveToRelative(-0.31f, 2.47f, 0.51f, 3.99f, 1.25f, 4.83f)
            curveToRelative(0.99f, 1.12f, 2.48f, 1.74f, 4.18f, 1.74f)
            horizontalLineToRelative(11f)
            curveToRelative(1.71f, 0f, 3.19f, -0.62f, 4.18f, -1.74f)
            curveToRelative(0.74f, -0.84f, 1.56f, -2.36f, 1.25f, -4.83f)
            curveToRelative(-0.54f, -4.29f, -1.52f, -8.2f, -2.84f, -11.43f)
            horizontalLineToRelative(2.41f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(10.5f, 6f)
            verticalLineToRelative(3f)
            lineTo(5.99f, 9f)
            curveToRelative(0.36f, -1.07f, 0.76f, -2.07f, 1.19f, -3f)
            horizontalLineToRelative(3.32f)
            close()
            moveTo(19.52f, 15f)
            horizontalLineToRelative(-6.02f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(5.38f)
            curveToRelative(0.24f, 0.96f, 0.45f, 1.97f, 0.64f, 3f)
            close()
            moveTo(10.5f, 15f)
            lineTo(4.48f, 15f)
            curveToRelative(0.19f, -1.03f, 0.4f, -2.04f, 0.64f, -3f)
            horizontalLineToRelative(5.38f)
            verticalLineToRelative(3f)
            close()
            moveTo(4.57f, 20.27f)
            curveToRelative(-0.45f, -0.51f, -0.62f, -1.29f, -0.53f, -2.27f)
            horizontalLineToRelative(6.47f)
            verticalLineToRelative(3f)
            lineTo(6.5f, 21f)
            curveToRelative(-0.59f, 0f, -1.4f, -0.13f, -1.93f, -0.73f)
            close()
            moveTo(19.43f, 20.27f)
            curveToRelative(-0.53f, 0.6f, -1.34f, 0.73f, -1.93f, 0.73f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(6.47f)
            curveToRelative(0.09f, 0.98f, -0.09f, 1.77f, -0.53f, 2.27f)
            close()
            moveTo(18.01f, 9f)
            horizontalLineToRelative(-4.51f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3.32f)
            curveToRelative(0.43f, 0.93f, 0.82f, 1.93f, 1.19f, 3f)
            close()
        }
    }.also { _SkeletonRibs = it }
