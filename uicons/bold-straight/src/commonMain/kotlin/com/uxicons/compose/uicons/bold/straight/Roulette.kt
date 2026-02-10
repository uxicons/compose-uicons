package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Roulette: ImageVector? = null

val Icons.Bs.Roulette: ImageVector
    get() = _Roulette ?: UXIcon(name = "Roulette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(18.0f, 14.51f)
                curveToRelative(-0.33f, 0.79f, -0.81f, 1.5f, -1.42f, 2.1f)
                lineToRelative(1.76f, 1.77f)
                curveToRelative(-0.83f, 0.82f, -1.82f, 1.49f, -2.92f, 1.94f)
                lineToRelative(-0.95f, -2.31f)
                curveToRelative(-0.78f, 0.32f, -1.61f, 0.49f, -2.47f, 0.49f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(0.01f, 2.5f)
                curveToRelative(-1.22f, 0f, -2.39f, -0.25f, -3.45f, -0.69f)
                lineToRelative(0.96f, -2.3f)
                curveToRelative(-0.79f, -0.33f, -1.5f, -0.81f, -2.11f, -1.41f)
                lineToRelative(-1.77f, 1.76f)
                curveToRelative(-0.83f, -0.83f, -1.49f, -1.82f, -1.95f, -2.92f)
                lineToRelative(2.31f, -0.95f)
                curveToRelative(-0.33f, -0.79f, -0.49f, -1.62f, -0.49f, -2.49f)
                verticalLineToRelative(-0.06f)
                lineToRelative(-2.5f, 0.05f)
                curveToRelative(0.0f, -1.24f, 0.25f, -2.42f, 0.71f, -3.49f)
                lineToRelative(2.3f, 0.97f)
                curveToRelative(0.33f, -0.79f, 0.81f, -1.49f, 1.42f, -2.1f)
                lineToRelative(-1.75f, -1.77f)
                curveToRelative(0.83f, -0.82f, 1.83f, -1.48f, 2.93f, -1.93f)
                lineToRelative(0.94f, 2.31f)
                curveToRelative(0.78f, -0.32f, 1.6f, -0.48f, 2.48f, -0.48f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(-0.03f, -2f)
                curveToRelative(1.23f, 0.0f, 2.41f, 0.25f, 3.48f, 0.7f)
                lineToRelative(-0.97f, 2.3f)
                curveToRelative(0.79f, 0.33f, 1.5f, 0.81f, 2.1f, 1.42f)
                lineToRelative(1.77f, -1.75f)
                curveToRelative(0.82f, 0.83f, 1.48f, 1.82f, 1.94f, 2.92f)
                lineToRelative(-2.31f, 0.95f)
                curveToRelative(0.32f, 0.78f, 0.48f, 1.61f, 0.48f, 2.46f)
                verticalLineToRelative(0.03f)
                lineToRelative(2.5f, -0.03f)
                curveToRelative(0f, 1.23f, -0.25f, 2.4f, -0.7f, 3.47f)
                lineToRelative(-2.3f, -0.96f)
                close()
                moveTo(16.06f, 10.06f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _Roulette = it}
