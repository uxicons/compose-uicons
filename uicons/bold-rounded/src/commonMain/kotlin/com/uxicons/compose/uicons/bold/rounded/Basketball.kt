package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Br.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
            arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
            close()
            moveTo(10.67f, 15.45f)
            lineTo(12f, 14.12f)
            lineTo(17.21f, 19.33f)
            arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.17f, 1.61f)
            arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, -5.48f)
            close()
            moveTo(13.33f, 8.55f)
            lineTo(12f, 9.88f)
            lineTo(6.79f, 4.67f)
            arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.17f, -1.61f)
            arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.37f, 5.48f)
            close()
            moveTo(9.88f, 12f)
            lineTo(8.55f, 13.33f)
            arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.48f, -2.37f)
            arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, -4.17f)
            close()
            moveTo(14.12f, 12f)
            lineTo(15.45f, 10.67f)
            arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.48f, 2.37f)
            arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.61f, 4.17f)
            close()
            moveTo(20.76f, 9.96f)
            arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.71f, -6.72f)
            arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 6.72f)
            close()
            moveTo(3.24f, 14.04f)
            arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 6.71f)
            arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.71f, -6.71f)
            close()
        }
    }.also { _Basketball = it }
