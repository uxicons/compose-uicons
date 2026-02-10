package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Rs.FilterSlash: ImageVector
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
                moveTo(19f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.18f)
                lineToRelative(-5.13f, 5.28f)
                lineTo(5.41f, 4f)
                horizontalLineToRelative(13.59f)
                close()
                moveTo(13f, 17.26f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(4.74f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-3.31f)
                lineTo(2f, 8.99f)
                verticalLineToRelative(-2.81f)
                lineTo(11f, 15.38f)
                verticalLineToRelative(3.12f)
                lineToRelative(2f, 1.5f)
                verticalLineToRelative(-2.74f)
                close()
            }
        }.also { _FilterSlash = it}
