package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Bs.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.25f, 15.03f)
                lineToRelative(4.75f, -4.92f)
                lineTo(22f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5f, 2f)
                curveToRelative(-0.24f, 0f, -0.47f, 0.03f, -0.7f, 0.07f)
                lineTo(2.12f, -0.1f)
                lineTo(0.0f, 2.02f)
                lineTo(21.88f, 23.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-6.75f, -6.75f)
                close()
                moveTo(18.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.39f)
                lineToRelative(-3.88f, 4.01f)
                lineTo(7.22f, 5f)
                horizontalLineToRelative(11.28f)
                close()
                moveTo(2.0f, 6.85f)
                lineToRelative(13.0f, 13.0f)
                verticalLineToRelative(4.05f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-2.12f)
                lineTo(2.01f, 10.12f)
                lineToRelative(-0.01f, -3.27f)
                close()
            }
        }.also { _FilterSlash = it}
