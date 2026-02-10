package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resume: ImageVector? = null

val Icons.Rs.Resume: ImageVector
    get() = _Resume ?: UXIcon(name = "Resume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 17f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                lineTo(6f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9.5f, 11f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(22f, 7.59f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                lineTo(14.41f, 0f)
                lineToRelative(7.59f, 7.59f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 9f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Resume = it}
