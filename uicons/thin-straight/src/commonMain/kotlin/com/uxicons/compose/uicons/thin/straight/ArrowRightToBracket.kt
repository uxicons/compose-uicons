package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Ts.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.56f, 13.06f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.35f, -5.35f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(16.71f)
                lineToRelative(-5.35f, -5.35f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ArrowRightToBracket = it}
