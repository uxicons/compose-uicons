package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fusilli: ImageVector? = null

val Icons.Ss.Fusilli: ImageVector
    get() = _Fusilli ?: UXIcon(name = "Fusilli") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(7f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(16f, 5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(8f, 12f)
                verticalLineToRelative(7f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-7f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(0f, 21f)
                lineTo(0f, 21f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                close()
            }
        }.also { _Fusilli = it}
