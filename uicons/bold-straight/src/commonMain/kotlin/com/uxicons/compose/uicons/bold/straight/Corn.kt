package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Corn: ImageVector? = null

val Icons.Bs.Corn: ImageVector
    get() = _Corn ?: UXIcon(name = "Corn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.14f, 10.04f)
                arcToRelative(13.72f, 13.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, 0.76f)
                curveTo(18.56f, 5.01f, 15.42f, 0f, 12f, 0f)
                reflectiveCurveTo(5.44f, 5.01f, 5.04f, 10.81f)
                arcToRelative(13.72f, 13.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, -0.76f)
                lineTo(1f, 9.58f)
                lineTo(1f, 11.5f)
                curveToRelative(0f, 10.06f, 6.34f, 12.07f, 9.7f, 12.43f)
                lineToRelative(1.28f, 0.07f)
                lineToRelative(1.31f, -0.07f)
                curveTo(16.65f, 23.58f, 23f, 21.57f, 23f, 11.5f)
                lineTo(23f, 9.58f)
                close()
                moveTo(4.13f, 13.66f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7.16f)
                curveTo(7.63f, 20.34f, 4.76f, 18.67f, 4.13f, 13.66f)
                close()
                moveTo(12f, 17.57f)
                arcToRelative(15.09f, 15.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.99f, -4.98f)
                curveToRelative(0f, -0.18f, -0.01f, -0.36f, -0.01f, -0.55f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 5f)
                lineTo(9.82f, 5f)
                curveTo(10.6f, 3.71f, 11.47f, 3f, 12f, 3f)
                reflectiveCurveToRelative(1.4f, 0.71f, 2.18f, 2f)
                lineTo(13f, 5f)
                lineTo(13f, 8f)
                horizontalLineToRelative(2.46f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12.04f)
                curveToRelative(0f, 0.18f, -0.01f, 0.37f, -0.01f, 0.55f)
                arcTo(15.09f, 15.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.57f)
                close()
                moveTo(13.87f, 20.83f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -7.16f)
                curveTo(19.24f, 18.67f, 16.37f, 20.34f, 13.87f, 20.83f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(10f, 13f)
                close()
            }
        }.also { _Corn = it}
