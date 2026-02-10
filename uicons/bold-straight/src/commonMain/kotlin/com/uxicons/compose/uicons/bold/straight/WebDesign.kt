package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebDesign: ImageVector? = null

val Icons.Bs.WebDesign: ImageVector
    get() = _WebDesign ?: UXIcon(name = "WebDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
                moveTo(13f, 13f)
                lineTo(5f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(5f, 18f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _WebDesign = it}
