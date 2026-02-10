package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ship: ImageVector? = null

val Icons.Ss.Ship: ImageVector
    get() = _Ship ?: UXIcon(name = "Ship") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.84f)
                lineTo(4f, 10.51f)
                verticalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -0.7f)
                arcTo(11.13f, 11.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.33f)
                verticalLineToRelative(-0.05f)
                lineToRelative(-9f, -3f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(10.28f)
                lineToRelative(-9f, 3f)
                verticalLineToRelative(0.05f)
                arcTo(11.13f, 11.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.38f, 21.3f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 22f)
                curveTo(2.66f, 22f, 2f, 21.31f, 2f, 21f)
                horizontalLineTo(0f)
                curveToRelative(0f, 1.63f, 1.72f, 3f, 3.75f, 3f)
                arcTo(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 23f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 23f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 1f)
                curveTo(22.28f, 24f, 24f, 22.63f, 24f, 21f)
                close()
                moveTo(16f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2f)
                verticalLineTo(3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Ship = it}
