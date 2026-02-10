package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Sc.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 20f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-0.38f, 0f, -1.26f, 0f, -4.48f, 4f)
                horizontalLineToRelative(8.96f)
                curveToRelative(-3.22f, -4f, -4.1f, -4f, -4.48f, -4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 18.5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.25f, -1.28f, 0.5f, -3.52f, 0.5f, -5.5f)
                curveToRelative(0f, -1.66f, -0.29f, -3.04f, -0.57f, -4f)
                horizontalLineToRelative(-4.43f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-4.43f)
                curveToRelative(-0.28f, 0.96f, -0.57f, 2.34f, -0.57f, 4f)
                curveToRelative(0f, 1.98f, 0.25f, 4.21f, 0.5f, 5.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _Monument = it}
