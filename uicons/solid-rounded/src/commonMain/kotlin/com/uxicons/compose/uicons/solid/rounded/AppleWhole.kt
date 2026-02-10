package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Sr.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.92f, 7.28f)
                arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.95f, 0.15f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 1.56f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8f)
                verticalLineTo(6.96f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.99f, -5.65f)
                arcTo(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.68f, 0.01f)
                curveToRelative(-1.85f, 0.08f, -4.58f, 1.52f, -5.15f, 3.7f)
                arcTo(8.71f, 8.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.71f, 0.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 1.4f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.95f, 6f)
                horizontalLineTo(8.5f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                curveToRelative(-0.16f, 5.6f, 5.64f, 10.77f, 10.75f, 8.38f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 0.02f)
                arcTo(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 24f)
                curveTo(24.21f, 23.92f, 27.06f, 11.87f, 19.92f, 7.28f)
                close()
            }
        }.also { _AppleWhole = it}
