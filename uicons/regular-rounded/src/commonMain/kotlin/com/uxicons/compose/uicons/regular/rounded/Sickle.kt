package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Rr.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.82f, 2.97f)
                curveTo(17.77f, 0.98f, 15.07f, -0.08f, 12.2f, 0.0f)
                horizontalLineToRelative(0f)
                curveTo(6.68f, 0.16f, 2.11f, 4.77f, 2.0f, 10.29f)
                curveToRelative(-0.06f, 3.05f, 1.22f, 5.96f, 3.47f, 7.98f)
                lineToRelative(-4.02f, 4.02f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(5.3f, -5.3f)
                curveToRelative(0.59f, -0.59f, 0.76f, -1.48f, 0.42f, -2.21f)
                curveToRelative(-0.54f, -1.17f, -0.71f, -2.47f, -0.5f, -3.76f)
                curveToRelative(0.47f, -2.91f, 2.95f, -5.19f, 5.9f, -5.41f)
                curveToRelative(3.27f, -0.25f, 6.22f, 1.98f, 6.88f, 5.18f)
                curveToRelative(0.1f, 0.47f, 0.53f, 0.8f, 1.0f, 0.8f)
                curveToRelative(0.49f, 0f, 0.91f, -0.36f, 0.99f, -0.84f)
                curveToRelative(0.1f, -0.6f, 0.14f, -1.14f, 0.14f, -1.66f)
                curveToRelative(0f, -2.86f, -1.13f, -5.53f, -3.18f, -7.53f)
                close()
                moveTo(13.84f, 5.03f)
                curveToRelative(-3.86f, 0.29f, -7.11f, 3.27f, -7.72f, 7.09f)
                curveToRelative(-0.25f, 1.53f, -0.08f, 3.08f, 0.47f, 4.47f)
                curveToRelative(-1.68f, -1.63f, -2.63f, -3.89f, -2.58f, -6.25f)
                curveToRelative(0.09f, -4.47f, 3.79f, -8.2f, 8.25f, -8.33f)
                curveToRelative(2.32f, -0.06f, 4.51f, 0.79f, 6.17f, 2.4f)
                curveToRelative(0.89f, 0.87f, 1.57f, 1.89f, 2.0f, 3.02f)
                curveToRelative(-1.7f, -1.65f, -4.07f, -2.58f, -6.59f, -2.4f)
                close()
            }
        }.also { _Sickle = it}
