package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Br.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.64f, 18.48f)
            curveToRelative(-0.54f, 0.63f, -1.49f, 0.7f, -2.12f, 0.16f)
            lineToRelative(-2.94f, -2.52f)
            curveToRelative(-0.09f, -0.08f, -0.21f, -0.12f, -0.33f, -0.12f)
            horizontalLineToRelative(-3.69f)
            lineToRelative(2.61f, 5.89f)
            curveToRelative(0.34f, 0.76f, -0.01f, 1.64f, -0.77f, 1.98f)
            curveToRelative(-0.74f, 0.33f, -1.64f, 0f, -1.98f, -0.77f)
            lineTo(7.61f, 9.95f)
            lineToRelative(-3.86f, 5.87f)
            curveToRelative(-0.29f, 0.44f, -0.77f, 0.68f, -1.25f, 0.68f)
            curveToRelative(-0.28f, 0f, -0.57f, -0.08f, -0.82f, -0.25f)
            curveToRelative(-0.69f, -0.46f, -0.88f, -1.39f, -0.43f, -2.08f)
            lineToRelative(3.95f, -6.01f)
            curveToRelative(0.6f, -0.9f, 1.43f, -1.59f, 2.42f, -2.01f)
            lineToRelative(5.37f, -2.3f)
            curveToRelative(0.09f, -0.04f, 0.16f, -0.1f, 0.21f, -0.18f)
            lineTo(15.26f, 0.65f)
            curveToRelative(0.47f, -0.69f, 1.4f, -0.86f, 2.08f, -0.39f)
            curveToRelative(0.69f, 0.47f, 0.86f, 1.4f, 0.39f, 2.08f)
            lineToRelative(-2.06f, 3.02f)
            curveToRelative(-0.37f, 0.55f, -0.9f, 0.98f, -1.51f, 1.24f)
            lineToRelative(-2.27f, 0.97f)
            lineToRelative(2.4f, 5.42f)
            horizontalLineToRelative(2.96f)
            curveToRelative(0.83f, 0f, 1.65f, 0.3f, 2.28f, 0.84f)
            lineToRelative(2.94f, 2.52f)
            curveToRelative(0.63f, 0.54f, 0.7f, 1.49f, 0.16f, 2.12f)
            close()
            moveTo(6.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _PersonFalling = it }
