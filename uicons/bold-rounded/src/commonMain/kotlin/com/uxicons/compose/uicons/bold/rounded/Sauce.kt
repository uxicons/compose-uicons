package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Br.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 8.61f)
            lineTo(17f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
            lineTo(13.83f, 5f)
            lineTo(13.16f, 0.99f)
            arcToRelative(1.18f, 1.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.33f, 0f)
            lineTo(10.17f, 5f)
            lineTo(9f, 5f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
            lineTo(7f, 8.61f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13.5f)
            verticalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18.5f)
            verticalLineToRelative(-5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8.61f)
            close()
            moveTo(17f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18.5f)
            verticalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13.5f)
            close()
            moveTo(15f, 15.5f)
            verticalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 18f)
            horizontalLineToRelative(-3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16.5f)
            verticalLineToRelative(-1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 14f)
            horizontalLineToRelative(3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15.5f)
            close()
        }
    }.also { _Sauce = it }
