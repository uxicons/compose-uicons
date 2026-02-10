package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSankey: ImageVector? = null

val Icons.Bs.DiagramSankey: ImageVector
    get() = _DiagramSankey ?: UXIcon(name = "DiagramSankey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(15.83f)
                curveToRelative(-0.13f, 0f, -0.26f, 0.05f, -0.35f, 0.15f)
                lineToRelative(-3.85f, 3.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(10.38f)
                lineToRelative(2.97f, -2.97f)
                curveToRelative(0.66f, -0.66f, 1.54f, -1.03f, 2.47f, -1.03f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(12.47f, 20.85f)
                lineToRelative(-6.85f, -6.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.38f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.47f, 1.03f)
                horizontalLineToRelative(11.17f)
                verticalLineToRelative(-3f)
                horizontalLineTo(12.83f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(3f)
                horizontalLineTo(9.38f)
                lineToRelative(4.97f, 4.97f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.47f, 1.03f)
                horizontalLineToRelative(7.17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-2.85f, -2.85f)
                horizontalLineToRelative(10.38f)
                verticalLineToRelative(-3f)
                horizontalLineTo(0f)
                close()
            }
        }.also { _DiagramSankey = it}
