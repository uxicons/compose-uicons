package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Br.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16.68f, 9.17f)
            lineToRelative(-3.18f, 4.09f)
            verticalLineToRelative(3.24f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.24f)
            lineToRelative(-3.18f, -4.09f)
            curveToRelative(-0.51f, -0.65f, -0.39f, -1.6f, 0.26f, -2.1f)
            curveToRelative(0.65f, -0.51f, 1.6f, -0.39f, 2.1f, 0.26f)
            lineToRelative(2.32f, 2.98f)
            lineToRelative(2.32f, -2.98f)
            curveToRelative(0.51f, -0.65f, 1.45f, -0.77f, 2.1f, -0.26f)
            curveToRelative(0.65f, 0.51f, 0.77f, 1.45f, 0.26f, 2.1f)
            close()
        }
    }.also { _CircleY = it }
