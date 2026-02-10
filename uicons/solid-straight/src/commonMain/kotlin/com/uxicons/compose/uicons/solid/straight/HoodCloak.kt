package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Ss.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 11.34f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.11f, -2.02f, -0.6f, -3.73f, -1.46f, -5.1f)
                curveToRelative(-0.34f, -0.54f, -0.52f, -1.09f, -0.5f, -1.55f)
                curveToRelative(0.05f, -1.54f, 0.95f, -3.13f, 0.96f, -3.14f)
                lineToRelative(1.04f, -1.55f)
                lineToRelative(-10.75f, 0.01f)
                curveToRelative(-0.73f, 0.01f, -1.37f, 0.01f, -1.85f, 0.04f)
                curveTo(5.34f, 0.34f, 0.36f, 5.3f, 0.04f, 11.34f)
                curveToRelative(-0.2f, 3.95f, 0.61f, 7.15f, 2.77f, 10.64f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11.85f)
                lineToRelative(-0.47f, -0.37f)
                curveToRelative(-0.26f, -0.21f, -6.38f, -5.11f, -6.38f, -10.6f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 5.5f, -6.12f, 10.4f, -6.38f, 10.6f)
                lineToRelative(-0.47f, 0.37f)
                horizontalLineToRelative(11.85f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(2.16f, -3.49f, 2.98f, -6.68f, 2.77f, -10.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 13f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 3.61f, 3.54f, 7.18f, 5f, 8.5f)
                curveToRelative(1.46f, -1.32f, 5f, -4.89f, 5f, -8.5f)
                close()
            }
        }.also { _HoodCloak = it}
