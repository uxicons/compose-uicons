package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WagonCovered: ImageVector? = null

val Icons.Br.WagonCovered: ImageVector
    get() = _WagonCovered ?: UXIcon(name = "WagonCovered") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
            close()
            moveTo(19f, 18f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
            close()
            moveTo(12.5f, 19f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 19f)
            close()
            moveTo(23.92f, 4.45f)
            lineTo(22f, 13.65f)
            lineTo(22f, 15.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(19f, 15f)
            lineTo(5f, 15f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(2f, 13.65f)
            lineTo(0.07f, 4.42f)
            arcTo(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.69f, 0.66f)
            curveTo(3.83f, 0.69f, 5.15f, 0.99f, 5.33f, 1f)
            curveToRelative(1f, 0f, 1.87f, -1f, 3.17f, -1f)
            reflectiveCurveTo(10.97f, 1f, 12f, 1f)
            reflectiveCurveToRelative(2.19f, -1f, 3.6f, -1f)
            reflectiveCurveToRelative(2.53f, 1f, 3.08f, 1f)
            arcTo(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.31f, 0.66f)
            arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.61f, 3.79f)
            close()
            moveTo(3f, 3.78f)
            lineTo(4.72f, 12f)
            lineTo(19.28f, 12f)
            lineToRelative(1.71f, -8.19f)
            arcToRelative(0.16f, 0.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, -0.17f)
            arcToRelative(0.1f, 0.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.04f)
            curveToRelative(-0.11f, 0.02f, -0.27f, 0.06f, -0.45f, 0.1f)
            arcTo(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 3.65f)
            lineTo(17f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(14f, 3.65f)
            arcToRelative(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            lineTo(10f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(7f, 3.65f)
            arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, 0.06f)
            curveToRelative(-0.18f, -0.04f, -0.34f, -0.08f, -0.45f, -0.1f)
            arcToRelative(0.09f, 0.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 0.04f)
            arcTo(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.78f)
            close()
        }
    }.also { _WagonCovered = it }
