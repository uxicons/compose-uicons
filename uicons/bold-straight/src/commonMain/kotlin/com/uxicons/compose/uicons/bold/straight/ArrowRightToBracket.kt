package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Bs.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.27f, 13.77f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.65f, -3.65f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(13.29f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-5f)
                verticalLineTo(3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _ArrowRightToBracket = it}
