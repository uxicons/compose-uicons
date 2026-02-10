package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filters: ImageVector? = null

val Icons.Bs.Filters: ImageVector
    get() = _Filters ?: UXIcon(name = "Filters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 20.93f)
                lineToRelative(-8f, -6.19f)
                verticalLineToRelative(-2.62f)
                lineTo(4f, 6.12f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.62f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(8.81f)
                close()
                moveTo(13f, 13.26f)
                lineToRelative(2f, 1.55f)
                verticalLineToRelative(-3.93f)
                lineToRelative(6f, -6f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(7.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.38f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(2.38f)
                close()
                moveTo(0f, 6.5f)
                verticalLineToRelative(2.62f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(2.62f)
                lineToRelative(8f, 6.19f)
                verticalLineToRelative(-3.79f)
                lineToRelative(-5f, -3.87f)
                verticalLineToRelative(-2.38f)
                lineTo(2f, 7f)
                lineTo(2f, 3.34f)
                curveTo(0.82f, 3.9f, 0f, 5.11f, 0f, 6.5f)
                close()
            }
        }.also { _Filters = it}
