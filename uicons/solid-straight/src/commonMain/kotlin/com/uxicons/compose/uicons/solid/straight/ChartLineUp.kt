package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Ss.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                horizontalLineTo(24f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(17f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-5.59f, 5.59f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6.71f, 6.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.29f, -5.29f)
                lineToRelative(4f, 4f)
                lineToRelative(7f, -7f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _ChartLineUp = it}
