package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Rr.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(22f, 12f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.66f, 5.51f)
                lineToRelative(-1.19f, -1.19f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15.96f)
                lineTo(19f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(13f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(1.38f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, -0.73f)
                lineToRelative(0.38f, -0.38f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(2.05f, 12.96f)
                lineTo(5.21f, 16.12f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 17f)
                lineTo(10f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3.95f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 12.96f)
                close()
                moveTo(13f, 21.95f)
                lineTo(13f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(7.33f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                lineTo(2.16f, 10.25f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.46f, 3.63f)
                lineToRelative(-0.22f, 0.22f)
                arcTo(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.88f, 4f)
                lineTo(15.5f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.5f)
                lineTo(10f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(0.96f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, 1.77f)
                lineToRelative(1.34f, 1.34f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 21.95f)
                close()
            }
        }.also { _World = it}
