package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Bs.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18.97f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineTo(0f)
                verticalLineTo(10.51f)
                curveTo(0f, 8.58f, 1.57f, 7.01f, 3.5f, 7.01f)
                horizontalLineToRelative(3.76f)
                curveToRelative(-0.69f, 0.83f, -1.13f, 1.87f, -1.24f, 3f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.46f)
                horizontalLineTo(14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(23.27f, 6.75f)
                lineTo(16.52f, 0f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.9f, 4.9f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.46f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.79f)
                lineToRelative(-4.9f, 4.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(6.75f, -6.75f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _ShareSquare = it}
