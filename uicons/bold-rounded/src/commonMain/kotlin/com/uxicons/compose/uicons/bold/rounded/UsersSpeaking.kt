package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSpeaking: ImageVector? = null

val Icons.Br.UsersSpeaking: ImageVector
    get() = _UsersSpeaking ?: UXIcon(name = "UsersSpeaking") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1f, 15f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            close()
            moveTo(20.0f, 20f)
            curveToRelative(-1.82f, 0f, -3.37f, 1.11f, -3.95f, 2.65f)
            curveToRelative(-0.25f, 0.66f, 0.32f, 1.35f, 1.06f, 1.35f)
            horizontalLineToRelative(5.78f)
            curveToRelative(0.79f, 0f, 1.31f, -0.76f, 1.02f, -1.46f)
            curveToRelative(-0.61f, -1.49f, -2.13f, -2.54f, -3.91f, -2.54f)
            close()
            moveTo(4.01f, 20f)
            curveToRelative(-1.82f, 0f, -3.37f, 1.11f, -3.95f, 2.65f)
            curveToRelative(-0.25f, 0.66f, 0.32f, 1.35f, 1.06f, 1.35f)
            horizontalLineToRelative(5.78f)
            curveToRelative(0.79f, 0f, 1.31f, -0.76f, 1.02f, -1.46f)
            curveToRelative(-0.61f, -1.49f, -2.13f, -2.54f, -3.91f, -2.54f)
            close()
            moveTo(20f, 18f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            close()
            moveTo(24f, 3f)
            verticalLineToRelative(3.0f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-2.87f)
            lineToRelative(-2.45f, 1.69f)
            curveToRelative(-0.69f, 0.46f, -1.67f, -0.04f, -1.67f, -0.92f)
            lineToRelative(-0.0f, -6.77f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3.0f)
            horizontalLineToRelative(4.0f)
            curveToRelative(1.66f, -0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
            close()
            moveTo(21f, 3f)
            horizontalLineToRelative(-4f)
            reflectiveCurveToRelative(0f, 3.0f, 0f, 3.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(-3.0f)
            close()
            moveTo(10.0f, 3.0f)
            lineTo(10.0f, 9.77f)
            curveToRelative(0.0f, 0.88f, -0.98f, 1.37f, -1.67f, 0.92f)
            lineToRelative(-2.45f, -1.69f)
            horizontalLineToRelative(-2.87f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            verticalLineToRelative(-3.0f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3.0f, -3f)
            horizontalLineToRelative(4.0f)
            curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
            close()
            moveTo(7.0f, 3.0f)
            horizontalLineToRelative(-4.0f)
            reflectiveCurveToRelative(0f, 3.0f, 0f, 3.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(-3.0f)
            close()
        }
    }.also { _UsersSpeaking = it }
