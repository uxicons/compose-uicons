package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebDesign: ImageVector? = null

val Icons.Rs.WebDesign: ImageVector
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
                moveTo(24f, 4f)
                verticalLineToRelative(19f)
                lineTo(0f, 23f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(14f, 10f)
                lineTo(2f, 10f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(2f, 21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4.5f)
                lineTo(2f, 16.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _WebDesign = it}
