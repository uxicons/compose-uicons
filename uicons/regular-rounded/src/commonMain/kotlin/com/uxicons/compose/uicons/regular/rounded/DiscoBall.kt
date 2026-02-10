package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscoBall: ImageVector? = null

val Icons.Rr.DiscoBall: ImageVector
    get() = _DiscoBall ?: UXIcon(name = "DiscoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.05f)
                lineTo(13f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(9f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                horizontalLineToRelative(2f)
                lineTo(11f, 4.05f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(16f, 15.67f)
                lineTo(16f, 12.33f)
                curveToRelative(2.63f, 0.47f, 4f, 1.31f, 4f, 1.67f)
                reflectiveCurveTo(18.63f, 15.2f, 16f, 15.67f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, -0.36f, 1.37f, -1.2f, 4f, -1.67f)
                verticalLineToRelative(3.34f)
                curveTo(5.37f, 15.2f, 4f, 14.36f, 4f, 14f)
                close()
                moveTo(10f, 12.08f)
                curveToRelative(0.62f, -0.05f, 1.28f, -0.08f, 2f, -0.08f)
                reflectiveCurveToRelative(1.38f, 0.03f, 2f, 0.08f)
                verticalLineToRelative(3.84f)
                curveToRelative(-0.62f, 0.05f, -1.28f, 0.08f, -2f, 0.08f)
                reflectiveCurveToRelative(-1.38f, -0.03f, -2f, -0.08f)
                close()
                moveTo(12f, 6f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0.26f)
                verticalLineToRelative(3.81f)
                curveToRelative(-0.66f, -0.05f, -1.33f, -0.07f, -2f, -0.07f)
                reflectiveCurveToRelative(-1.34f, 0.03f, -2f, 0.07f)
                lineTo(10f, 6.26f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(19.5f, 11.24f)
                arcTo(14.95f, 14.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.3f)
                lineTo(16f, 7.08f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 11.24f)
                close()
                moveTo(8f, 7.08f)
                lineTo(8f, 10.3f)
                arcToRelative(14.95f, 14.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 0.93f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7.08f)
                close()
                moveTo(4.5f, 16.76f)
                arcTo(14.95f, 14.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17.7f)
                verticalLineToRelative(3.22f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 16.76f)
                close()
                moveTo(10f, 21.74f)
                lineTo(10f, 17.93f)
                curveToRelative(0.66f, 0.05f, 1.33f, 0.07f, 2f, 0.07f)
                reflectiveCurveToRelative(1.34f, -0.03f, 2f, -0.07f)
                verticalLineToRelative(3.81f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                close()
                moveTo(16f, 20.92f)
                lineTo(16f, 17.7f)
                arcToRelative(14.95f, 14.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, -0.93f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20.92f)
                close()
            }
        }.also { _DiscoBall = it}
