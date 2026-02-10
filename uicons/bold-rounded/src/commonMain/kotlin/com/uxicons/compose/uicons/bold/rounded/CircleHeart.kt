package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Br.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(14.5f, 8f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.23f, -2.5f, 2.75f)
            curveToRelative(0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
            reflectiveCurveToRelative(-2.5f, 1.23f, -2.5f, 2.75f)
            curveToRelative(0f, 2.16f, 2.82f, 4.7f, 4.22f, 5.82f)
            curveToRelative(0.45f, 0.36f, 1.1f, 0.36f, 1.55f, 0f)
            curveToRelative(1.4f, -1.13f, 4.22f, -3.66f, 4.22f, -5.82f)
            curveToRelative(0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
            close()
        }
    }.also { _CircleHeart = it }
