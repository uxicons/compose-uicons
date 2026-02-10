package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuideAlt: ImageVector? = null

val Icons.Sc.GuideAlt: ImageVector
    get() = _GuideAlt ?: UXIcon(name = "GuideAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                close()
                moveTo(18f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.05f, 22.97f)
                curveToRelative(-0.35f, 0.02f, -0.7f, 0.03f, -1.05f, 0.03f)
                curveToRelative(-1.47f, 0f, -3.1f, -0.16f, -4.87f, -0.47f)
                curveToRelative(-1.6f, -0.28f, -2.87f, -1.39f, -3.42f, -2.86f)
                curveToRelative(0.56f, -1.57f, 2.1f, -1.67f, 2.29f, -1.67f)
                horizontalLineToRelative(5.04f)
                curveToRelative(0.16f, 2.14f, 0.84f, 3.8f, 2.01f, 4.97f)
                close()
                moveTo(4f, 16f)
                curveToRelative(-0.7f, 0f, -1.8f, 0.26f, -2.73f, 0.98f)
                curveToRelative(-0.14f, -1.47f, -0.27f, -3.23f, -0.27f, -4.98f)
                curveToRelative(0f, -2.48f, 0.24f, -4.98f, 0.45f, -6.65f)
                curveToRelative(0.24f, -1.93f, 1.66f, -3.45f, 3.55f, -3.85f)
                curveToRelative(0f, 0f, 2f, -0.51f, 5f, -0.51f)
                curveToRelative(3.65f, 0f, 7.31f, 0.99f, 7.46f, 1.04f)
                curveToRelative(0.37f, 0.1f, 0.65f, 0.41f, 0.72f, 0.79f)
                curveToRelative(0.03f, 0.15f, 0.51f, 2.95f, 0.72f, 6.31f)
                curveToRelative(-0.59f, -0.09f, -1.23f, -0.14f, -1.91f, -0.14f)
                curveToRelative(-4.89f, 0f, -7.62f, 2.42f, -7.96f, 7f)
                horizontalLineToRelative(-5.04f)
                close()
            }
        }.also { _GuideAlt = it}
