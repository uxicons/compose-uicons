package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Br.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 24f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(0f, 1.5f)
            curveTo(0.03f, -0.47f, 2.97f, -0.47f, 3f, 1.5f)
            lineTo(3f, 20.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            lineTo(22.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 10.88f)
            verticalLineToRelative(4.63f)
            curveToRelative(-0.01f, 1.93f, -1.58f, 3.49f, -3.5f, 3.49f)
            lineTo(8.5f, 19f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(1.32f, -1.32f, 3.61f, -1.32f, 4.94f, -0.01f)
            lineToRelative(3.58f, 3.44f)
            lineToRelative(0.55f, -0.49f)
            curveToRelative(1.24f, -1.29f, 3.64f, -1.28f, 4.89f, 0.06f)
            lineToRelative(1.39f, 1.27f)
            curveToRelative(0.72f, 0.66f, 1.13f, 1.6f, 1.13f, 2.58f)
            close()
            moveTo(21f, 10.88f)
            curveToRelative(0f, -0.14f, -0.06f, -0.27f, -0.16f, -0.37f)
            lineToRelative(-1.44f, -1.32f)
            curveToRelative(-0.31f, -0.26f, -0.46f, -0.26f, -0.75f, -0.04f)
            lineToRelative(-1.65f, 1.47f)
            curveToRelative(-0.58f, 0.52f, -1.47f, 0.51f, -2.04f, -0.04f)
            lineToRelative(-4.59f, -4.41f)
            lineToRelative(-0.02f, -0.02f)
            curveToRelative(-0.27f, -0.21f, -0.44f, -0.21f, -0.71f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.09f, 0.09f, -0.15f, 0.22f, -0.15f, 0.35f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(12f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-4.62f)
            close()
        }
    }.also { _ChartArea = it }
