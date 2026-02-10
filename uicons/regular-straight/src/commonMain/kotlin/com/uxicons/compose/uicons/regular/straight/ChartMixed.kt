package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartMixed: ImageVector? = null

val Icons.Rs.ChartMixed: ImageVector
    get() = _ChartMixed ?: UXIcon(name = "ChartMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 10.41f)
                lineTo(0.29f, 5.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                lineTo(12f, 0.59f)
                lineToRelative(5f, 5f)
                lineTo(22.29f, 0.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.71f, 6.71f)
                lineTo(12f, 3.41f)
                lineToRelative(-7f, 7f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(8f, 14f)
                close()
                moveTo(3f, 12f)
                lineTo(1f, 12f)
                verticalLineToRelative(12f)
                lineTo(3f, 24f)
                lineTo(3f, 12f)
                close()
                moveTo(13f, 8f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 24f)
                horizontalLineToRelative(2f)
                lineTo(13f, 8f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                lineTo(18f, 11f)
                close()
                moveTo(23f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 24f)
                horizontalLineToRelative(2f)
                lineTo(23f, 7f)
                close()
            }
        }.also { _ChartMixed = it}
