package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Tc.RectangleVertical: ImageVector
    get() = _RectangleVertical ?: UXIcon(name = "RectangleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.6f, 2.62f)
                curveToRelative(-0.03f, -0.16f, -0.14f, -0.29f, -0.28f, -0.36f)
                curveToRelative(-0.11f, -0.05f, -2.77f, -1.25f, -6.32f, -1.25f)
                curveToRelative(-3.58f, 0f, -6.21f, 1.2f, -6.32f, 1.25f)
                curveToRelative(-0.15f, 0.07f, -0.25f, 0.2f, -0.28f, 0.36f)
                curveToRelative(-0.01f, 0.04f, -0.8f, 4.39f, -0.8f, 9.38f)
                reflectiveCurveToRelative(0.79f, 9.34f, 0.8f, 9.38f)
                curveToRelative(0.03f, 0.16f, 0.14f, 0.29f, 0.28f, 0.36f)
                curveToRelative(0.11f, 0.05f, 2.77f, 1.25f, 6.32f, 1.25f)
                curveToRelative(3.58f, 0f, 6.21f, -1.2f, 6.32f, -1.25f)
                curveToRelative(0.15f, -0.07f, 0.25f, -0.2f, 0.28f, -0.36f)
                curveToRelative(0.01f, -0.04f, 0.8f, -4.39f, 0.8f, -9.38f)
                reflectiveCurveToRelative(-0.79f, -9.34f, -0.8f, -9.38f)
                close()
                moveTo(17.66f, 20.94f)
                curveToRelative(-0.7f, 0.28f, -2.9f, 1.06f, -5.66f, 1.06f)
                curveToRelative(-2.74f, 0f, -4.95f, -0.78f, -5.66f, -1.06f)
                curveToRelative(-0.17f, -1.0f, -0.74f, -4.74f, -0.74f, -8.94f)
                reflectiveCurveToRelative(0.57f, -7.94f, 0.74f, -8.94f)
                curveToRelative(0.7f, -0.28f, 2.89f, -1.06f, 5.66f, -1.06f)
                curveToRelative(2.74f, 0f, 4.95f, 0.78f, 5.66f, 1.06f)
                curveToRelative(0.17f, 1.0f, 0.74f, 4.74f, 0.74f, 8.94f)
                reflectiveCurveToRelative(-0.57f, 7.93f, -0.74f, 8.94f)
                close()
            }
        }.also { _RectangleVertical = it}
