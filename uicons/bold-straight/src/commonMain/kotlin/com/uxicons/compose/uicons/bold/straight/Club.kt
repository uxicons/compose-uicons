package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Club: ImageVector? = null

val Icons.Bs.Club: ImageVector
    get() = _Club ?: UXIcon(name = "Club") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.25f, -5.92f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5.5f)
                curveTo(18f, 2.31f, 15.48f, 0f, 12f, 0f)
                reflectiveCurveTo(6f, 2.31f, 6f, 5.5f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 1.58f)
                arcTo(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 13f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.25f, 6f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.29f, -0.95f)
                curveTo(9.79f, 20.28f, 9f, 21f, 5f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                curveToRelative(-4f, 0f, -4.79f, -0.72f, -5.54f, -2.95f)
                arcTo(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.75f, 19f)
                arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.82f, 0f, 3f, 0.98f, 3f, 2.5f)
                curveToRelative(0f, 0.96f, -0.67f, 1.89f, -1.99f, 2.74f)
                lineToRelative(0f, 0f)
                arcTo(8.34f, 8.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.1f)
                arcToRelative(8.34f, 8.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, -0.86f)
                lineToRelative(0f, 0f)
                curveTo(9.67f, 7.38f, 9f, 6.46f, 9f, 5.5f)
                curveTo(9f, 3.98f, 10.18f, 3f, 12f, 3f)
                close()
                moveTo(7.25f, 16f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, -3f)
                curveTo(9f, 10f, 10.7f, 12.22f, 10.7f, 12.23f)
                lineToRelative(0.46f, 0.78f)
                lineToRelative(-0.45f, 0.76f)
                curveTo(10.69f, 13.79f, 9.35f, 16f, 7.25f, 16f)
                close()
                moveTo(13.3f, 13.77f)
                lineToRelative(-0.46f, -0.78f)
                lineToRelative(0.45f, -0.76f)
                curveTo(13.3f, 12.22f, 15f, 10f, 16.75f, 10f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.25f, 3f)
                curveTo(14.65f, 16f, 13.31f, 13.79f, 13.3f, 13.77f)
                close()
            }
        }.also { _Club = it}
