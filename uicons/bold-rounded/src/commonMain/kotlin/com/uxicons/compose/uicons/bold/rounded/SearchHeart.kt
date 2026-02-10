package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Br.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(272f, 149.33f)
            curveToRelative(-27.81f, 1.38f, -49.27f, 24.99f, -48f, 52.8f)
            curveToRelative(1.27f, -27.81f, -20.19f, -51.42f, -48f, -52.8f)
            curveToRelative(-27.81f, 1.38f, -49.27f, 24.99f, -48f, 52.8f)
            curveToRelative(0f, 41.54f, 54.14f, 90.99f, 81.07f, 112.64f)
            curveToRelative(8.72f, 7.02f, 21.15f, 7.02f, 29.87f, 0f)
            curveTo(265.9f, 293.12f, 320f, 243.67f, 320f, 202.13f)
            curveTo(321.27f, 174.32f, 299.81f, 150.71f, 272f, 149.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(502.66f, 457.37f)
            lineToRelative(-99.05f, -99.07f)
            curveToRelative(74.11f, -99.03f, 53.91f, -239.38f, -45.11f, -313.49f)
            reflectiveCurveTo(119.13f, -9.09f, 45.02f, 89.93f)
            reflectiveCurveTo(-8.9f, 329.31f, 90.13f, 403.42f)
            curveToRelative(79.55f, 59.54f, 188.82f, 59.54f, 268.37f, 0f)
            lineToRelative(99.07f, 99.09f)
            curveToRelative(12.45f, 12.45f, 32.64f, 12.45f, 45.09f, 0f)
            curveToRelative(12.45f, -12.45f, 12.45f, -32.64f, 0f, -45.09f)
            verticalLineTo(457.37f)
            close()
            moveTo(65.74f, 224.92f)
            curveToRelative(0f, -88.02f, 71.35f, -159.37f, 159.37f, -159.37f)
            reflectiveCurveToRelative(159.37f, 71.35f, 159.37f, 159.37f)
            reflectiveCurveToRelative(-71.35f, 159.37f, -159.37f, 159.37f)
            curveTo(137.14f, 384.2f, 65.84f, 312.9f, 65.74f, 224.92f)
            close()
        }
    }.also { _SearchHeart = it }
