package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballPlayer: ImageVector? = null

val Icons.Rr.FootballPlayer: ImageVector
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
                moveTo(17.93f, 22.63f)
                curveToRelative(0.2f, 0.51f, -0.04f, 1.09f, -0.56f, 1.3f)
                curveToRelative(-0.5f, 0.2f, -1.09f, -0.04f, -1.3f, -0.56f)
                lineToRelative(-1.59f, -3.98f)
                curveToRelative(-0.2f, -0.5f, -0.53f, -0.94f, -0.96f, -1.27f)
                lineToRelative(-4.22f, -3.23f)
                curveToRelative(-1.16f, -0.73f, -1.65f, -2.27f, -1.1f, -3.62f)
                lineToRelative(2.1f, -4.22f)
                lineToRelative(-2.85f, -1.38f)
                curveToRelative(-0.72f, -0.35f, -1.35f, -0.87f, -1.83f, -1.51f)
                lineToRelative(-1.92f, -2.56f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.2f)
                lineToRelative(1.92f, 2.56f)
                curveToRelative(0.29f, 0.39f, 0.67f, 0.7f, 1.1f, 0.91f)
                lineToRelative(14.12f, 6.81f)
                curveToRelative(0.5f, 0.24f, 0.71f, 0.84f, 0.47f, 1.33f)
                curveToRelative(-0.24f, 0.5f, -0.85f, 0.7f, -1.33f, 0.47f)
                lineToRelative(-5.97f, -2.88f)
                lineToRelative(-2.66f, 5.56f)
                lineToRelative(1.8f, 1.38f)
                curveToRelative(0.71f, 0.55f, 1.27f, 1.28f, 1.6f, 2.11f)
                lineToRelative(1.59f, 3.98f)
                close()
                moveTo(10.44f, 13.26f)
                lineTo(11.3f, 13.91f)
                lineTo(13.8f, 8.73f)
                lineTo(12.1f, 7.92f)
                lineTo(10.02f, 12.1f)
                curveToRelative(-0.15f, 0.38f, 0.01f, 0.9f, 0.42f, 1.16f)
                close()
                moveTo(6.82f, 15.18f)
                lineTo(4.83f, 16.71f)
                lineTo(1.6f, 14.22f)
                curveToRelative(-0.44f, -0.33f, -1.06f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.41f)
                lineToRelative(3.21f, 2.48f)
                curveToRelative(0.72f, 0.53f, 1.7f, 0.53f, 2.41f, -0.02f)
                lineToRelative(2.21f, -1.7f)
                curveToRelative(-0.54f, -0.36f, -1.07f, -0.9f, -1.42f, -1.43f)
                close()
            }
        }.also { _FootballPlayer = it}
