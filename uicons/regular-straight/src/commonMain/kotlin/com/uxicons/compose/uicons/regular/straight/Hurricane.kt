package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Rs.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(12f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
                moveTo(10f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 22f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, -1.12f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                curveTo(2f, 4.63f, 7.05f, 0f, 14f, 0f)
                horizontalLineToRelative(3f)
                lineTo(17f, 2f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, 1.12f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                curveTo(22f, 19.37f, 16.95f, 24f, 10f, 24f)
                close()
                moveTo(11.58f, 2.23f)
                curveTo(7.07f, 3.13f, 4f, 6.54f, 4f, 11f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(2.12f)
                lineTo(13.4f, 20.45f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 1.32f)
                curveTo(16.93f, 20.87f, 20f, 17.46f, 20f, 13f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(9.88f, 5f)
                lineToRelative(0.72f, -1.45f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.58f, 2.23f)
                close()
            }
        }.also { _Hurricane = it}
