package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanHead: ImageVector? = null

val Icons.Rs.SnowmanHead: ImageVector
    get() = _SnowmanHead ?: UXIcon(name = "SnowmanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                lineTo(2f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.94f)
                curveToRelative(-0.61f, 1.24f, -0.94f, 2.61f, -0.94f, 4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.39f, -0.33f, -2.76f, -0.94f, -4f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                lineTo(7f, 9f)
                lineTo(7f, 3f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.45f, 0.43f, -2.83f, 1.25f, -4f)
                horizontalLineToRelative(11.49f)
                curveToRelative(0.82f, 1.17f, 1.25f, 2.55f, 1.25f, 4f)
                close()
                moveTo(7f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12f, 21f)
                reflectiveCurveToRelative(-1.5f, -2.67f, -1.5f, -3.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, 3.5f, -1.5f, 3.5f)
                close()
            }
        }.also { _SnowmanHead = it}
