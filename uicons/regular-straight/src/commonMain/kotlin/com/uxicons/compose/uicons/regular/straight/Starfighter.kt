package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Rs.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                verticalLineToRelative(8f)
                lineTo(15.98f, 14f)
                curveTo(15.7f, -4.73f, 8.3f, -4.67f, 8.02f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 21f)
                lineTo(2f, 21f)
                lineTo(2f, 19.17f)
                lineTo(7.63f, 24f)
                lineTo(10f, 24f)
                lineTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.42f)
                lineTo(22f, 19.18f)
                lineTo(22f, 21f)
                horizontalLineToRelative(2f)
                lineTo(24f, 6f)
                close()
                moveTo(13.05f, 5.15f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, 0f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.09f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.05f, 5.15f)
                close()
                moveTo(8f, 21.68f)
                lineTo(2f, 16.54f)
                lineTo(2f, 16f)
                lineTo(8f, 16f)
                close()
                moveTo(10f, 20f)
                lineTo(10f, 15f)
                arcToRelative(53.69f, 53.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -7.47f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 0f)
                arcTo(53.69f, 53.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                verticalLineToRelative(5f)
                close()
                moveTo(16f, 21.72f)
                lineTo(16f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.54f)
                close()
            }
        }.also { _Starfighter = it}
