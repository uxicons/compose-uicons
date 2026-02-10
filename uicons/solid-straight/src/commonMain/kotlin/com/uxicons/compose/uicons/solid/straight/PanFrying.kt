package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PanFrying: ImageVector? = null

val Icons.Ss.PanFrying: ImageVector
    get() = _PanFrying ?: UXIcon(name = "PanFrying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.59f, 17.18f)
                curveToRelative(1.5f, -1.82f, 2.4f, -4.14f, 2.4f, -6.68f)
                curveTo(21f, 4.71f, 16.29f, 0f, 10.5f, 0f)
                reflectiveCurveTo(0f, 4.71f, 0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.54f, 0f, 4.86f, -0.9f, 6.68f, -2.4f)
                lineToRelative(5.38f, 5.38f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.38f, -5.38f)
                close()
                moveTo(16.1f, 13.81f)
                curveToRelative(-0.31f, 2.39f, -2.44f, 4.19f, -5.01f, 4.19f)
                curveToRelative(-4.46f, 0f, -8.09f, -3.63f, -8.09f, -8.09f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -3.48f, 2.83f, -6.32f, 6.32f, -6.32f)
                curveToRelative(2.14f, 0f, 4.07f, 1.18f, 5.23f, 3.19f)
                curveToRelative(2f, 0.44f, 3.45f, 2.08f, 3.45f, 4.02f)
                curveToRelative(0f, 1.41f, -0.74f, 2.79f, -1.9f, 3.6f)
                close()
                moveTo(13.8f, 8.09f)
                lineToRelative(-0.55f, -0.06f)
                lineToRelative(-0.24f, -0.5f)
                curveToRelative(-0.78f, -1.59f, -2.16f, -2.54f, -3.69f, -2.54f)
                curveToRelative(-2.38f, 0f, -4.32f, 1.94f, -4.32f, 4.32f)
                verticalLineToRelative(0.59f)
                curveToRelative(0f, 3.36f, 2.73f, 6.09f, 6.09f, 6.09f)
                curveToRelative(1.65f, 0f, 3.05f, -1.24f, 3.05f, -2.71f)
                verticalLineToRelative(-0.61f)
                lineToRelative(0.54f, -0.34f)
                curveToRelative(0.76f, -0.39f, 1.31f, -1.28f, 1.31f, -2.13f)
                curveToRelative(0f, -1.18f, -1.12f, -2.0f, -2.2f, -2.12f)
                close()
                moveTo(9f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _PanFrying = it}
