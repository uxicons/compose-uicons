package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscoBall: ImageVector? = null

val Icons.Bs.DiscoBall: ImageVector
    get() = _DiscoBall ?: UXIcon(name = "DiscoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 4.12f)
                lineTo(13.5f, 3f)
                lineTo(16f, 3f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 3f)
                horizontalLineToRelative(2.5f)
                lineTo(10.5f, 4.12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14f)
                close()
                moveTo(9.17f, 20.4f)
                lineTo(9.17f, 16.68f)
                arcToRelative(25.02f, 25.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.87f, -0.68f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.02f)
                arcToRelative(25.14f, 25.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.87f, -0.67f)
                lineTo(9.17f, 7.61f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.67f, 0f)
                verticalLineToRelative(3.71f)
                arcToRelative(24.97f, 24.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.87f, 0.68f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.02f)
                arcToRelative(25.33f, 25.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.87f, 0.67f)
                lineTo(14.83f, 20.4f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.83f, 16.68f)
                verticalLineTo(11.31f)
                curveToRelative(-0.94f, -0.09f, -1.9f, -0.15f, -2.83f, -0.15f)
                reflectiveCurveToRelative(-1.9f, 0.06f, -2.83f, 0.15f)
                verticalLineToRelative(5.37f)
                curveToRelative(0.94f, 0.09f, 1.9f, 0.15f, 2.83f, 0.15f)
                reflectiveCurveTo(13.9f, 16.78f, 14.83f, 16.68f)
                close()
            }
        }.also { _DiscoBall = it}
