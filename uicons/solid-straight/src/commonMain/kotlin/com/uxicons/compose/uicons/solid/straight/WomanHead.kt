package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WomanHead: ImageVector? = null

val Icons.Ss.WomanHead: ImageVector
    get() = _WomanHead ?: UXIcon(name = "WomanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.91f, 20.03f)
                lineToRelative(-1.06f, -5.96f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -5.79f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.23f, 7.9f)
                lineTo(1.5f, 12f)
                reflectiveCurveToRelative(1.61f, 0f, 1.78f, -0.01f)
                arcToRelative(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -1.19f)
                arcTo(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.64f, -1.48f)
                arcTo(16.53f, 16.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.12f, 3.14f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.83f, 6.01f)
                lineToRelative(0.08f, 0.75f)
                lineToRelative(0.74f, 0.13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                horizontalLineTo(19.35f)
                lineToRelative(-0.22f, 0.62f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -5f)
                horizontalLineTo(1.15f)
                lineTo(0.07f, 20.11f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.24f, 24f)
                lineTo(9f, 24f)
                verticalLineTo(20.41f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -0.59f)
                verticalLineTo(24f)
                horizontalLineToRelative(5.76f)
                arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.56f, -1.26f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.91f, 20.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _WomanHead = it}
