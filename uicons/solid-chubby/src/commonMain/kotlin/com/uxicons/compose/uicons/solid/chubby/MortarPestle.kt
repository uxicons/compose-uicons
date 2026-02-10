package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MortarPestle: ImageVector? = null

val Icons.Sc.MortarPestle: ImageVector
    get() = _MortarPestle ?: UXIcon(name = "MortarPestle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 10f)
                verticalLineToRelative(2.77f)
                curveToRelative(0f, 2.31f, -1.48f, 4.92f, -4.29f, 5.86f)
                curveToRelative(-0.12f, 1.44f, -0.53f, 2.89f, -0.55f, 2.96f)
                curveToRelative(-0.09f, 0.32f, -0.33f, 0.56f, -0.64f, 0.67f)
                curveToRelative(-0.09f, 0.03f, -2.2f, 0.74f, -5.52f, 0.74f)
                reflectiveCurveToRelative(-5.44f, -0.71f, -5.52f, -0.74f)
                curveToRelative(-0.28f, -0.1f, -0.5f, -0.31f, -0.61f, -0.58f)
                curveToRelative(-0.03f, -0.07f, -0.23f, -0.63f, -0.44f, -1.68f)
                horizontalLineToRelative(7.57f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-9.01f)
                curveToRelative(-1.9f, -1.19f, -3.0f, -3.25f, -3.0f, -5.23f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.47f, 0.32f, -0.87f, 0.78f, -0.97f)
                curveToRelative(1.55f, -0.36f, 6.14f, -1.02f, 10.22f, -1.02f)
                reflectiveCurveToRelative(8.66f, 0.67f, 10.22f, 1.02f)
                curveToRelative(0.45f, 0.1f, 0.78f, 0.51f, 0.78f, 0.97f)
                close()
                moveTo(21.41f, 6.83f)
                curveToRelative(0.85f, -1.01f, 1.35f, -1.66f, 1.39f, -1.71f)
                curveToRelative(0.17f, -0.22f, 0.23f, -0.49f, 0.19f, -0.76f)
                curveToRelative(-0.02f, -0.14f, -0.23f, -1.36f, -1.11f, -2.24f)
                reflectiveCurveToRelative(-2.1f, -1.09f, -2.24f, -1.11f)
                curveToRelative(-0.27f, -0.04f, -0.54f, 0.03f, -0.76f, 0.19f)
                curveToRelative(-0.11f, 0.08f, -2.49f, 1.91f, -5.49f, 4.82f)
                curveToRelative(3.12f, 0.1f, 6.18f, 0.49f, 8.02f, 0.81f)
                close()
            }
        }.also { _MortarPestle = it}
