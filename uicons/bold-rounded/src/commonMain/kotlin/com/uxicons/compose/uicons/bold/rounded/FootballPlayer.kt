package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballPlayer: ImageVector? = null

val Icons.Br.FootballPlayer: ImageVector
    get() = _FootballPlayer ?: UXIcon(name = "FootballPlayer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.89f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(22f, 20f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(14.33f, 9.73f)
            lineTo(12.38f, 13.81f)
            lineTo(15.6f, 16.27f)
            curveToRelative(0.69f, 0.53f, 1.21f, 1.24f, 1.5f, 2.05f)
            lineToRelative(1.31f, 3.67f)
            curveToRelative(0.28f, 0.78f, -0.13f, 1.64f, -0.91f, 1.92f)
            curveToRelative(-0.76f, 0.28f, -1.64f, -0.12f, -1.92f, -0.91f)
            lineToRelative(-1.31f, -3.67f)
            curveToRelative(-0.1f, -0.27f, -0.27f, -0.51f, -0.5f, -0.69f)
            lineToRelative(-4.34f, -3.33f)
            curveToRelative(-1.42f, -0.94f, -1.96f, -2.79f, -1.26f, -4.34f)
            lineToRelative(1.68f, -3.38f)
            lineToRelative(-3.25f, -1.55f)
            curveToRelative(-0.68f, -0.32f, -1.28f, -0.77f, -1.77f, -1.34f)
            lineToRelative(-1.96f, -2.23f)
            curveToRelative(-0.55f, -0.62f, -0.48f, -1.57f, 0.14f, -2.12f)
            reflectiveCurveToRelative(1.57f, -0.48f, 2.12f, 0.14f)
            lineToRelative(1.96f, 2.23f)
            curveToRelative(0.23f, 0.26f, 0.5f, 0.46f, 0.81f, 0.61f)
            lineToRelative(13.26f, 6.3f)
            curveToRelative(0.75f, 0.35f, 1.07f, 1.25f, 0.71f, 2.0f)
            curveToRelative(-0.36f, 0.76f, -1.27f, 1.06f, -2.0f, 0.71f)
            lineToRelative(-5.53f, -2.63f)
            close()
            moveTo(6.39f, 14.75f)
            lineTo(5.4f, 15.5f)
            curveToRelative(-0.34f, 0.26f, -0.81f, 0.27f, -1.16f, 0.03f)
            lineToRelative(-1.83f, -1.23f)
            curveToRelative(-0.66f, -0.5f, -1.6f, -0.37f, -2.1f, 0.29f)
            curveToRelative(-0.5f, 0.66f, -0.37f, 1.6f, 0.29f, 2.1f)
            lineToRelative(2.6f, 1.75f)
            curveToRelative(1.09f, 0.73f, 2.52f, 0.67f, 3.55f, -0.14f)
            lineToRelative(1.61f, -1.28f)
            curveToRelative(-0.86f, -0.59f, -1.54f, -1.37f, -1.96f, -2.28f)
            close()
        }
    }.also { _FootballPlayer = it }
