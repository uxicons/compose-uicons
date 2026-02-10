package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Br.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.33f, 0.69f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.41f, -0.92f, -3.24f, -0.92f, -4.65f, 0f)
            curveTo(6.17f, 2.97f, 2f, 6.5f, 2f, 10.39f)
            verticalLineToRelative(6.21f)
            curveToRelative(0f, 2.24f, 1.34f, 4.23f, 3.4f, 5.09f)
            lineToRelative(4.7f, 1.93f)
            curveToRelative(0.61f, 0.25f, 1.25f, 0.38f, 1.9f, 0.38f)
            reflectiveCurveToRelative(1.29f, -0.13f, 1.9f, -0.38f)
            lineToRelative(4.7f, -1.93f)
            curveToRelative(2.07f, -0.85f, 3.4f, -2.85f, 3.4f, -5.08f)
            verticalLineToRelative(-6.21f)
            curveToRelative(0f, -3.89f, -4.17f, -7.42f, -7.67f, -9.7f)
            close()
            moveTo(19f, 16.61f)
            curveToRelative(0f, 1.02f, -0.61f, 1.92f, -1.55f, 2.31f)
            lineToRelative(-3.95f, 1.63f)
            verticalLineToRelative(-5.79f)
            lineToRelative(2.48f, -1.24f)
            curveToRelative(0.63f, -0.31f, 1.02f, -0.96f, 1.02f, -1.66f)
            curveToRelative(0f, -1.02f, -0.83f, -1.85f, -1.85f, -1.85f)
            horizontalLineToRelative(-6.29f)
            curveToRelative(-1.02f, 0f, -1.85f, 0.83f, -1.85f, 1.85f)
            curveToRelative(0f, 0.7f, 0.4f, 1.34f, 1.02f, 1.66f)
            lineToRelative(2.48f, 1.24f)
            verticalLineToRelative(5.79f)
            lineToRelative(-3.95f, -1.63f)
            curveToRelative(-0.94f, -0.39f, -1.55f, -1.29f, -1.55f, -2.31f)
            verticalLineToRelative(-6.21f)
            curveToRelative(0f, -1.93f, 2.36f, -4.62f, 6.31f, -7.19f)
            curveToRelative(0.21f, -0.14f, 0.45f, -0.21f, 0.69f, -0.21f)
            reflectiveCurveToRelative(0.48f, 0.07f, 0.69f, 0.21f)
            curveToRelative(3.95f, 2.57f, 6.31f, 5.26f, 6.31f, 7.19f)
            verticalLineToRelative(6.21f)
            close()
        }
    }.also { _HelmetBattle = it }
