package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BackUp: ImageVector? = null

val Icons.Bs.BackUp: ImageVector
    get() = _BackUp ?: UXIcon(name = "BackUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 16f)
                curveTo(5f, 16f, 3.2f, 14.9f, 3f, 14.5f)
                verticalLineTo(13f)
                curveToRelative(1.6f, 0.7f, 3.5f, 1f, 5.5f, 1f)
                curveToRelative(1f, 0f, 1.9f, -0.1f, 2.9f, -0.3f)
                curveTo(10.5f, 13f, 9.7f, 12f, 9.1f, 11f)
                curveToRelative(-0.2f, 0f, -0.4f, 0f, -0.6f, 0f)
                curveTo(5f, 11f, 3.2f, 9.9f, 3f, 9.5f)
                verticalLineTo(8f)
                curveToRelative(1.5f, 0.6f, 3.4f, 1f, 5.3f, 1f)
                curveTo(8.1f, 8.2f, 8f, 7.4f, 8f, 6.5f)
                curveTo(8f, 6.3f, 8f, 6.2f, 8f, 6f)
                curveTo(4.9f, 5.9f, 3.2f, 4.9f, 3f, 4.6f)
                verticalLineToRelative(0f)
                curveTo(3.2f, 4.1f, 5.1f, 3f, 8.5f, 3f)
                curveToRelative(0.1f, 0f, 0.1f, 0f, 0.2f, 0f)
                curveToRelative(0.4f, -1.1f, 1f, -2f, 1.8f, -2.9f)
                curveTo(9.8f, 0.1f, 9.2f, 0f, 8.5f, 0f)
                curveTo(4.3f, 0f, 0f, 1.5f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 3f, 4.3f, 4.5f, 8.5f, 4.5f)
                reflectiveCurveToRelative(8.5f, -1.5f, 8.5f, -4.5f)
                verticalLineTo(16f)
                curveToRelative(-1.3f, -0.1f, -2.6f, -0.4f, -3.7f, -1f)
                curveTo(12.5f, 15.5f, 10.9f, 16f, 8.5f, 16f)
                close()
                moveTo(14f, 19.5f)
                curveToRelative(-0.2f, 0.4f, -2f, 1.5f, -5.5f, 1.5f)
                reflectiveCurveTo(3.2f, 19.9f, 3f, 19.5f)
                verticalLineTo(18f)
                curveToRelative(1.6f, 0.7f, 3.5f, 1f, 5.5f, 1f)
                curveToRelative(2f, 0f, 4f, -0.3f, 5.5f, -1f)
                lineTo(14f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 10f)
                curveToRelative(-0.7f, 0f, -1.4f, -0.2f, -1.9f, -0.6f)
                lineTo(17f, 8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.6f, 0f, -1f, 0.4f, -1f, 1f)
                verticalLineToRelative(4f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(1.1f, 0.9f, 2.5f, 1.4f, 4.1f, 1.4f)
                curveToRelative(3.1f, 0f, 5.6f, -2.1f, 6.3f, -5f)
                horizontalLineToRelative(-3.2f)
                curveTo(20.1f, 9.2f, 18.9f, 10f, 17.5f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 2.5f)
                curveToRelative(-1.2f, -1.5f, -3f, -2.5f, -5f, -2.5f)
                curveToRelative(-3.4f, 0f, -6.2f, 2.6f, -6.5f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0.2f, -1.7f, 1.7f, -3f, 3.4f, -3f)
                curveToRelative(1.2f, 0f, 2.3f, 0.6f, 2.9f, 1.6f)
                lineTo(19f, 6f)
                horizontalLineToRelative(4f)
                curveToRelative(0.6f, 0f, 1f, -0.4f, 1f, -1f)
                verticalLineTo(1f)
                lineTo(22.5f, 2.5f)
                close()
            }
        }.also { _BackUp = it}
