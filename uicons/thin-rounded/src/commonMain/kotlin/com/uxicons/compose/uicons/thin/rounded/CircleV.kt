package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Tr.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.72f, 7.43f)
                lineToRelative(-3.64f, 9.72f)
                curveToRelative(-0.35f, 0.84f, -1.14f, 1.35f, -2.08f, 1.35f)
                reflectiveCurveToRelative(-1.72f, -0.51f, -2.07f, -1.34f)
                lineToRelative(-3.9f, -9.73f)
                curveToRelative(-0.1f, -0.26f, 0.02f, -0.55f, 0.28f, -0.65f)
                curveToRelative(0.26f, -0.1f, 0.55f, 0.02f, 0.65f, 0.28f)
                lineToRelative(3.89f, 9.72f)
                curveToRelative(0.22f, 0.53f, 0.73f, 0.72f, 1.14f, 0.72f)
                reflectiveCurveToRelative(0.92f, -0.19f, 1.15f, -0.72f)
                lineToRelative(3.64f, -9.7f)
                curveToRelative(0.1f, -0.26f, 0.39f, -0.39f, 0.64f, -0.29f)
                curveToRelative(0.26f, 0.1f, 0.39f, 0.39f, 0.29f, 0.64f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CircleV = it}
