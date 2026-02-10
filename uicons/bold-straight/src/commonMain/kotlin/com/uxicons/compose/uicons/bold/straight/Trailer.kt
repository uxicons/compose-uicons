package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Bs.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20.5f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(3f)
                lineTo(13.97f, 21f)
                curveToRelative(0.01f, -0.17f, 0.03f, -0.33f, 0.03f, -0.5f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.4f, 18f)
                lineTo(20f, 18f)
                lineTo(20f, 14f)
                lineTo(3f, 14f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineToRelative(0.1f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20.5f)
                curveToRelative(0f, 0.15f, 0.01f, 0.3f, 0.02f, 0.45f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 17.5f)
                lineTo(0f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(16f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3.5f)
                lineTo(23f, 18f)
                close()
                moveTo(20f, 11f)
                lineTo(20f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                lineTo(3f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 5f)
                lineTo(8f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(10f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(15f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Trailer = it}
