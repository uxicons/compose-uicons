package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebDesign: ImageVector? = null

val Icons.Ss.WebDesign: ImageVector
    get() = _WebDesign ?: UXIcon(name = "WebDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 15.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(0f, 17.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5.5f)
                lineTo(0f, 17.5f)
                close()
                moveTo(16f, 23f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(13f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(9f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WebDesign = it}
