package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Ts.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 1f)
                lineTo(4f, 1f)
                lineTo(4f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                lineTo(20f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(20f, 1f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 23f)
                close()
                moveTo(19f, 16f)
                lineTo(5f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 13f)
                close()
                moveTo(19f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Reel = it}
