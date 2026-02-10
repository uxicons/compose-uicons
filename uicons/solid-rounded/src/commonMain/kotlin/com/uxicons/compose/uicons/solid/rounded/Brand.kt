package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Sr.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.41f, 4.83f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.12f, 3.12f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(14.56f, 17.85f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(3.23f, -3.23f)
                lineToRelative(-1.09f, -1.09f)
                lineToRelative(-3.23f, 3.23f)
                close()
                moveTo(22.6f, 19.35f)
                lineToRelative(-3.21f, 3.24f)
                curveToRelative(-0.91f, 0.92f, -2.12f, 1.43f, -3.41f, 1.43f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.28f, 0f, -2.49f, -0.5f, -3.4f, -1.4f)
                lineTo(3.85f, 13.98f)
                curveToRelative(-0.81f, -0.81f, -1.23f, -1.92f, -1.14f, -3.06f)
                lineToRelative(0.7f, -6.09f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(-0.04f, 0.16f, -0.07f, 0.33f, -0.07f, 0.51f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.03f, -0.51f, 0.07f)
                lineToRelative(-3.66f, -3.66f)
                lineToRelative(5.8f, -0.65f)
                curveToRelative(1.18f, -0.15f, 2.38f, 0.26f, 3.22f, 1.09f)
                lineToRelative(8.73f, 8.67f)
                curveToRelative(1.89f, 1.88f, 1.9f, 4.94f, 0.03f, 6.83f)
                close()
                moveTo(21f, 15.0f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-4.65f, 4.65f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.65f, -4.65f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _Brand = it}
