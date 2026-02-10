package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerPlus: ImageVector? = null

val Icons.Rs.LayerPlus: ImageVector
    get() = _LayerPlus ?: UXIcon(name = "LayerPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.37f)
                verticalLineToRelative(2.33f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 11.7f)
                verticalLineToRelative(-2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                close()
                moveTo(12f, 14.4f)
                lineTo(0.06f, 7.23f)
                lineTo(12f, 0.06f)
                lineToRelative(11.94f, 7.17f)
                lineToRelative(-11.94f, 7.17f)
                close()
                moveTo(3.94f, 7.23f)
                lineToRelative(8.06f, 4.83f)
                lineToRelative(8.06f, -4.83f)
                lineTo(12f, 2.4f)
                lineTo(3.94f, 7.23f)
                close()
                moveTo(0f, 13.7f)
                verticalLineToRelative(2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(2f, -1.2f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-2f, 1.2f)
                lineTo(0f, 13.7f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _LayerPlus = it}
