package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Tr.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 21f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(7.5f)
                curveTo(0f, 5.02f, 2.02f, 3f, 4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(4.5f)
                close()
            }
        }.also { _RectangleHorizontal = it}
