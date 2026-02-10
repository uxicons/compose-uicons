package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceLying: ImageVector? = null

val Icons.Ts.FaceLying: ImageVector
    get() = _FaceLying ?: UXIcon(name = "FaceLying") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 18f)
                curveToRelative(0.32f, 0f, 0.64f, -0.04f, 0.94f, -0.1f)
                curveToRelative(-2.06f, 3.64f, -5.97f, 6.1f, -10.44f, 6.1f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(5.81f, 0f, 10.66f, 4.15f, 11.76f, 9.63f)
                curveToRelative(-0.36f, -0.21f, -0.74f, -0.37f, -1.15f, -0.48f)
                curveTo(21.36f, 4.47f, 17.08f, 1f, 12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                curveToRelative(3.85f, 0f, 7.24f, -1.99f, 9.21f, -5f)
                horizontalLineToRelative(0.29f)
                close()
                moveTo(7.33f, 17.87f)
                curveToRelative(0.02f, -0.02f, 2.14f, -1.87f, 4.67f, -1.87f)
                verticalLineToRelative(-1f)
                curveToRelative(-2.92f, 0f, -5.24f, 2.04f, -5.33f, 2.13f)
                lineToRelative(0.67f, 0.75f)
                close()
                moveTo(15f, 8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(9f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(21.5f, 11f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _FaceLying = it}
