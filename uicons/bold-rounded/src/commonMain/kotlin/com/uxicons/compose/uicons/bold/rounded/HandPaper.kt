package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPaper: ImageVector? = null

val Icons.Br.HandPaper: ImageVector
    get() = _HandPaper ?: UXIcon(name = "HandPaper") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 9.5f)
            lineTo(16f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(12.5f, 11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(14f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.98f)
            curveToRelative(-2.37f, 0f, -4.68f, -0.81f, -6.52f, -2.27f)
            curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f)
            curveToRelative(1.18f, -0.49f, 1.95f, -1.64f, 1.95f, -2.92f)
            lineTo(9f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(12.29f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.14f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            curveToRelative(0f, 0f, -2.48f, -2.49f, -2.56f, -2.54f)
            curveToRelative(-0.7f, -0.48f, -1.82f, -0.56f, -2.59f, 0.22f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.17f, 2.65f)
            curveToRelative(0.03f, 0.05f, 3.2f, 3.45f, 3.2f, 3.45f)
            curveToRelative(2.55f, 2.74f, 6.16f, 4.31f, 9.9f, 4.31f)
            horizontalLineToRelative(1.98f)
            curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
            lineTo(24.0f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _HandPaper = it }
