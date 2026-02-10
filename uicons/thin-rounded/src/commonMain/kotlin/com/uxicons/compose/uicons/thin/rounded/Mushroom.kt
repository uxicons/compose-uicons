package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Tr.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.07f, 0f, 11.3f)
                curveToRelative(0f, 2.56f, 1.76f, 3.7f, 3.5f, 3.7f)
                curveToRelative(1.02f, 0f, 2.03f, -0.56f, 3.2f, -1.22f)
                curveToRelative(0.36f, -0.2f, 0.74f, -0.41f, 1.13f, -0.61f)
                curveToRelative(-0.57f, 2.52f, -0.83f, 4.74f, -0.83f, 5.83f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.09f, -0.26f, -3.32f, -0.83f, -5.83f)
                curveToRelative(0.39f, 0.2f, 0.77f, 0.41f, 1.13f, 0.61f)
                curveToRelative(1.17f, 0.66f, 2.18f, 1.22f, 3.2f, 1.22f)
                curveToRelative(2.19f, 0f, 3.5f, -1.38f, 3.5f, -3.7f)
                curveTo(24f, 5.07f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(16f, 19f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.14f, 0.31f, -3.62f, 0.98f, -6.37f)
                curveToRelative(0.91f, -0.37f, 1.91f, -0.63f, 3.02f, -0.63f)
                reflectiveCurveToRelative(2.11f, 0.26f, 3.02f, 0.63f)
                curveToRelative(0.68f, 2.75f, 0.98f, 5.23f, 0.98f, 6.37f)
                close()
                moveTo(20.5f, 14f)
                curveToRelative(-0.76f, 0f, -1.66f, -0.51f, -2.71f, -1.09f)
                curveToRelative(-1.52f, -0.85f, -3.41f, -1.91f, -5.79f, -1.91f)
                reflectiveCurveToRelative(-4.27f, 1.06f, -5.79f, 1.91f)
                curveToRelative(-1.05f, 0.59f, -1.96f, 1.09f, -2.71f, 1.09f)
                curveToRelative(-1.21f, 0f, -2.5f, -0.71f, -2.5f, -2.7f)
                curveTo(1f, 5.62f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.62f, 11f, 10.3f)
                curveToRelative(0f, 2.35f, -1.57f, 2.7f, -2.5f, 2.7f)
                close()
            }
        }.also { _Mushroom = it}
