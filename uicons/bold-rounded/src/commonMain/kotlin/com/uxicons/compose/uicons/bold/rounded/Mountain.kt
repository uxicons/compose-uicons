package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Br.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.58f, 18.68f)
            lineTo(14.84f, 1.75f)
            curveTo(14.28f, 0.7f, 13.19f, 0.04f, 12f, 0.04f)
            reflectiveCurveToRelative(-2.28f, 0.66f, -2.85f, 1.73f)
            lineTo(0.42f, 18.67f)
            curveToRelative(-0.6f, 1.13f, -0.56f, 2.47f, 0.1f, 3.57f)
            curveToRelative(0.66f, 1.1f, 1.83f, 1.76f, 3.11f, 1.76f)
            horizontalLineToRelative(16.73f)
            curveToRelative(1.29f, 0f, 2.45f, -0.66f, 3.11f, -1.76f)
            curveToRelative(0.66f, -1.1f, 0.7f, -2.44f, 0.1f, -3.56f)
            close()
            moveTo(20.91f, 20.69f)
            curveToRelative(-0.07f, 0.12f, -0.23f, 0.31f, -0.54f, 0.31f)
            lineTo(3.64f, 21f)
            curveToRelative(-0.31f, 0f, -0.47f, -0.19f, -0.54f, -0.31f)
            reflectiveCurveToRelative(-0.16f, -0.35f, -0.02f, -0.62f)
            curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
            lineToRelative(4.81f, -9.32f)
            lineToRelative(1.78f, 2.82f)
            curveToRelative(0.38f, 0.6f, 1.25f, 0.6f, 1.63f, -0.0f)
            lineToRelative(1.69f, -2.7f)
            lineToRelative(0.98f, 1.62f)
            curveToRelative(0.38f, 0.62f, 1.29f, 0.62f, 1.65f, -0.01f)
            lineToRelative(0.72f, -1.23f)
            lineToRelative(4.57f, 8.85f)
            curveToRelative(0.15f, 0.28f, 0.05f, 0.51f, -0.02f, 0.62f)
            close()
        }
    }.also { _Mountain = it }
