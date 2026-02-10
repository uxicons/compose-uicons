package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Tc.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.55f, 15.92f)
                curveToRelative(-0.05f, -2.65f, -2.54f, -4.83f, -5.54f, -4.85f)
                curveToRelative(-1.14f, -0.01f, -2.21f, -0.46f, -2.94f, -1.23f)
                curveToRelative(-0.62f, -0.66f, -0.93f, -1.49f, -0.88f, -2.34f)
                curveToRelative(0.12f, -2.01f, 1.91f, -3.77f, 3.82f, -3.78f)
                curveToRelative(1.55f, 0.01f, 3.08f, 1.19f, 3.63f, 2.8f)
                curveToRelative(0.09f, 0.26f, 0.38f, 0.4f, 0.63f, 0.31f)
                curveToRelative(0.26f, -0.09f, 0.4f, -0.37f, 0.31f, -0.63f)
                curveToRelative(-0.63f, -1.87f, -2.26f, -3.23f, -4.07f, -3.45f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(-2.25f, 0.28f, -4.18f, 2.31f, -4.32f, 4.69f)
                curveToRelative(-0.06f, 1.13f, 0.34f, 2.22f, 1.15f, 3.08f)
                curveToRelative(0.92f, 0.98f, 2.25f, 1.54f, 3.67f, 1.55f)
                curveToRelative(2.47f, 0.02f, 4.51f, 1.76f, 4.55f, 3.87f)
                curveToRelative(0.01f, 1f, -0.45f, 2.05f, -1.27f, 2.89f)
                curveToRelative(-0.89f, 0.91f, -2.09f, 1.44f, -3.28f, 1.45f)
                curveToRelative(-1.2f, -0.01f, -2.4f, -0.54f, -3.29f, -1.45f)
                curveToRelative(-0.82f, -0.84f, -1.28f, -1.89f, -1.27f, -2.89f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.49f, -0.51f)
                curveToRelative(-0.31f, -0.03f, -0.5f, 0.22f, -0.51f, 0.49f)
                curveToRelative(-0.02f, 1.26f, 0.55f, 2.58f, 1.55f, 3.6f)
                curveToRelative(0.95f, 0.97f, 2.2f, 1.58f, 3.5f, 1.72f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.25f)
                curveToRelative(1.29f, -0.13f, 2.54f, -0.74f, 3.5f, -1.72f)
                curveToRelative(1.0f, -1.03f, 1.57f, -2.34f, 1.55f, -3.61f)
                close()
            }
        }.also { _Dollar = it}
