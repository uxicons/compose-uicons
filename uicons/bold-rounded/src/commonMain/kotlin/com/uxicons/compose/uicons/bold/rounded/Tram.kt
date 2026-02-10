package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tram: ImageVector? = null

val Icons.Br.Tram: ImageVector
    get() = _Tram ?: UXIcon(name = "Tram") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 9f)
            lineTo(12f, 9f)
            lineTo(12f, 3f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 4.73f)
            lineTo(9f, 9f)
            lineTo(5.5f, 9f)
            curveTo(2.26f, 9f, 0f, 12.16f, 0f, 15f)
            verticalLineToRelative(3.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            lineTo(24f, 15f)
            curveTo(24f, 12.16f, 21.74f, 9f, 18.5f, 9f)
            close()
            moveTo(21f, 15f)
            verticalLineToRelative(1f)
            lineTo(17f, 16f)
            lineTo(17f, 12f)
            horizontalLineToRelative(1.5f)
            curveTo(19.76f, 12f, 21f, 13.49f, 21f, 15f)
            close()
            moveTo(10f, 16f)
            lineTo(10f, 12f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveTo(5.5f, 12f)
            lineTo(7f, 12f)
            verticalLineToRelative(4f)
            lineTo(3f, 16f)
            lineTo(3f, 15f)
            curveTo(3f, 13.49f, 4.24f, 12f, 5.5f, 12f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -2f)
            horizontalLineToRelative(17.9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            close()
            moveTo(13f, 2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
            close()
            moveTo(19.03f, 2.16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.22f, 0.41f)
            lineToRelative(2f, -0.38f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.56f, 2.95f)
            lineToRelative(-2f, 0.38f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.03f, 2.16f)
            close()
            moveTo(0.03f, 5.78f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, 4.03f)
            lineToRelative(3f, -0.57f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.78f, 6.4f)
            lineToRelative(-3f, 0.57f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 5.78f)
            close()
        }
    }.also { _Tram = it }
