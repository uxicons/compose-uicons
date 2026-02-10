package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Bs.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(378.94f, 0f)
                horizontalLineTo(126.99f)
                curveTo(92.2f, 0f, 64f, 28.2f, 64f, 62.99f)
                verticalLineToRelative(448.64f)
                lineToRelative(83.98f, -58.39f)
                lineToRelative(52.49f, 36.53f)
                lineToRelative(52.49f, -36.51f)
                lineToRelative(52.49f, 36.51f)
                lineToRelative(52.49f, -36.49f)
                lineToRelative(83.98f, 58.47f)
                verticalLineTo(62.99f)
                curveTo(441.92f, 28.2f, 413.72f, 0f, 378.94f, 0f)
                close()
                moveTo(378.94f, 391.07f)
                lineToRelative(-21f, -14.55f)
                lineToRelative(-52.49f, 36.53f)
                lineToRelative(-52.49f, -36.51f)
                lineToRelative(-52.49f, 36.51f)
                lineToRelative(-52.49f, -36.49f)
                lineToRelative(-21f, 14.7f)
                verticalLineTo(62.99f)
                horizontalLineToRelative(251.95f)
                verticalLineTo(391.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(170.67f, 128f)
                horizontalLineToRelative(170.67f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-170.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(170.67f, 234.67f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-128f)
                close()
            }
        }.also { _Receipt = it}
