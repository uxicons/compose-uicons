package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Sr.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 17f)
                horizontalLineTo(7.33f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -0.88f)
                lineTo(0.05f, 10.97f)
                curveTo(0.02f, 11.31f, 0f, 11.65f, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 23.95f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.44f, 3.48f)
                lineToRelative(-1.79f, 1.79f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.88f, 6f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(0.96f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 0.35f)
                lineToRelative(2.62f, 2.63f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.44f, 3.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15.96f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 4f)
                horizontalLineToRelative(1.38f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -0.15f)
                lineToRelative(1.66f, -1.66f)
                arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 8.59f)
                lineToRelative(6.12f, 6.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 15f)
                horizontalLineTo(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(5.95f)
                arcToRelative(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.48f, -3.47f)
                lineToRelative(-2.75f, -2.75f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15.96f)
                close()
            }
        }.also { _World = it}
