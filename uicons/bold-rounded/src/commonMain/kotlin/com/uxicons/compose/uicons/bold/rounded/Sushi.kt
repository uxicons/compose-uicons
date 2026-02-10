package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Br.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6f)
            curveToRelative(0f, -3.36f, -3.73f, -6f, -8.5f, -6f)
            curveTo(11.18f, 0f, 7.71f, 2.17f, 7.11f, 5.08f)
            curveTo(3.03f, 5.54f, 0f, 7.97f, 0f, 11f)
            verticalLineToRelative(7.68f)
            curveTo(0f, 21.71f, 3.65f, 24f, 8.5f, 24f)
            curveToRelative(4.72f, 0f, 8.29f, -2.17f, 8.48f, -5.08f)
            curveTo(21.07f, 18.51f, 24f, 16.4f, 24f, 13.68f)
            close()
            moveTo(15.5f, 3f)
            curveTo(18.74f, 3f, 21f, 4.58f, 21f, 6f)
            curveToRelative(0f, 1.27f, -1.81f, 2.66f, -4.51f, 2.94f)
            arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.96f)
            curveToRelative(0.21f, 0.01f, 0.43f, 0.02f, 0.65f, 0.02f)
            curveTo(17.56f, 7f, 19f, 6.47f, 19f, 6f)
            reflectiveCurveToRelative(-1.44f, -1f, -3.5f, -1f)
            arcToRelative(6.63f, 6.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.2f, 0.62f)
            arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, -0.49f)
            curveTo(10.98f, 4.0f, 12.92f, 3f, 15.5f, 3f)
            close()
            moveTo(8.5f, 8f)
            curveTo(11.74f, 8f, 14f, 9.58f, 14f, 11f)
            reflectiveCurveToRelative(-2.26f, 3f, -5.5f, 3f)
            reflectiveCurveTo(3f, 12.42f, 3f, 11f)
            reflectiveCurveTo(5.26f, 8f, 8.5f, 8f)
            close()
            moveTo(14f, 18.68f)
            curveTo(14f, 19.6f, 11.81f, 21f, 8.5f, 21f)
            reflectiveCurveTo(3f, 19.6f, 3f, 18.68f)
            lineTo(3f, 15.61f)
            arcTo(10.85f, 10.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
            arcTo(10.85f, 10.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15.61f)
            close()
            moveTo(17f, 15.89f)
            lineTo(17f, 11.9f)
            arcToRelative(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.3f)
            verticalLineToRelative(3.08f)
            curveTo(21f, 14.46f, 19.45f, 15.55f, 17f, 15.89f)
            close()
            moveTo(5f, 11f)
            curveToRelative(0f, -0.47f, 1.44f, -1f, 3.5f, -1f)
            reflectiveCurveToRelative(3.5f, 0.53f, 3.5f, 1f)
            reflectiveCurveToRelative(-1.44f, 1f, -3.5f, 1f)
            reflectiveCurveTo(5f, 11.47f, 5f, 11f)
            close()
        }
    }.also { _Sushi = it }
