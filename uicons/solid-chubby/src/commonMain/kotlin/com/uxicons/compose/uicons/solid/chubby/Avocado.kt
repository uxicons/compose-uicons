package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Sc.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 14.0f)
                curveToRelative(-0.32f, -1.77f, -0.95f, -2.83f, -1.46f, -3.69f)
                curveToRelative(-0.47f, -0.8f, -0.79f, -1.32f, -0.79f, -2.22f)
                curveToRelative(0f, -4.44f, -2.43f, -7.1f, -6.5f, -7.1f)
                reflectiveCurveToRelative(-6.5f, 2.65f, -6.5f, 7.1f)
                curveToRelative(0f, 0.9f, -0.31f, 1.43f, -0.79f, 2.22f)
                curveToRelative(-0.51f, 0.85f, -1.14f, 1.91f, -1.46f, 3.69f)
                curveToRelative(-0.45f, 2.5f, -0.01f, 4.58f, 1.31f, 6.16f)
                curveToRelative(1.53f, 1.83f, 4.17f, 2.84f, 7.44f, 2.84f)
                reflectiveCurveToRelative(5.91f, -1.01f, 7.44f, -2.84f)
                curveToRelative(1.32f, -1.58f, 1.76f, -3.65f, 1.31f, -6.16f)
                close()
                moveTo(12f, 18.56f)
                curveToRelative(-3.39f, 0f, -4.11f, -2.22f, -4.11f, -4.08f)
                curveToRelative(0f, -2.71f, 1.38f, -4.09f, 4.11f, -4.09f)
                reflectiveCurveToRelative(4.11f, 1.38f, 4.11f, 4.09f)
                reflectiveCurveToRelative(-1.38f, 4.08f, -4.11f, 4.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.39f)
                curveToRelative(-1.46f, 0f, -2.11f, 0.3f, -2.11f, 2.09f)
                curveToRelative(0f, 1.58f, 0.51f, 2.08f, 2.11f, 2.08f)
                curveToRelative(1.46f, 0f, 2.11f, -0.3f, 2.11f, -2.08f)
                reflectiveCurveToRelative(-0.65f, -2.09f, -2.11f, -2.09f)
                close()
            }
        }.also { _Avocado = it}
