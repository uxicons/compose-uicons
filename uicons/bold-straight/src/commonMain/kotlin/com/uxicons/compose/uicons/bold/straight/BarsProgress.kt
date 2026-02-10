package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsProgress: ImageVector? = null

val Icons.Bs.BarsProgress: ImageVector
    get() = _BarsProgress ?: UXIcon(name = "BarsProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 7.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(14f, 5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(21f, 7.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(20.5f, 13f)
                lineTo(3.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 22f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 18.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(21f, 18.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(11f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BarsProgress = it}
