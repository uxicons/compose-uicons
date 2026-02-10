package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Br.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(12.31f, 0f, 9f, 0f)
            reflectiveCurveTo(3f, 2.69f, 3f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(11f, 17.34f)
            curveToRelative(-0.64f, -0.23f, -1.31f, -0.34f, -2f, -0.34f)
            curveToRelative(-3.16f, 0f, -5.8f, 2.46f, -6.0f, 5.6f)
            curveToRelative(-0.05f, 0.79f, -0.71f, 1.4f, -1.5f, 1.4f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.0f)
            curveToRelative(-0.83f, -0.05f, -1.45f, -0.77f, -1.4f, -1.59f)
            curveToRelative(0.31f, -4.71f, 4.26f, -8.4f, 9.0f, -8.4f)
            curveToRelative(1.03f, 0f, 2.04f, 0.17f, 3f, 0.51f)
            curveToRelative(0.78f, 0.28f, 1.19f, 1.13f, 0.91f, 1.91f)
            curveToRelative(-0.28f, 0.78f, -1.13f, 1.19f, -1.91f, 0.91f)
            close()
            moveTo(23.26f, 16.02f)
            lineToRelative(-6.71f, 6.71f)
            curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
            lineToRelative(6.81f, -6.81f)
            curveToRelative(0.95f, -0.95f, 2.53f, -0.89f, 3.41f, 0.18f)
            curveToRelative(0.76f, 0.93f, 0.6f, 2.32f, -0.25f, 3.17f)
            close()
        }
    }.also { _UserPen = it }
