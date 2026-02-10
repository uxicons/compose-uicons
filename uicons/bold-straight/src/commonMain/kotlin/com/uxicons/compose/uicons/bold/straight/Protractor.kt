package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Protractor: ImageVector? = null

val Icons.Bs.Protractor: ImageVector
    get() = _Protractor ?: UXIcon(name = "Protractor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.97f, 11.22f)
                arcTo(11.17f, 11.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.08f)
                lineTo(12f, 0f)
                lineTo(5.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.5f)
                verticalLineToRelative(17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
                lineTo(12f, 24f)
                lineTo(12f, 22.96f)
                arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.03f, -3.44f)
                arcTo(11.09f, 11.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.97f, 11.22f)
                close()
                moveTo(16.84f, 17.48f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.09f, 20f)
                lineTo(9f, 20f)
                verticalLineToRelative(1f)
                lineTo(5.5f, 21f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                lineTo(5f, 19f)
                lineTo(7f, 19f)
                lineTo(7f, 16f)
                lineTo(5f, 16f)
                lineTo(5f, 13.5f)
                lineTo(7f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(5f, 10.5f)
                lineTo(5f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
                lineTo(9f, 3f)
                lineTo(9f, 4f)
                horizontalLineToRelative(1.66f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.32f, 7.43f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.84f, 17.48f)
                close()
                moveTo(15f, 12f)
                arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.17f, 4.17f)
                lineTo(10f, 16.17f)
                lineTo(10f, 7.83f)
                horizontalLineToRelative(0.83f)
                arcTo(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                close()
            }
        }.also { _Protractor = it}
