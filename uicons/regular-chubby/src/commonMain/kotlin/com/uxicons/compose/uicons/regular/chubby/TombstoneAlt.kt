package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TombstoneAlt: ImageVector? = null

val Icons.Rc.TombstoneAlt: ImageVector
    get() = _TombstoneAlt ?: UXIcon(name = "TombstoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 21.02f)
                curveToRelative(-0.06f, -0.01f, -0.5f, -0.1f, -1.19f, -0.21f)
                verticalLineToRelative(-10.81f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                verticalLineToRelative(10.81f)
                curveToRelative(-0.7f, 0.12f, -1.14f, 0.2f, -1.19f, 0.21f)
                curveToRelative(-0.54f, 0.11f, -0.89f, 0.63f, -0.79f, 1.18f)
                curveToRelative(0.11f, 0.54f, 0.63f, 0.9f, 1.18f, 0.79f)
                curveToRelative(0.05f, -0.01f, 5.03f, -0.98f, 9.81f, -0.98f)
                curveToRelative(5.06f, 0.02f, 9.6f, 0.97f, 10.0f, 1f)
                curveToRelative(0.47f, 0f, 0.89f, -0.33f, 0.98f, -0.81f)
                curveToRelative(0.11f, -0.54f, -0.25f, -1.07f, -0.79f, -1.18f)
                close()
                moveTo(5f, 20.51f)
                verticalLineToRelative(-10.51f)
                curveToRelative(0f, -5.17f, 1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                verticalLineToRelative(10.51f)
                curveToRelative(-1.91f, -0.26f, -4.46f, -0.51f, -7f, -0.51f)
                reflectiveCurveToRelative(-5.09f, 0.26f, -7f, 0.51f)
                close()
            }
        }.also { _TombstoneAlt = it}
