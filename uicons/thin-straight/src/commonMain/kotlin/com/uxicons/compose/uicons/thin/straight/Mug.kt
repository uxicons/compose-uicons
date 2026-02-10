package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Ts.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 2f)
                horizontalLineToRelative(2f)
                lineTo(21f, 1f)
                lineTo(0f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 2f)
                lineTo(2f, 20.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(16.5f, 22f)
                lineTo(4.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(3f, 7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                lineTo(3f, 6f)
                lineTo(3f, 2f)
                horizontalLineToRelative(15f)
                lineTo(18f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 7f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.also { _Mug = it}
