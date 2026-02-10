package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Rr.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 5f)
                curveToRelative(-7.27f, 0.23f, -7.27f, 10.77f, 0f, 11f)
                curveTo(16.77f, 15.77f, 16.77f, 5.23f, 9.5f, 5f)
                close()
                moveTo(9.5f, 14f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 14f)
                close()
                moveTo(19.52f, 5.32f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.21f, -0.87f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.55f, 0.01f)
                arcTo(10.23f, 10.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11f)
                arcTo(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 24f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.83f, -6.12f)
                arcToRelative(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -1.39f)
                curveTo(25.56f, 13.44f, 24.29f, 6.71f, 19.52f, 5.32f)
                close()
                moveTo(20.38f, 14.95f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 2.49f)
                arcTo(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                curveToRelative(-0.34f, -4.73f, 3.37f, -9.05f, 8f, -9f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.65f, 3.57f)
                arcTo(4.26f, 4.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.9f, 7.22f)
                horizontalLineToRelative(0f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.38f, 14.95f)
                close()
                moveTo(13f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                close()
                moveTo(20f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                close()
                moveTo(16f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                close()
            }
        }.also { _EggFried = it}
