package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Br.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.13f, 2.46f)
            curveToRelative(-0.72f, -0.88f, -1.77f, -1.41f, -2.9f, -1.47f)
            curveToRelative(-1.13f, -0.05f, -2.23f, 0.37f, -3.03f, 1.17f)
            lineTo(0.76f, 18.55f)
            curveToRelative(-0.49f, 0.49f, -0.76f, 1.14f, -0.76f, 1.84f)
            reflectiveCurveToRelative(0.27f, 1.35f, 0.77f, 1.84f)
            curveToRelative(0.49f, 0.49f, 1.14f, 0.76f, 1.83f, 0.76f)
            horizontalLineToRelative(0.01f)
            curveToRelative(0.34f, 0f, 0.69f, -0.01f, 0.95f, -0.02f)
            curveToRelative(1.96f, -0.08f, 3.8f, -0.46f, 5.47f, -1.14f)
            curveToRelative(2.37f, -0.95f, 4.18f, -2.87f, 5.06f, -5.28f)
            lineToRelative(8.66f, -8.64f)
            curveToRelative(1.49f, -1.49f, 1.66f, -3.89f, 0.37f, -5.46f)
            close()
            moveTo(7.92f, 19.05f)
            curveToRelative(-1.31f, 0.53f, -2.77f, 0.84f, -4.33f, 0.91f)
            lineToRelative(6.18f, -6.17f)
            lineToRelative(1.59f, 1.48f)
            curveToRelative(-0.55f, 1.71f, -1.82f, 3.12f, -3.44f, 3.77f)
            close()
            moveTo(20.64f, 5.79f)
            lineToRelative(-7.27f, 7.26f)
            lineToRelative(-1.47f, -1.37f)
            lineToRelative(7.42f, -7.4f)
            curveToRelative(0.2f, -0.2f, 0.44f, -0.3f, 0.76f, -0.29f)
            curveToRelative(0.17f, 0.01f, 0.48f, 0.07f, 0.73f, 0.37f)
            curveToRelative(0.31f, 0.38f, 0.23f, 1.02f, -0.17f, 1.43f)
            close()
        }
    }.also { _Scalpel = it }
