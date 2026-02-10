package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodDropper: ImageVector? = null

val Icons.Ss.BloodDropper: ImageVector
    get() = _BloodDropper ?: UXIcon(name = "BloodDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                reflectiveCurveToRelative(-3.2f, 1.31f, -3.45f, 3f)
                horizontalLineToRelative(-2.55f)
                curveTo(3.24f, 3f, 1f, 5.24f, 1f, 8f)
                lineTo(17f, 8f)
                verticalLineToRelative(2f)
                lineTo(1f, 10f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(3f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(-3.9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BloodDropper = it}
