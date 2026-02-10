package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Bs.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.71f, 10.5f)
                horizontalLineToRelative(14.29f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.71f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.73f, 13.77f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
                lineTo(6.23f, 4.73f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.65f, 3.65f)
                close()
                moveTo(21f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
