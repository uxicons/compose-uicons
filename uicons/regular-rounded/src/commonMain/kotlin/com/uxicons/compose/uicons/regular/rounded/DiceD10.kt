package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Rr.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12.92f)
                arcToRelative(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, -3.24f)
                lineTo(15.1f, 1.47f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.19f, -0.01f)
                lineTo(2.02f, 9.71f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12.92f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.37f, 3.27f)
                lineToRelative(6.75f, 6.59f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 24f)
                horizontalLineToRelative(0f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, -1.2f)
                lineToRelative(6.79f, -6.65f)
                arcTo(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12.92f)
                close()
                moveTo(20.39f, 10.92f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, 0.87f)
                lineToRelative(-4.11f, -0.68f)
                lineTo(13.81f, 3.04f)
                close()
                moveTo(12.01f, 13.75f)
                lineTo(9.19f, 11.64f)
                lineToRelative(2.81f, -7.72f)
                lineToRelative(2.8f, 7.72f)
                close()
                moveTo(10.2f, 3.04f)
                lineTo(7.26f, 11.11f)
                lineTo(3.14f, 11.8f)
                arcToRelative(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -0.84f)
                close()
                moveTo(3.81f, 14.79f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -0.97f)
                lineToRelative(4.55f, -0.76f)
                lineTo(11.01f, 15.5f)
                verticalLineToRelative(6.23f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, -0.36f)
                close()
                moveTo(13.45f, 21.39f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, 0.34f)
                lineTo(13.01f, 15.5f)
                lineToRelative(3.25f, -2.44f)
                lineToRelative(4.55f, 0.76f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, 0.94f)
                close()
            }
        }.also { _DiceD10 = it}
