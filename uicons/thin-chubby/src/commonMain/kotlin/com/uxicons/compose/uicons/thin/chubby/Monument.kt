package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Tc.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 19.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(0.38f, -1.29f, 1.13f, -4.3f, 1.13f, -7.55f)
                curveToRelative(0f, -3.23f, -1.07f, -5.39f, -1.12f, -5.48f)
                curveToRelative(-0.02f, -0.03f, -0.03f, -0.06f, -0.06f, -0.09f)
                curveToRelative(-1.31f, -1.64f, -3.66f, -4.39f, -4.64f, -4.39f)
                reflectiveCurveToRelative(-3.33f, 2.75f, -4.64f, 4.39f)
                curveToRelative(-0.02f, 0.03f, -0.04f, 0.06f, -0.06f, 0.09f)
                curveToRelative(-0.05f, 0.09f, -1.12f, 2.24f, -1.12f, 5.48f)
                curveToRelative(0f, 3.25f, 0.76f, 6.26f, 1.13f, 7.55f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(16.81f, 10.95f)
                curveToRelative(0f, 3.36f, -0.87f, 6.53f, -1.18f, 7.55f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.03f, 0.0f, -0.05f)
                verticalLineToRelative(-11.95f)
                reflectiveCurveToRelative(3.49f, 0.0f, 3.5f, 0f)
                curveToRelative(0.3f, 0.8f, 0.81f, 2.4f, 0.81f, 4.45f)
                close()
                moveTo(11.97f, 2.0f)
                curveToRelative(0.45f, 0.1f, 2.07f, 1.81f, 3.47f, 3.5f)
                horizontalLineToRelative(-6.88f)
                curveToRelative(1.4f, -1.7f, 3.02f, -3.4f, 3.41f, -3.5f)
                close()
                moveTo(7.19f, 10.95f)
                curveToRelative(0f, -2.05f, 0.51f, -3.65f, 0.81f, -4.45f)
                curveToRelative(0.01f, 0.0f, 3.5f, 0f, 3.5f, 0f)
                verticalLineToRelative(11.95f)
                curveToRelative(0f, 0.02f, 0f, 0.03f, 0.0f, 0.05f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-0.31f, -1.02f, -1.18f, -4.19f, -1.18f, -7.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 22f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Monument = it}
