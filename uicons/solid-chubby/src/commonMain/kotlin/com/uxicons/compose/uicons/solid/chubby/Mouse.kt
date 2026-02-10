package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mouse: ImageVector? = null

val Icons.Sc.Mouse: ImageVector
    get() = _Mouse ?: UXIcon(name = "Mouse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.32f, 5.87f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.61f, -0.64f, -0.72f)
                curveToRelative(-0.11f, -0.04f, -2.32f, -0.81f, -5.18f, -1.03f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.62f)
                curveToRelative(-2.85f, 0.22f, -5.07f, 0.99f, -5.17f, 1.03f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.04f, 0.15f, -0.85f, 3.67f, -0.84f, 9.19f)
                curveToRelative(0.01f, 4.38f, 3.67f, 7.94f, 8.16f, 7.94f)
                reflectiveCurveToRelative(8.15f, -3.55f, 8.15f, -7.91f)
                curveToRelative(0f, -5.49f, -0.8f, -9.07f, -0.83f, -9.22f)
                close()
                moveTo(13f, 10.84f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.11f)
                close()
            }
        }.also { _Mouse = it}
