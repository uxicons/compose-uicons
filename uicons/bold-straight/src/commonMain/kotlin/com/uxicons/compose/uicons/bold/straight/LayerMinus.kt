package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerMinus: ImageVector? = null

val Icons.Bs.LayerMinus: ImageVector
    get() = _LayerMinus ?: UXIcon(name = "LayerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 11.3f)
                lineToRelative(12f, 7.2f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 14.8f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(24f, 8.2f)
                verticalLineToRelative(1.1f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 9.3f)
                verticalLineToRelative(-1.1f)
                lineTo(12f, 1f)
                lineToRelative(12f, 7.2f)
                close()
                moveTo(19.08f, 8.75f)
                lineToRelative(-7.08f, -4.25f)
                lineToRelative(-7.08f, 4.25f)
                lineToRelative(7.08f, 4.25f)
                lineToRelative(7.08f, -4.25f)
                close()
                moveTo(15f, 21.0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                lineTo(15f, 18.0f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _LayerMinus = it}
