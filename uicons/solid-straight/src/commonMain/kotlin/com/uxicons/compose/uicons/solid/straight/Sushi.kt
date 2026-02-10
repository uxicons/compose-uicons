package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Ss.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 6f)
                curveTo(3.73f, 6f, 0f, 8.2f, 0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.8f, 3.73f, 5f, 8.5f, 5f)
                reflectiveCurveTo(17f, 21.8f, 17f, 19f)
                lineTo(17f, 11f)
                curveTo(17f, 8.2f, 13.27f, 6f, 8.5f, 6f)
                close()
                moveTo(8.5f, 8f)
                curveTo(12.33f, 8f, 15f, 9.58f, 15f, 11f)
                reflectiveCurveToRelative(-2.67f, 3f, -6.5f, 3f)
                reflectiveCurveTo(2f, 12.42f, 2f, 11f)
                reflectiveCurveTo(4.67f, 8f, 8.5f, 8f)
                close()
                moveTo(4.3f, 11f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, -1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, -1f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, 11f)
                close()
                moveTo(11.3f, 5f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, -1f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, -1f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.3f, 5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.06f, -2.02f, 3.8f, -5f, 4.57f)
                lineTo(19f, 11f)
                arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, -3.22f)
                curveTo(20.39f, 7.29f, 22f, 6.1f, 22f, 5f)
                curveToRelative(0f, -1.42f, -2.67f, -3f, -6.5f, -3f)
                curveToRelative(-2.96f, 0f, -5.22f, 0.94f, -6.1f, 2.03f)
                curveToRelative(-0.3f, -0.01f, -0.6f, -0.03f, -0.9f, -0.03f)
                curveToRelative(-0.46f, 0f, -0.91f, 0.02f, -1.35f, 0.06f)
                curveTo(7.88f, 1.72f, 11.28f, 0f, 15.5f, 0f)
                curveTo(20.27f, 0f, 24f, 2.2f, 24f, 5f)
                close()
            }
        }.also { _Sushi = it}
