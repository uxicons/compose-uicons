package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pineapple: ImageVector? = null

val Icons.Bs.Pineapple: ImageVector
    get() = _Pineapple ?: UXIcon(name = "Pineapple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.63f, 5.46f)
                arcTo(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3f)
                lineTo(18f, 0f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 2.75f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.75f)
                arcTo(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(6f, 3f)
                arcTo(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.37f, 5.46f)
                curveTo(3.7f, 6.8f, 3f, 10.87f, 3f, 14.5f)
                curveTo(3f, 18.92f, 4.02f, 24f, 12f, 24f)
                reflectiveCurveToRelative(9f, -5.08f, 9f, -9.5f)
                curveTo(21f, 10.87f, 20.3f, 6.8f, 15.63f, 5.46f)
                close()
                moveTo(14.71f, 20.71f)
                lineTo(12f, 18f)
                lineTo(9.29f, 20.71f)
                curveToRelative(-2.03f, -0.53f, -2.87f, -1.8f, -3.16f, -3.84f)
                lineTo(8.5f, 14.5f)
                lineTo(6.14f, 12.14f)
                curveToRelative(0.29f, -2.05f, 1.12f, -3.31f, 3.16f, -3.84f)
                lineTo(12f, 11f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(2.03f, 0.53f, 2.87f, 1.8f, 3.16f, 3.84f)
                lineTo(15.5f, 14.5f)
                lineToRelative(2.36f, 2.36f)
                curveTo(17.57f, 18.91f, 16.74f, 20.18f, 14.71f, 20.71f)
                close()
                moveTo(15.5f, 14.5f)
                lineTo(12f, 18f)
                lineTo(8.5f, 14.5f)
                lineTo(12f, 11f)
                close()
            }
        }.also { _Pineapple = it}
