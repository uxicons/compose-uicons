package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ship: ImageVector? = null

val Icons.Rs.Ship: ImageVector
    get() = _Ship ?: UXIcon(name = "Ship") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.25f, 22f)
                arcToRelative(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -0.7f)
                arcTo(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                verticalLineToRelative(-0.72f)
                lineToRelative(-2f, -0.67f)
                lineTo(20f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(16f, 5f)
                lineTo(16f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(11f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                lineTo(8f, 5f)
                lineTo(7f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8f)
                verticalLineToRelative(3.61f)
                lineToRelative(-2f, 0.67f)
                lineTo(2f, 13f)
                arcToRelative(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.38f, 8.3f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 22f)
                curveTo(2.66f, 22f, 2f, 21.31f, 2f, 21f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.63f, 1.72f, 3f, 3.75f, 3f)
                arcTo(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 23f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 23f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 1f)
                curveTo(22.28f, 24f, 24f, 22.63f, 24f, 21f)
                lineTo(22f, 21f)
                curveTo(22f, 21.34f, 21.32f, 22f, 20.25f, 22f)
                close()
                moveTo(10f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(14f, 5f)
                lineTo(10f, 5f)
                close()
                moveTo(6f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                lineTo(17f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.95f)
                lineToRelative(-6f, -2f)
                lineToRelative(-6f, 2f)
                close()
                moveTo(9.25f, 22f)
                curveToRelative(-1.09f, 0f, -1.75f, -0.69f, -1.75f, -1f)
                lineToRelative(0f, -0.46f)
                lineToRelative(-0.34f, -0.3f)
                arcToRelative(10.4f, 10.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.13f, -6.53f)
                lineTo(11f, 11.39f)
                lineTo(11f, 21f)
                curveTo(11f, 21.34f, 10.32f, 22f, 9.25f, 22f)
                close()
                moveTo(14.75f, 22f)
                curveTo(13.66f, 22f, 13f, 21.31f, 13f, 21f)
                lineTo(13f, 11.39f)
                lineToRelative(6.97f, 2.33f)
                arcToRelative(10.4f, 10.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.12f, 6.53f)
                lineToRelative(-0.35f, 0.3f)
                lineTo(16.5f, 21f)
                curveTo(16.5f, 21.34f, 15.82f, 22f, 14.75f, 22f)
                close()
            }
        }.also { _Ship = it}
