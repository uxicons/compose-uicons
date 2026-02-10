package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tram: ImageVector? = null

val Icons.Rs.Tram: ImageVector
    get() = _Tram ?: UXIcon(name = "Tram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 2f)
                lineTo(10f, 9f)
                lineTo(3f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
                moveTo(22f, 12f)
                verticalLineToRelative(4f)
                lineTo(17f, 16f)
                lineTo(17f, 11f)
                horizontalLineToRelative(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                lineTo(9f, 16f)
                close()
                moveTo(3f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(5f)
                lineTo(2f, 16f)
                lineTo(2f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 18f)
                lineTo(22f, 18f)
                verticalLineToRelative(4f)
                close()
                moveTo(13f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                close()
                moveTo(6.8f, 5.37f)
                lineTo(0f, 6.69f)
                lineTo(0f, 4.62f)
                lineTo(6.05f, 3.45f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.8f, 5.37f)
                close()
                moveTo(24f, 0f)
                lineTo(24f, 2.04f)
                lineToRelative(-5.15f, 1f)
                arcTo(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.86f, 0.99f)
                close()
            }
        }.also { _Tram = it}
