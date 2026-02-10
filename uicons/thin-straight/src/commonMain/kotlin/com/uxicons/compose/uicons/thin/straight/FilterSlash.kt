package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Ts.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.84f, 15.13f)
                lineToRelative(6.16f, -6.34f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.15f, -1.37f, 0.42f)
                lineTo(0.76f, 0.06f)
                lineTo(0.06f, 0.76f)
                lineTo(23.24f, 23.94f)
                lineToRelative(0.71f, -0.71f)
                lineTo(15.84f, 15.13f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.88f)
                lineToRelative(-5.87f, 6.04f)
                lineTo(3.86f, 3.15f)
                curveToRelative(0.2f, -0.1f, 0.42f, -0.15f, 0.64f, -0.15f)
                close()
                moveTo(14f, 17.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(5.5f)
                lineToRelative(-6f, -4.53f)
                verticalLineToRelative(-3.56f)
                lineTo(2f, 8.79f)
                verticalLineToRelative(-3.25f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1.84f)
                lineToRelative(7f, 7.15f)
                verticalLineToRelative(3.4f)
                lineToRelative(4f, 3.07f)
                verticalLineToRelative(-4.46f)
                close()
            }
        }.also { _FilterSlash = it}
