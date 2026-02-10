package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fox: ImageVector? = null

val Icons.Rs.Fox: ImageVector
    get() = _Fox ?: UXIcon(name = "Fox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 0f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.6f, 3.78f)
                arcTo(21.87f, 21.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                arcToRelative(21.88f, 21.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.4f, 0.78f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 11.93f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.76f, 4.24f)
                lineToRelative(6.95f, 6.95f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.83f, 24f)
                horizontalLineToRelative(2.34f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(6.95f, -6.95f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.93f)
                lineTo(24f, 0f)
                close()
                moveTo(9f, 20.59f)
                lineTo(3.17f, 14.76f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11.93f)
                lineTo(2f, 10.21f)
                arcToRelative(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0.72f)
                arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.62f, 3.05f)
                arcTo(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                close()
                moveTo(22f, 11.93f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, 2.83f)
                lineTo(15f, 20.59f)
                lineTo(15f, 19f)
                arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.38f, -5.01f)
                arcTo(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10.94f)
                arcToRelative(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -0.72f)
                close()
                moveTo(22f, 8.17f)
                curveToRelative(-2.43f, 0.56f, -9f, 2.81f, -9f, 10.83f)
                verticalLineToRelative(1f)
                lineTo(11f, 20f)
                lineTo(11f, 19f)
                curveTo(11f, 10.99f, 4.43f, 8.73f, 2f, 8.17f)
                lineTo(2f, 2.11f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.05f, 5.32f)
                lineToRelative(0.32f, 0.95f)
                lineToRelative(0.95f, -0.32f)
                arcTo(20.92f, 20.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcToRelative(20.93f, 20.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.68f, 0.95f)
                lineToRelative(0.95f, 0.32f)
                lineToRelative(0.32f, -0.95f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 2.11f)
                close()
            }
        }.also { _Fox = it}
