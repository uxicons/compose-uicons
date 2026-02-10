package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Br.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(8.52f, 20.3f)
            curveToRelative(0.11f, -1.83f, 1.62f, -3.3f, 3.48f, -3.3f)
            reflectiveCurveToRelative(3.37f, 1.46f, 3.48f, 3.3f)
            curveToRelative(-1.07f, 0.45f, -2.25f, 0.7f, -3.48f, 0.7f)
            reflectiveCurveToRelative(-2.41f, -0.25f, -3.48f, -0.7f)
            close()
            moveTo(18.19f, 18.52f)
            curveToRelative(-0.84f, -2.62f, -3.3f, -4.52f, -6.19f, -4.52f)
            reflectiveCurveToRelative(-5.35f, 1.9f, -6.19f, 4.52f)
            curveToRelative(-1.73f, -1.64f, -2.81f, -3.95f, -2.81f, -6.52f)
            curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            curveToRelative(0f, 2.56f, -1.08f, 4.88f, -2.81f, 6.52f)
            close()
            moveTo(15.5f, 8.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            close()
        }
    }.also { _CircleUser = it }
