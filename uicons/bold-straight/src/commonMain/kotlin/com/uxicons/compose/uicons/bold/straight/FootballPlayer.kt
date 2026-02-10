package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballPlayer: ImageVector? = null

val Icons.Bs.FootballPlayer: ImageVector
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
                moveTo(16.64f, 17.07f)
                lineTo(18.8f, 22.98f)
                lineTo(15.99f, 24.01f)
                lineTo(14.13f, 18.93f)
                lineTo(9.43f, 15.33f)
                curveToRelative(-1.39f, -0.92f, -1.94f, -2.69f, -1.3f, -4.24f)
                curveToRelative(0.03f, -0.09f, 1.7f, -3.42f, 1.75f, -3.52f)
                lineToRelative(-4.3f, -2.0f)
                lineToRelative(-3.06f, -3.55f)
                lineToRelative(2.27f, -1.96f)
                lineToRelative(2.63f, 3.06f)
                lineToRelative(15.09f, 7.02f)
                lineToRelative(-1.26f, 2.72f)
                lineToRelative(-6.89f, -3.2f)
                lineToRelative(-1.99f, 4.15f)
                lineToRelative(4.27f, 3.27f)
                close()
                moveTo(6.39f, 14.75f)
                lineTo(4.83f, 15.93f)
                lineTo(1.79f, 13.65f)
                lineTo(-0.01f, 16.04f)
                lineTo(4.83f, 19.69f)
                lineTo(8.36f, 17.03f)
                curveToRelative(-0.86f, -0.59f, -1.54f, -1.37f, -1.96f, -2.28f)
                close()
            }
        }.also { _FootballPlayer = it}
