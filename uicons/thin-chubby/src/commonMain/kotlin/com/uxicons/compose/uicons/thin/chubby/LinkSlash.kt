package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Tc.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.35f, 16.35f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.2f, 0.2f, -0.19f, 0.53f, 0f, 0.71f)
                curveToRelative(0.29f, 0.28f, 0.61f, 0.1f, 0.71f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.27f, 19.48f)
                curveToRelative(-5.04f, 3.91f, -7.6f, 2.55f, -9.44f, 0.7f)
                curveToRelative(-1.94f, -1.95f, -3.2f, -4.44f, 0.69f, -9.45f)
                curveToRelative(0.17f, -0.22f, 0.13f, -0.53f, -0.09f, -0.7f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.13f, -0.7f, 0.09f)
                curveToRelative(-3.44f, 4.43f, -3.63f, 7.75f, -0.61f, 10.77f)
                curveToRelative(1.41f, 1.41f, 2.89f, 2.12f, 4.51f, 2.12f)
                curveToRelative(1.85f, 0f, 3.89f, -0.91f, 6.25f, -2.74f)
                curveToRelative(0.22f, -0.17f, 0.26f, -0.48f, 0.09f, -0.7f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.26f, -0.7f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.66f, 16.95f)
                curveToRelative(0.54f, -0.63f, 1.8f, -2.12f, 1.94f, -2.28f)
                curveToRelative(4.1f, -4.89f, 4.49f, -8.35f, 1.29f, -11.55f)
                curveToRelative(-3.12f, -3.12f, -6.61f, -2.78f, -11.33f, 1.11f)
                curveToRelative(-0.24f, 0.2f, -2.12f, 1.73f, -2.54f, 2.08f)
                lineToRelative(-5.15f, -5.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(20.99f, 20.99f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-5.19f, -5.19f)
                close()
                moveTo(10.19f, 4.99f)
                curveToRelative(5.38f, -4.44f, 7.98f, -3.19f, 9.99f, -1.18f)
                curveToRelative(2.04f, 2.04f, 3.28f, 4.69f, -1.34f, 10.21f)
                curveToRelative(-0.13f, 0.16f, -1.32f, 1.55f, -1.88f, 2.22f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(3.64f, -3.65f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.64f, 3.65f)
                lineToRelative(-4.28f, -4.28f)
                curveToRelative(0.54f, -0.44f, 2.24f, -1.83f, 2.47f, -2.01f)
                close()
            }
        }.also { _LinkSlash = it}
