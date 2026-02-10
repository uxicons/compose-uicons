package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Ts.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 11.28f)
                curveTo(23.61f, 4.95f, 18.34f, 0f, 12.02f, 0f)
                curveTo(5.39f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.39f, 12f, 12.02f, 12f)
                horizontalLineToRelative(11.98f)
                lineTo(24f, 11.28f)
                close()
                moveTo(23.0f, 23f)
                lineTo(12.02f, 23f)
                curveToRelative(-6.08f, 0f, -11.02f, -4.93f, -11.02f, -11f)
                reflectiveCurveTo(5.94f, 1f, 12.02f, 1f)
                curveToRelative(5.8f, 0f, 10.62f, 4.54f, 10.98f, 10.31f)
                verticalLineToRelative(11.69f)
                close()
                moveTo(13f, 9f)
                lineTo(7f, 9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(7f, 12f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 13f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 17f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Comment = it}
