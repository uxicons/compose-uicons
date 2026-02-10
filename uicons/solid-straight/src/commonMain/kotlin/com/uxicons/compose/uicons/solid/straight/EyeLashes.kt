package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeLashes: ImageVector? = null

val Icons.Ss.EyeLashes: ImageVector
    get() = _EyeLashes ?: UXIcon(name = "EyeLashes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(23.82f, 14.82f)
                curveToRelative(-0.88f, 1.92f, -4.33f, 8.18f, -11.82f, 8.18f)
                reflectiveCurveToRelative(-10.94f, -6.26f, -11.82f, -8.18f)
                curveToRelative(-0.24f, -0.52f, -0.24f, -1.12f, 0f, -1.64f)
                curveToRelative(0.41f, -0.9f, 1.4f, -2.76f, 3.1f, -4.48f)
                lineToRelative(-2.68f, -3.35f)
                lineToRelative(1.56f, -1.25f)
                lineToRelative(2.63f, 3.29f)
                curveToRelative(0.63f, -0.47f, 1.32f, -0.9f, 2.1f, -1.26f)
                lineToRelative(-1.33f, -3.89f)
                lineToRelative(1.89f, -0.65f)
                lineToRelative(1.32f, 3.85f)
                curveToRelative(0.7f, -0.19f, 1.44f, -0.33f, 2.24f, -0.39f)
                verticalLineToRelative(-4.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.05f)
                curveToRelative(0.8f, 0.06f, 1.54f, 0.2f, 2.24f, 0.39f)
                lineToRelative(1.31f, -3.85f)
                lineToRelative(1.89f, 0.65f)
                lineToRelative(-1.33f, 3.89f)
                curveToRelative(0.77f, 0.36f, 1.47f, 0.79f, 2.1f, 1.27f)
                lineToRelative(2.63f, -3.29f)
                lineToRelative(1.56f, 1.25f)
                lineToRelative(-2.68f, 3.35f)
                curveToRelative(1.7f, 1.72f, 2.69f, 3.57f, 3.1f, 4.48f)
                curveToRelative(0.24f, 0.52f, 0.24f, 1.12f, 0f, 1.64f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _EyeLashes = it}
