package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Br.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.58f, 18.69f)
            lineToRelative(-3.51f, -6.78f)
            curveToRelative(-1.56f, -3.02f, -4.66f, -4.9f, -8.07f, -4.9f)
            reflectiveCurveToRelative(-6.5f, 1.88f, -8.07f, 4.9f)
            lineTo(0.42f, 18.68f)
            curveToRelative(-0.6f, 1.13f, -0.56f, 2.46f, 0.09f, 3.56f)
            curveToRelative(0.66f, 1.1f, 1.83f, 1.76f, 3.12f, 1.76f)
            horizontalLineToRelative(16.73f)
            curveToRelative(1.29f, 0f, 2.46f, -0.66f, 3.12f, -1.76f)
            curveToRelative(0.66f, -1.1f, 0.69f, -2.44f, 0.1f, -3.55f)
            close()
            moveTo(20.91f, 20.69f)
            curveToRelative(-0.07f, 0.12f, -0.23f, 0.31f, -0.54f, 0.31f)
            lineTo(3.64f, 21f)
            curveToRelative(-0.31f, 0f, -0.48f, -0.19f, -0.54f, -0.31f)
            curveToRelative(-0.07f, -0.11f, -0.16f, -0.34f, -0.02f, -0.61f)
            curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
            lineToRelative(3.51f, -6.78f)
            curveToRelative(1.06f, -2.06f, 3.08f, -3.28f, 5.41f, -3.28f)
            reflectiveCurveToRelative(4.34f, 1.23f, 5.41f, 3.28f)
            lineToRelative(3.52f, 6.8f)
            curveToRelative(0.14f, 0.27f, 0.05f, 0.5f, -0.02f, 0.61f)
            close()
        }
    }.also { _Mound = it }
