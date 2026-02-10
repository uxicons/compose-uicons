package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Corn: ImageVector? = null

val Icons.Br.Corn: ImageVector
    get() = _Corn ?: UXIcon(name = "Corn") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.96f, 10.49f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, -0.32f)
            curveToRelative(-0.25f, 0.1f, -0.47f, 0.22f, -0.7f, 0.33f)
            curveTo(18.32f, 4.71f, 15.35f, 0f, 12f, 0f)
            reflectiveCurveTo(5.68f, 4.71f, 5.11f, 10.5f)
            curveToRelative(-0.23f, -0.11f, -0.45f, -0.23f, -0.7f, -0.33f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, 0.32f)
            arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12.74f)
            curveTo(1.78f, 22.9f, 8.95f, 24f, 12f, 24f)
            reflectiveCurveToRelative(10.22f, -1.1f, 11f, -11.26f)
            arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.96f, 10.49f)
            close()
            moveTo(4.07f, 13.3f)
            curveToRelative(3.52f, 1.76f, 5.2f, 5.3f, 5.93f, 7.5f)
            curveTo(7.33f, 20.26f, 4.69f, 18.37f, 4.07f, 13.3f)
            close()
            moveTo(8.01f, 12.35f)
            arcTo(16.42f, 16.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.61f, 8f)
            lineTo(9.5f, 8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -2.96f)
            curveTo(10.63f, 3.73f, 11.47f, 3f, 12f, 3f)
            reflectiveCurveToRelative(1.37f, 0.73f, 2.15f, 2.04f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 8f)
            horizontalLineToRelative(0.89f)
            arcTo(16.38f, 16.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12.35f)
            arcTo(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.71f)
            arcTo(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.01f, 12.35f)
            close()
            moveTo(13.99f, 20.81f)
            curveToRelative(0.74f, -2.21f, 2.42f, -5.75f, 5.93f, -7.5f)
            curveTo(19.31f, 18.37f, 16.67f, 20.26f, 13.99f, 20.81f)
            close()
            moveTo(14f, 11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 13f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11.5f)
            close()
        }
    }.also { _Corn = it }
