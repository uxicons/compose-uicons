package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Rs.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 0.04f)
                lineTo(9.68f, 12.91f)
                arcToRelative(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, -3.12f)
                lineToRelative(3.4f, -3.4f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
                curveTo(0f, 10.74f, 1.79f, 14.5f, 4.83f, 17.76f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(22.5f, -22.5f)
                close()
                moveTo(2f, 7.5f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, 4.71f)
                lineTo(4.89f, 2.95f)
                lineTo(8.32f, 6.39f)
                lineTo(5.39f, 9.32f)
                lineToRelative(0.24f, 0.61f)
                arcToRelative(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, 4.39f)
                lineTo(6.24f, 16.35f)
                curveTo(3.57f, 13.47f, 2f, 10.23f, 2f, 7.5f)
                close()
                moveTo(17.61f, 12.85f)
                lineTo(23.88f, 19.11f)
                lineTo(20.71f, 22.28f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                curveToRelative(-2.67f, 0f, -5.8f, -1.31f, -8.72f, -3.54f)
                lineTo(9.21f, 19.03f)
                curveTo(11.7f, 20.89f, 14.36f, 22f, 16.5f, 22f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, -1.13f)
                lineToRelative(1.76f, -1.76f)
                lineToRelative(-3.44f, -3.44f)
                lineTo(14.69f, 18.6f)
                lineToRelative(-0.61f, -0.23f)
                arcToRelative(15.2f, 15.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.8f, -1.42f)
                lineTo(12.74f, 15.5f)
                arcToRelative(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, 0.76f)
                close()
            }
        }.also { _PhoneSlash = it}
