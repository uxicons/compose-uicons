package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Rr.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 16.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-5.63f, 5.63f)
                lineToRelative(-2.69f, -2.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, 1.4f)
                lineToRelative(2.74f, 2.7f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 0.6f)
                horizontalLineToRelative(0.03f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -0.55f)
                lineToRelative(5.71f, -5.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.09f, 21.96f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.91f, -9.96f)
                curveToRelative(0f, 0.31f, -0.01f, 0.61f, -0.04f, 0.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.91f, 1.09f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, -0.91f)
                curveToRelative(0.03f, -0.36f, 0.05f, -0.73f, 0.05f, -1.09f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.09f, 11.95f)
                horizontalLineToRelative(0.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 7f)
                verticalLineToRelative(4.59f)
                lineToRelative(-2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -0.71f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                close()
            }
        }.also { _TimeCheck = it}
