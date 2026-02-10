package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerMinus: ImageVector? = null

val Icons.Ss.LayerMinus: ImageVector
    get() = _LayerMinus ?: UXIcon(name = "LayerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.7f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 11.7f)
                verticalLineToRelative(-2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(2.33f)
                close()
                moveTo(23.94f, 7.23f)
                lineTo(12f, 0.06f)
                lineTo(0.06f, 7.23f)
                lineToRelative(11.94f, 7.17f)
                lineToRelative(11.94f, -7.17f)
                close()
                moveTo(14f, 19.7f)
                lineToRelative(-2f, 1.2f)
                lineTo(0f, 13.7f)
                verticalLineToRelative(2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(2f, -1.2f)
                verticalLineToRelative(-2.33f)
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _LayerMinus = it}
