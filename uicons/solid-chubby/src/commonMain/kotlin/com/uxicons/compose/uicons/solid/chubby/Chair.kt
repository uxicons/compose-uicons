package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Sc.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.93f, 13.53f)
                curveToRelative(0.24f, -1.08f, 0.36f, -2.3f, 0.36f, -3.74f)
                curveToRelative(-0.0f, -6.34f, -2.32f, -9.29f, -7.29f, -9.29f)
                curveToRelative(-4.9f, 0f, -7.29f, 3.04f, -7.29f, 9.29f)
                curveToRelative(0f, 1.45f, 0.12f, 2.67f, 0.35f, 3.75f)
                curveToRelative(-1.26f, 1.11f, -1.83f, 2.51f, -2.05f, 3.79f)
                curveToRelative(-0.05f, 0.29f, 0.03f, 0.59f, 0.22f, 0.81f)
                curveToRelative(0.19f, 0.23f, 0.47f, 0.35f, 0.77f, 0.35f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.29f, 0f, 0.57f, -0.13f, 0.76f, -0.35f)
                reflectiveCurveToRelative(0.27f, -0.52f, 0.22f, -0.81f)
                curveToRelative(-0.22f, -1.29f, -0.79f, -2.69f, -2.06f, -3.8f)
                close()
                moveTo(9f, 11.77f)
                curveToRelative(-0.41f, 0.08f, -0.79f, 0.17f, -1.15f, 0.28f)
                curveToRelative(-0.09f, -0.67f, -0.14f, -1.42f, -0.14f, -2.25f)
                curveToRelative(0f, -2.89f, 0.5f, -4.46f, 1.29f, -5.32f)
                close()
                moveTo(13f, 11.53f)
                curveToRelative(-0.32f, -0.02f, -0.65f, -0.03f, -1f, -0.03f)
                reflectiveCurveToRelative(-0.68f, 0.01f, -1f, 0.03f)
                verticalLineToRelative(-7.98f)
                curveToRelative(0.32f, -0.04f, 0.66f, -0.05f, 1f, -0.05f)
                reflectiveCurveToRelative(0.68f, 0.01f, 1f, 0.05f)
                verticalLineToRelative(7.98f)
                close()
                moveTo(16.14f, 12.04f)
                curveToRelative(-0.35f, -0.11f, -0.74f, -0.2f, -1.14f, -0.28f)
                verticalLineToRelative(-7.29f)
                curveToRelative(0.78f, 0.85f, 1.29f, 2.42f, 1.29f, 5.32f)
                curveToRelative(0f, 0.83f, -0.05f, 1.58f, -0.14f, 2.25f)
                close()
            }
        }.also { _Chair = it}
