package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Br.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.38f, 1.29f)
            curveToRelative(-0.6f, -0.82f, -1.54f, -1.29f, -2.55f, -1.29f)
            horizontalLineToRelative(-3.23f)
            curveTo(5.8f, 0f, 1.6f, 7.93f, 1.15f, 8.84f)
            curveToRelative(-0.28f, 0.57f, -0.17f, 1.25f, 0.27f, 1.71f)
            curveToRelative(0.45f, 0.45f, 1.13f, 0.58f, 1.7f, 0.31f)
            lineToRelative(0.3f, -0.14f)
            curveToRelative(1.74f, -0.81f, 3.71f, -1.72f, 6.05f, -1.72f)
            horizontalLineToRelative(8.7f)
            lineToRelative(-1.26f, 4f)
            horizontalLineToRelative(-4.42f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.47f)
            lineToRelative(-1.9f, 6.05f)
            curveToRelative(-0.25f, 0.79f, 0.19f, 1.63f, 0.98f, 1.88f)
            curveToRelative(0.15f, 0.05f, 0.3f, 0.07f, 0.45f, 0.07f)
            curveToRelative(0.64f, 0f, 1.23f, -0.41f, 1.43f, -1.05f)
            lineToRelative(5.93f, -18.84f)
            curveToRelative(0.3f, -0.97f, 0.12f, -2.0f, -0.48f, -2.82f)
            close()
            moveTo(20.0f, 3.22f)
            lineToRelative(-0.88f, 2.78f)
            horizontalLineToRelative(-9.64f)
            curveToRelative(-0.85f, 0f, -1.65f, 0.09f, -2.4f, 0.24f)
            curveToRelative(2.02f, -1.67f, 5.09f, -3.24f, 9.52f, -3.24f)
            horizontalLineToRelative(3.23f)
            curveToRelative(0.02f, 0f, 0.09f, 0f, 0.14f, 0.07f)
            reflectiveCurveToRelative(0.03f, 0.14f, 0.03f, 0.15f)
            close()
        }
    }.also { _Scythe = it }
