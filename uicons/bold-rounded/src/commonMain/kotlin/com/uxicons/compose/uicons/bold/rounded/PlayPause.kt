package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Br.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(21f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(17.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(16f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(3.63f, 20.58f)
            curveToRelative(-0.56f, 0f, -1.12f, -0.13f, -1.64f, -0.39f)
            curveToRelative(-1.23f, -0.62f, -1.99f, -1.86f, -1.99f, -3.23f)
            lineTo(0f, 7.05f)
            curveToRelative(0f, -1.37f, 0.76f, -2.61f, 1.99f, -3.23f)
            curveToRelative(1.21f, -0.61f, 2.69f, -0.49f, 3.78f, 0.31f)
            lineToRelative(6.75f, 4.95f)
            curveToRelative(0.94f, 0.69f, 1.48f, 1.75f, 1.48f, 2.92f)
            reflectiveCurveToRelative(-0.54f, 2.23f, -1.48f, 2.92f)
            lineToRelative(-6.75f, 4.95f)
            curveToRelative(-0.64f, 0.47f, -1.38f, 0.7f, -2.14f, 0.7f)
            close()
            moveTo(3.63f, 6.42f)
            curveToRelative(-0.1f, 0f, -0.19f, 0.02f, -0.29f, 0.07f)
            curveToRelative(-0.22f, 0.11f, -0.34f, 0.3f, -0.34f, 0.56f)
            verticalLineToRelative(9.91f)
            curveToRelative(0f, 0.25f, 0.12f, 0.44f, 0.34f, 0.56f)
            curveToRelative(0.22f, 0.11f, 0.45f, 0.1f, 0.65f, -0.05f)
            lineToRelative(6.75f, -4.95f)
            curveToRelative(0.17f, -0.12f, 0.25f, -0.29f, 0.25f, -0.5f)
            reflectiveCurveToRelative(-0.09f, -0.38f, -0.25f, -0.5f)
            lineTo(3.99f, 6.54f)
            curveToRelative(-0.12f, -0.08f, -0.24f, -0.13f, -0.36f, -0.13f)
            close()
        }
    }.also { _PlayPause = it }
