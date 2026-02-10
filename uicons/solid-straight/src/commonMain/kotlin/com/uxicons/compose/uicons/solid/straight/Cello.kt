package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cello: ImageVector? = null

val Icons.Ss.Cello: ImageVector
    get() = _Cello ?: UXIcon(name = "Cello") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.71f, 15.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(8.22f, -8.22f)
                curveToRelative(-1.6f, -1.29f, -3.64f, -2.08f, -5.86f, -2.08f)
                curveToRelative(-0.74f, 0f, -1.5f, 0.11f, -2.27f, 0.34f)
                lineToRelative(-0.72f, 0.21f)
                lineToRelative(-0.01f, 0.75f)
                curveToRelative(-0.01f, 1.25f, -0.5f, 2.44f, -1.39f, 3.32f)
                curveToRelative(-1.07f, 1.07f, -2.61f, 1.57f, -4.11f, 1.33f)
                lineToRelative(-0.71f, -0.12f)
                lineToRelative(-0.33f, 0.64f)
                curveToRelative(-0.73f, 1.39f, -1.11f, 2.84f, -1.11f, 4.19f)
                curveToRelative(0f, 2.22f, 0.78f, 4.25f, 2.08f, 5.86f)
                lineToRelative(3.72f, -3.72f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.72f, 3.72f)
                curveToRelative(1.6f, 1.29f, 3.64f, 2.08f, 5.86f, 2.08f)
                curveToRelative(1.37f, 0f, 2.83f, -0.39f, 4.24f, -1.14f)
                lineToRelative(0.66f, -0.35f)
                lineToRelative(-0.15f, -0.73f)
                curveToRelative(-0.32f, -1.57f, 0.16f, -3.18f, 1.29f, -4.3f)
                curveToRelative(0.9f, -0.9f, 2.1f, -1.38f, 3.38f, -1.39f)
                lineToRelative(0.78f, 0.01f)
                lineToRelative(0.19f, -0.76f)
                curveToRelative(0.17f, -0.67f, 0.26f, -1.34f, 0.26f, -1.98f)
                curveToRelative(0f, -2.22f, -0.78f, -4.25f, -2.08f, -5.86f)
                lineToRelative(-8.22f, 8.22f)
                close()
                moveTo(17.93f, 7.49f)
                lineToRelative(6.06f, -6.06f)
                lineTo(22.57f, 0.01f)
                lineToRelative(-6.06f, 6.06f)
                curveToRelative(0.52f, 0.42f, 0.99f, 0.89f, 1.41f, 1.41f)
                close()
                moveTo(2.08f, 20.51f)
                lineTo(0.04f, 22.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.04f, -2.04f)
                curveToRelative(-0.52f, -0.42f, -0.99f, -0.89f, -1.41f, -1.41f)
                close()
            }
        }.also { _Cello = it}
