package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Br.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 2.47f)
            curveTo(13f, 1.09f, 14.12f, -0.03f, 15.5f, -0.03f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(22.25f, 8.67f)
            curveToRelative(-0.46f, -0.69f, -1.39f, -0.88f, -2.08f, -0.43f)
            lineToRelative(-3.09f, 2.04f)
            lineToRelative(-1.25f, -1.86f)
            curveToRelative(-0.51f, -0.98f, -1.36f, -1.73f, -2.39f, -2.13f)
            curveToRelative(-0.74f, -0.32f, -1.52f, -0.38f, -2.27f, -0.18f)
            curveToRelative(-0.97f, 0.26f, -1.79f, 0.93f, -2.26f, 1.91f)
            lineToRelative(-2.47f, 5.76f)
            curveToRelative(-0.56f, 1.13f, -0.82f, 2.81f, 1.07f, 4.35f)
            lineToRelative(3.31f, 2.87f)
            horizontalLineToRelative(-5.31f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.74f, -0.19f, -1.14f, -0.52f, -1.42f)
            lineToRelative(-4.36f, -3.77f)
            lineToRelative(2.71f, -6.46f)
            lineToRelative(1.58f, 2.35f)
            curveToRelative(0.46f, 0.68f, 1.39f, 0.87f, 2.07f, 0.41f)
            lineToRelative(4.33f, -2.86f)
            curveToRelative(0.69f, -0.46f, 0.88f, -1.39f, 0.43f, -2.08f)
            close()
        }
    }.also { _PersonPraying = it }
