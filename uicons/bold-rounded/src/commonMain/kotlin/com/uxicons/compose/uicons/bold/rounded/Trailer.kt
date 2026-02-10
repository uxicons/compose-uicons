package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Br.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 19.09f)
            lineTo(23f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
            lineTo(5.5f, 0f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(11f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 3.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -1.99f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            lineTo(3f, 15f)
            lineTo(20f, 15f)
            verticalLineToRelative(4f)
            lineTo(15.5f, 19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19.09f)
            close()
            moveTo(18f, 12f)
            lineTo(18f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(15f, 12f)
            lineTo(13f, 12f)
            lineTo(13f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(10f, 12f)
            lineTo(8f, 12f)
            lineTo(8f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(5f, 12f)
            lineTo(3f, 12f)
            lineTo(3f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(12f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.5f)
            lineTo(20f, 12f)
            close()
            moveTo(12f, 20.5f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 0f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20.5f)
            close()
        }
    }.also { _Trailer = it }
