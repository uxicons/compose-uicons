package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookUser: ImageVector? = null

val Icons.Bs.BookUser: ImageVector
    get() = _BookUser ?: UXIcon(name = "BookUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(15f, 9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(23f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(5f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4f)
                curveTo(1f, 1.79f, 2.79f, 0f, 5f, 0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20f, 3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(10f)
                lineTo(20f, 3f)
                close()
                moveTo(4f, 4f)
                verticalLineToRelative(12.13f)
                curveToRelative(0.32f, -0.08f, 0.66f, -0.13f, 1f, -0.13f)
                horizontalLineToRelative(2f)
                lineTo(7f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(20f, 21f)
                verticalLineToRelative(-2f)
                lineTo(5f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _BookUser = it}
