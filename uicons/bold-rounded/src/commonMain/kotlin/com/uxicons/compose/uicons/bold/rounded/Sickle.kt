package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Br.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.75f, 8.38f)
            curveTo(21.59f, 3.54f, 17.46f, 0.1f, 12.72f, 0.0f)
            curveToRelative(-2.84f, -0.04f, -5.53f, 1.01f, -7.57f, 3.0f)
            curveToRelative(-2.03f, 1.99f, -3.15f, 4.66f, -3.15f, 7.5f)
            curveToRelative(0f, 2.76f, 1.12f, 5.4f, 3.03f, 7.35f)
            lineToRelative(-3.59f, 3.59f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(5.06f, -5.06f)
            curveToRelative(0.82f, -0.82f, 1.09f, -2.06f, 0.69f, -3.17f)
            curveToRelative(-0.34f, -0.94f, -0.41f, -1.93f, -0.21f, -2.94f)
            curveToRelative(0.43f, -2.16f, 2.24f, -3.93f, 4.4f, -4.31f)
            curveToRelative(2.8f, -0.48f, 5.42f, 1.13f, 6.24f, 3.84f)
            curveToRelative(0.19f, 0.64f, 0.76f, 1.07f, 1.7f, 1.07f)
            curveToRelative(0.79f, 0f, 1.41f, -0.58f, 1.49f, -1.34f)
            curveToRelative(0.09f, -0.8f, 0.14f, -1.9f, -0.19f, -3.28f)
            close()
            moveTo(13f, 5.13f)
            curveToRelative(-3.41f, 0.59f, -6.16f, 3.27f, -6.83f, 6.68f)
            curveToRelative(-0.16f, 0.82f, -0.2f, 1.66f, -0.13f, 2.49f)
            curveToRelative(-0.67f, -1.14f, -1.04f, -2.45f, -1.04f, -3.8f)
            curveToRelative(0f, -2.03f, 0.8f, -3.94f, 2.25f, -5.36f)
            curveToRelative(1.41f, -1.39f, 3.27f, -2.14f, 5.25f, -2.14f)
            curveToRelative(3.29f, 0f, 4.45f, 1.16f, 5.83f, 2.93f)
            curveToRelative(-1.59f, -0.81f, -3.45f, -1.13f, -5.33f, -0.8f)
            close()
        }
    }.also { _Sickle = it }
