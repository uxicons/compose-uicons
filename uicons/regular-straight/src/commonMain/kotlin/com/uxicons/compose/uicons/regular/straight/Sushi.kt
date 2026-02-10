package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Rs.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, -1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, -1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 1f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 12f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.49f, -2.95f, 4.52f, -7f, 4.92f)
                lineTo(17f, 19f)
                curveToRelative(0f, 2.8f, -3.73f, 5f, -8.5f, 5f)
                reflectiveCurveTo(0f, 21.8f, 0f, 19f)
                lineTo(0f, 11f)
                curveTo(0f, 8.5f, 2.97f, 6.48f, 7f, 6.08f)
                lineTo(7f, 5f)
                curveToRelative(0f, -2.8f, 3.73f, -5f, 8.5f, -5f)
                reflectiveCurveTo(24f, 2.2f, 24f, 5f)
                close()
                moveTo(9f, 5f)
                arcToRelative(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.45f, 1.03f)
                arcTo(10.68f, 10.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.34f, 8f)
                lineTo(15.5f, 8f)
                curveTo(19.33f, 8f, 22f, 6.42f, 22f, 5f)
                reflectiveCurveToRelative(-2.67f, -3f, -6.5f, -3f)
                reflectiveCurveTo(9f, 3.58f, 9f, 5f)
                close()
                moveTo(2f, 11f)
                curveToRelative(0f, 1.42f, 2.67f, 3f, 6.5f, 3f)
                reflectiveCurveTo(15f, 12.42f, 15f, 11f)
                reflectiveCurveTo(12.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(2f, 9.58f, 2f, 11f)
                close()
                moveTo(15f, 19f)
                lineTo(15f, 14.26f)
                arcTo(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 16f)
                arcTo(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14.26f)
                lineTo(2f, 19f)
                curveToRelative(0f, 1.42f, 2.67f, 3f, 6.5f, 3f)
                reflectiveCurveTo(15f, 20.42f, 15f, 19f)
                close()
                moveTo(22f, 13f)
                lineTo(22f, 8.26f)
                arcToRelative(10.87f, 10.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.18f, 1.69f)
                arcTo(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                verticalLineToRelative(4.92f)
                curveTo(20.03f, 15.57f, 22f, 14.21f, 22f, 13f)
                close()
                moveTo(19.7f, 5f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, -1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, 1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 1f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.7f, 5f)
                close()
            }
        }.also { _Sushi = it}
