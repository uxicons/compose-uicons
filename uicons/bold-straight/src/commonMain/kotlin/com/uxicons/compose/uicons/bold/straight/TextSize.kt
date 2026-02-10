package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSize: ImageVector? = null

val Icons.Bs.TextSize: ImageVector
    get() = _TextSize ?: UXIcon(name = "TextSize") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineTo(14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13.5f, 4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(23f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }.also { _TextSize = it}
