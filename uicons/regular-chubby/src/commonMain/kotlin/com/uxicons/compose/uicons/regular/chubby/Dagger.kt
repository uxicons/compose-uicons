package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dagger: ImageVector? = null

val Icons.Rc.Dagger: ImageVector
    get() = _Dagger ?: UXIcon(name = "Dagger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.84f, 5.6f)
                lineToRelative(2.37f, -2.4f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.01f)
                lineToRelative(-2.36f, 2.38f)
                curveToRelative(-2.12f, -1.89f, -4.67f, -3.18f, -6.93f, -3.18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.86f, 0f, 1.79f, 0.26f, 2.72f, 0.69f)
                curveToRelative(-2.17f, 1.71f, -8.27f, 6.58f, -10.17f, 8.48f)
                curveToRelative(-3.53f, 3.53f, -3.04f, 9.63f, -3.01f, 9.88f)
                curveToRelative(0.04f, 0.48f, 0.43f, 0.87f, 0.91f, 0.91f)
                curveToRelative(0.06f, 0.01f, 0.43f, 0.04f, 1.0f, 0.04f)
                curveToRelative(1.93f, 0f, 6.17f, -0.33f, 8.88f, -3.05f)
                curveToRelative(1.9f, -1.9f, 6.76f, -8.01f, 8.48f, -10.17f)
                curveToRelative(0.44f, 0.93f, 0.69f, 1.86f, 0.69f, 2.72f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.25f, -1.28f, -4.79f, -3.16f, -6.9f)
                close()
                moveTo(10.41f, 18.54f)
                curveToRelative(-2.16f, 2.16f, -5.75f, 2.45f, -7.41f, 2.46f)
                curveToRelative(0.01f, -1.66f, 0.3f, -5.25f, 2.46f, -7.41f)
                curveToRelative(2.02f, -2.02f, 9.4f, -7.85f, 10.59f, -8.79f)
                curveToRelative(1.19f, 0.86f, 2.29f, 1.97f, 3.15f, 3.15f)
                curveToRelative(-0.94f, 1.19f, -6.77f, 8.56f, -8.79f, 10.59f)
                close()
            }
        }.also { _Dagger = it}
