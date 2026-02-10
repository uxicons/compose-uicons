package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fusilli: ImageVector? = null

val Icons.Sr.Fusilli: ImageVector
    get() = _Fusilli ?: UXIcon(name = "Fusilli") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(7f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(16f, 5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(23f, 3f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 1f)
                curveToRelative(0f, -1f, -1f, -1f, -1f, -1f)
                curveToRelative(-1.24f, 0f, -2f, 1.01f, -2f, 2.25f)
                verticalLineToRelative(7.75f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.24f, 0f, 2.25f, -0.76f, 2.25f, -2f)
                curveToRelative(0f, 0f, 0f, -1f, -1f, -1f)
                close()
                moveTo(1f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1f, 1f, 1f, 1f, 1f)
                curveToRelative(1.24f, 0f, 2f, -1.01f, 2f, -2.25f)
                verticalLineToRelative(-7.75f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.24f, 0f, -2.25f, 0.76f, -2.25f, 2f)
                curveToRelative(0f, 0f, 0f, 1f, 1f, 1f)
                close()
            }
        }.also { _Fusilli = it}
