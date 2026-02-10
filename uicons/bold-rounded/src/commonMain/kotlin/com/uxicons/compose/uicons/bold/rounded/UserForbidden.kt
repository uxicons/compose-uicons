package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Br.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            curveToRelative(-0.01f, 6.67f, 5.48f, 12.02f, 12f, 12f)
            curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
            lineToRelative(-5.65f, -5.65f)
            curveToRelative(1.08f, -0.6f, 1.82f, -1.73f, 1.82f, -3.05f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            curveToRelative(-1.32f, 0f, -2.46f, 0.74f, -3.05f, 1.82f)
            lineToRelative(-2.15f, -2.15f)
            curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            close()
            moveTo(8.11f, 20.1f)
            curveToRelative(0.26f, -1.14f, 1f, -2.12f, 2.07f, -2.67f)
            curveToRelative(0.74f, -0.38f, 1.03f, -1.28f, 0.65f, -2.02f)
            reflectiveCurveToRelative(-1.28f, -1.03f, -2.02f, -0.65f)
            curveToRelative(-1.5f, 0.77f, -2.63f, 2.02f, -3.26f, 3.5f)
            curveToRelative(-1.58f, -1.62f, -2.56f, -3.83f, -2.56f, -6.27f)
            curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
            lineToRelative(12.53f, 12.53f)
            curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
            curveToRelative(-1.4f, 0f, -2.71f, -0.33f, -3.89f, -0.9f)
            close()
        }
    }.also { _UserForbidden = it }
