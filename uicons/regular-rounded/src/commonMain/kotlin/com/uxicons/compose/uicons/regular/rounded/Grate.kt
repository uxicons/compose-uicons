package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Rr.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                lineTo(18f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(11f, 13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 11f)
                lineTo(8f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                close()
                moveTo(13f, 11f)
                lineTo(13f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                lineTo(2f, 11f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Grate = it}
