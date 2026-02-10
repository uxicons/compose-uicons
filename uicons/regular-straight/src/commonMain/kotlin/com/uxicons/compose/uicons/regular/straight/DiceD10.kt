package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Rs.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.12f, 0.87f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 0.87f)
                lineTo(0.03f, 13.06f)
                lineTo(9.9f, 23.13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.23f, -0.01f)
                lineTo(23.97f, 13.06f)
                close()
                moveTo(12.01f, 13.75f)
                lineTo(9.19f, 11.64f)
                lineToRelative(2.81f, -7.72f)
                lineToRelative(2.8f, 7.72f)
                close()
                moveTo(7.26f, 11.11f)
                lineTo(3.7f, 11.7f)
                lineTo(9.79f, 4.18f)
                close()
                moveTo(16.74f, 11.11f)
                lineTo(14.22f, 4.17f)
                lineTo(20.3f, 11.7f)
                close()
                moveTo(3.51f, 13.76f)
                lineToRelative(4.23f, -0.7f)
                lineTo(11.01f, 15.5f)
                verticalLineToRelative(5.91f)
                close()
                moveTo(13.01f, 21.41f)
                lineTo(13.01f, 15.5f)
                lineToRelative(3.25f, -2.44f)
                lineToRelative(4.23f, 0.7f)
                close()
            }
        }.also { _DiceD10 = it}
