package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSankey: ImageVector? = null

val Icons.Rs.DiagramSankey: ImageVector
    get() = _DiagramSankey ?: UXIcon(name = "DiagramSankey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(15.83f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-4.71f, 4.71f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9.59f)
                lineTo(13.71f, 0.88f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(12.12f, 21.71f)
                lineToRelative(-6.71f, -6.71f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.59f)
                lineToRelative(6.12f, 6.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(11.17f)
                verticalLineToRelative(-2f)
                horizontalLineTo(12.83f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.59f)
                lineToRelative(5.12f, 5.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(7.17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-3.71f, -3.71f)
                horizontalLineToRelative(11.59f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                close()
            }
        }.also { _DiagramSankey = it}
