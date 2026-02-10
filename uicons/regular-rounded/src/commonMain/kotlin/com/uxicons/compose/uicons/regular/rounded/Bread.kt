package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bread: ImageVector? = null

val Icons.Rr.Bread: ImageVector
    get() = _Bread ?: UXIcon(name = "Bread") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.03f, 24f)
                curveToRelative(-4.98f, -0.02f, -7.08f, -4.19f, -5.54f, -9.18f)
                curveTo(2.34f, 7.43f, 15.02f, -4.36f, 22.36f, 1.64f)
                horizontalLineToRelative(0f)
                curveTo(28.83f, 9.57f, 14.58f, 24.3f, 6.03f, 24f)
                close()
                moveTo(17.97f, 2f)
                curveTo(11.4f, 2.25f, 4.24f, 9.3f, 2.41f, 15.38f)
                curveToRelative(-0.72f, 2.45f, -0.49f, 4.43f, 0.64f, 5.56f)
                curveToRelative(6.8f, 5.33f, 23.22f, -11.09f, 17.89f, -17.89f)
                horizontalLineToRelative(0f)
                arcTo(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.97f, 2f)
                close()
                moveTo(15f, 14f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                close()
                moveTo(19f, 10f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
                moveTo(11f, 18f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18f)
                close()
            }
        }.also { _Bread = it}
