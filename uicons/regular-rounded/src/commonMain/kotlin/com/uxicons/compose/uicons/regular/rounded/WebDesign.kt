package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebDesign: ImageVector? = null

val Icons.Rr.WebDesign: ImageVector
    get() = _WebDesign ?: UXIcon(name = "WebDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(14f, 10f)
                lineTo(2f, 10f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(5f, 21f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4.5f)
                lineTo(2f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(22f, 18f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _WebDesign = it}
