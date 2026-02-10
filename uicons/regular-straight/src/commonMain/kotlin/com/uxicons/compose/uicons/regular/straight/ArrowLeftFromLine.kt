package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Rs.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.59f, 13.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineTo(6.09f, 5.09f)
                lineToRelative(1.41f, 1.41f)
                lineTo(3f, 11f)
                close()
                moveTo(22f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
