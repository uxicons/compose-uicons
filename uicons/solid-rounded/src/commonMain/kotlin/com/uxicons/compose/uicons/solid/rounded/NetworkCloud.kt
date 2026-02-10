package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NetworkCloud: ImageVector? = null

val Icons.Sr.NetworkCloud: ImageVector
    get() = _NetworkCloud ?: UXIcon(name = "NetworkCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 20f)
                horizontalLineToRelative(-8.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -1.82f)
                verticalLineToRelative(-4.16f)
                curveToRelative(1.34f, 0f, 2.52f, -0.01f, 3.1f, -0.02f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -0.13f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.7f, -3.7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, -6f)
                lineToRelative(-0.18f, -0.04f)
                curveToRelative(-0.3f, -0.07f, -0.45f, -0.1f, -0.59f, -0.43f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.37f, 0.85f)
                arcToRelative(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 2.73f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.45f, 6.59f)
                arcToRelative(3.68f, 3.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, 0.13f)
                curveToRelative(0.65f, 0.02f, 2.55f, 0.03f, 4.52f, 0.03f)
                horizontalLineToRelative(0.08f)
                verticalLineToRelative(4.16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, 1.81f)
                horizontalLineToRelative(-8.18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8.18f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                horizontalLineToRelative(8.18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _NetworkCloud = it}
