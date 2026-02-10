package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Umbrella: ImageVector? = null

val Icons.Rr.Umbrella: ImageVector
    get() = _Umbrella ?: UXIcon(name = "Umbrella") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.72f, 9.55f)
                arcToRelative(12.83f, 12.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.72f, -7.51f)
                verticalLineToRelative(-1.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.04f)
                arcToRelative(12.84f, 12.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.73f, 7.51f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 3.68f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, 1.77f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6.98f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, -1.77f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, -3.68f)
                close()
                moveTo(21.66f, 12.11f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, 0.89f)
                horizontalLineToRelative(-15.98f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -0.89f)
                arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, -1.82f)
                curveToRelative(1.45f, -3.65f, 5.61f, -6.29f, 9.87f, -6.29f)
                arcToRelative(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.86f, 6.29f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, 1.82f)
                close()
            }
        }.also { _Umbrella = it}
