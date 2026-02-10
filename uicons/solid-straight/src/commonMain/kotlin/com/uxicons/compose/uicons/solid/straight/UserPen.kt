package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Ss.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(16.09f, 24f)
                horizontalLineToRelative(-3.09f)
                reflectiveCurveToRelative(0f, -3.09f, 0f, -3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.85f, 0.85f, 0.85f, 2.23f, 0f, 3.09f)
                lineToRelative(-7.28f, 7.28f)
                close()
                moveTo(11f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                lineTo(13f, 14f)
                curveToRelative(1.15f, 0f, 2.19f, 0.4f, 3.03f, 1.05f)
                lineToRelative(-5.03f, 5.03f)
                verticalLineToRelative(3.91f)
                close()
            }
        }.also { _UserPen = it}
