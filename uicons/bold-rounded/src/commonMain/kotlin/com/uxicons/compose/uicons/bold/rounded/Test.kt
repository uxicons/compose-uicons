package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Br.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 17.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 19f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17.5f)
            close()
            moveTo(13.09f, 14f)
            lineTo(10.91f, 14f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.5f)
            lineTo(8f, 10f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            verticalLineToRelative(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.91f, 0.5f)
            close()
            moveTo(11f, 10f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            lineTo(13f, 10f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
            close()
            moveTo(10.43f, 15.95f)
            lineTo(9.51f, 16.89f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, 2.1f)
            reflectiveCurveToRelative(0.16f, 0.19f, 0.19f, 0.21f)
            arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, -0.01f)
            lineToRelative(1.12f, -1.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, -2.11f)
            close()
            moveTo(22f, 7.16f)
            lineTo(22f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
            horizontalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.5f)
            lineTo(2f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 0f)
            horizontalLineToRelative(7.34f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 1.61f)
            lineToRelative(1.66f, 1.66f)
            arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7.16f)
            close()
            moveTo(18.98f, 7f)
            lineTo(17f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            lineTo(15f, 3.02f)
            curveTo(14.95f, 3.01f, 7.5f, 3f, 7.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 21f)
            horizontalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18.5f)
            reflectiveCurveTo(18.99f, 7.05f, 18.98f, 7f)
            close()
        }
    }.also { _Test = it }
