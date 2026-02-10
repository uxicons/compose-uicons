package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Racquet: ImageVector? = null

val Icons.Bs.Racquet: ImageVector
    get() = _Racquet ?: UXIcon(name = "Racquet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 2.22f)
                curveTo(18.42f, -1.14f, 12.42f, -0.61f, 8.4f, 3.4f)
                arcToRelative(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.38f, 8.1f)
                lineTo(5f, 11.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.22f, 0f, 2.38f, -0.56f, 2.94f)
                lineToRelative(-4.4f, 4.4f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.4f, -4.4f)
                curveToRelative(0.61f, -0.61f, 2.23f, -0.58f, 3.41f, -0.56f)
                curveToRelative(1.42f, 0.02f, 2.76f, -0.01f, 2.86f, -0.01f)
                arcTo(11.16f, 11.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.6f, 15.6f)
                curveTo(24.61f, 11.58f, 25.14f, 5.58f, 21.78f, 2.22f)
                close()
                moveTo(18.39f, 3.49f)
                lineTo(14.54f, 7.34f)
                lineTo(11.72f, 4.52f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.44f, -1.53f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.39f, 3.49f)
                close()
                moveTo(9.58f, 6.62f)
                lineToRelative(2.83f, 2.83f)
                lineTo(8.48f, 13.4f)
                arcTo(6.85f, 6.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.58f, 6.62f)
                close()
                moveTo(10.6f, 15.52f)
                lineTo(14.54f, 11.58f)
                lineTo(17.38f, 14.42f)
                arcTo(6.85f, 6.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, 15.52f)
                close()
                moveTo(19.48f, 12.28f)
                lineTo(16.66f, 9.46f)
                lineTo(20.52f, 5.6f)
                arcTo(6.81f, 6.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.48f, 12.28f)
                close()
            }
        }.also { _Racquet = it}
