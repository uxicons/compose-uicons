package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Sc.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.59f)
                curveToRelative(-0.25f, 0.09f, -0.53f, 0.11f, -0.81f, 0.06f)
                curveToRelative(-0.81f, -0.17f, -1.33f, -0.96f, -1.16f, -1.77f)
                curveToRelative(0.34f, -1.61f, 1.51f, -2.79f, 3.14f, -3.16f)
                curveToRelative(0.45f, -0.1f, 0.91f, 0.01f, 1.27f, 0.29f)
                curveToRelative(0.36f, 0.28f, 0.56f, 0.71f, 0.56f, 1.17f)
                close()
                moveTo(15.11f, 5.13f)
                curveToRelative(-0.76f, -0.34f, -1.64f, 0.0f, -1.98f, 0.76f)
                curveToRelative(-0.01f, 0.03f, -1.44f, 3.19f, -4.63f, 7.28f)
                curveToRelative(-3.17f, -4.06f, -4.61f, -7.24f, -4.63f, -7.28f)
                curveToRelative(-0.34f, -0.76f, -1.22f, -1.1f, -1.98f, -0.76f)
                curveToRelative(-0.76f, 0.34f, -1.1f, 1.22f, -0.76f, 1.98f)
                curveToRelative(0.05f, 0.12f, 1.75f, 3.87f, 5.41f, 8.41f)
                curveToRelative(-2.73f, 3.07f, -4.92f, 4.76f, -4.95f, 4.79f)
                curveToRelative(-0.66f, 0.5f, -0.79f, 1.44f, -0.28f, 2.1f)
                curveToRelative(0.51f, 0.66f, 1.45f, 0.78f, 2.1f, 0.28f)
                curveToRelative(0.11f, -0.09f, 2.3f, -1.76f, 5.09f, -4.86f)
                curveToRelative(2.79f, 3.1f, 4.97f, 4.78f, 5.09f, 4.86f)
                curveToRelative(0.65f, 0.5f, 1.6f, 0.38f, 2.1f, -0.28f)
                curveToRelative(0.5f, -0.66f, 0.38f, -1.6f, -0.28f, -2.1f)
                curveToRelative(-0.03f, -0.02f, -2.21f, -1.71f, -4.94f, -4.78f)
                curveToRelative(3.68f, -4.6f, 5.34f, -8.26f, 5.41f, -8.41f)
                curveToRelative(0.34f, -0.76f, -0.0f, -1.64f, -0.76f, -1.98f)
                close()
            }
        }.also { _Superscript = it}
