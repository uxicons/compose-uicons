package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Rc.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 11.0f)
                curveToRelative(0f, -7.01f, -2.99f, -9.99f, -9.99f, -9.99f)
                reflectiveCurveToRelative(-9.99f, 2.99f, -9.99f, 9.99f)
                curveToRelative(0f, 3.8f, 0.84f, 6.28f, 2.7f, 7.86f)
                curveToRelative(-1.25f, 0.89f, -2.61f, 1.62f, -4.07f, 2.21f)
                curveToRelative(-0.51f, 0.2f, -0.76f, 0.79f, -0.56f, 1.3f)
                curveToRelative(0.2f, 0.52f, 0.8f, 0.76f, 1.3f, 0.56f)
                curveToRelative(2.77f, -1.1f, 5.21f, -2.71f, 7.27f, -4.8f)
                curveToRelative(0.33f, -0.33f, 0.38f, -0.85f, 0.13f, -1.24f)
                curveToRelative(-0.01f, -0.01f, -0.77f, -1.23f, -0.77f, -2.89f)
                curveToRelative(0f, -4.43f, 1.57f, -6.0f, 6.0f, -6.0f)
                curveToRelative(3.87f, 0f, 5.67f, 1.52f, 6.0f, 5.09f)
                curveToRelative(0.05f, 0.51f, 0.48f, 0.91f, 1.0f, 0.91f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.52f, -0.0f, 0.95f, -0.4f, 0.99f, -0.92f)
                curveToRelative(0.03f, -0.39f, 0.0f, -1.91f, 0.0f, -2.08f)
                close()
                moveTo(14.99f, 6.0f)
                curveToRelative(-5.53f, 0f, -8.0f, 2.47f, -8.0f, 8.0f)
                curveToRelative(0f, 1.38f, 0.39f, 2.53f, 0.7f, 3.23f)
                curveToRelative(-0.13f, 0.12f, -0.26f, 0.24f, -0.39f, 0.35f)
                curveToRelative(-1.6f, -1.17f, -2.31f, -3.22f, -2.31f, -6.58f)
                curveToRelative(0f, -5.9f, 2.09f, -8.0f, 8.0f, -8.0f)
                curveToRelative(4.67f, 0f, 6.95f, 1.31f, 7.7f, 4.77f)
                curveToRelative(-1.34f, -1.18f, -3.24f, -1.77f, -5.71f, -1.77f)
                close()
            }
        }.also { _Sickle = it}
