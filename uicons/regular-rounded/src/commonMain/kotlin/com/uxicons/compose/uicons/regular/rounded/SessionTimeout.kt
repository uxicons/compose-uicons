package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Rr.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.47f, 20.93f)
                curveToRelative(-0.14f, 0.54f, -0.7f, 0.86f, -1.22f, 0.72f)
                curveToRelative(-4.86f, -1.25f, -8.25f, -5.63f, -8.25f, -10.65f)
                curveToRelative(0f, -6.07f, 4.93f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 4.11f, 2.77f, 7.69f, 6.75f, 8.72f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.22f)
                close()
                moveTo(12f, 11f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(22.37f, 24f)
                horizontalLineToRelative(-9.62f)
                curveToRelative(-1.26f, 0f, -2.04f, -1.36f, -1.41f, -2.45f)
                lineToRelative(4.81f, -8.24f)
                curveToRelative(0.63f, -1.08f, 2.19f, -1.08f, 2.81f, 0f)
                lineToRelative(4.81f, 8.24f)
                curveToRelative(0.63f, 1.09f, -0.15f, 2.45f, -1.41f, 2.45f)
                close()
                moveTo(18.56f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(18.56f, 17.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _SessionTimeout = it}
