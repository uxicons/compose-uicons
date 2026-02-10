package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Feather: ImageVector? = null

val Icons.Sr.Feather: ImageVector
    get() = _Feather ?: UXIcon(name = "Feather") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.82f, 19.31f)
                curveToRelative(0.05f, 0.04f, 0.12f, 0.07f, 0.17f, 0.12f)
                lineToRelative(-4.28f, 4.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(4.29f, -4.29f)
                arcToRelative(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.24f, 1.3f)
                close()
                moveTo(10f, 12.59f)
                lineTo(16.29f, 6.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                horizontalLineToRelative(7.19f)
                arcToRelative(30.73f, 30.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.28f, -6.08f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, -4.81f)
                arcToRelative(31.84f, 31.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.04f, 3.99f)
                close()
                moveTo(12.5f, 13f)
                curveToRelative(-0.03f, 0f, -0.05f, -0.01f, -0.07f, -0.01f)
                lineToRelative(-6.44f, 6.44f)
                arcToRelative(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 1.58f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.9f, -2.54f)
                arcToRelative(28.72f, 28.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.04f, -5.46f)
                close()
                moveTo(8f, 14.5f)
                verticalLineToRelative(-8.99f)
                arcToRelative(26.45f, 26.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.74f, 2.36f)
                arcToRelative(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 5.83f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, 4.3f)
                lineToRelative(3.44f, -3.44f)
                curveToRelative(-0.0f, -0.02f, -0.01f, -0.04f, -0.01f, -0.06f)
                close()
            }
        }.also { _Feather = it}
