package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Br.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 14.5f)
            curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(7.5f)
            curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
            reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
            horizontalLineToRelative(4.6f)
            lineToRelative(-3.58f, -3.41f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
            lineToRelative(4.07f, 3.88f)
            curveToRelative(0.88f, 0.88f, 1.34f, 2.0f, 1.34f, 3.21f)
            reflectiveCurveToRelative(-0.47f, 2.33f, -1.32f, 3.18f)
            lineToRelative(-4.15f, 3.95f)
            curveToRelative(-0.29f, 0.28f, -0.66f, 0.41f, -1.03f, 0.41f)
            curveToRelative(-0.4f, 0f, -0.79f, -0.16f, -1.09f, -0.47f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
            lineToRelative(3.63f, -3.46f)
            horizontalLineToRelative(-4.6f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(9f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            curveToRelative(0f, -1.6f, -0.86f, -3.1f, -2.25f, -3.9f)
            curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f)
            curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f)
            curveToRelative(2.31f, 1.34f, 3.75f, 3.83f, 3.75f, 6.5f)
            close()
        }
    }.also { _EndlessLoop = it }
