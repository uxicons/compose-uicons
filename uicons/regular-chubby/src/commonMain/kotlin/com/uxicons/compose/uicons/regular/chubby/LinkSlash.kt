package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Rc.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.21f, 16.2f)
                lineToRelative(1f, -1f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1f, 1f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.89f, 18.71f)
                curveToRelative(-4.46f, 3.46f, -6.62f, 2.39f, -8.3f, 0.71f)
                curveToRelative(-1.94f, -1.94f, -2.56f, -4.1f, 0.7f, -8.31f)
                curveToRelative(0.34f, -0.44f, 0.26f, -1.06f, -0.18f, -1.4f)
                curveToRelative(-0.43f, -0.34f, -1.06f, -0.26f, -1.4f, 0.18f)
                curveToRelative(-3.43f, 4.41f, -3.6f, 7.89f, -0.54f, 10.95f)
                curveToRelative(1.44f, 1.44f, 2.97f, 2.17f, 4.66f, 2.17f)
                curveToRelative(1.88f, 0f, 3.95f, -0.9f, 6.28f, -2.71f)
                curveToRelative(0.44f, -0.34f, 0.52f, -0.97f, 0.18f, -1.4f)
                curveToRelative(-0.34f, -0.43f, -0.97f, -0.52f, -1.4f, -0.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.1f, 16.68f)
                curveToRelative(0.58f, -0.68f, 1.43f, -1.68f, 1.53f, -1.81f)
                curveToRelative(4.07f, -4.85f, 4.44f, -8.46f, 1.2f, -11.71f)
                curveToRelative(-3.16f, -3.17f, -6.81f, -2.84f, -11.5f, 1.02f)
                curveToRelative(-0.18f, 0.15f, -1.38f, 1.13f, -2.05f, 1.68f)
                lineToRelative(-4.57f, -4.57f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(19.99f, 19.99f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(10.61f, 5.73f)
                curveToRelative(5.04f, -4.16f, 7.19f, -2.78f, 8.81f, -1.15f)
                curveToRelative(1.64f, 1.65f, 3.03f, 3.83f, -1.31f, 9.01f)
                curveToRelative(-0.1f, 0.12f, -0.85f, 1.0f, -1.42f, 1.67f)
                lineToRelative(-3.27f, -3.27f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(0.69f, -0.56f, 1.73f, -1.41f, 1.9f, -1.55f)
                close()
            }
        }.also { _LinkSlash = it}
