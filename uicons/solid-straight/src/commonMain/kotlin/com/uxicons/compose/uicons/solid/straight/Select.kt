package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Select: ImageVector? = null

val Icons.Ss.Select: ImageVector
    get() = _Select ?: UXIcon(name = "Select") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 9.75f)
                lineToRelative(4.19f, -4.19f)
                lineToRelative(4f, 4f)
                lineToRelative(-4.19f, 4.19f)
                close()
                moveTo(8.83f, 11.17f)
                lineToRelative(-8f, 8f)
                arcToRelative(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.83f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -0.83f)
                lineToRelative(8f, -8f)
                close()
                moveTo(18.67f, 17.3f)
                lineTo(20f, 19.96f)
                lineTo(21.33f, 17.3f)
                lineTo(24f, 15.96f)
                lineToRelative(-2.67f, -1.33f)
                lineTo(20f, 11.96f)
                lineToRelative(-1.33f, 2.67f)
                lineTo(16f, 15.96f)
                close()
                moveTo(6.67f, 5.34f)
                lineTo(8f, 8f)
                lineTo(9.33f, 5.33f)
                lineTo(12f, 4f)
                lineTo(9.33f, 2.67f)
                lineTo(8f, 0f)
                lineTo(6.67f, 2.67f)
                lineTo(4f, 4f)
                close()
                moveTo(19.33f, 4.67f)
                lineTo(20.5f, 7f)
                lineToRelative(1.17f, -2.33f)
                lineTo(24f, 3.5f)
                lineTo(21.67f, 2.33f)
                lineTo(20.5f, 0f)
                lineTo(19.33f, 2.33f)
                lineTo(17f, 3.5f)
                close()
            }
        }.also { _Select = it}
