package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanHead: ImageVector? = null

val Icons.Ss.SnowmanHead: ImageVector
    get() = _SnowmanHead ?: UXIcon(name = "SnowmanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(2f, 8f)
                verticalLineToRelative(2f)
                lineTo(22f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20.48f, 12f)
                lineTo(3.52f, 12f)
                curveToRelative(-0.34f, 0.96f, -0.52f, 1.97f, -0.52f, 3f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.03f, -0.18f, -2.04f, -0.52f, -3f)
                close()
                moveTo(8.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12f, 22f)
                reflectiveCurveToRelative(-1.5f, -2.67f, -1.5f, -3.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, 3.5f, -1.5f, 3.5f)
                close()
                moveTo(15.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SnowmanHead = it}
