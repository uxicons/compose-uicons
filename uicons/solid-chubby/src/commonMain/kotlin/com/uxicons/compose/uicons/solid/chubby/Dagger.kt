package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dagger: ImageVector? = null

val Icons.Sc.Dagger: ImageVector
    get() = _Dagger ?: UXIcon(name = "Dagger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.24f, 5.9f)
                lineToRelative(1.83f, -1.85f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                reflectiveCurveToRelative(-1.54f, -0.58f, -2.12f, 0.01f)
                lineToRelative(-1.82f, 1.84f)
                curveToRelative(-2.02f, -1.67f, -4.41f, -2.77f, -6.62f, -2.77f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.64f, 0f, 1.32f, 0.16f, 2.01f, 0.44f)
                curveToRelative(-2.37f, 1.88f, -7.78f, 6.21f, -9.53f, 7.96f)
                curveToRelative(-3.45f, 3.45f, -2.97f, 9.4f, -2.95f, 9.66f)
                curveToRelative(0.04f, 0.48f, 0.43f, 0.87f, 0.91f, 0.91f)
                curveToRelative(0.06f, 0.01f, 0.42f, 0.03f, 0.98f, 0.03f)
                curveToRelative(1.88f, 0f, 6.03f, -0.33f, 8.68f, -2.98f)
                curveToRelative(1.75f, -1.75f, 6.08f, -7.16f, 7.96f, -9.53f)
                curveToRelative(0.28f, 0.69f, 0.44f, 1.37f, 0.44f, 2.01f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -2.21f, -1.1f, -4.58f, -2.76f, -6.6f)
                close()
            }
        }.also { _Dagger = it}
