package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Sc.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.68f, 9.52f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.56f, -0.71f, -0.63f)
                curveToRelative(-0.13f, -0.03f, -3.27f, -0.77f, -6.97f, -0.77f)
                curveToRelative(-1.28f, 0f, -2.49f, 0.09f, -3.54f, 0.2f)
                curveToRelative(-0.02f, -0.25f, -0.04f, -0.52f, -0.04f, -0.81f)
                curveToRelative(0f, -2.98f, 1.15f, -3.5f, 3.56f, -3.5f)
                reflectiveCurveToRelative(3.06f, 0.67f, 3.38f, 1.82f)
                curveToRelative(0.22f, 0.8f, 1.04f, 1.27f, 1.84f, 1.05f)
                curveToRelative(0.8f, -0.22f, 1.27f, -1.04f, 1.05f, -1.84f)
                curveTo(17.17f, 1f, 13.28f, 1f, 11.99f, 1f)
                curveToRelative(-4.36f, 0f, -6.57f, 2.19f, -6.57f, 6.5f)
                curveToRelative(0f, 0.45f, 0.02f, 0.88f, 0.07f, 1.27f)
                curveToRelative(-0.28f, 0.06f, -0.44f, 0.1f, -0.47f, 0.1f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.32f, -0.71f, 0.64f)
                curveToRelative(-0.04f, 0.11f, -0.94f, 2.65f, -0.94f, 6.04f)
                curveToRelative(0f, 3.41f, 0.9f, 5.94f, 0.94f, 6.04f)
                curveToRelative(0.11f, 0.32f, 0.38f, 0.56f, 0.71f, 0.63f)
                curveToRelative(0.13f, 0.03f, 3.27f, 0.77f, 6.97f, 0.77f)
                reflectiveCurveToRelative(6.84f, -0.74f, 6.97f, -0.77f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.32f, 0.71f, -0.64f)
                curveToRelative(0.04f, -0.11f, 0.94f, -2.65f, 0.94f, -6.04f)
                curveToRelative(0f, -3.41f, -0.9f, -5.94f, -0.94f, -6.04f)
                close()
                moveTo(13f, 16.3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.49f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.49f)
                close()
            }
        }.also { _Unlock = it}
