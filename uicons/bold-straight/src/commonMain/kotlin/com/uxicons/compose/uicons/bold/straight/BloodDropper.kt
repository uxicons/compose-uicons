package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodDropper: ImageVector? = null

val Icons.Bs.BloodDropper: ImageVector
    get() = _BloodDropper ?: UXIcon(name = "BloodDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 3f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                reflectiveCurveToRelative(-3.2f, 1.31f, -3.45f, 3f)
                horizontalLineToRelative(-2.05f)
                curveTo(3.47f, 3f, 1f, 5.47f, 1f, 8.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.08f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.08f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(23f, 8.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(17.5f, 19f)
                lineTo(6.5f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                lineTo(14f, 12f)
                verticalLineToRelative(-3f)
                lineTo(4f, 9f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.95f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
            }
        }.also { _BloodDropper = it}
