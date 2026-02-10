package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartMixed: ImageVector? = null

val Icons.Bs.ChartMixed: ImageVector
    get() = _ChartMixed ?: UXIcon(name = "ChartMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 11.62f)
                lineTo(-0.06f, 6.56f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.94f, 2.94f)
                lineTo(12f, 0.38f)
                lineToRelative(5f, 5f)
                lineTo(21.94f, 0.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-7.06f, 7.06f)
                lineToRelative(-5f, -5f)
                lineToRelative(-7f, 7f)
                close()
                moveTo(8f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                lineTo(8f, 15f)
                close()
                moveTo(3f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(11f)
                lineTo(3f, 24f)
                lineTo(3f, 13f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(3f)
                lineTo(13f, 9f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                lineTo(18f, 12f)
                close()
                moveTo(23f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(3f)
                lineTo(23f, 9f)
                close()
            }
        }.also { _ChartMixed = it}
