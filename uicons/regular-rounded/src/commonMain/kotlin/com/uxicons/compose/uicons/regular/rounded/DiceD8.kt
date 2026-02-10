package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Rr.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 8.76f)
                lineTo(14.99f, 1.34f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -0.01f)
                horizontalLineToRelative(0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.99f, 1.34f)
                lineTo(2.17f, 8.78f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.2f, 15.25f)
                lineTo(9.02f, 22.67f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 1.35f)
                horizontalLineToRelative(0.01f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.98f, -1.34f)
                lineToRelative(6.83f, -7.47f)
                arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.8f, 8.76f)
                close()
                moveTo(13.5f, 2.68f)
                lineTo(20.29f, 10.08f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.62f, 1.24f)
                lineTo(13f, 13.66f)
                lineTo(13f, 2.26f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.51f, 2.68f)
                close()
                moveTo(10.48f, 2.68f)
                lineTo(10.49f, 2.66f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.41f)
                lineTo(10.99f, 13.66f)
                lineTo(3.07f, 11.32f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -1.22f)
                close()
                moveTo(10.5f, 21.33f)
                lineTo(3.7f, 13.93f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -0.42f)
                lineTo(11f, 15.75f)
                lineTo(11f, 21.74f)
                arcTo(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.51f, 21.33f)
                close()
                moveTo(13.51f, 21.34f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.52f, 0.42f)
                lineTo(12.99f, 15.75f)
                lineTo(20.61f, 13.5f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.28f, 0.39f)
                close()
            }
        }.also { _DiceD8 = it}
