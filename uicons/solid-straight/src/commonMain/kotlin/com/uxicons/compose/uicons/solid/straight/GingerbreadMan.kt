package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GingerbreadMan: ImageVector? = null

val Icons.Ss.GingerbreadMan: ImageVector
    get() = _GingerbreadMan ?: UXIcon(name = "GingerbreadMan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 8.29f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.2f, -1.28f)
                curveToRelative(-0.27f, 0f, -2.51f, 0.26f, -4.27f, 0.47f)
                arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.34f, -0.71f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.78f, -0.01f)
                arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, 0.71f)
                curveToRelative(-1.76f, -0.2f, -3.93f, -0.45f, -4.2f, -0.45f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, 8.29f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 3.56f)
                lineTo(7f, 12.38f)
                verticalLineToRelative(4.16f)
                lineToRelative(-2.59f, 3.52f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 3.29f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 0.62f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.76f, -1.12f)
                lineTo(11.48f, 19.3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.57f, -0.3f)
                arcToRelative(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, 0.31f)
                lineToRelative(2.72f, 3.46f)
                arcToRelative(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.29f, 0.98f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, -3.58f)
                lineTo(17f, 16.56f)
                lineTo(17f, 12.38f)
                lineToRelative(3.32f, -0.53f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.7f, 8.29f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                close()
                moveTo(12f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
            }
        }.also { _GingerbreadMan = it}
