package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockQuote: ImageVector? = null

val Icons.Rs.BlockQuote: ImageVector
    get() = _BlockQuote ?: UXIcon(name = "BlockQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                lineTo(6f, 19f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                lineTo(6f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                lineTo(0f, 11f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _BlockQuote = it}
