package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExternalWorld: ImageVector? = null

val Icons.Br.ExternalWorld: ImageVector
    get() = _ExternalWorld ?: UXIcon(name = "ExternalWorld") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.24f, 8f)
            horizontalLineToRelative(1.26f)
            verticalLineToRelative(-3.5f)
            curveToRelative(-0.61f, -0.46f, -1f, -1.18f, -1f, -2f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 0.82f, -0.39f, 1.54f, -1f, 2f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(1.26f)
            curveToRelative(0.78f, 0f, 1.17f, 0.94f, 0.62f, 1.49f)
            lineToRelative(-2.76f, 2.76f)
            curveToRelative(-0.34f, 0.34f, -0.89f, 0.34f, -1.23f, 0f)
            lineToRelative(-2.76f, -2.76f)
            curveToRelative(-0.55f, -0.55f, -0.16f, -1.49f, 0.62f, -1.49f)
            close()
            moveTo(12f, 24f)
            curveToRelative(-5.8f, 0f, -10.99f, -5f, -10.99f, -10.64f)
            curveToRelative(0f, -3.86f, 1.89f, -7.59f, 5.06f, -9.62f)
            curveToRelative(0.69f, -0.44f, 1.62f, -0.25f, 2.07f, 0.45f)
            curveToRelative(0.45f, 0.7f, 0.24f, 1.62f, -0.45f, 2.07f)
            curveToRelative(-2.02f, 1.3f, -3.33f, 3.4f, -3.62f, 5.74f)
            horizontalLineToRelative(4.45f)
            curveToRelative(0.8f, 0f, 1.47f, 0.63f, 1.5f, 1.44f)
            curveToRelative(0.11f, 2.56f, 1.14f, 4.87f, 1.99f, 6.36f)
            curveToRelative(0.85f, -1.49f, 1.88f, -3.79f, 1.99f, -6.36f)
            curveToRelative(0.03f, -0.8f, 0.69f, -1.44f, 1.5f, -1.44f)
            horizontalLineToRelative(4.45f)
            curveToRelative(-0.29f, -2.34f, -1.6f, -4.44f, -3.62f, -5.74f)
            curveToRelative(-0.7f, -0.45f, -0.9f, -1.38f, -0.45f, -2.07f)
            curveToRelative(0.45f, -0.7f, 1.38f, -0.9f, 2.07f, -0.45f)
            curveToRelative(3.17f, 2.04f, 5.06f, 5.76f, 5.06f, 9.62f)
            curveToRelative(0f, 5.64f, -5.2f, 10.64f, -10.99f, 10.64f)
            close()
            moveTo(8.9f, 20.38f)
            curveToRelative(-0.73f, -1.44f, -1.45f, -3.29f, -1.75f, -5.38f)
            horizontalLineToRelative(-2.89f)
            curveToRelative(0.63f, 2.43f, 2.37f, 4.41f, 4.65f, 5.38f)
            close()
            moveTo(19.75f, 15f)
            horizontalLineToRelative(-2.89f)
            curveToRelative(-0.3f, 2.09f, -1.02f, 3.94f, -1.75f, 5.38f)
            curveToRelative(2.28f, -0.96f, 4.02f, -2.95f, 4.65f, -5.38f)
            close()
        }
    }.also { _ExternalWorld = it }
