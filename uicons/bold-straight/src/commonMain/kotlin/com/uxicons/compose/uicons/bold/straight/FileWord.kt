package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileWord: ImageVector? = null

val Icons.Bs.FileWord: ImageVector
    get() = _FileWord ?: UXIcon(name = "FileWord") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.66f)
                lineTo(16.38f, 0f)
                horizontalLineTo(5f)
                curveTo(3.35f, 0f, 2f, 1.35f, 2f, 3f)
                verticalLineTo(24f)
                reflectiveCurveToRelative(20f, 0f, 20f, 0f)
                verticalLineTo(5.66f)
                close()
                moveTo(5f, 3f)
                horizontalLineTo(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                close()
                moveTo(15.3f, 22f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-1.05f, -2.22f)
                lineToRelative(-1.01f, 2.22f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-1.51f, -8f)
                horizontalLineToRelative(2.04f)
                lineToRelative(0.96f, 4.97f)
                lineToRelative(1.83f, -4.18f)
                lineToRelative(1.83f, 4.17f)
                lineToRelative(0.96f, -4.97f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.51f, 8f)
                close()
            }
        }.also { _FileWord = it}
