package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeTwentyFour: ImageVector? = null

val Icons.Br.TimeTwentyFour: ImageVector
    get() = _TimeTwentyFour ?: UXIcon(name = "TimeTwentyFour") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 15.62f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 0f)
            curveToRelative(0f, 0.62f, -1.19f, 1.52f, -2.15f, 2.24f)
            curveToRelative(-1.57f, 1.18f, -3.35f, 2.51f, -3.35f, 4.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            horizontalLineToRelative(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-2.8f)
            curveToRelative(0.31f, -0.25f, 0.65f, -0.5f, 0.95f, -0.74f)
            curveToRelative(1.56f, -1.18f, 3.35f, -2.51f, 3.35f, -4.64f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-0.75f)
            arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.25f, -1.25f)
            verticalLineToRelative(-3.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3.25f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, 4.25f)
            horizontalLineToRelative(0.75f)
            verticalLineToRelative(2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-10f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.29f, 2.71f)
            lineToRelative(-1.32f, 1.32f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.47f, 13.78f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.62f, -1.46f)
            arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.71f, -10.19f)
            lineToRelative(-1.13f, 1.13f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            horizontalLineToRelative(4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
            verticalLineToRelative(-4.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -0.71f)
            close()
        }
    }.also { _TimeTwentyFour = it }
