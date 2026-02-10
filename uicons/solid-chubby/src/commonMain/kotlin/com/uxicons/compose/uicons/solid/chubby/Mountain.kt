package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Sc.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.41f, 8.12f)
                curveToRelative(2.65f, -4.54f, 4.64f, -6.57f, 4.89f, -6.81f)
                curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0f)
                curveToRelative(0.24f, 0.24f, 2.13f, 2.16f, 4.67f, 6.44f)
                curveToRelative(-0.45f, 2.39f, -1.59f, 4.42f, -2.36f, 5.56f)
                curveToRelative(-0.41f, -0.58f, -0.77f, -1.17f, -1.07f, -1.76f)
                curveToRelative(-0.17f, -0.34f, -0.54f, -0.53f, -0.91f, -0.55f)
                curveToRelative(-0.39f, 0.01f, -0.73f, 0.24f, -0.89f, 0.59f)
                curveToRelative(-0.49f, 1.08f, -1.06f, 2.05f, -1.72f, 2.94f)
                curveToRelative(-1.03f, -1.1f, -2.88f, -3.37f, -4.01f, -6.41f)
                close()
                moveTo(22.88f, 20.77f)
                curveToRelative(-0.29f, -1.4f, -1.39f, -5.49f, -4.1f, -10.54f)
                curveToRelative(-1.08f, 3.13f, -2.9f, 5.27f, -3.0f, 5.39f)
                curveToRelative(-0.38f, 0.47f, -1.16f, 0.45f, -1.53f, -0.02f)
                curveToRelative(-0.42f, -0.51f, -0.8f, -1.02f, -1.15f, -1.54f)
                curveToRelative(-0.54f, 0.94f, -1.16f, 1.81f, -1.85f, 2.6f)
                curveToRelative(-0.34f, 0.41f, -1.02f, 0.46f, -1.42f, 0.1f)
                curveToRelative(-0.14f, -0.12f, -2.82f, -2.51f, -4.67f, -6.43f)
                curveToRelative(-2.72f, 5.11f, -3.74f, 9.0f, -4.05f, 10.44f)
                curveToRelative(-0.13f, 0.53f, 0.25f, 1.1f, 0.79f, 1.19f)
                curveToRelative(1.64f, 0.32f, 5.9f, 1.05f, 10.09f, 1.05f)
                reflectiveCurveToRelative(8.45f, -0.74f, 10.09f, -1.05f)
                curveToRelative(0.54f, -0.09f, 0.91f, -0.66f, 0.79f, -1.19f)
                close()
            }
        }.also { _Mountain = it}
