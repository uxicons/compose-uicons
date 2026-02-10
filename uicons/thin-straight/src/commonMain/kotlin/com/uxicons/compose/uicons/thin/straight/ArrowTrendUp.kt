package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Ts.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 6f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7.29f)
                lineToRelative(-9.29f, 9.29f)
                lineToRelative(-6f, -6f)
                lineTo(0.03f, 17.27f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.27f, -6.27f)
                lineToRelative(6f, 6f)
                lineTo(23f, 7.71f)
                verticalLineToRelative(7.29f)
                horizontalLineToRelative(1f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowTrendUp = it}
