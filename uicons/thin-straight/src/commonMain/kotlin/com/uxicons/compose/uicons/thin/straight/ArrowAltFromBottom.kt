package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Ts.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 23f)
                verticalLineTo(7f)
                horizontalLineToRelative(6.62f)
                lineTo(13.36f, 0.61f)
                curveToRelative(-0.69f, -0.78f, -2.03f, -0.77f, -2.71f, -0.0f)
                lineTo(4.88f, 7f)
                horizontalLineToRelative(6.62f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineTo(21f)
                verticalLineToRelative(-1f)
                horizontalLineTo(12.5f)
                close()
                moveTo(11.39f, 1.28f)
                curveToRelative(0.32f, -0.36f, 0.9f, -0.36f, 1.22f, 0f)
                lineToRelative(4.27f, 4.72f)
                horizontalLineTo(7.12f)
                lineTo(11.39f, 1.28f)
                close()
            }
        }.also { _ArrowAltFromBottom = it}
