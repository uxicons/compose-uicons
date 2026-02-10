package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Rr.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.91f, 24f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 21.09f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(6.09f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.42f, 1.48f)
                curveTo(3.19f, 18.46f, 0f, 12.28f, 0f, 6f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcTo(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 0.61f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.09f, 0.61f)
                arcTo(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                curveToRelative(0f, 6.28f, -3.19f, 12.46f, -5.58f, 16.57f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.91f, 24f)
                close()
                moveTo(12f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(6.09f)
                arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, 0.47f)
                curveTo(18.97f, 17.65f, 22f, 11.79f, 22f, 6f)
                arcToRelative(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 0.54f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.64f, -0.46f)
                arcTo(10.76f, 10.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                curveTo(2.04f, 2f, 2f, 5.84f, 2f, 6f)
                curveToRelative(0f, 5.79f, 3.03f, 11.65f, 5.31f, 15.56f)
                arcTo(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 21.09f)
                verticalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
            }
        }.also { _Tooth = it}
