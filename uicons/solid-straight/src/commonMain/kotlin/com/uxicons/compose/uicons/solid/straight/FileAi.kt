package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAi: ImageVector? = null

val Icons.Ss.FileAi: ImageVector
    get() = _FileAi ?: UXIcon(name = "FileAi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.41f)
                lineToRelative(4.41f, -4.41f)
                lineToRelative(-4.41f, 0f)
                lineToRelative(0f, 4.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.48f, 8.57f)
                lineToRelative(1.1f, 0f)
                lineToRelative(-0.55f, -1.45f)
                lineToRelative(-0.55f, 1.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(17f, 24f)
                lineTo(17f, 17f)
                horizontalLineToRelative(7f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(8.56f, 11.19f)
                lineTo(8.05f, 9.82f)
                lineTo(6f, 9.82f)
                lineToRelative(-0.52f, 1.36f)
                lineTo(4.15f, 11.19f)
                lineTo(6.5f, 5.01f)
                lineTo(7.57f, 5f)
                lineTo(9.9f, 11.19f)
                close()
                moveTo(12.41f, 11.13f)
                horizontalLineToRelative(-1.25f)
                lineTo(11.16f, 5.06f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }.also { _FileAi = it}
