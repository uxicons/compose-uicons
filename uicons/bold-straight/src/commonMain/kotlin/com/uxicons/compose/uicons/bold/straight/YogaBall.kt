package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBall: ImageVector? = null

val Icons.Bs.YogaBall: ImageVector
    get() = _YogaBall ?: UXIcon(name = "YogaBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(19.86f, 16.38f)
                curveToRelative(-1.07f, 0.41f, -2.19f, 0.62f, -3.36f, 0.62f)
                curveToRelative(-5.24f, 0f, -9.5f, -4.26f, -9.5f, -9.5f)
                curveToRelative(0f, -1.16f, 0.22f, -2.29f, 0.62f, -3.36f)
                curveToRelative(0.62f, -0.35f, 1.3f, -0.62f, 2.0f, -0.81f)
                curveToRelative(-0.08f, 0.49f, -0.13f, 0.99f, -0.13f, 1.49f)
                curveToRelative(0f, 5.34f, 4.34f, 9.68f, 9.68f, 9.68f)
                curveToRelative(0.5f, 0f, 1f, -0.05f, 1.49f, -0.13f)
                curveToRelative(-0.19f, 0.7f, -0.47f, 1.38f, -0.81f, 2.0f)
                close()
                moveTo(20.27f, 8.46f)
                curveToRelative(0.37f, 0.87f, 0.61f, 1.81f, 0.69f, 2.8f)
                curveToRelative(-0.58f, 0.16f, -1.17f, 0.25f, -1.78f, 0.25f)
                curveToRelative(-3.69f, 0f, -6.68f, -3.0f, -6.68f, -6.68f)
                curveToRelative(0f, -0.61f, 0.09f, -1.21f, 0.25f, -1.78f)
                curveToRelative(0.98f, 0.08f, 1.93f, 0.32f, 2.8f, 0.69f)
                curveToRelative(0.3f, 2.47f, 2.26f, 4.42f, 4.73f, 4.73f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.49f, 0.37f, -2.9f, 1.02f, -4.14f)
                curveToRelative(0.19f, 6.61f, 5.52f, 11.94f, 12.12f, 12.12f)
                curveToRelative(-1.24f, 0.65f, -2.65f, 1.02f, -4.14f, 1.02f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
            }
        }.also { _YogaBall = it}
