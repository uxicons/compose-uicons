package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Br.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.96f, 16.02f)
            curveToRelative(-0.19f, 0.81f, -1.0f, 1.3f, -1.8f, 1.11f)
            curveToRelative(-0.38f, -0.09f, -0.76f, -0.13f, -1.16f, -0.13f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            curveToRelative(0.62f, 0f, 1.24f, 0.07f, 1.84f, 0.21f)
            curveToRelative(0.81f, 0.19f, 1.31f, 1.0f, 1.11f, 1.8f)
            close()
            moveTo(14f, 6f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveTo(4.69f, 0f, 8f, 0f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(11f, 6f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            close()
            moveTo(24f, 14.61f)
            verticalLineToRelative(3.02f)
            curveToRelative(0f, 3.97f, -3.69f, 5.78f, -4.94f, 6.26f)
            curveToRelative(-0.18f, 0.07f, -0.37f, 0.11f, -0.56f, 0.11f)
            curveToRelative(-0.23f, 0f, -0.46f, -0.05f, -0.67f, -0.16f)
            curveToRelative(-1.2f, -0.54f, -4.83f, -2.69f, -4.83f, -6.21f)
            verticalLineToRelative(-3.02f)
            curveToRelative(0f, -1.42f, 0.9f, -2.67f, 2.25f, -3.11f)
            lineToRelative(2.78f, -0.92f)
            curveToRelative(0.31f, -0.1f, 0.64f, -0.1f, 0.94f, 0f)
            lineToRelative(2.78f, 0.92f)
            curveToRelative(1.34f, 0.45f, 2.25f, 1.7f, 2.25f, 3.11f)
            close()
            moveTo(21f, 14.61f)
            curveToRelative(0f, -0.12f, -0.08f, -0.23f, -0.19f, -0.26f)
            lineToRelative(-2.31f, -0.77f)
            lineToRelative(-2.31f, 0.77f)
            curveToRelative(-0.11f, 0.04f, -0.19f, 0.14f, -0.19f, 0.26f)
            verticalLineToRelative(3.02f)
            curveToRelative(0f, 1.52f, 1.69f, 2.7f, 2.56f, 3.21f)
            curveToRelative(0.9f, -0.45f, 2.44f, -1.46f, 2.44f, -3.21f)
            verticalLineToRelative(-3.02f)
            close()
        }
    }.also { _UserShield = it }
