package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Student: ImageVector? = null

val Icons.Sc.Student: ImageVector
    get() = _Student ?: UXIcon(name = "Student") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.99f)
                curveToRelative(-1.83f, 0.72f, -3.79f, 1.23f, -5.88f, 1.48f)
                curveToRelative(-0.08f, 0.01f, -0.16f, 0.01f, -0.24f, 0f)
                curveToRelative(-3.05f, -0.37f, -5.87f, -1.25f, -8.36f, -2.62f)
                curveToRelative(-0.32f, -0.17f, -0.52f, -0.51f, -0.52f, -0.88f)
                reflectiveCurveToRelative(0.2f, -0.7f, 0.52f, -0.88f)
                curveToRelative(2.49f, -1.36f, 5.31f, -2.25f, 8.36f, -2.62f)
                curveToRelative(0.08f, -0.01f, 0.16f, -0.01f, 0.24f, 0f)
                curveToRelative(3.05f, 0.37f, 5.87f, 1.25f, 8.36f, 2.62f)
                curveToRelative(0.32f, 0.17f, 0.52f, 0.51f, 0.52f, 0.88f)
                close()
                moveTo(17f, 9f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(-1.48f, 0.46f, -3.03f, 0.79f, -4.64f, 0.98f)
                curveToRelative(-0.24f, 0.03f, -0.48f, 0.03f, -0.72f, 0f)
                curveToRelative(-1.61f, -0.2f, -3.16f, -0.53f, -4.64f, -0.98f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 3.41f, 1.59f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.59f, 5f, -5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.89f, 0f, -6.83f, 0.55f, -7.79f, 5.3f)
                curveToRelative(-0.12f, 0.53f, 0.27f, 1.1f, 0.81f, 1.18f)
                curveToRelative(0.12f, 0.02f, 2.94f, 0.52f, 6.99f, 0.52f)
                reflectiveCurveToRelative(6.87f, -0.49f, 6.99f, -0.52f)
                curveToRelative(0.54f, -0.08f, 0.92f, -0.65f, 0.81f, -1.18f)
                curveToRelative(-0.96f, -4.75f, -4.91f, -5.3f, -7.79f, -5.3f)
                close()
            }
        }.also { _Student = it}
