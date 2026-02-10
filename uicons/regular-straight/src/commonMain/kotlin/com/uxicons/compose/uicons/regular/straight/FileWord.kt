package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileWord: ImageVector? = null

val Icons.Rs.FileWord: ImageVector
    get() = _FileWord ?: UXIcon(name = "FileWord") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.68f, 20f)
                lineToRelative(-1.7f, -9f)
                horizontalLineToRelative(2.04f)
                lineToRelative(1.15f, 5.97f)
                lineToRelative(1.83f, -4.18f)
                lineToRelative(1.83f, 4.17f)
                lineToRelative(1.15f, -5.97f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.7f, 9f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-1.05f, -2.22f)
                lineToRelative(-1.01f, 2.22f)
                horizontalLineToRelative(-2.31f)
                close()
                moveTo(22f, 7.59f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                lineTo(14.41f, 0f)
                lineToRelative(7.59f, 7.59f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 9f)
                close()
            }
        }.also { _FileWord = it}
