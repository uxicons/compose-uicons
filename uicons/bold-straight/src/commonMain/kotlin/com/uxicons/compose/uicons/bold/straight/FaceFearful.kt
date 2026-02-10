package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceFearful: ImageVector? = null

val Icons.Bs.FaceFearful: ImageVector
    get() = _FaceFearful ?: UXIcon(name = "FaceFearful") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(18f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(11f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(8.89f, 7.42f)
                lineToRelative(-0.78f, -1.84f)
                curveToRelative(-1.67f, 0.71f, -3.04f, 1.85f, -3.95f, 3.29f)
                lineToRelative(1.69f, 1.07f)
                curveToRelative(0.69f, -1.08f, 1.77f, -1.98f, 3.05f, -2.52f)
                close()
                moveTo(19.76f, 8.74f)
                curveToRelative(-0.91f, -1.38f, -2.25f, -2.47f, -3.87f, -3.16f)
                lineToRelative(-0.79f, 1.84f)
                curveToRelative(1.26f, 0.54f, 2.29f, 1.38f, 2.99f, 2.43f)
                lineToRelative(1.67f, -1.1f)
                close()
            }
        }.also { _FaceFearful = it}
