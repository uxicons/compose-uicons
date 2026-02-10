package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayChartUp: ImageVector? = null

val Icons.Rs.DisplayChartUp: ImageVector
    get() = _DisplayChartUp ?: UXIcon(name = "DisplayChartUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(11f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
                moveTo(2f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(21.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(2f, 17f)
                lineTo(2f, 3.5f)
                close()
                moveTo(20f, 6.5f)
                verticalLineToRelative(4.48f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.56f)
                lineToRelative(-5.15f, 5.15f)
                lineToRelative(-3f, -3f)
                lineToRelative(-4.27f, 4.27f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.69f, -5.69f)
                lineToRelative(3f, 3f)
                lineToRelative(3.74f, -3.74f)
                horizontalLineToRelative(-2.56f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.48f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _DisplayChartUp = it}
