package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Ss.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.28f, 14.87f)
                lineToRelative(5.72f, -5.88f)
                verticalLineToRelative(-3.99f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(4f, 2f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.03f, -0.53f, 0.06f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-7.67f, -7.67f)
                close()
                moveTo(15f, 19.26f)
                verticalLineToRelative(4.74f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-3.31f)
                lineTo(2f, 8.99f)
                verticalLineToRelative(-2.81f)
                lineToRelative(13f, 13.08f)
                close()
            }
        }.also { _FilterSlash = it}
