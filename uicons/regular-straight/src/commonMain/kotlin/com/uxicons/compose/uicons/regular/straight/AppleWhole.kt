package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Rs.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.24f, 6.19f)
                arcTo(7.38f, 7.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.99f, 0.93f)
                lineTo(18.93f, 0.07f)
                lineTo(18.07f, 0.01f)
                arcTo(7.36f, 7.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, 1.76f)
                arcToRelative(5.09f, 5.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 0.7f)
                arcTo(15.46f, 15.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.19f, 0.05f)
                lineTo(9.44f, 1.01f)
                arcTo(13.31f, 13.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.95f, 6f)
                horizontalLineTo(8.5f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                curveToRelative(-0.11f, 6.33f, 6.42f, 10.95f, 12f, 8.2f)
                curveToRelative(5.58f, 2.75f, 12.11f, -1.87f, 12f, -8.2f)
                arcTo(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.24f, 6.19f)
                close()
                moveTo(14.22f, 3.17f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, -1.13f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, 2.74f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.77f, 1.17f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.22f, 3.17f)
                close()
                moveTo(15.5f, 22f)
                arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.01f, -0.8f)
                lineTo(12f, 20.92f)
                lineToRelative(-0.49f, 0.28f)
                curveTo(7.2f, 23.7f, 1.91f, 20.06f, 2f, 15f)
                arcTo(6.77f, 6.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8f)
                horizontalLineToRelative(7f)
                curveTo(24.1f, 8.32f, 24.1f, 21.68f, 15.5f, 22f)
                close()
            }
        }.also { _AppleWhole = it}
