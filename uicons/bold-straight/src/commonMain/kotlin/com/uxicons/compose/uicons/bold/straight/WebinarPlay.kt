package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebinarPlay: ImageVector? = null

val Icons.Bs.WebinarPlay: ImageVector
    get() = _WebinarPlay ?: UXIcon(name = "WebinarPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.28f)
                verticalLineToRelative(7.72f)
                lineTo(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(11.08f, 2f)
                curveToRelative(-0.52f, 0.9f, -0.88f, 1.92f, -1.01f, 3f)
                lineTo(3f, 5f)
                verticalLineToRelative(11f)
                lineTo(21f, 16f)
                verticalLineToRelative(-2.59f)
                curveToRelative(1.16f, -0.47f, 2.19f, -1.21f, 3f, -2.13f)
                close()
                moveTo(8.5f, 11f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(7f, 12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(16f, 9.06f)
                lineToRelative(5.5f, -3.06f)
                lineToRelative(-5.5f, -3.06f)
                verticalLineToRelative(6.11f)
                close()
            }
        }.also { _WebinarPlay = it}
