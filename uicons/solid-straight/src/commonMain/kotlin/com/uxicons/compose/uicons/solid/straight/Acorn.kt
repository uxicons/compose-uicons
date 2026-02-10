package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Ss.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                verticalLineToRelative(1f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1f)
                curveTo(1f, 4.69f, 3.69f, 2f, 7f, 2f)
                horizontalLineToRelative(4f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(3f, 13.91f)
                curveToRelative(0f, 6.71f, 8.3f, 9.81f, 8.66f, 9.94f)
                lineToRelative(0.34f, 0.12f)
                lineToRelative(0.34f, -0.12f)
                curveToRelative(0.35f, -0.13f, 8.66f, -3.23f, 8.66f, -9.94f)
                verticalLineToRelative(-2.91f)
                horizontalLineTo(3f)
                verticalLineToRelative(2.91f)
                close()
            }
        }.also { _Acorn = it}
