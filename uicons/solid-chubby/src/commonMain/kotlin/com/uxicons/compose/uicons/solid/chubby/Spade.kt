package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Sc.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.07f, 4.04f)
                curveToRelative(-2.57f, -2.51f, -4.72f, -3.04f, -6.07f, -3.04f)
                reflectiveCurveToRelative(-3.5f, 0.53f, -6.07f, 3.04f)
                curveToRelative(-3.21f, 3.14f, -3.88f, 5.89f, -3.88f, 7.64f)
                curveToRelative(0.01f, 1.75f, 0.67f, 3.39f, 1.82f, 4.5f)
                curveToRelative(0.95f, 0.92f, 2.43f, 1.46f, 3.94f, 1.46f)
                curveToRelative(1.15f, 0f, 1.94f, -0.27f, 2.58f, -0.63f)
                curveToRelative(-0.12f, 1.57f, -0.31f, 2.34f, -1.57f, 2.99f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.88f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.33f)
                curveToRelative(-1.23f, -0.64f, -1.39f, -1.4f, -1.5f, -2.99f)
                curveToRelative(0.64f, 0.36f, 1.4f, 0.57f, 2.24f, 0.62f)
                curveToRelative(1.62f, 0.09f, 3.26f, -0.47f, 4.28f, -1.45f)
                curveToRelative(1.15f, -1.11f, 1.82f, -2.75f, 1.82f, -4.5f)
                curveToRelative(0.01f, -1.75f, -0.66f, -4.5f, -3.88f, -7.64f)
                close()
            }
        }.also { _Spade = it}
