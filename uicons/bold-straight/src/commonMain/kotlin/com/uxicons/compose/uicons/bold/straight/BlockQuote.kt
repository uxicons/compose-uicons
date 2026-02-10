package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockQuote: ImageVector? = null

val Icons.Bs.BlockQuote: ImageVector
    get() = _BlockQuote ?: UXIcon(name = "BlockQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(3f)
                lineTo(0f, 5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                lineTo(7f, 19f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                lineTo(7f, 10f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                lineTo(0f, 10f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _BlockQuote = it}
