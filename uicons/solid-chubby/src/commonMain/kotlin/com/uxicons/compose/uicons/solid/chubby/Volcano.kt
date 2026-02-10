package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volcano: ImageVector? = null

val Icons.Sc.Volcano: ImageVector
    get() = _Volcano ?: UXIcon(name = "Volcano") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.66f, 8.69f)
                horizontalLineToRelative(-5.33f)
                curveToRelative(-0.28f, 0f, -0.54f, 0.12f, -0.73f, 0.32f)
                curveToRelative(-0.69f, 0.74f, -1.45f, 1.64f, -2.21f, 2.67f)
                curveToRelative(3.69f, 0.86f, 7.52f, 0.86f, 11.2f, 0f)
                curveToRelative(-0.76f, -1.03f, -1.51f, -1.93f, -2.21f, -2.67f)
                curveToRelative(-0.19f, -0.2f, -0.45f, -0.32f, -0.73f, -0.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 20.56f)
                curveToRelative(-0.67f, -2.73f, -1.78f, -5.12f, -3.02f, -7.11f)
                curveToRelative(-1.23f, 0.32f, -2.48f, 0.56f, -3.73f, 0.7f)
                verticalLineToRelative(3.49f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.33f)
                curveToRelative(-0.35f, 0.01f, -0.7f, 0.02f, -1.06f, 0.02f)
                curveToRelative(-0.37f, 0f, -0.74f, -0.01f, -1.1f, -0.02f)
                verticalLineToRelative(1.46f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.61f)
                curveToRelative(-1.24f, -0.14f, -2.47f, -0.38f, -3.69f, -0.7f)
                curveToRelative(-1.24f, 2.0f, -2.35f, 4.38f, -3.02f, 7.11f)
                curveToRelative(-0.13f, 0.52f, 0.18f, 1.06f, 0.7f, 1.2f)
                curveToRelative(2.98f, 0.83f, 6.04f, 1.24f, 9.11f, 1.24f)
                reflectiveCurveToRelative(6.13f, -0.41f, 9.11f, -1.24f)
                curveToRelative(0.52f, -0.14f, 0.83f, -0.68f, 0.7f, -1.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.66f, 7.67f)
                horizontalLineToRelative(2.34f)
                verticalLineToRelative(-1.11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.11f)
                reflectiveCurveToRelative(2.57f, 0.0f, 2.6f, 0f)
                curveToRelative(1.31f, -0.13f, 2.3f, -1.25f, 2.3f, -2.58f)
                curveToRelative(0f, -0.98f, -0.55f, -1.86f, -1.39f, -2.3f)
                curveToRelative(-0.7f, -1.11f, -1.91f, -1.79f, -3.24f, -1.79f)
                curveToRelative(-0.67f, 0f, -1.31f, 0.17f, -1.88f, 0.49f)
                curveToRelative(-1.21f, -0.27f, -2.52f, 0.16f, -3.34f, 1.09f)
                curveToRelative(-1.12f, 0.28f, -1.95f, 1.3f, -1.95f, 2.51f)
                curveToRelative(0f, 1.42f, 1.15f, 2.58f, 2.56f, 2.58f)
                close()
            }
        }.also { _Volcano = it}
