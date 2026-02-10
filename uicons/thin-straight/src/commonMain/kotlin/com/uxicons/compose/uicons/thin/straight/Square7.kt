package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square7: ImageVector? = null

val Icons.Ts.Square7: ImageVector
    get() = _Square7 ?: UXIcon(name = "Square7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineTo(21.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineTo(24f)
                close()
                moveTo(1f, 23f)
                horizontalLineTo(23f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(23f)
                close()
                moveTo(16f, 6.92f)
                verticalLineToRelative(-0.92f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.81f)
                lineToRelative(-5.81f, 10.53f)
                lineToRelative(0.88f, 0.48f)
                lineToRelative(6.12f, -11.1f)
                close()
            }
        }.also { _Square7 = it}
