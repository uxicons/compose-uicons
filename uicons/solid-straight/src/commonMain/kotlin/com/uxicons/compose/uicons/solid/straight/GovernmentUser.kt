package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentUser: ImageVector? = null

val Icons.Ss.GovernmentUser: ImageVector
    get() = _GovernmentUser ?: UXIcon(name = "GovernmentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 5f)
                curveTo(5f, 2.24f, 7.24f, 0f, 10f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                lineTo(23f, 2f)
                horizontalLineToRelative(1f)
                lineTo(24f, 0f)
                close()
                moveTo(0f, 22f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.33f, 11f)
                lineToRelative(-1.57f, 2.36f)
                lineToRelative(1.05f, 4.64f)
                horizontalLineToRelative(6.18f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.67f)
                close()
                moveTo(9.24f, 13.36f)
                lineToRelative(-1.57f, -2.36f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.18f)
                lineToRelative(1.05f, -4.64f)
                close()
            }
        }.also { _GovernmentUser = it}
