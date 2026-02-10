package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Sc.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 3.5f)
                curveToRelative(0f, 1.79f, -0.71f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.71f, -2.5f, -2.5f)
                reflectiveCurveToRelative(0.71f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.71f, 2.5f, 2.5f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-6.74f, 0f, -10.2f, 0.82f, -11f, 1.05f)
                verticalLineToRelative(2.95f)
                curveToRelative(0f, 0.43f, 0.28f, 0.81f, 0.68f, 0.95f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 10.32f, 1.05f)
                reflectiveCurveToRelative(10.19f, -1.01f, 10.32f, -1.05f)
                curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f)
                verticalLineToRelative(-2.95f)
                curveToRelative(-0.8f, -0.22f, -4.26f, -1.04f, -11f, -1.04f)
                close()
                moveTo(23.0f, 15.52f)
                curveToRelative(0.05f, -2.4f, -1.15f, -4.74f, -3.78f, -7.37f)
                curveToRelative(-0.52f, -0.52f, -1.87f, -1.86f, -2.97f, -2.93f)
                curveToRelative(-0.15f, -0.51f, -0.25f, -1.08f, -0.25f, -1.73f)
                curveToRelative(0f, -0.97f, 0.2f, -1.79f, 0.55f, -2.46f)
                curveToRelative(-0.18f, -0.01f, -0.36f, -0.04f, -0.55f, -0.04f)
                curveToRelative(-4.78f, 0f, -8.78f, 4.0f, -11.17f, 6.39f)
                curveToRelative(-2.36f, 2.28f, -3.85f, 5.34f, -3.83f, 8.0f)
                verticalLineToRelative(0.59f)
                curveToRelative(1.47f, -0.35f, 4.97f, -0.98f, 11f, -0.98f)
                reflectiveCurveToRelative(9.53f, 0.63f, 11.0f, 0.98f)
                close()
            }
        }.also { _HatSanta = it}
