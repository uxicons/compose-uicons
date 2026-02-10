package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Sc.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 12.02f)
                curveToRelative(0f, 6.84f, 3.93f, 10.94f, 11.01f, 10.98f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 12.88f)
                verticalLineToRelative(0.65f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.57f)
                curveToRelative(0f, -0.55f, 0.44f, -1.0f, 0.99f, -1f)
                curveToRelative(1.49f, -0.01f, 2.08f, -0.6f, 2.11f, -2.12f)
                curveToRelative(-0.03f, -1.44f, -0.66f, -2.07f, -2.11f, -2.08f)
                curveToRelative(-1.46f, 0.01f, -2.07f, 0.62f, -2.1f, 2.12f)
                curveToRelative(-0.01f, 0.55f, -0.5f, 0.98f, -1.02f, 0.98f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.05f, -2.58f, 1.54f, -4.07f, 4.09f, -4.08f)
                curveToRelative(2.53f, 0.02f, 4.06f, 1.54f, 4.11f, 4.08f)
                curveToRelative(-0.04f, 2.29f, -1.13f, 3.69f, -3.1f, 4.03f)
                close()
            }
        }.also { _Interrogation = it}
