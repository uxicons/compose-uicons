package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Ts.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.91f, 6.75f)
                horizontalLineToRelative(1.08f)
                lineToRelative(-4.36f, 10.82f)
                curveToRelative(-0.29f, 0.56f, -0.93f, 0.93f, -1.62f, 0.93f)
                curveToRelative(-0.72f, 0f, -1.34f, -0.39f, -1.68f, -1.06f)
                lineTo(5.86f, 6.75f)
                horizontalLineToRelative(1.08f)
                lineToRelative(4.28f, 10.27f)
                curveToRelative(0.15f, 0.3f, 0.43f, 0.48f, 0.77f, 0.48f)
                curveToRelative(0.37f, 0f, 0.64f, -0.2f, 0.71f, -0.34f)
                lineToRelative(4.2f, -10.41f)
                close()
            }
        }.also { _CircleV = it}
