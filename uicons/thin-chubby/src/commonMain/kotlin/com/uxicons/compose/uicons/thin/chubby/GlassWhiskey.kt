package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Tc.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.63f, 2.47f)
                curveToRelative(-0.05f, -0.17f, -0.17f, -0.3f, -0.34f, -0.35f)
                curveToRelative(-0.15f, -0.04f, -3.84f, -1.11f, -10.29f, -1.11f)
                reflectiveCurveToRelative(-10.14f, 1.06f, -10.29f, 1.11f)
                curveToRelative(-0.17f, 0.05f, -0.29f, 0.18f, -0.34f, 0.35f)
                curveToRelative(-0.02f, 0.06f, -0.41f, 1.51f, -0.35f, 4.3f)
                curveToRelative(0.04f, 1.78f, 0.25f, 3.71f, 0.63f, 5.72f)
                curveToRelative(1.11f, 5.88f, 2.99f, 9.02f, 3.36f, 9.59f)
                curveToRelative(0.07f, 0.11f, 0.18f, 0.18f, 0.3f, 0.21f)
                curveToRelative(0.66f, 0.16f, 3.1f, 0.7f, 6.7f, 0.7f)
                reflectiveCurveToRelative(6.03f, -0.54f, 6.7f, -0.7f)
                curveToRelative(0.12f, -0.03f, 0.23f, -0.11f, 0.3f, -0.21f)
                curveToRelative(0.37f, -0.57f, 2.25f, -3.71f, 3.36f, -9.59f)
                curveToRelative(0.38f, -2.01f, 0.59f, -3.94f, 0.63f, -5.72f)
                curveToRelative(0.06f, -2.79f, -0.33f, -4.24f, -0.35f, -4.3f)
                close()
                moveTo(2.27f, 3.01f)
                curveToRelative(0.97f, -0.24f, 4.42f, -0.99f, 9.73f, -0.99f)
                reflectiveCurveToRelative(8.76f, 0.75f, 9.73f, 0.99f)
                curveToRelative(0.51f, 2.28f, 0.19f, 7.11f, -0.51f, 9.99f)
                horizontalLineToRelative(-18.44f)
                curveToRelative(-0.7f, -2.88f, -1.02f, -7.73f, -0.51f, -9.99f)
                close()
                moveTo(18.26f, 21.36f)
                curveToRelative(-0.84f, 0.19f, -3.07f, 0.62f, -6.26f, 0.62f)
                reflectiveCurveToRelative(-5.42f, -0.43f, -6.26f, -0.62f)
                curveToRelative(-0.46f, -0.75f, -1.77f, -3.17f, -2.75f, -7.37f)
                horizontalLineToRelative(18.02f)
                curveToRelative(-0.98f, 4.2f, -2.29f, 6.61f, -2.75f, 7.37f)
                close()
            }
        }.also { _GlassWhiskey = it}
