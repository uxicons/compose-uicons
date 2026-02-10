package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Br.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.32f, 9.26f)
            lineToRelative(-0.25f, -0.99f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.16f, 6f)
            horizontalLineTo(7.54f)
            lineToRelative(0.23f, -1.04f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.21f, 3f)
            horizontalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(10.21f)
            arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.84f, 4.31f)
            lineTo(3.65f, 9.66f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.5f)
            verticalLineToRelative(2f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
            horizontalLineToRelative(11f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
            verticalLineToRelative(-2f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.32f, 9.26f)
            close()
            moveTo(20.96f, 15f)
            horizontalLineTo(3.04f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 12f)
            horizontalLineToRelative(11f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.96f, 15f)
            close()
            moveTo(17.5f, 21f)
            horizontalLineTo(6.5f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.46f, -3f)
            horizontalLineTo(20.96f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
            close()
        }
    }.also { _Curling = it }
