package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Ss.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(11f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(0f, 14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                lineTo(0f, 8f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Table = it}
