package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Br.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.41f, 8.14f)
            lineTo(15.85f, 1.59f)
            curveTo(14.83f, 0.57f, 13.46f, 0f, 12.0f, 0f)
            reflectiveCurveToRelative(-2.83f, 0.56f, -3.85f, 1.59f)
            lineTo(1.59f, 8.14f)
            curveToRelative(-2.12f, 2.12f, -2.12f, 5.58f, 0f, 7.71f)
            lineToRelative(6.55f, 6.55f)
            curveToRelative(1.06f, 1.06f, 2.46f, 1.59f, 3.85f, 1.59f)
            reflectiveCurveToRelative(2.79f, -0.53f, 3.85f, -1.59f)
            lineToRelative(6.55f, -6.55f)
            curveToRelative(2.12f, -2.12f, 2.12f, -5.58f, 0f, -7.71f)
            close()
            moveTo(20.28f, 13.73f)
            lineToRelative(-6.55f, 6.55f)
            curveToRelative(-0.96f, 0.96f, -2.51f, 0.95f, -3.47f, 0f)
            lineToRelative(-6.55f, -6.55f)
            curveToRelative(-0.95f, -0.96f, -0.95f, -2.51f, 0f, -3.47f)
            lineToRelative(6.55f, -6.55f)
            curveToRelative(0.46f, -0.46f, 1.07f, -0.71f, 1.73f, -0.71f)
            reflectiveCurveToRelative(1.27f, 0.25f, 1.73f, 0.71f)
            lineToRelative(6.55f, 6.55f)
            curveToRelative(0.95f, 0.96f, 0.95f, 2.51f, 0f, 3.46f)
            close()
            moveTo(16f, 14.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.35f)
            curveToRelative(0f, 0.65f, -0.79f, 0.98f, -1.25f, 0.52f)
            lineToRelative(-3.01f, -2.97f)
            curveToRelative(-0.32f, -0.32f, -0.32f, -0.84f, 0f, -1.16f)
            lineToRelative(3.01f, -2.97f)
            curveToRelative(0.46f, -0.46f, 1.25f, -0.13f, 1.25f, 0.52f)
            verticalLineToRelative(1.71f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
        }
    }.also { _RoadSignLeft = it }
