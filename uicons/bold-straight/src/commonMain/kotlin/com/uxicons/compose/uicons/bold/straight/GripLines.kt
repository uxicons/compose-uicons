package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLines: ImageVector? = null

val Icons.Bs.GripLines: ImageVector
    get() = _GripLines ?: UXIcon(name = "GripLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                lineTo(0f, 17f)
                verticalLineToRelative(-3f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 7f)
                close()
            }
        }.also { _GripLines = it}
