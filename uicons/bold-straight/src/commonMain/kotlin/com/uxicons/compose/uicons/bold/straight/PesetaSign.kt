package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Bs.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7.5f)
                horizontalLineToRelative(-2.13f)
                curveTo(20.16f, 3.25f, 16.45f, 0f, 12f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(3f, 7.5f)
                lineTo(1f, 7.5f)
                verticalLineToRelative(3f)
                lineTo(3f, 10.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                curveToRelative(4.45f, 0f, 8.16f, -3.25f, 8.87f, -7.5f)
                horizontalLineToRelative(2.13f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.79f, 0f, 5.14f, 1.91f, 5.81f, 4.5f)
                lineTo(6f, 7.5f)
                lineTo(6f, 3.5f)
                close()
                moveTo(12f, 15f)
                lineTo(6f, 15f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(11.81f)
                curveToRelative(-0.67f, 2.59f, -3.02f, 4.5f, -5.81f, 4.5f)
                close()
            }
        }.also { _PesetaSign = it}
