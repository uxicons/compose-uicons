package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peapod: ImageVector? = null

val Icons.Bs.Peapod: ImageVector
    get() = _Peapod ?: UXIcon(name = "Peapod") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 1.46f)
                lineToRelative(-0.04f, -1.46f)
                horizontalLineToRelative(-1.46f)
                curveToRelative(-0.39f, 0f, -9.69f, 0.07f, -16.06f, 6.44f)
                reflectiveCurveTo(0f, 22.11f, 0f, 22.5f)
                verticalLineToRelative(1.46f)
                reflectiveCurveToRelative(1.56f, 0.04f, 1.67f, 0.04f)
                curveToRelative(1.45f, 0f, 9.73f, -0.28f, 15.89f, -6.44f)
                curveToRelative(6.63f, -6.63f, 6.45f, -15.72f, 6.44f, -16.1f)
                close()
                moveTo(15.44f, 15.44f)
                curveToRelative(-4.18f, 4.18f, -9.67f, 5.22f, -12.32f, 5.48f)
                curveToRelative(0.3f, -2.71f, 1.41f, -8.32f, 5.45f, -12.36f)
                curveToRelative(4.03f, -4.03f, 9.65f, -5.14f, 12.36f, -5.45f)
                curveToRelative(-0.26f, 2.66f, -1.3f, 8.14f, -5.48f, 12.32f)
                close()
                moveTo(9.5f, 12f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.5f, 14.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _Peapod = it}
