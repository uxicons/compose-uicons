package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Bs.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.48f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(9.02f)
                horizontalLineTo(5.19f)
                lineToRelative(-0.83f, -0.97f)
                arcTo(5.64f, 5.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(9f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, 0.98f)
                lineTo(3f, 11.08f)
                verticalLineTo(13.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 17f)
                horizontalLineToRelative(3.84f)
                lineToRelative(-1.7f, 2.01f)
                curveToRelative(-0.05f, 0f, -0.09f, -0.01f, -0.14f, -0.01f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 21.5f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, -0.55f)
                lineTo(14f, 17.32f)
                lineToRelative(3.07f, 3.62f)
                arcTo(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.5f, 19f)
                curveToRelative(-0.05f, 0f, -0.09f, 0.01f, -0.14f, 0.01f)
                lineTo(17.66f, 17f)
                horizontalLineTo(19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.5f)
                verticalLineTo(10.52f)
                curveTo(24f, 2.2f, 17.77f, 0f, 14.48f, 0f)
                close()
                moveTo(15f, 3.03f)
                arcToRelative(6.42f, 6.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 5.99f)
                horizontalLineTo(15f)
                close()
                moveTo(21f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 14f)
                horizontalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineTo(12.02f)
                horizontalLineTo(21f)
                close()
            }
        }.also { _BabyCarriage = it}
