package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadCry: ImageVector? = null

val Icons.Rs.SadCry: ImageVector
    get() = _SadCry ?: UXIcon(name = "SadCry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(5f, 11f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3f, 2.11f, 3f, 4f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-1.77f, 0f, -3f, 2.11f, -3f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                horizontalLineToRelative(2f)
                curveTo(19f, 9.11f, 17.77f, 7f, 16f, 7f)
                close()
                moveTo(12f, 19f)
                curveToRelative(1.1f, 0f, 2f, -1.34f, 2f, -3f)
                reflectiveCurveToRelative(-0.9f, -3f, -2f, -3f)
                reflectiveCurveToRelative(-2f, 1.34f, -2f, 3f)
                reflectiveCurveTo(10.9f, 19f, 12f, 19f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(2f)
                lineTo(19f, 13f)
                lineTo(17f, 13f)
                close()
                moveTo(5f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 13f)
                lineTo(5f, 13f)
                close()
                moveTo(21f, 19.91f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7.91f)
                lineTo(3f, 16.33f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcToRelative(9.92f, 9.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 4.33f)
                close()
                moveTo(9f, 21.54f)
                verticalLineToRelative(2.07f)
                arcToRelative(11.59f, 11.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(15f, 21.54f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                close()
            }
        }.also { _SadCry = it}
