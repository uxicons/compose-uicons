package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Ss.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-3.85f, 1.45f)
                curveToRelative(-0.98f, 1.53f, -2.69f, 2.56f, -4.64f, 2.56f)
                curveToRelative(-3.04f, 0f, -5.5f, -2.46f, -5.5f, -5.5f)
                reflectiveCurveTo(12.46f, 0f, 15.5f, 0f)
                curveToRelative(2.63f, 0f, 4.84f, 1.85f, 5.37f, 4.33f)
                lineToRelative(3.13f, 1.17f)
                close()
                moveTo(13.5f, 17f)
                curveToRelative(-1.03f, 0f, -2.69f, 0.96f, -3.98f, 1.89f)
                curveToRelative(0.98f, 0.51f, 2.46f, 1.11f, 3.98f, 1.11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.65f, 10.95f)
                curveToRelative(1.15f, 1.55f, 2.35f, 3.74f, 2.35f, 5.75f)
                curveToRelative(0f, 4.74f, -3.81f, 7.3f, -7.41f, 7.3f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(-3.21f, 0f, -5.92f, -1.37f, -7.42f, -3.77f)
                curveToRelative(-1.6f, -2.55f, -1.63f, -5.96f, -0.1f, -9.13f)
                lineToRelative(0.71f, -1.47f)
                reflectiveCurveToRelative(1.87f, 3.36f, 3.16f, 3.36f)
                curveToRelative(1.03f, 0f, 3.09f, -1.48f, 4.6f, -2.87f)
                curveToRelative(1.37f, 1.75f, 3.51f, 2.87f, 5.9f, 2.87f)
                curveToRelative(1.99f, 0f, 3.81f, -0.78f, 5.15f, -2.05f)
                close()
                moveTo(17f, 18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-2.55f, 0f, -6.01f, 2.91f, -6.4f, 3.24f)
                lineToRelative(-0.96f, 0.82f)
                lineToRelative(1.02f, 0.74f)
                curveToRelative(0.12f, 0.09f, 3.05f, 2.19f, 6.34f, 2.19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _Duck = it}
