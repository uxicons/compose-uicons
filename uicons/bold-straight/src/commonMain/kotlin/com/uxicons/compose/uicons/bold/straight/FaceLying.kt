package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceLying: ImageVector? = null

val Icons.Bs.FaceLying: ImageVector
    get() = _FaceLying ?: UXIcon(name = "FaceLying") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(14f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(19.48f, 17f)
                curveToRelative(-1.62f, 2.41f, -4.37f, 4f, -7.48f, 4f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                curveToRelative(3.91f, 0f, 7.24f, 2.51f, 8.47f, 6f)
                horizontalLineToRelative(1.52f)
                curveToRelative(0.61f, 0f, 1.19f, 0.15f, 1.71f, 0.4f)
                curveTo(22.51f, 4.03f, 17.72f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(4.88f, 0f, 9.08f, -2.93f, 10.96f, -7.13f)
                curveToRelative(-0.31f, 0.08f, -0.62f, 0.13f, -0.96f, 0.13f)
                horizontalLineToRelative(-2.52f)
                close()
                moveTo(14f, 8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(10f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(12f, 17f)
                verticalLineToRelative(-3f)
                curveToRelative(-3.3f, 0f, -5.89f, 2.28f, -6f, 2.38f)
                lineToRelative(1.99f, 2.24f)
                curveToRelative(0.02f, -0.02f, 1.87f, -1.62f, 4.0f, -1.62f)
                close()
            }
        }.also { _FaceLying = it}
