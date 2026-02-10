package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Rs.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(22f, 12f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, 5.48f)
                arcTo(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13.99f)
                lineTo(19f, 12f)
                lineTo(13f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(12f, 10f)
                horizontalLineToRelative(3f)
                lineTo(15f, 6f)
                horizontalLineToRelative(2.91f)
                lineToRelative(1.11f, -1.11f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(2.05f, 12.96f)
                lineTo(6.09f, 17f)
                lineTo(10f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3.95f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 12.96f)
                close()
                moveTo(13f, 21.95f)
                lineTo(13f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(6.91f, 15f)
                lineTo(2.16f, 10.25f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.46f, 3.63f)
                lineToRelative(-0.37f, 0.37f)
                lineTo(13f, 4f)
                lineTo(13f, 8f)
                lineTo(10f, 8f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 5.06f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 21.95f)
                close()
            }
        }.also { _World = it}
