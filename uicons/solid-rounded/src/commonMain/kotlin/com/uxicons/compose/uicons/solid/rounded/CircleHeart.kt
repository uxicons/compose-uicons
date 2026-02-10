package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Sr.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10.75f)
                curveToRelative(0f, 1.2f, -1.48f, 3.14f, -3.85f, 5.04f)
                curveToRelative(-0.09f, 0.07f, -0.21f, 0.07f, -0.3f, 0f)
                curveToRelative(-2.38f, -1.91f, -3.85f, -3.84f, -3.85f, -5.04f)
                curveToRelative(0f, -0.96f, 0.67f, -1.75f, 1.5f, -1.75f)
                reflectiveCurveToRelative(1.5f, 0.79f, 1.5f, 1.75f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.96f, 0.67f, -1.75f, 1.5f, -1.75f)
                reflectiveCurveToRelative(1.5f, 0.79f, 1.5f, 1.75f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18f, 10.75f)
                curveToRelative(0f, -2.07f, -1.57f, -3.75f, -3.5f, -3.75f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.43f, -2.5f, 1.13f)
                curveToRelative(-0.64f, -0.7f, -1.52f, -1.13f, -2.5f, -1.13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.68f, -3.5f, 3.75f)
                curveToRelative(0f, 2.41f, 2.5f, 4.92f, 4.6f, 6.6f)
                curveToRelative(0.41f, 0.33f, 0.9f, 0.49f, 1.4f, 0.49f)
                reflectiveCurveToRelative(1f, -0.16f, 1.4f, -0.49f)
                curveToRelative(2.1f, -1.68f, 4.6f, -4.2f, 4.6f, -6.6f)
                close()
            }
        }.also { _CircleHeart = it}
