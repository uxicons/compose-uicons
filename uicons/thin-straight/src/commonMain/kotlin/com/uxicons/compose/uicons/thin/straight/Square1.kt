package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Ts.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
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
                moveTo(13f, 6f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-3.36f, 3.45f)
                lineToRelative(0.72f, 0.7f)
                lineToRelative(2.44f, -2.51f)
                verticalLineToRelative(10.36f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Square1 = it}
