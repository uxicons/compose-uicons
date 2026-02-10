package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Br.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.86f, 20.74f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.14f, -8.74f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.86f, 11.66f)
            arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 0.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -2.96f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.62f, 15.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineToRelative(-4.79f, 4.78f)
            lineToRelative(-2.13f, -2.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -0.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 2.12f)
            lineToRelative(2.58f, 2.72f)
            arcToRelative(2.36f, 2.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.67f, 0.74f)
            horizontalLineToRelative(0.04f)
            arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, -0.69f)
            lineToRelative(5.25f, -5.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.01f, -2.12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.5f, 7.5f)
            verticalLineToRelative(3.56f)
            lineToRelative(-2.4f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, 2.07f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 0.47f)
            lineToRelative(2.87f, -1.8f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.94f, -1.7f)
            verticalLineToRelative(-4.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
        }
    }.also { _TimeCheck = it }
