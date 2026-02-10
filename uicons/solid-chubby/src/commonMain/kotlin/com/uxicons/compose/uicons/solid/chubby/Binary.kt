package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Sc.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 1f)
                curveToRelative(-2.65f, 0f, -4f, 1.68f, -4f, 5f)
                reflectiveCurveToRelative(1.35f, 5f, 4f, 5f)
                reflectiveCurveToRelative(4f, -1.68f, 4f, -5f)
                reflectiveCurveToRelative(-1.35f, -5f, -4f, -5f)
                close()
                moveTo(8f, 8f)
                curveToRelative(-0.62f, 0f, -1f, 0f, -1f, -2f)
                reflectiveCurveToRelative(0.38f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0f, 1f, 2f)
                reflectiveCurveToRelative(-0.38f, 2f, -1f, 2f)
                close()
                moveTo(16f, 13f)
                curveToRelative(-2.65f, 0f, -4f, 1.68f, -4f, 5f)
                reflectiveCurveToRelative(1.35f, 5f, 4f, 5f)
                reflectiveCurveToRelative(4f, -1.68f, 4f, -5f)
                reflectiveCurveToRelative(-1.35f, -5f, -4f, -5f)
                close()
                moveTo(16f, 20f)
                curveToRelative(-0.62f, 0f, -1f, 0f, -1f, -2f)
                reflectiveCurveToRelative(0.38f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0f, 1f, 2f)
                reflectiveCurveToRelative(-0.38f, 2f, -1f, 2f)
                close()
                moveTo(8.44f, 13.33f)
                curveToRelative(0.36f, 0.28f, 0.56f, 0.71f, 0.56f, 1.17f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.59f)
                curveToRelative(-0.25f, 0.09f, -0.53f, 0.11f, -0.81f, 0.06f)
                curveToRelative(-0.81f, -0.17f, -1.33f, -0.96f, -1.16f, -1.77f)
                curveToRelative(0.34f, -1.61f, 1.51f, -2.79f, 3.14f, -3.16f)
                curveToRelative(0.45f, -0.1f, 0.91f, 0.01f, 1.27f, 0.29f)
                close()
                moveTo(14.03f, 4.19f)
                curveToRelative(0.34f, -1.61f, 1.51f, -2.79f, 3.14f, -3.16f)
                curveToRelative(0.45f, -0.1f, 0.91f, 0.01f, 1.27f, 0.29f)
                curveToRelative(0.36f, 0.28f, 0.56f, 0.71f, 0.56f, 1.17f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.59f)
                curveToRelative(-0.25f, 0.09f, -0.53f, 0.11f, -0.81f, 0.06f)
                curveToRelative(-0.81f, -0.17f, -1.33f, -0.96f, -1.16f, -1.77f)
                close()
            }
        }.also { _Binary = it}
