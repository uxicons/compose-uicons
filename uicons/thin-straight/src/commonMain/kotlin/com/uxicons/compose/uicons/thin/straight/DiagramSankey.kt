package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSankey: ImageVector? = null

val Icons.Ts.DiagramSankey: ImageVector
    get() = _DiagramSankey ?: UXIcon(name = "DiagramSankey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(15.83f)
                curveToRelative(-0.39f, 0f, -0.78f, 0.16f, -1.06f, 0.44f)
                lineToRelative(-4.56f, 4.56f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(9.79f)
                lineTo(14.06f, 0.73f)
                curveToRelative(0.47f, -0.47f, 1.1f, -0.73f, 1.77f, -0.73f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(11.77f, 22.56f)
                lineToRelative(-6.56f, -6.56f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.79f)
                lineToRelative(6.27f, 6.27f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(11.17f)
                verticalLineToRelative(-1f)
                horizontalLineTo(12.83f)
                curveToRelative(-0.39f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(1f)
                horizontalLineTo(9.79f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(7.17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.39f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineToRelative(-4.56f, -4.56f)
                horizontalLineToRelative(12.79f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0f)
                close()
            }
        }.also { _DiagramSankey = it}
