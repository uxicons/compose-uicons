package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bread: ImageVector? = null

val Icons.Bs.Bread: ImageVector
    get() = _Bread ?: UXIcon(name = "Bread") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.3f, 23.99f)
                arcToRelative(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.58f, -1.71f)
                curveTo(-1.69f, 18.86f, 0.15f, 11.68f, 5.91f, 5.91f)
                reflectiveCurveToRelative(12.95f, -7.6f, 16.36f, -4.19f)
                reflectiveCurveToRelative(1.57f, 10.6f, -4.19f, 16.36f)
                curveTo(14.28f, 21.89f, 9.85f, 23.99f, 6.3f, 23.99f)
                close()
                moveTo(17.69f, 3.01f)
                curveToRelative(-2.55f, 0f, -6.26f, 1.62f, -9.65f, 5.02f)
                curveTo(3.23f, 12.84f, 1.97f, 18.28f, 3.84f, 20.16f)
                reflectiveCurveToRelative(7.32f, 0.62f, 12.12f, -4.19f)
                reflectiveCurveTo(22.03f, 5.72f, 20.16f, 3.84f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.69f, 3.01f)
                close()
                moveTo(14f, 5f)
                verticalLineTo(8f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(3f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 5f)
                close()
                moveTo(10f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(3f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                close()
                moveTo(6f, 13f)
                verticalLineToRelative(3f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(3f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13f)
                close()
            }
        }.also { _Bread = it}
