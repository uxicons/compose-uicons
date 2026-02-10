package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Tr.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 23.15f)
                lineToRelative(-6.45f, -6.45f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.45f, 6.45f)
                curveToRelative(0.45f, 0.47f, 1.17f, -0.26f, 0.71f, -0.71f)
                close()
                moveTo(10f, 19f)
                curveTo(5.04f, 19f, 1f, 14.96f, 1f, 10f)
                reflectiveCurveTo(5.04f, 1f, 10f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(16.0f, 8.58f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.06f, -1.4f, -2.96f, -3.08f, -6.0f, -3.08f)
                reflectiveCurveToRelative(-4.94f, 1.67f, -6.0f, 3.08f)
                curveToRelative(-0.63f, 0.84f, -0.63f, 2.01f, 0f, 2.85f)
                curveToRelative(1.06f, 1.4f, 2.96f, 3.08f, 6.0f, 3.08f)
                reflectiveCurveToRelative(4.94f, -1.67f, 6.0f, -3.08f)
                curveToRelative(0.63f, -0.84f, 0.63f, -2.01f, 0f, -2.85f)
                close()
                moveTo(15.2f, 10.82f)
                curveToRelative(-0.92f, 1.22f, -2.57f, 2.68f, -5.2f, 2.68f)
                reflectiveCurveToRelative(-4.28f, -1.46f, -5.2f, -2.68f)
                curveToRelative(-0.36f, -0.48f, -0.36f, -1.16f, 0f, -1.65f)
                curveToRelative(0.92f, -1.22f, 2.57f, -2.68f, 5.2f, -2.68f)
                reflectiveCurveToRelative(4.28f, 1.46f, 5.2f, 2.68f)
                curveToRelative(0.36f, 0.48f, 0.36f, 1.16f, 0f, 1.65f)
                close()
                moveTo(10f, 8.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(10f, 11.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
