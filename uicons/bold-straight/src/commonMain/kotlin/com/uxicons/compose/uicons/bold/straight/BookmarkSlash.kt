package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Bs.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.88f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.56f, 1f)
                curveToRelative(-0.67f, 0f, -1.28f, 0.27f, -1.73f, 0.7f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.96f, -2.96f)
                close()
                moveTo(18f, 4f)
                verticalLineToRelative(11.88f)
                lineTo(6.12f, 4f)
                horizontalLineToRelative(11.88f)
                close()
                moveTo(8.79f, 13.8f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-7.92f, 8.07f)
                verticalLineToRelative(-15.99f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(5.65f)
                lineToRelative(2.79f, -2.85f)
                close()
            }
        }.also { _BookmarkSlash = it}
