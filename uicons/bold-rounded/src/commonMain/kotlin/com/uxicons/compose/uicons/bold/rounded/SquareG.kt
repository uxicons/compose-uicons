package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareG: ImageVector? = null

val Icons.Br.SquareG: ImageVector
    get() = _SquareG ?: UXIcon(name = "SquareG") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(18.0f, 13.06f)
            curveToRelative(0.07f, 1.78f, -0.75f, 3.5f, -2.24f, 4.66f)
            curveToRelative(-1.08f, 0.84f, -2.41f, 1.28f, -3.76f, 1.28f)
            curveToRelative(-0.58f, 0f, -1.17f, -0.08f, -1.74f, -0.25f)
            curveToRelative(-2.51f, -0.73f, -4.26f, -3.12f, -4.26f, -5.8f)
            verticalLineToRelative(-1.82f)
            curveToRelative(0f, -1.66f, 0.69f, -3.27f, 1.89f, -4.43f)
            curveToRelative(1.18f, -1.14f, 2.72f, -1.74f, 4.32f, -1.69f)
            curveToRelative(1.64f, 0.05f, 3.2f, 0.78f, 4.3f, 1.99f)
            curveToRelative(0.56f, 0.61f, 0.51f, 1.56f, -0.1f, 2.12f)
            curveToRelative(-0.61f, 0.56f, -1.56f, 0.51f, -2.12f, -0.1f)
            curveToRelative(-0.56f, -0.62f, -1.33f, -0.97f, -2.17f, -1.0f)
            curveToRelative(-0.78f, -0.03f, -1.55f, 0.28f, -2.14f, 0.85f)
            curveToRelative(-0.62f, 0.6f, -0.97f, 1.43f, -0.97f, 2.28f)
            verticalLineToRelative(1.82f)
            curveToRelative(0f, 1.36f, 0.86f, 2.56f, 2.1f, 2.92f)
            curveToRelative(0.99f, 0.29f, 2.02f, 0.1f, 2.81f, -0.52f)
            curveToRelative(0.47f, -0.36f, 0.79f, -0.83f, 0.96f, -1.35f)
            horizontalLineToRelative(-1.38f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.54f, 0f, 1.03f, 0.2f, 1.4f, 0.57f)
            curveToRelative(0.56f, 0.56f, 0.6f, 1.28f, 0.6f, 1.49f)
            close()
        }
    }.also { _SquareG = it }
