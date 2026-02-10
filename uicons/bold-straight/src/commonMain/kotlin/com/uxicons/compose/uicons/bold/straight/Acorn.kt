package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Bs.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-3f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                horizontalLineToRelative(-3f)
                curveTo(3.92f, 2f, 1f, 4.92f, 1f, 8.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 11f)
                verticalLineToRelative(2.93f)
                curveToRelative(0f, 6.68f, 8.14f, 9.72f, 8.49f, 9.85f)
                lineToRelative(0.51f, 0.19f)
                lineToRelative(0.51f, -0.19f)
                curveToRelative(0.35f, -0.13f, 8.49f, -3.17f, 8.49f, -9.85f)
                verticalLineToRelative(-2.93f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(7.5f, 5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(4.04f, 8f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(18f, 13.93f)
                curveToRelative(0f, 3.81f, -4.46f, 6.13f, -6f, 6.81f)
                curveToRelative(-1.54f, -0.69f, -6f, -3.01f, -6f, -6.81f)
                verticalLineToRelative(-2.93f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2.93f)
                close()
            }
        }.also { _Acorn = it}
