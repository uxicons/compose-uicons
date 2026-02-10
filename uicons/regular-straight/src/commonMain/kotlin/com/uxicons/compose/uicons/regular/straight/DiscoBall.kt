package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscoBall: ImageVector? = null

val Icons.Rs.DiscoBall: ImageVector
    get() = _DiscoBall ?: UXIcon(name = "DiscoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 4.05f)
                lineTo(13f, 2f)
                horizontalLineToRelative(3f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 2f)
                horizontalLineToRelative(3f)
                lineTo(11f, 4.05f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14f)
                close()
                moveTo(20f, 14f)
                curveToRelative(0f, 0.36f, -1.37f, 1.2f, -4f, 1.67f)
                lineTo(16f, 12.33f)
                curveTo(18.63f, 12.8f, 20f, 13.64f, 20f, 14f)
                close()
                moveTo(14f, 15.92f)
                curveToRelative(-0.62f, 0.05f, -1.28f, 0.08f, -2f, 0.08f)
                reflectiveCurveToRelative(-1.38f, -0.03f, -2f, -0.08f)
                lineTo(10f, 12.08f)
                curveToRelative(0.62f, -0.05f, 1.28f, -0.08f, 2f, -0.08f)
                reflectiveCurveToRelative(1.38f, 0.03f, 2f, 0.08f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, -0.36f, 1.37f, -1.2f, 4f, -1.67f)
                verticalLineToRelative(3.34f)
                curveTo(5.37f, 15.2f, 4f, 14.36f, 4f, 14f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-0.67f, 0f, -1.34f, 0.03f, -2f, 0.07f)
                lineTo(10f, 6.26f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(3.81f)
                curveTo(13.34f, 10.03f, 12.66f, 10f, 12f, 10f)
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
                moveTo(19.5f, 11.24f)
                arcTo(14.95f, 14.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.3f)
                lineTo(16f, 7.08f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 11.24f)
                close()
            }
        }.also { _DiscoBall = it}
