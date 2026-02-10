package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogText: ImageVector? = null

val Icons.Ss.BlogText: ImageVector
    get() = _BlogText ?: UXIcon(name = "BlogText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 7f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(13f)
                lineTo(0f, 22f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(10f, 12f)
                lineTo(4f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BlogText = it}
