package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Br.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(22.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(11.96f, 14f)
            horizontalLineToRelative(0.01f)
            curveToRelative(6.09f, -0.0f, 10.18f, -3.85f, 11.66f, -5.5f)
            curveToRelative(0.55f, -0.62f, 0.5f, -1.57f, -0.12f, -2.12f)
            curveToRelative(-0.62f, -0.55f, -1.57f, -0.5f, -2.12f, 0.12f)
            curveToRelative(-1.21f, 1.35f, -4.54f, 4.5f, -9.42f, 4.5f)
            curveToRelative(-4.8f, 0f, -8.14f, -3.09f, -9.35f, -4.42f)
            curveToRelative(-0.56f, -0.61f, -1.51f, -0.66f, -2.12f, -0.1f)
            curveToRelative(-0.61f, 0.56f, -0.66f, 1.51f, -0.1f, 2.12f)
            curveToRelative(1.48f, 1.62f, 5.57f, 5.4f, 11.56f, 5.4f)
            close()
            moveTo(0.96f, 16.9f)
            curveToRelative(1.49f, 0.57f, 5.44f, 2.1f, 11.0f, 2.1f)
            horizontalLineToRelative(0.01f)
            curveToRelative(5.72f, 0f, 9.62f, -1.53f, 11.09f, -2.1f)
            curveToRelative(0.77f, -0.3f, 1.15f, -1.17f, 0.85f, -1.94f)
            curveToRelative(-0.3f, -0.77f, -1.17f, -1.15f, -1.94f, -0.85f)
            curveToRelative(-1.32f, 0.52f, -4.84f, 1.9f, -9.99f, 1.9f)
            curveToRelative(-5.0f, 0f, -8.45f, -1.33f, -9.92f, -1.9f)
            curveToRelative(-0.77f, -0.3f, -1.64f, 0.09f, -1.94f, 0.86f)
            curveToRelative(-0.3f, 0.77f, 0.09f, 1.64f, 0.86f, 1.94f)
            close()
            moveTo(11.38f, 9.24f)
            curveToRelative(0.34f, 0.34f, 0.89f, 0.34f, 1.23f, 0f)
            lineToRelative(2.76f, -2.76f)
            curveToRelative(0.55f, -0.55f, 0.16f, -1.49f, -0.62f, -1.49f)
            horizontalLineToRelative(-1.26f)
            lineTo(13.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-1.26f)
            curveToRelative(-0.78f, 0f, -1.17f, 0.94f, -0.62f, 1.49f)
            lineToRelative(2.76f, 2.76f)
            close()
        }
    }.also { _ArrowDownStrenght = it }
