package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Br.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.92f, 13.83f)
            lineToRelative(-2.01f, -1.88f)
            lineToRelative(2.24f, -1.49f)
            curveToRelative(0.1f, -0.06f, 0.19f, -0.14f, 0.27f, -0.22f)
            curveToRelative(0.56f, -0.6f, 0.74f, -1.45f, 0.46f, -2.22f)
            curveToRelative(-0.28f, -0.77f, -0.95f, -1.31f, -1.76f, -1.41f)
            curveToRelative(-2.5f, -0.32f, -7.23f, -0.61f, -10.12f, -0.61f)
            reflectiveCurveToRelative(-7.62f, 0.28f, -10.12f, 0.61f)
            curveToRelative(-0.81f, 0.1f, -1.48f, 0.65f, -1.76f, 1.41f)
            curveToRelative(-0.28f, 0.77f, -0.1f, 1.62f, 0.46f, 2.22f)
            curveToRelative(0.08f, 0.08f, 0.17f, 0.16f, 0.27f, 0.22f)
            lineToRelative(2.24f, 1.49f)
            lineToRelative(-2.01f, 1.88f)
            curveToRelative(-0.06f, 0.06f, -0.12f, 0.12f, -0.17f, 0.2f)
            curveToRelative(-0.52f, 0.69f, -0.58f, 1.63f, -0.14f, 2.38f)
            curveToRelative(0.43f, 0.75f, 1.27f, 1.17f, 2.13f, 1.07f)
            curveToRelative(2.22f, -0.26f, 6.31f, -0.48f, 9.11f, -0.48f)
            reflectiveCurveToRelative(6.89f, 0.21f, 9.11f, 0.48f)
            curveToRelative(0.09f, 0.01f, 0.17f, 0.01f, 0.26f, 0.01f)
            curveToRelative(0.77f, 0f, 1.48f, -0.41f, 1.87f, -1.08f)
            curveToRelative(0.43f, -0.75f, 0.38f, -1.69f, -0.14f, -2.38f)
            curveToRelative(-0.05f, -0.07f, -0.11f, -0.14f, -0.17f, -0.2f)
            close()
            moveTo(17.48f, 12.84f)
            lineToRelative(1.52f, 1.43f)
            curveToRelative(-2.23f, -0.16f, -4.92f, -0.27f, -7.0f, -0.27f)
            reflectiveCurveToRelative(-4.77f, 0.11f, -7.0f, 0.27f)
            lineToRelative(1.52f, -1.43f)
            curveToRelative(0.34f, -0.31f, 0.51f, -0.76f, 0.47f, -1.22f)
            reflectiveCurveToRelative(-0.28f, -0.87f, -0.67f, -1.12f)
            lineToRelative(-1.73f, -1.15f)
            curveToRelative(2.27f, -0.19f, 5.2f, -0.34f, 7.4f, -0.34f)
            reflectiveCurveToRelative(5.13f, 0.16f, 7.4f, 0.34f)
            lineToRelative(-1.73f, 1.15f)
            curveToRelative(-0.38f, 0.25f, -0.63f, 0.67f, -0.67f, 1.12f)
            reflectiveCurveToRelative(0.14f, 0.91f, 0.47f, 1.22f)
            close()
        }
    }.also { _Banner = it }
