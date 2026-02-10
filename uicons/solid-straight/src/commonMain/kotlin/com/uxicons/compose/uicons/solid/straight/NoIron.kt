package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Ss.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineToRelative(14.5f)
                lineToRelative(-1.46f, 1.46f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(10.41f, 9f)
                horizontalLineToRelative(11.59f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(0f, 19.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(17.76f)
                lineTo(5.86f, 10.1f)
                curveTo(2.39f, 11.81f, 0f, 15.38f, 0f, 19.5f)
                close()
            }
        }.also { _NoIron = it}
