package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoon: ImageVector? = null

val Icons.Bs.CloudMoon: ImageVector
    get() = _CloudMoon ?: UXIcon(name = "CloudMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19.48f)
                arcToRelative(10.99f, 10.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.31f, -18.1f)
                lineToRelative(2.33f, 1.29f)
                lineTo(16.33f, 4f)
                arcToRelative(9.12f, 9.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.87f, 4.29f)
                arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.01f, 10.39f)
                arcToRelative(10.22f, 10.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.46f, -7.25f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 3f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.92f, 16.18f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19.48f)
                close()
                moveTo(24f, 18.75f)
                arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.37f, -5.18f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.01f, 15.26f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 24f)
                horizontalLineToRelative(8.25f)
                arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.75f)
                close()
                moveTo(12f, 18f)
                lineTo(12f, 15.5f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, -0.31f)
                lineToRelative(0.17f, 1.31f)
                lineTo(18.75f, 16.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.5f)
                lineTo(10.5f, 21f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                close()
            }
        }.also { _CloudMoon = it}
