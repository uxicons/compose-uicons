package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Br.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
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
            moveTo(7.64f, 13.97f)
            lineToRelative(-1.3f, 1f)
            curveToRelative(-0.45f, 0.45f, -0.45f, 1.17f, 0f, 1.62f)
            lineToRelative(0.52f, 0.6f)
            curveToRelative(0.55f, 0.55f, 1.28f, 0.81f, 2f, 0.81f)
            curveToRelative(3.71f, 0f, 9.14f, -5.14f, 9.14f, -9.14f)
            curveToRelative(0f, -0.72f, -0.26f, -1.45f, -0.81f, -2f)
            lineToRelative(-0.6f, -0.52f)
            curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
            lineToRelative(-1f, 1.3f)
            curveToRelative(-0.45f, 0.45f, -0.45f, 1.17f, 0f, 1.62f)
            lineToRelative(0.85f, 1.07f)
            curveToRelative(-0.9f, 2.24f, -2.43f, 3.71f, -4.5f, 4.5f)
            lineToRelative(-1.07f, -0.85f)
            curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
            close()
        }
    }.also { _CirclePhoneFlip = it }
