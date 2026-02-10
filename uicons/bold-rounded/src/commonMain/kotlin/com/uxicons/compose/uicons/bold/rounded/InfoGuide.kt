package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfoGuide: ImageVector? = null

val Icons.Br.InfoGuide: ImageVector
    get() = _InfoGuide ?: UXIcon(name = "InfoGuide") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.15f)
            verticalLineToRelative(10.15f)
            curveToRelative(0f, 2.66f, -1.9f, 4.93f, -4.52f, 5.41f)
            lineToRelative(-5.76f, 1.14f)
            curveToRelative(-0.58f, 0.1f, -1.15f, 0.16f, -1.73f, 0.16f)
            curveToRelative(-0.57f, 0f, -1.13f, -0.05f, -1.69f, -0.15f)
            lineToRelative(-5.81f, -1.15f)
            curveToRelative(-2.6f, -0.47f, -4.49f, -2.75f, -4.49f, -5.41f)
            lineTo(0f, 7.15f)
            curveToRelative(0f, -1.34f, 0.49f, -2.64f, 1.38f, -3.64f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.68f, 2.12f, -0.13f)
            curveToRelative(0.62f, 0.55f, 0.68f, 1.5f, 0.13f, 2.12f)
            curveToRelative(-0.28f, 0.32f, -0.62f, 0.87f, -0.62f, 1.65f)
            verticalLineToRelative(10.15f)
            curveToRelative(0f, 1.21f, 0.86f, 2.24f, 2.05f, 2.46f)
            lineToRelative(5.45f, 1.08f)
            verticalLineToRelative(-3.33f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.33f)
            lineToRelative(5.42f, -1.07f)
            curveToRelative(1.21f, -0.22f, 2.08f, -1.25f, 2.08f, -2.46f)
            lineTo(21f, 7.15f)
            curveToRelative(0f, -0.78f, -0.34f, -1.33f, -0.62f, -1.65f)
            curveToRelative(-0.55f, -0.62f, -0.49f, -1.57f, 0.13f, -2.12f)
            curveToRelative(0.62f, -0.55f, 1.57f, -0.49f, 2.12f, 0.13f)
            curveToRelative(0.89f, 1.0f, 1.38f, 2.3f, 1.38f, 3.64f)
            close()
            moveTo(15f, 0f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(0.07f)
            lineToRelative(1.94f, 1.94f)
            curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
            lineToRelative(1.94f, -1.94f)
            lineToRelative(-0.02f, -0.01f)
            curveToRelative(1.63f, -0.03f, 2.95f, -1.36f, 2.95f, -3.0f)
            lineTo(18.0f, 3f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(12f, 2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(13f, 7f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _InfoGuide = it }
