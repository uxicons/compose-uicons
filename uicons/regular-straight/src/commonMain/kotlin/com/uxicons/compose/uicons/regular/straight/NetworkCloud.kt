package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NetworkCloud: ImageVector? = null

val Icons.Rs.NetworkCloud: ImageVector
    get() = _NetworkCloud ?: UXIcon(name = "NetworkCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                lineTo(14.82f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.18f)
                lineTo(13f, 14f)
                horizontalLineToRelative(3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -9.94f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.5f)
                arcToRelative(5.15f, 5.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 0.62f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.18f, 20f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                lineTo(9.18f, 22f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                lineTo(24f, 22f)
                close()
                moveTo(5f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 8.01f)
                horizontalLineToRelative(0.01f)
                lineToRelative(1.71f, 0.17f)
                lineToRelative(-0.54f, -1.49f)
                arcTo(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.96f, -0.39f)
                lineToRelative(0.1f, 0.89f)
                lineToRelative(1.0f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                lineTo(7f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                close()
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _NetworkCloud = it}
