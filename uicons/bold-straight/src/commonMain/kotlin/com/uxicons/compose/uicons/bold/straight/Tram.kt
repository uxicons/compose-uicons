package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tram: ImageVector? = null

val Icons.Bs.Tram: ImageVector
    get() = _Tram ?: UXIcon(name = "Tram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 4.73f)
                lineTo(9f, 9f)
                lineTo(3.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 9f)
                close()
                moveTo(21f, 12.5f)
                lineTo(21f, 16f)
                lineTo(17f, 16f)
                lineTo(17f, 12f)
                horizontalLineToRelative(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.5f)
                close()
                moveTo(14f, 12f)
                verticalLineToRelative(4f)
                lineTo(10f, 16f)
                lineTo(10f, 12f)
                close()
                moveTo(3.5f, 12f)
                lineTo(7f, 12f)
                verticalLineToRelative(4f)
                lineTo(3f, 16f)
                lineTo(3f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 12f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 19f)
                lineTo(21f, 19f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                close()
                moveTo(7.23f, 5.88f)
                lineTo(0f, 7.1f)
                lineTo(0f, 4.06f)
                lineTo(6f, 3.04f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.23f, 5.88f)
                close()
                moveTo(24f, 0f)
                lineTo(24f, 3.04f)
                lineToRelative(-5.55f, 0.94f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.82f, 0.88f)
                close()
            }
        }.also { _Tram = it}
