package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Ss.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.59f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6.56f, 0f)
                curveToRelative(-1.39f, 0f, -2.57f, 0.95f, -2.9f, 2.24f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.96f, -2.96f)
                close()
                moveTo(10.92f, 15.93f)
                lineToRelative(-7.92f, 8.07f)
                verticalLineToRelative(-15.99f)
                lineToRelative(7.92f, 7.92f)
                close()
            }
        }.also { _BookmarkSlash = it}
