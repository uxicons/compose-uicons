package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Br.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.63f, 24f)
            horizontalLineToRelative(-9.26f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.32f, -1.52f)
            arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -3.45f)
            arcToRelative(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.93f, -7.03f)
            arcToRelative(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.94f, -7.03f)
            arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -3.45f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, -1.52f)
            horizontalLineToRelative(9.26f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, 1.52f)
            arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 3.45f)
            arcToRelative(12.23f, 12.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.94f, 7.03f)
            arcToRelative(12.23f, 12.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.94f, 7.03f)
            arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 3.45f)
            arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.32f, 1.52f)
            close()
            moveTo(16.63f, 3f)
            horizontalLineToRelative(-9.26f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 0.48f)
            arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, 1.05f)
            curveToRelative(0.34f, 2.24f, 1.75f, 4.36f, 4.19f, 6.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.35f)
            curveToRelative(-2.44f, 1.93f, -3.85f, 4.05f, -4.19f, 6.3f)
            arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, 1.05f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, 0.47f)
            horizontalLineToRelative(9.26f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -0.48f)
            arcToRelative(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, -1.04f)
            curveToRelative(-0.34f, -2.24f, -1.75f, -4.36f, -4.19f, -6.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.35f)
            curveToRelative(2.45f, -1.95f, 3.86f, -4.07f, 4.19f, -6.3f)
            arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, -1.04f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, -0.48f)
            close()
        }
    }.also { _Hourglass = it }
