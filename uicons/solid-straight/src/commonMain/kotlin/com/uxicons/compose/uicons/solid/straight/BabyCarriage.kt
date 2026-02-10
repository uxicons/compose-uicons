package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Ss.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.86f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                curveTo(15.08f, 0f, 22.75f, 0.1f, 23.86f, 8f)
                close()
                moveTo(5.5f, 10f)
                lineTo(4f, 8f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(8f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.4f, 9.2f)
                lineTo(4f, 11.33f)
                verticalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4.87f)
                lineTo(9.26f, 19.13f)
                curveToRelative(-1.32f, -0.62f, -3.42f, 0.92f, -3.25f, 2.51f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.76f, -1.19f)
                lineTo(14f, 16.56f)
                lineToRelative(3.24f, 3.89f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 21.64f)
                curveToRelative(0.17f, -1.59f, -1.93f, -3.13f, -3.25f, -2.51f)
                lineTo(16.14f, 16f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(10f)
                close()
            }
        }.also { _BabyCarriage = it}
