package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleCheck: ImageVector? = null

val Icons.Br.PlugCircleCheck: ImageVector
    get() = _PlugCircleCheck ?: UXIcon(name = "PlugCircleCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 8f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.15f)
            curveToRelative(-3.42f, -0.7f, -6f, -3.73f, -6f, -7.35f)
            verticalLineToRelative(-3.09f)
            curveToRelative(-0.58f, -0.21f, -1f, -0.76f, -1f, -1.41f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            lineTo(4f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(3f)
            lineTo(10f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.65f, -0.42f, 1.2f, -1f, 1.41f)
            verticalLineToRelative(1.59f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(4f, 8f)
            close()
            moveTo(24f, 18f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(21.71f, 16.3f)
            curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
            lineToRelative(-2.71f, 2.62f)
            curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0.0f)
            lineToRelative(-1.35f, -1.33f)
            curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
            curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
            lineToRelative(1.35f, 1.33f)
            curveToRelative(0.46f, 0.45f, 1.06f, 0.67f, 1.66f, 0.67f)
            reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
            lineToRelative(2.7f, -2.61f)
            curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
            close()
        }
    }.also { _PlugCircleCheck = it }
