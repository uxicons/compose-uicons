package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Sc.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                curveToRelative(0f, 2.75f, -3.23f, 5.57f, -5f, 6.8f)
                curveToRelative(-1.77f, -1.23f, -5f, -4.06f, -5f, -6.8f)
                curveToRelative(0f, -3.74f, 1.26f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.26f, 5f, 5f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.5f, -1.07f, 5.2f, -3.27f, 8.21f)
                curveToRelative(0.8f, 0.15f, 1.77f, 0.42f, 2.72f, 0.9f)
                curveToRelative(0.41f, 0.21f, 0.63f, 0.67f, 0.53f, 1.12f)
                curveToRelative(-0.11f, 0.45f, -0.51f, 0.77f, -0.97f, 0.77f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.46f, 0f, -0.87f, -0.32f, -0.97f, -0.77f)
                curveToRelative(-0.11f, -0.45f, 0.11f, -0.92f, 0.53f, -1.12f)
                curveToRelative(0.94f, -0.47f, 1.92f, -0.74f, 2.72f, -0.9f)
                curveToRelative(-2.2f, -3.01f, -3.27f, -5.71f, -3.27f, -8.21f)
                curveToRelative(0f, -7.71f, 3.29f, -11f, 11f, -11f)
                curveToRelative(5.55f, 0f, 10.03f, 0.98f, 10.22f, 1.02f)
                curveToRelative(0.46f, 0.1f, 0.78f, 0.51f, 0.78f, 0.98f)
                curveToRelative(0f, 0.06f, -0.01f, 1.55f, -0.51f, 4.45f)
                curveToRelative(0.34f, 1.29f, 0.51f, 2.78f, 0.51f, 4.55f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -4.84f, -2.16f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 2.16f, -7f, 7f)
                curveToRelative(0f, 4.79f, 6.21f, 8.69f, 6.47f, 8.85f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.15f, 0.53f, 0.15f)
                reflectiveCurveToRelative(0.36f, -0.05f, 0.53f, -0.15f)
                curveToRelative(0.27f, -0.16f, 6.47f, -4.06f, 6.47f, -8.85f)
                close()
            }
        }.also { _HoodCloak = it}
