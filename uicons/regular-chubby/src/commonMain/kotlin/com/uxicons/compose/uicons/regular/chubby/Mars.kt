package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Rc.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.53f, 2.15f)
                curveToRelative(-0.1f, -0.3f, -0.34f, -0.53f, -0.64f, -0.63f)
                curveToRelative(-0.14f, -0.04f, -3.4f, -1.09f, -6.58f, 0.11f)
                curveToRelative(-0.52f, 0.2f, -0.78f, 0.77f, -0.58f, 1.29f)
                curveToRelative(0.2f, 0.52f, 0.78f, 0.78f, 1.29f, 0.58f)
                curveToRelative(1.24f, -0.47f, 2.52f, -0.5f, 3.52f, -0.4f)
                lineToRelative(-5.39f, 5.36f)
                curveToRelative(-3.48f, -2.89f, -7.08f, -2.67f, -10.46f, 0.67f)
                curveToRelative(-3.57f, 3.61f, -3.57f, 7.47f, 0.03f, 11.21f)
                curveToRelative(1.83f, 1.76f, 3.73f, 2.64f, 5.63f, 2.64f)
                reflectiveCurveToRelative(3.78f, -0.88f, 5.57f, -2.64f)
                curveToRelative(3.29f, -3.33f, 3.5f, -7.01f, 0.64f, -10.46f)
                lineToRelative(5.4f, -5.37f)
                curveToRelative(0.09f, 0.98f, 0.07f, 2.26f, -0.41f, 3.5f)
                curveToRelative(-0.2f, 0.52f, 0.06f, 1.09f, 0.58f, 1.29f)
                curveToRelative(0.12f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                curveToRelative(0.4f, 0f, 0.78f, -0.24f, 0.94f, -0.64f)
                curveToRelative(1.21f, -3.17f, 0.15f, -6.42f, 0.11f, -6.56f)
                close()
                moveTo(13.51f, 18.91f)
                curveToRelative(-2.79f, 2.75f, -5.54f, 2.74f, -8.38f, 0f)
                curveToRelative(-2.84f, -2.94f, -2.85f, -5.53f, -0.03f, -8.38f)
                curveToRelative(1.43f, -1.41f, 2.79f, -2.11f, 4.16f, -2.11f)
                reflectiveCurveToRelative(2.76f, 0.71f, 4.24f, 2.12f)
                curveToRelative(2.79f, 2.9f, 2.8f, 5.56f, 0.02f, 8.36f)
                close()
            }
        }.also { _Mars = it}
