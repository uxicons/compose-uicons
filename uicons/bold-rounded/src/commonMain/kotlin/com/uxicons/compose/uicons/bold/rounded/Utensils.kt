package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Br.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.33f, 0.76f)
            arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, -0.55f)
            arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2.45f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(20.02f)
            curveTo(25.11f, 15.38f, 25.64f, 5.86f, 20.33f, 0.76f)
            close()
            moveTo(19f, 15.74f)
            verticalLineToRelative(-12f)
            curveTo(21.49f, 6.64f, 21.71f, 12.72f, 19f, 15.74f)
            close()
            moveTo(13f, 1.5f)
            verticalLineToRelative(6f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 6.32f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineTo(13.82f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.5f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(6f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.15f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(9.15f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7.5f)
            verticalLineToRelative(-6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 1.5f)
            close()
        }
    }.also { _Utensils = it }
