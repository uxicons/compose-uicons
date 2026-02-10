package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Br.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-2.41f, 0f, -4.6f, -1.33f, -5.71f, -3.47f)
            lineToRelative(-5.31f, -10.22f)
            lineToRelative(-6.65f, 12.88f)
            curveToRelative(-0.27f, 0.52f, -0.79f, 0.81f, -1.33f, 0.81f)
            curveToRelative(-0.23f, 0f, -0.47f, -0.05f, -0.69f, -0.17f)
            curveToRelative(-0.74f, -0.38f, -1.02f, -1.28f, -0.65f, -2.02f)
            lineToRelative(7.62f, -14.76f)
            lineToRelative(-1.14f, -2.2f)
            curveToRelative(-0.59f, -1.14f, -1.76f, -1.85f, -3.05f, -1.85f)
            curveToRelative(-0.83f, 0f, -1.55f, -0.67f, -1.55f, -1.5f)
            reflectiveCurveToRelative(0.62f, -1.5f, 1.45f, -1.5f)
            curveToRelative(2.41f, 0f, 4.69f, 1.33f, 5.81f, 3.47f)
            lineToRelative(8.14f, 15.68f)
            curveToRelative(0.59f, 1.14f, 1.76f, 1.85f, 3.05f, 1.85f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Lambda = it }
