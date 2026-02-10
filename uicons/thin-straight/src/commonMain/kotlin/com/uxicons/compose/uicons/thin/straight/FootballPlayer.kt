package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FootballPlayer: ImageVector? = null

val Icons.Ts.FootballPlayer: ImageVector
    get() = _FootballPlayer ?: UXIcon(name = "FootballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(14.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(11.77f, 15.14f)
                lineTo(15.09f, 8.8f)
                lineTo(22.51f, 12.37f)
                lineTo(22.95f, 11.47f)
                lineTo(7.32f, 3.95f)
                lineTo(4.32f, 0.08f)
                lineTo(3.53f, 0.69f)
                lineTo(6.68f, 4.75f)
                lineTo(10.65f, 6.66f)
                lineTo(8.2f, 11.35f)
                curveToRelative(-0.46f, 1.12f, -0.05f, 2.41f, 0.94f, 3.04f)
                lineToRelative(4.99f, 3.82f)
                lineToRelative(2.41f, 5.5f)
                lineToRelative(0.92f, -0.4f)
                lineToRelative(-2.51f, -5.73f)
                close()
                moveTo(9.11f, 11.77f)
                lineTo(11.55f, 7.09f)
                lineTo(14.18f, 8.36f)
                lineTo(10.96f, 14.52f)
                lineTo(9.71f, 13.56f)
                curveToRelative(-0.62f, -0.39f, -0.86f, -1.16f, -0.6f, -1.79f)
                close()
                moveTo(7.99f, 16.02f)
                lineTo(8.0f, 16.03f)
                lineTo(4.83f, 18.59f)
                lineTo(0.04f, 15.08f)
                lineTo(0.64f, 14.28f)
                lineTo(4.83f, 17.34f)
                lineTo(7.23f, 15.37f)
                curveToRelative(0.23f, 0.24f, 0.47f, 0.46f, 0.75f, 0.65f)
                close()
            }
        }.also { _FootballPlayer = it}
