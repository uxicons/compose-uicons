package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Sr.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 10.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10.5f)
                close()
                moveTo(24f, 11.5f)
                arcToRelative(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 4.99f)
                arcToRelative(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, 1.39f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                arcTo(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11f)
                arcTo(10.23f, 10.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.55f, 0.01f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.76f, 4.45f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 0.87f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11.5f)
                close()
                moveTo(13f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                close()
                moveTo(15f, 10.5f)
                curveToRelative(-0.23f, -7.27f, -10.77f, -7.27f, -11f, 0f)
                curveTo(4.23f, 17.77f, 14.77f, 17.77f, 15f, 10.5f)
                close()
                moveTo(16f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 17f)
                close()
                moveTo(20f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11f)
                close()
            }
        }.also { _EggFried = it}
