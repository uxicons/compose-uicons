package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Br.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.44f, 4.08f)
            lineTo(14.66f, 0.75f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.33f, 0f)
            lineTo(3.56f, 4.08f)
            arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 8.7f)
            verticalLineToRelative(6.66f)
            arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, 4.62f)
            lineToRelative(5.77f, 3.33f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.33f, 0f)
            lineToRelative(5.77f, -3.33f)
            arcTo(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.1f, 15.36f)
            lineTo(23.1f, 8.7f)
            arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.44f, 4.08f)
            close()
            moveTo(10.84f, 3.35f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, 0f)
            lineTo(18.6f, 6.48f)
            lineTo(13.42f, 9.48f)
            arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
            lineTo(5.4f, 6.48f)
            close()
            moveTo(5.06f, 17.38f)
            arcTo(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.9f, 15.36f)
            lineTo(3.9f, 9.08f)
            lineToRelative(5.18f, 2.99f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0.58f)
            verticalLineToRelative(7.86f)
            close()
            moveTo(18.94f, 17.38f)
            lineTo(13.5f, 20.52f)
            lineTo(13.5f, 12.66f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -0.58f)
            lineTo(20.1f, 9.08f)
            verticalLineToRelative(6.28f)
            arcTo(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.94f, 17.38f)
            close()
        }
    }.also { _Cube = it }
