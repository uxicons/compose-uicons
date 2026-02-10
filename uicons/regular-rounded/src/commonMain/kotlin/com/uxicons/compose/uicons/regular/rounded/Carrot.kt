package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Rr.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                lineTo(20.41f, 5f)
                lineToRelative(2.29f, -2.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(19f, 3.59f)
                lineTo(19f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(17f, 5.46f)
                arcTo(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.15f, 3.33f)
                arcTo(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.72f, 4.38f)
                curveTo(7.96f, 6.14f, 3.06f, 15.12f, 0.3f, 20.32f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.68f, 23.7f)
                curveToRelative(5.2f, -2.76f, 14.18f, -7.67f, 15.94f, -9.42f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -4.42f)
                arcTo(10.17f, 10.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, 7f)
                lineTo(23f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 5f)
                close()
                moveTo(18.21f, 12.86f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.91f, 14.5f)
                lineToRelative(-2.21f, -2.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(1.87f, 1.87f)
                curveToRelative(-2.75f, 1.64f, -6.69f, 3.84f, -11.42f, 6.36f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, -0.68f)
                curveToRelative(1.52f, -2.86f, 2.92f, -5.42f, 4.16f, -7.62f)
                lineToRelative(2.07f, 2.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(7.25f, 11.84f)
                curveToRelative(1.09f, -1.89f, 2.01f, -3.4f, 2.71f, -4.46f)
                lineToRelative(2.33f, 2.33f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(11.17f, 5.76f)
                curveToRelative(0.85f, -0.79f, 1.37f, -0.92f, 2.18f, -0.59f)
                arcToRelative(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 2.47f)
                arcToRelative(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.47f, 3.01f)
                curveTo(19.08f, 11.22f, 19.18f, 11.89f, 18.21f, 12.86f)
                close()
            }
        }.also { _Carrot = it}
