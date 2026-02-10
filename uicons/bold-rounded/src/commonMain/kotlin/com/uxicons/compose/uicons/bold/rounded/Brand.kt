package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Br.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.31f, 11.41f)
            lineToRelative(-7.42f, -7.44f)
            curveToRelative(-1.25f, -1.25f, -3.05f, -1.85f, -4.84f, -1.61f)
            lineToRelative(-4.8f, 0.78f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.03f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.14f, 1.98f, 0.44f, 2.56f)
            lineToRelative(2.63f, 2.63f)
            lineToRelative(-0.72f, 5.17f)
            curveToRelative(-0.14f, 1.69f, 0.48f, 3.34f, 1.68f, 4.53f)
            lineToRelative(7.44f, 7.45f)
            curveToRelative(1.08f, 1.08f, 2.52f, 1.67f, 4.05f, 1.67f)
            horizontalLineToRelative(0.02f)
            curveToRelative(1.53f, -0.01f, 2.98f, -0.61f, 4.06f, -1.7f)
            lineToRelative(2.75f, -2.78f)
            curveToRelative(2.23f, -2.25f, 2.21f, -5.89f, -0.03f, -8.11f)
            close()
            moveTo(20.21f, 17.41f)
            lineToRelative(-2.75f, 2.78f)
            curveToRelative(-0.52f, 0.52f, -1.21f, 0.81f, -1.94f, 0.81f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-0.73f, 0f, -1.42f, -0.28f, -1.93f, -0.79f)
            lineToRelative(-7.44f, -7.45f)
            curveToRelative(-0.57f, -0.57f, -0.87f, -1.36f, -0.81f, -2.08f)
            lineToRelative(0.4f, -2.84f)
            lineToRelative(1.31f, 1.31f)
            curveToRelative(-0.02f, 0.11f, -0.04f, 0.23f, -0.04f, 0.34f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            curveToRelative(-0.12f, 0f, -0.23f, 0.02f, -0.34f, 0.04f)
            lineToRelative(-1.29f, -1.29f)
            lineToRelative(2.62f, -0.42f)
            curveToRelative(0.85f, -0.11f, 1.69f, 0.17f, 2.29f, 0.77f)
            lineToRelative(7.42f, 7.44f)
            curveToRelative(1.07f, 1.06f, 1.08f, 2.81f, 0.01f, 3.88f)
            close()
            moveTo(17.56f, 13.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(2f, -2f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            close()
        }
    }.also { _Brand = it }
