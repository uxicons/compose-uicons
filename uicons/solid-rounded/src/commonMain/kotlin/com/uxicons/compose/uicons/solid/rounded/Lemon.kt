package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lemon: ImageVector? = null

val Icons.Sr.Lemon: ImageVector
    get() = _Lemon ?: UXIcon(name = "Lemon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.63f, 4.44f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                curveToRelative(-1.02f, -0.04f, -1.96f, 0.87f, -2.93f, 0.48f)
                curveTo(13.51f, -0.42f, 8.63f, -0.4f, 3.87f, 3.87f)
                curveTo(-0.41f, 8.64f, -0.42f, 13.5f, 0.48f, 18.07f)
                curveTo(0.87f, 19.05f, -0.04f, 19.98f, 0f, 21f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.44f, 2.63f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -0.1f)
                curveToRelative(4.56f, 0.88f, 9.46f, 0.88f, 14.23f, -3.41f)
                curveToRelative(4.31f, -4.81f, 4.28f, -9.62f, 3.41f, -14.23f)
                arcTo(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.63f, 4.44f)
                close()
                moveTo(15f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11f)
                close()
                moveTo(17f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 14f)
                close()
                moveTo(19f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
                close()
            }
        }.also { _Lemon = it}
