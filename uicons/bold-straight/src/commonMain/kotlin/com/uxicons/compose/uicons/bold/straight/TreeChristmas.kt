package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeChristmas: ImageVector? = null

val Icons.Bs.TreeChristmas: ImageVector
    get() = _TreeChristmas ?: UXIcon(name = "TreeChristmas", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(288.83f, 512f)
                verticalLineToRelative(-42.67f)
                horizontalLineToRelative(219.16f)
                lineToRelative(-86.04f, -128.28f)
                horizontalLineToRelative(53.91f)
                lineToRelative(-85.33f, -127.72f)
                horizontalLineToRelative(46.93f)
                curveToRelative(0f, 0f, -99.23f, -145.07f, -134.87f, -191.55f)
                curveToRelative(-0.81f, -1.06f, -3.41f, -4.1f, -3.41f, -4.1f)
                curveTo(288.01f, 6.34f, 272.75f, -0.04f, 256.83f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-15.93f, -0.05f, -33.43f, 6.36f, -42.35f, 17.71f)
                lineTo(73.3f, 213.33f)
                horizontalLineTo(121.6f)
                lineToRelative(-85.33f, 128f)
                horizontalLineToRelative(53.72f)
                lineToRelative(-86.06f, 128f)
                horizontalLineToRelative(220.91f)
                verticalLineTo(512f)
                horizontalLineTo(288.83f)
                close()
                moveTo(155.73f, 277.33f)
                lineToRelative(85.33f, -128f)
                horizontalLineToRelative(-42.9f)
                lineToRelative(58.58f, -81.47f)
                lineToRelative(57.34f, 81.47f)
                horizontalLineToRelative(-43.28f)
                lineToRelative(85.33f, 127.72f)
                horizontalLineToRelative(-54.19f)
                lineToRelative(86.04f, 128.28f)
                horizontalLineTo(124.07f)
                lineToRelative(86.06f, -128f)
                horizontalLineTo(155.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.33f, 352f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(266.67f, 245.33f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
        }.also { _TreeChristmas = it}
