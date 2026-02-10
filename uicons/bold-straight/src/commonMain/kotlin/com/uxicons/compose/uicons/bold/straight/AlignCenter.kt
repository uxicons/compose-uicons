package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignCenter: ImageVector? = null

val Icons.Bs.AlignCenter: ImageVector
    get() = _AlignCenter ?: UXIcon(name = "AlignCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _AlignCenter = it}
