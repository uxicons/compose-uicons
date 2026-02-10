package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clean: ImageVector? = null

val Icons.Rs.Clean: ImageVector
    get() = _Clean ?: UXIcon(name = "Clean") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.96f, 8.46f)
                lineToRelative(5.03f, -5.03f)
                lineTo(22.57f, 2.01f)
                lineTo(17.52f, 7.05f)
                lineTo(15.31f, 4.89f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.72f, -0.07f)
                arcTo(19.71f, 19.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.23f, 8.69f)
                lineTo(-0.01f, 10.51f)
                verticalLineToRelative(0.76f)
                arcTo(12.89f, 12.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.01f, 24.01f)
                horizontalLineToRelative(1.24f)
                lineToRelative(0.26f, -0.18f)
                arcToRelative(14.98f, 14.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.89f, -12.08f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -1.5f)
                close()
                moveTo(13.9f, 6.34f)
                lineToRelative(5.48f, 5.34f)
                arcToRelative(12.65f, 12.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 3.02f)
                lineTo(11.94f, 7.9f)
                arcTo(24.69f, 24.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.9f, 6.34f)
                close()
                moveTo(13.61f, 21.98f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(11.15f, 11.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.29f, -0.86f)
                arcToRelative(11.55f, 11.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.35f, -3.8f)
                lineToRelative(0.52f, -0.76f)
                lineTo(11.91f, 15.43f)
                lineToRelative(-0.52f, 0.76f)
                arcTo(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 19.32f)
                lineToRelative(-1.23f, 0.62f)
                arcToRelative(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, -2.56f)
                arcToRelative(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.36f, -2.66f)
                lineTo(6.93f, 13.28f)
                arcToRelative(9.61f, 9.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.97f, 2.32f)
                arcToRelative(10.4f, 10.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, -3.58f)
                lineToRelative(4.75f, -1.39f)
                arcToRelative(15.23f, 15.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.42f, -1.59f)
                lineToRelative(7.91f, 7.7f)
                arcTo(14.1f, 14.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.61f, 21.98f)
                close()
            }
        }.also { _Clean = it}
