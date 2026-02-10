package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyBar: ImageVector? = null

val Icons.Ts.CandyBar: ImageVector
    get() = _CandyBar ?: UXIcon(name = "CandyBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 11.5f)
                curveToRelative(0f, -0.61f, 0.23f, -1.2f, 0.65f, -1.67f)
                lineToRelative(0.3f, -0.33f)
                lineToRelative(-0.3f, -0.33f)
                curveToRelative(-0.42f, -0.47f, -0.65f, -1.06f, -0.65f, -1.67f)
                curveToRelative(0f, -0.89f, 0.49f, -1.72f, 1.27f, -2.16f)
                lineToRelative(0.57f, -0.33f)
                lineTo(17.59f, 0.76f)
                curveToRelative(-0.98f, -0.98f, -2.69f, -0.98f, -3.66f, 0f)
                lineTo(1.76f, 12.92f)
                curveToRelative(-1.01f, 1.01f, -1.01f, 2.65f, 0f, 3.66f)
                lineToRelative(6.65f, 6.65f)
                curveToRelative(0.51f, 0.51f, 1.17f, 0.76f, 1.83f, 0.76f)
                reflectiveCurveToRelative(1.33f, -0.25f, 1.83f, -0.76f)
                lineToRelative(9.4f, -9.4f)
                lineToRelative(-0.46f, -0.35f)
                curveToRelative(-0.64f, -0.48f, -1.01f, -1.21f, -1.01f, -2.0f)
                close()
                moveTo(7.06f, 9.04f)
                lineToRelative(3.82f, -3.82f)
                lineToRelative(4.07f, 4.06f)
                lineToRelative(-3.82f, 3.82f)
                lineToRelative(-4.07f, -4.07f)
                close()
                moveTo(15.66f, 9.98f)
                lineToRelative(4.13f, 4.13f)
                lineToRelative(-3.82f, 3.82f)
                lineToRelative(-4.13f, -4.13f)
                lineToRelative(3.82f, -3.82f)
                close()
                moveTo(16.36f, 9.28f)
                lineToRelative(2.82f, -2.82f)
                curveToRelative(-0.11f, 0.34f, -0.18f, 0.68f, -0.18f, 1.04f)
                curveToRelative(0f, 0.71f, 0.23f, 1.41f, 0.64f, 2f)
                curveToRelative(-0.41f, 0.59f, -0.64f, 1.28f, -0.64f, 2f)
                curveToRelative(0f, 0.15f, 0.02f, 0.31f, 0.04f, 0.46f)
                lineToRelative(-2.68f, -2.68f)
                close()
                moveTo(14.63f, 1.47f)
                curveToRelative(0.31f, -0.31f, 0.72f, -0.47f, 1.12f, -0.47f)
                reflectiveCurveToRelative(0.81f, 0.15f, 1.12f, 0.47f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(-4.16f, 4.16f)
                lineToRelative(-4.07f, -4.06f)
                lineToRelative(3.04f, -3.04f)
                close()
                moveTo(11.37f, 22.53f)
                curveToRelative(-0.62f, 0.62f, -1.63f, 0.62f, -2.25f, 0f)
                lineToRelative(-6.65f, -6.65f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.63f, 0f, -2.25f)
                lineToRelative(3.89f, -3.89f)
                lineToRelative(8.9f, 8.9f)
                lineToRelative(-3.89f, 3.89f)
                close()
            }
        }.also { _CandyBar = it}
