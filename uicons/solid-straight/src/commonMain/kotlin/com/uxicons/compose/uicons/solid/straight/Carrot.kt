package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Ss.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                horizontalLineTo(20.41f)
                lineToRelative(3.29f, -3.29f)
                lineTo(22.29f, 0.29f)
                lineTo(19f, 3.59f)
                verticalLineTo(0f)
                horizontalLineTo(17f)
                verticalLineTo(5.46f)
                arcTo(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.15f, 3.33f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.76f, 4.34f)
                lineToRelative(3.64f, 3.64f)
                lineTo(11.98f, 9.4f)
                lineTo(8.55f, 5.96f)
                curveToRelative(-0.76f, 1.21f, -1.64f, 2.86f, -2.52f, 4.65f)
                lineTo(9.28f, 13.87f)
                lineTo(7.87f, 15.28f)
                lineTo(5.11f, 12.53f)
                curveToRelative(-1.94f, 4.09f, -3.7f, 8.28f, -4.04f, 9.09f)
                lineTo(0.14f, 23.86f)
                lineToRelative(2.25f, -0.94f)
                curveToRelative(1.08f, -0.45f, 8.25f, -3.47f, 13.1f, -6.02f)
                lineTo(12.7f, 14.11f)
                lineTo(14.11f, 12.7f)
                lineToRelative(3.2f, 3.2f)
                arcToRelative(12.51f, 12.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, -1.61f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -4.42f)
                arcTo(10.17f, 10.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, 7f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _Carrot = it}
