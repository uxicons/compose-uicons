package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Bs.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-10.5f)
                close()
                moveTo(7.5f, 7f)
                lineToRelative(3.79f, 3.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _DisplayArrowDown = it}
