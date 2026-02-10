package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pager: ImageVector? = null

val Icons.Ts.Pager: ImageVector
    get() = _Pager ?: UXIcon(name = "Pager") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                lineTo(4f, 7f)
                verticalLineToRelative(5f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 11f)
                verticalLineToRelative(-3f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Pager = it}
