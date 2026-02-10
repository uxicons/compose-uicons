package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintRoller: ImageVector? = null

val Icons.Sc.PaintRoller: ImageVector
    get() = _PaintRoller ?: UXIcon(name = "PaintRoller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.9f, 4.8f)
                curveToRelative(-0.26f, -0.2f, -0.58f, -0.3f, -0.9f, -0.3f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-0.25f, -1.47f, -0.77f, -2.46f, -0.8f, -2.51f)
                curveToRelative(-0.15f, -0.28f, -0.41f, -0.47f, -0.72f, -0.52f)
                curveToRelative(-0.12f, -0.02f, -2.98f, -0.47f, -6.35f, -0.47f)
                reflectiveCurveToRelative(-6.23f, 0.45f, -6.35f, 0.47f)
                curveToRelative(-0.31f, 0.05f, -0.58f, 0.24f, -0.73f, 0.52f)
                curveToRelative(-0.04f, 0.07f, -0.92f, 1.77f, -0.92f, 4.01f)
                curveToRelative(0f, 2.26f, 0.89f, 3.94f, 0.92f, 4.01f)
                curveToRelative(0.15f, 0.28f, 0.41f, 0.47f, 0.72f, 0.52f)
                curveToRelative(0.12f, 0.02f, 2.98f, 0.47f, 6.35f, 0.47f)
                reflectiveCurveToRelative(6.23f, -0.45f, 6.35f, -0.47f)
                curveToRelative(0.31f, -0.05f, 0.58f, -0.24f, 0.73f, -0.52f)
                curveToRelative(0.03f, -0.05f, 0.55f, -1.05f, 0.79f, -2.51f)
                horizontalLineToRelative(1.81f)
                curveToRelative(0.15f, 0.39f, 0.32f, 1.09f, 0.32f, 2.25f)
                reflectiveCurveToRelative(-0.17f, 1.86f, -0.31f, 2.25f)
                horizontalLineToRelative(-9.19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.85f)
                curveToRelative(-1.0f, 0.56f, -1.5f, 1.78f, -1.5f, 3.65f)
                curveToRelative(0f, 2.65f, 1.01f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -4f)
                curveToRelative(0f, -1.87f, -0.5f, -3.1f, -1.5f, -3.65f)
                verticalLineToRelative(-0.35f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.32f, 0f, 0.64f, -0.1f, 0.9f, -0.3f)
                curveToRelative(0.38f, -0.28f, 1.6f, -1.47f, 1.6f, -4.95f)
                reflectiveCurveToRelative(-1.22f, -4.67f, -1.6f, -4.95f)
                close()
            }
        }.also { _PaintRoller = it}
