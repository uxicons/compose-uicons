package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Bs.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.78f, 9.13f)
                lineTo(18f, 6f)
                lineTo(8.04f, 6f)
                lineToRelative(0.58f, -2.61f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.1f, 3f)
                lineTo(17f, 3f)
                lineTo(17f, 0f)
                lineTo(9.1f, 0f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.69f, 2.74f)
                lineTo(4.2f, 9.42f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.5f)
                verticalLineToRelative(2f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
                horizontalLineToRelative(11f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
                verticalLineToRelative(-2f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.78f, 9.13f)
                close()
                moveTo(6.5f, 12f)
                horizontalLineToRelative(11f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.46f, 3f)
                lineTo(3.04f, 15f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 12f)
                close()
                moveTo(17.5f, 21f)
                lineTo(6.5f, 21f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.46f, -3f)
                lineTo(20.96f, 18f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
                close()
            }
        }.also { _Curling = it}
