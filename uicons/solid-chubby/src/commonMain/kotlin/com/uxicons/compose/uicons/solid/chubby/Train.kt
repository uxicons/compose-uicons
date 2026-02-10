package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Sc.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 10.1f)
                curveToRelative(3.19f, 0f, 5.7f, -2.86f, 6.97f, -4.67f)
                curveToRelative(-0.2f, -1.31f, -0.43f, -2.07f, -0.45f, -2.12f)
                curveToRelative(-0.07f, -0.23f, -0.22f, -0.43f, -0.43f, -0.56f)
                curveToRelative(-0.11f, -0.07f, -2.84f, -1.74f, -6.08f, -1.74f)
                reflectiveCurveToRelative(-5.97f, 1.67f, -6.08f, 1.74f)
                curveToRelative(-0.21f, 0.13f, -0.36f, 0.33f, -0.43f, 0.56f)
                curveToRelative(-0.02f, 0.06f, -0.24f, 0.81f, -0.44f, 2.11f)
                curveToRelative(1.28f, 1.81f, 3.81f, 4.69f, 6.94f, 4.69f)
                close()
                moveTo(10.32f, 3.43f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.54f, 20.89f)
                curveToRelative(-0.79f, -1.78f, -1.96f, -3.14f, -3.05f, -4.11f)
                curveToRelative(0.01f, -0.04f, 0.79f, -3.13f, 0.79f, -6.99f)
                curveToRelative(0f, -0.53f, -0.01f, -1.03f, -0.04f, -1.5f)
                curveToRelative(-1.67f, 1.87f, -4.16f, 3.81f, -7.26f, 3.81f)
                curveToRelative(-3.07f, 0f, -5.55f, -1.96f, -7.23f, -3.83f)
                curveToRelative(-0.02f, 0.48f, -0.04f, 0.98f, -0.04f, 1.51f)
                curveToRelative(-0.02f, 3.99f, 0.77f, 6.96f, 0.79f, 6.99f)
                curveToRelative(-1.09f, 0.97f, -2.25f, 2.33f, -3.05f, 4.12f)
                curveToRelative(-0.34f, 0.76f, -0.02f, 1.69f, 0.76f, 1.98f)
                curveToRelative(1.02f, 0.38f, 1.73f, -0.2f, 1.98f, -0.76f)
                curveToRelative(0.82f, -1.85f, 2.21f, -3.11f, 3.24f, -3.85f)
                curveToRelative(0.94f, 0.23f, 2.12f, 0.41f, 3.56f, 0.41f)
                reflectiveCurveToRelative(2.63f, -0.18f, 3.56f, -0.41f)
                curveToRelative(1.02f, 0.74f, 2.41f, 2.0f, 3.24f, 3.85f)
                curveToRelative(0.25f, 0.56f, 1.04f, 1.16f, 1.98f, 0.76f)
                curveToRelative(0.76f, -0.32f, 1.1f, -1.22f, 0.76f, -1.98f)
                close()
                moveTo(12f, 16.8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Train = it}
