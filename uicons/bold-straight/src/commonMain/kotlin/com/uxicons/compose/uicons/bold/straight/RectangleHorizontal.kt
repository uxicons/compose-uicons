package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Bs.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(24f)
                close()
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _RectangleHorizontal = it}
