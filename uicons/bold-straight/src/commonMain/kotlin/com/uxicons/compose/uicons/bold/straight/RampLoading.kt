package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Bs.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.64f, 19.1f)
                lineToRelative(-3.55f, -7.1f)
                lineTo(5.91f, 12f)
                lineToRelative(-3.55f, 7.1f)
                curveToRelative(-0.53f, 1.06f, -0.47f, 2.29f, 0.15f, 3.3f)
                reflectiveCurveToRelative(1.7f, 1.61f, 2.88f, 1.61f)
                horizontalLineToRelative(13.22f)
                curveToRelative(1.18f, 0f, 2.26f, -0.6f, 2.88f, -1.61f)
                reflectiveCurveToRelative(0.68f, -2.24f, 0.15f, -3.3f)
                close()
                moveTo(18.94f, 20.82f)
                curveToRelative(-0.05f, 0.08f, -0.15f, 0.18f, -0.33f, 0.18f)
                lineTo(5.39f, 21.0f)
                curveToRelative(-0.18f, 0f, -0.28f, -0.1f, -0.33f, -0.18f)
                curveToRelative(-0.05f, -0.08f, -0.1f, -0.22f, -0.02f, -0.38f)
                lineToRelative(2.72f, -5.44f)
                horizontalLineToRelative(8.48f)
                lineToRelative(2.72f, 5.44f)
                curveToRelative(0.08f, 0.16f, 0.04f, 0.29f, -0.02f, 0.38f)
                close()
                moveTo(5f, 9.48f)
                lineToRelative(-3f, 5.91f)
                lineTo(2f, 3.5f)
                curveTo(2f, 1.57f, 3.57f, 0f, 5.5f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(22f, 15.39f)
                lineToRelative(-3f, -5.91f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.98f)
                close()
            }
        }.also { _RampLoading = it}
