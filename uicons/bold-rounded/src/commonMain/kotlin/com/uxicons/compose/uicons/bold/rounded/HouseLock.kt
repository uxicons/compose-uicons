package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLock: ImageVector? = null

val Icons.Br.HouseLock: ImageVector
    get() = _HouseLock ?: UXIcon(name = "HouseLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 15.78f)
            verticalLineToRelative(-2.28f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(2.28f)
            curveToRelative(-0.61f, 0.55f, -1f, 1.34f, -1f, 2.22f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.89f, -0.39f, -1.67f, -1f, -2.22f)
            close()
            moveTo(18.5f, 12f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(18.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(3f, 9.89f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveTo(2.47f, 24f, 0f, 21.53f, 0f, 18.5f)
            verticalLineToRelative(-8.61f)
            curveTo(0f, 8.05f, 0.91f, 6.35f, 2.42f, 5.33f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.26f, 4.23f)
            curveToRelative(0.69f, 0.46f, 0.87f, 1.4f, 0.4f, 2.08f)
            curveToRelative(-0.46f, 0.69f, -1.4f, 0.87f, -2.08f, 0.4f)
            lineToRelative(-6.26f, -4.23f)
            curveToRelative(-0.85f, -0.57f, -1.95f, -0.57f, -2.8f, 0f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            close()
        }
    }.also { _HouseLock = it }
