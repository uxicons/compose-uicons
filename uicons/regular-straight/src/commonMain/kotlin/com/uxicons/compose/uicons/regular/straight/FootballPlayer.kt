package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballPlayer: ImageVector? = null

val Icons.Rs.FootballPlayer: ImageVector
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
                moveTo(15.81f, 17.36f)
                lineTo(18.38f, 23.21f)
                lineTo(16.55f, 24.02f)
                lineTo(14.19f, 18.64f)
                lineTo(9.3f, 14.9f)
                curveToRelative(-1.16f, -0.73f, -1.65f, -2.27f, -1.1f, -3.62f)
                lineToRelative(2.1f, -4.22f)
                lineToRelative(-3.94f, -1.9f)
                lineToRelative(-3.14f, -3.82f)
                lineToRelative(1.55f, -1.27f)
                lineToRelative(2.86f, 3.48f)
                lineToRelative(15.19f, 7.33f)
                lineToRelative(-0.87f, 1.8f)
                lineToRelative(-6.35f, -3.07f)
                lineToRelative(-2.66f, 5.56f)
                lineToRelative(2.88f, 2.2f)
                close()
                moveTo(10.44f, 13.26f)
                lineTo(11.3f, 13.91f)
                lineTo(13.79f, 8.73f)
                lineTo(12.1f, 7.92f)
                lineTo(10.02f, 12.1f)
                curveToRelative(-0.15f, 0.38f, 0.01f, 0.9f, 0.42f, 1.16f)
                close()
                moveTo(6.82f, 15.18f)
                lineTo(4.83f, 16.71f)
                lineTo(1.24f, 14.06f)
                lineTo(0.04f, 15.65f)
                lineTo(4.83f, 19.22f)
                lineTo(8.24f, 16.6f)
                curveToRelative(-0.54f, -0.36f, -1.07f, -0.9f, -1.42f, -1.43f)
                close()
            }
        }.also { _FootballPlayer = it}
