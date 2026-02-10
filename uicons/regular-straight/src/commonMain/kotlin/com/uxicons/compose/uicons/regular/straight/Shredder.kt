package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shredder: ImageVector? = null

val Icons.Rs.Shredder: ImageVector
    get() = _Shredder ?: UXIcon(name = "Shredder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                lineTo(24f, 16f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 2f)
                close()
                moveTo(22f, 14f)
                lineTo(2f, 14f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                lineTo(3f, 24f)
                verticalLineToRelative(-6f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Shredder = it}
