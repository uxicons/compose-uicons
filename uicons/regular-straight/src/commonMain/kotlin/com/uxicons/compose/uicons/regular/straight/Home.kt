package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Rs.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.34f, 0.83f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
                lineTo(0f, 10.43f)
                verticalLineToRelative(10.4f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, 3.2f)
                lineTo(20.8f, 24.03f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, -3.2f)
                verticalLineToRelative(-10.4f)
                close()
                moveTo(15f, 22.03f)
                lineTo(9f, 22.03f)
                lineTo(9f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
                moveTo(22f, 20.83f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, 1.2f)
                lineTo(17f, 22.03f)
                lineTo(17f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                verticalLineToRelative(5.03f)
                lineTo(3.2f, 22.03f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, -1.2f)
                lineTo(2f, 11.32f)
                lineToRelative(10f, -9f)
                lineToRelative(10f, 9f)
                close()
            }
        }.also { _Home = it}
