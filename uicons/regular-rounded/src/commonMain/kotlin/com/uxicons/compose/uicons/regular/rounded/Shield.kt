package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Rr.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.58f, 2.14f)
                lineTo(12.32f, 0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 0f)
                lineTo(5.42f, 2.14f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.88f)
                verticalLineTo(12f)
                curveToRelative(0f, 7.56f, 9.2f, 11.74f, 9.59f, 11.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 0f)
                curveTo(12.8f, 23.74f, 22f, 19.56f, 22f, 12f)
                verticalLineTo(6.88f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.58f, 2.14f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 5.46f, -6.32f, 9.03f, -8f, 9.89f)
                curveToRelative(-1.68f, -0.85f, -8f, -4.42f, -8f, -9.89f)
                verticalLineTo(6.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.05f, 4.04f)
                lineTo(12f, 2.05f)
                lineToRelative(5.95f, 1.98f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6.88f)
                close()
            }
        }.also { _Shield = it}
