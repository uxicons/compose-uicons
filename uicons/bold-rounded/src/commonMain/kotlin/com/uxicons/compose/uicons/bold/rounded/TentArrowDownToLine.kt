package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Br.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(0.63f, 5.71f)
            curveTo(0f, 5.08f, 0.45f, 4.0f, 1.34f, 4.0f)
            horizontalLineToRelative(1.66f)
            lineTo(3f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(1.66f)
            curveToRelative(0.89f, 0f, 1.34f, 1.08f, 0.71f, 1.71f)
            lineToRelative(-3.16f, 3.16f)
            curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
            lineTo(0.63f, 5.71f)
            close()
            moveTo(23.28f, 21.88f)
            curveToRelative(-0.85f, 1.33f, -2.29f, 2.12f, -3.87f, 2.12f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.79f)
            curveToRelative(-0.42f, -1.13f, -0.38f, -2.39f, 0.15f, -3.52f)
            curveToRelative(0.04f, -0.08f, 5.59f, -8.1f, 5.63f, -8.14f)
            curveToRelative(1.17f, -1.35f, 2.13f, -2.31f, 3.94f, -2.31f)
            curveToRelative(1.55f, 0f, 2.86f, 0.79f, 4.02f, 2.42f)
            curveToRelative(0f, 0f, 5.51f, 7.95f, 5.55f, 8.03f)
            curveToRelative(0.66f, 1.43f, 0.55f, 3.07f, -0.29f, 4.4f)
            close()
            moveTo(20.89f, 18.85f)
            lineToRelative(-5.32f, -7.67f)
            curveToRelative(-0.81f, -1.14f, -1.34f, -1.14f, -1.57f, -1.14f)
            curveToRelative(-0.4f, 0f, -0.57f, 0f, -1.62f, 1.21f)
            lineToRelative(-5.27f, 7.6f)
            curveToRelative(-0.18f, 0.47f, -0.13f, 0.98f, 0.14f, 1.42f)
            curveToRelative(0.3f, 0.47f, 0.79f, 0.73f, 1.34f, 0.73f)
            horizontalLineToRelative(1.81f)
            lineToRelative(2.21f, -4.08f)
            curveToRelative(0.55f, -1.17f, 2.22f, -1.17f, 2.76f, 0f)
            lineToRelative(2.21f, 4.08f)
            horizontalLineToRelative(1.81f)
            curveToRelative(0.56f, 0f, 1.04f, -0.27f, 1.34f, -0.73f)
            curveToRelative(0.28f, -0.43f, 0.33f, -0.94f, 0.14f, -1.42f)
            close()
        }
    }.also { _TentArrowDownToLine = it }
