package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodDropper: ImageVector? = null

val Icons.Ts.BloodDropper: ImageVector
    get() = _BloodDropper ?: UXIcon(name = "BloodDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 3.5f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.25f, -1.97f, -1.93f, -3.5f, -3.97f, -3.5f)
                reflectiveCurveToRelative(-3.72f, 1.53f, -3.97f, 3.5f)
                horizontalLineToRelative(-2.53f)
                curveTo(3.02f, 3.5f, 1f, 5.52f, 1f, 8f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(8f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(13f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _BloodDropper = it}
