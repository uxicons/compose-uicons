package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAi: ImageVector? = null

val Icons.Bs.FileAi: ImageVector
    get() = _FileAi ?: UXIcon(name = "FileAi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.14f, 5.06f)
                lineToRelative(-0.55f, 1.45f)
                lineToRelative(1.1f, 0f)
                lineToRelative(-0.55f, -1.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(17.47f)
                lineTo(24f, 17.47f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(11.27f, 3f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(9.06f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(6.61f, 2.94f)
                lineToRelative(1.06f, 0f)
                lineToRelative(2.33f, 6.18f)
                lineToRelative(-1.34f, 0f)
                lineTo(8.16f, 7.76f)
                horizontalLineTo(6.12f)
                lineTo(5.6f, 9.12f)
                horizontalLineTo(4.26f)
                close()
                moveTo(21f, 15f)
                horizontalLineTo(15f)
                verticalLineToRelative(6f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                close()
            }
        }.also { _FileAi = it}
