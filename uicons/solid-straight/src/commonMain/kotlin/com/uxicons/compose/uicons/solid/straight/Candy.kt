package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Candy: ImageVector? = null

val Icons.Ss.Candy: ImageVector
    get() = _Candy ?: UXIcon(name = "Candy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                horizontalLineTo(17f)
                verticalLineTo(3.92f)
                curveToRelative(-3.34f, -1.77f, -7.83f, -0.91f, -10.91f, 2.17f)
                reflectiveCurveTo(2.15f, 13.65f, 3.92f, 17f)
                horizontalLineTo(0.04f)
                lineTo(0f, 17.96f)
                arcToRelative(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, 4.05f)
                arcTo(6.18f, 6.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 24f)
                horizontalLineTo(7f)
                verticalLineTo(20.06f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.77f, 21f)
                arcToRelative(10.23f, 10.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.14f, -3.08f)
                curveTo(20.99f, 14.83f, 21.85f, 10.35f, 20.08f, 7f)
                horizontalLineTo(24f)
                close()
                moveTo(11.54f, 16.94f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, 0.06f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.73f, -1.05f)
                lineToRelative(1.41f, -1.41f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 0.43f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, -1.3f)
                lineToRelative(1.41f, 1.41f)
                arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.54f, 16.94f)
                close()
            }
        }.also { _Candy = it}
