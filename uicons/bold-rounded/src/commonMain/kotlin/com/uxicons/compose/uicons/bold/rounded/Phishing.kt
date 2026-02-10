package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Phishing: ImageVector? = null

val Icons.Br.Phishing: ImageVector
    get() = _Phishing ?: UXIcon(name = "Phishing") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 19f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -3.0f, -2.42f, -5.45f, -5.41f, -5.5f)
            curveToRelative(-0.43f, -0.99f, -1.17f, -1.83f, -2.17f, -2.38f)
            curveToRelative(-0.57f, -0.32f, -0.91f, -0.82f, -0.91f, -1.35f)
            verticalLineToRelative(-0.77f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.77f)
            curveToRelative(0f, 1.5f, 0.77f, 2.86f, 2.07f, 3.73f)
            horizontalLineToRelative(-2.57f)
            lineToRelative(-1.79f, -1.79f)
            curveToRelative(-0.45f, -0.45f, -1.21f, -0.13f, -1.21f, 0.5f)
            verticalLineToRelative(1.31f)
            curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.47f)
            verticalLineToRelative(7.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 1.02f, 0.83f, 1.85f, 1.85f, 1.85f)
            horizontalLineToRelative(20.31f)
            curveToRelative(1.02f, 0f, 1.85f, -0.83f, 1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(14.77f, 20f)
            horizontalLineToRelative(-5.54f)
            lineToRelative(-0.92f, -1f)
            horizontalLineToRelative(-3.31f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(6.24f)
            curveToRelative(-0.27f, 0.47f, -0.72f, 0.82f, -1.25f, 0.94f)
            curveToRelative(-0.29f, 0.08f, -0.7f, 0.05f, -0.99f, 0.06f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(3f, 0f, 4.94f, -1.47f, 5.39f, -3.96f)
            curveToRelative(1.2f, 0.19f, 2.11f, 1.22f, 2.11f, 2.46f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-3.31f)
            close()
        }
    }.also { _Phishing = it }
