package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Sc.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(-2.69f, 0f, -4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                reflectiveCurveToRelative(-1.31f, 4f, -4f, 4f)
                close()
                moveTo(12f, 12.8f)
                curveToRelative(0.6f, -0.41f, 1.67f, -1.15f, 2.9f, -2.11f)
                curveToRelative(-1.22f, -1.02f, -1.9f, -2.6f, -1.9f, -4.69f)
                curveToRelative(0f, -0.73f, 0.1f, -1.37f, 0.26f, -1.98f)
                curveToRelative(-0.41f, -0.01f, -0.82f, -0.02f, -1.26f, -0.02f)
                curveToRelative(-5.04f, 0f, -8.03f, 0.73f, -8.99f, 1.02f)
                curveToRelative(0.62f, 0.72f, 1.24f, 1.39f, 1.84f, 1.99f)
                curveToRelative(2.67f, 2.67f, 5.89f, 4.94f, 7.15f, 5.79f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-0.79f, 0f, -1.49f, -0.12f, -2.14f, -0.3f)
                curveToRelative(-2.29f, 1.83f, -4.2f, 3.06f, -4.32f, 3.14f)
                curveToRelative(-0.33f, 0.21f, -0.75f, 0.21f, -1.08f, 0f)
                curveToRelative(-0.18f, -0.12f, -4.5f, -2.89f, -8.02f, -6.42f)
                curveToRelative(-0.54f, -0.54f, -1.1f, -1.15f, -1.66f, -1.78f)
                curveToRelative(-0.32f, 1.17f, -0.78f, 3.39f, -0.78f, 6.36f)
                curveToRelative(0f, 4.4f, 1.02f, 7.17f, 1.06f, 7.28f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.49f, 0.6f, 0.59f)
                curveToRelative(0.13f, 0.05f, 3.23f, 1.12f, 9.34f, 1.12f)
                reflectiveCurveToRelative(9.21f, -1.08f, 9.34f, -1.12f)
                curveToRelative(0.28f, -0.1f, 0.5f, -0.32f, 0.6f, -0.59f)
                curveToRelative(0.04f, -0.12f, 1.06f, -2.89f, 1.06f, -7.28f)
                curveToRelative(0f, -0.78f, -0.03f, -1.5f, -0.09f, -2.16f)
                curveToRelative(-0.99f, 0.75f, -2.29f, 1.16f, -3.92f, 1.16f)
                close()
            }
        }.also { _EnvelopeDot = it}
