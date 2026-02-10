package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerTime: ImageVector? = null

val Icons.Br.MarkerTime: ImageVector
    get() = _MarkerTime ?: UXIcon(name = "MarkerTime") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.78f, 3.24f)
            arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.56f, 0f)
            arcToRelative(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 15.66f)
            lineToRelative(3.74f, 3.47f)
            arcToRelative(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.98f, 0.03f)
            lineToRelative(3.81f, -3.54f)
            arcToRelative(11.09f, 11.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.0f, -15.62f)
            close()
            moveTo(17.7f, 16.7f)
            lineTo(13.9f, 20.23f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.83f, -0.03f)
            lineToRelative(-3.72f, -3.46f)
            arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.38f)
            arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
            arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, 11.35f)
            close()
            moveTo(15.56f, 14.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
            lineToRelative(-2.5f, -2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, -1.06f)
            verticalLineToRelative(-3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(2.88f)
            lineToRelative(2.06f, 2.06f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            close()
        }
    }.also { _MarkerTime = it }
