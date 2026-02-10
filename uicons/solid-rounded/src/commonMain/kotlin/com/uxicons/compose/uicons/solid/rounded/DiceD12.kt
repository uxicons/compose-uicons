package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD12: ImageVector? = null

val Icons.Sr.DiceD12: ImageVector
    get() = _DiceD12 ?: UXIcon(name = "DiceD12") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.26f, 13.75f)
                lineTo(0.87f, 7.28f)
                lineTo(2.44f, 4.65f)
                lineTo(11f, 6.79f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(21.55f, 4.63f)
                lineTo(13f, 6.77f)
                verticalLineToRelative(4.61f)
                lineToRelative(4.74f, 2.37f)
                lineToRelative(5.38f, -6.49f)
                close()
                moveTo(12f, 13.12f)
                lineTo(7.25f, 15.5f)
                lineTo(10.36f, 24f)
                horizontalLineToRelative(3.23f)
                lineToRelative(3.16f, -8.51f)
                close()
                moveTo(18.88f, 15.51f)
                lineTo(15.88f, 23.59f)
                arcToRelative(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, -0.3f)
                lineToRelative(3.19f, -1.92f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, -1.72f)
                lineToRelative(1.92f, -3.19f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13.89f)
                lineTo(24f, 10.11f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.05f, -0.71f)
                close()
                moveTo(11.96f, 4.97f)
                lineToRelative(8.15f, -2.04f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, -0.3f)
                lineTo(16.46f, 0.71f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.89f, 0f)
                lineTo(10.11f, 0f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.54f, 0.71f)
                lineTo(4.34f, 2.63f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, 0.32f)
                close()
                moveTo(5.12f, 15.51f)
                lineTo(0.05f, 9.42f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.11f)
                verticalLineToRelative(3.78f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 2.57f)
                lineToRelative(1.92f, 3.19f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, 1.72f)
                lineToRelative(3.19f, 1.92f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 0.28f)
                close()
            }
        }.also { _DiceD12 = it}
