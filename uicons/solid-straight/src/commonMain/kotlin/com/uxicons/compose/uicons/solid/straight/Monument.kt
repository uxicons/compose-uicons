package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Ss.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.35f, 5f)
                curveToRelative(-0.08f, -0.66f, -0.38f, -1.27f, -0.85f, -1.74f)
                lineTo(14.12f, 0.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-2.38f, 2.38f)
                curveToRelative(-0.47f, 0.47f, -0.77f, 1.09f, -0.85f, 1.74f)
                horizontalLineToRelative(10.71f)
                close()
                moveTo(17.59f, 7f)
                horizontalLineToRelative(-4.59f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                lineTo(6.41f, 7f)
                lineToRelative(-1.29f, 11f)
                lineTo(2f, 18f)
                verticalLineToRelative(2f)
                lineTo(22f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(-1.29f, -11f)
                close()
            }
        }.also { _Monument = it}
