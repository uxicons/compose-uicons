package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeSnow: ImageVector? = null

val Icons.Br.GlobeSnow: ImageVector
    get() = _GlobeSnow ?: UXIcon(name = "GlobeSnow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.55f)
            curveToRelative(-0.23f, -1.13f, -1.22f, -1.98f, -2.41f, -2.0f)
            curveToRelative(2.13f, -2.01f, 3.46f, -4.85f, 3.46f, -8.0f)
            curveTo(23f, 4.93f, 18.07f, 0f, 12f, 0f)
            reflectiveCurveTo(1f, 4.93f, 1f, 11f)
            curveToRelative(0f, 3.15f, 1.33f, 5.99f, 3.46f, 8.0f)
            curveToRelative(-1.19f, 0.02f, -2.18f, 0.87f, -2.41f, 2.0f)
            horizontalLineToRelative(-0.55f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4f, 11f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            curveToRelative(0f, 4.07f, -3.06f, 7.44f, -7f, 7.94f)
            verticalLineToRelative(-1.94f)
            horizontalLineToRelative(1.64f)
            curveToRelative(0.84f, 0f, 1.32f, -0.96f, 0.82f, -1.64f)
            lineToRelative(-0.88f, -1.17f)
            horizontalLineToRelative(0.15f)
            curveToRelative(0.73f, 0f, 1.15f, -0.83f, 0.71f, -1.42f)
            lineToRelative(-2.41f, -3.22f)
            curveToRelative(-0.49f, -0.66f, -1.49f, -0.66f, -1.98f, 0f)
            lineToRelative(-2.41f, 3.22f)
            curveToRelative(-0.44f, 0.58f, -0.02f, 1.42f, 0.71f, 1.42f)
            horizontalLineToRelative(0.07f)
            lineToRelative(-0.88f, 1.17f)
            curveToRelative(-0.51f, 0.68f, -0.03f, 1.64f, 0.82f, 1.64f)
            horizontalLineToRelative(1.64f)
            verticalLineToRelative(1.94f)
            curveToRelative(-3.94f, -0.49f, -7f, -3.87f, -7f, -7.94f)
            close()
            moveTo(13f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(16f, 10.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(6f, 8.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _GlobeSnow = it }
