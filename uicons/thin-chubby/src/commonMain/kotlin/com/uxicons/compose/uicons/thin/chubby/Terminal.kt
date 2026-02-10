package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Tc.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 21.17f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-0.02f, -0.01f, -2.19f, -0.54f, -5.38f, -0.54f)
                reflectiveCurveToRelative(-5.36f, 0.53f, -5.38f, 0.54f)
                curveToRelative(-0.26f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.09f, -0.02f, 2.3f, -0.56f, 5.62f, -0.56f)
                reflectiveCurveToRelative(5.53f, 0.54f, 5.62f, 0.56f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                close()
                moveTo(1.76f, 3.07f)
                curveToRelative(-0.23f, -0.14f, -0.54f, -0.07f, -0.69f, 0.16f)
                curveToRelative(-0.14f, 0.23f, -0.07f, 0.54f, 0.16f, 0.69f)
                curveToRelative(3.54f, 2.18f, 6.45f, 4.9f, 8.66f, 8.07f)
                curveToRelative(-2.21f, 3.17f, -5.12f, 5.89f, -8.66f, 8.07f)
                curveToRelative(-0.23f, 0.15f, -0.31f, 0.45f, -0.16f, 0.69f)
                curveToRelative(0.15f, 0.24f, 0.46f, 0.31f, 0.69f, 0.16f)
                curveToRelative(3.76f, -2.32f, 6.84f, -5.23f, 9.15f, -8.65f)
                curveToRelative(0.12f, -0.17f, 0.12f, -0.39f, 0f, -0.56f)
                curveToRelative(-2.31f, -3.41f, -5.39f, -6.32f, -9.15f, -8.64f)
                close()
            }
        }.also { _Terminal = it}
