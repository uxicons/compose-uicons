package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Sr.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.03f, 0.01f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 0.82f)
                lineTo(20.01f, 11.98f)
                lineTo(7.24f, 9.29f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.16f)
                lineTo(0f, 18f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineToRelative(6.01f)
                arcToRelative(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.71f, -5.69f)
                arcTo(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.4f, 15.8f)
                lineTo(23.85f, 1.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.03f, 0.01f)
                close()
                moveTo(10.98f, 19.49f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.79f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, -0.02f)
                lineTo(4.83f, 19.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, -1.96f)
                lineToRelative(4.96f, 1.05f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.98f, 19.49f)
                close()
                moveTo(15.49f, 16.26f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.8f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, -0.02f)
                lineTo(5.8f, 15.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.21f, 13.3f)
                lineToRelative(8.51f, 1.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.49f, 16.26f)
                close()
            }
        }.also { _GolfClub = it}
