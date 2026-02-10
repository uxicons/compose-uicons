package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandmarkAlt: ImageVector? = null

val Icons.Sc.LandmarkAlt: ImageVector
    get() = _LandmarkAlt ?: UXIcon(name = "LandmarkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 17.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.46f, -0.31f, -0.85f, -0.74f, -0.96f)
                curveToRelative(0.12f, -0.88f, 0.24f, -2.07f, 0.24f, -3.54f)
                curveToRelative(0f, -0.95f, -0.04f, -1.79f, -0.13f, -2.57f)
                curveToRelative(0.37f, -0.15f, 0.63f, -0.51f, 0.63f, -0.93f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.47f)
                curveToRelative(-0.83f, -3.22f, -2.82f, -5.0f, -6.03f, -5.41f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.59f)
                curveToRelative(-3.21f, 0.41f, -5.2f, 2.19f, -6.03f, 5.41f)
                horizontalLineToRelative(-0.47f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.42f, 0.26f, 0.78f, 0.62f, 0.93f)
                curveToRelative(-0.08f, 0.78f, -0.12f, 1.62f, -0.12f, 2.57f)
                curveToRelative(0f, 1.46f, 0.13f, 2.64f, 0.29f, 3.52f)
                curveToRelative(-0.45f, 0.1f, -0.79f, 0.5f, -0.79f, 0.98f)
                close()
                moveTo(16f, 16.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.46f)
                curveToRelative(0.03f, 0.47f, 0.04f, 0.96f, 0.04f, 1.5f)
                curveToRelative(0f, 1.55f, -0.14f, 2.73f, -0.27f, 3.5f)
                close()
                moveTo(13f, 11.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(6.5f, 13f)
                curveToRelative(0f, -0.54f, 0.01f, -1.04f, 0.04f, -1.5f)
                horizontalLineToRelative(1.46f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.16f)
                curveToRelative(-0.16f, -0.75f, -0.34f, -1.93f, -0.34f, -3.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 20f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _LandmarkAlt = it}
