package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Rs.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.57f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(9f)
                horizontalLineTo(6.43f)
                lineToRelative(-0.29f, -0.48f)
                curveTo(3.28f, 18.75f, 0f, 12.45f, 0f, 6f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcTo(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 0.61f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.09f, 0.61f)
                arcTo(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                curveToRelative(0f, 6.45f, -3.28f, 12.75f, -6.14f, 17.52f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(1.43f)
                curveTo(19.09f, 17.52f, 22f, 11.75f, 22f, 6f)
                arcToRelative(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 0.54f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.64f, -0.46f)
                arcTo(10.76f, 10.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                curveTo(2.04f, 2f, 2f, 5.84f, 2f, 6f)
                curveToRelative(0f, 5.75f, 2.91f, 11.52f, 5.57f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
        }.also { _Tooth = it}
