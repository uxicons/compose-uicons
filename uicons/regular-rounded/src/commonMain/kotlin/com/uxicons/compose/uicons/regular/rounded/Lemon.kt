package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lemon: ImageVector? = null

val Icons.Rr.Lemon: ImageVector
    get() = _Lemon ?: UXIcon(name = "Lemon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                close()
                moveTo(15f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9f)
                close()
                moveTo(19f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
                moveTo(23.53f, 5.9f)
                curveTo(26.19f, 17.55f, 17.54f, 26.19f, 5.9f, 23.53f)
                curveToRelative(-0.95f, -0.38f, -1.9f, 0.51f, -2.9f, 0.47f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 19.55f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, -1.48f)
                curveToRelative(-0.9f, -4.56f, -0.88f, -9.43f, 3.4f, -14.2f)
                curveTo(8.63f, -0.4f, 13.51f, -0.42f, 18.07f, 0.48f)
                arcToRelative(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.48f, -0.1f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3f)
                curveTo(24.04f, 4f, 23.15f, 4.94f, 23.53f, 5.9f)
                close()
                moveTo(21.88f, 3.48f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                curveToRelative(-1.1f, 0.34f, -2.08f, 0.83f, -3.41f, 0.42f)
                curveTo(9.42f, 0.48f, 1.9f, 5.23f, 2.0f, 14.01f)
                curveToRelative(-0.23f, 2.09f, 1.22f, 4.6f, 0.12f, 6.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, 1.36f)
                curveTo(5.4f, 20.8f, 7.87f, 22.24f, 9.99f, 22f)
                curveToRelative(2.06f, -0.03f, 5.93f, -0.49f, 8.72f, -3.28f)
                reflectiveCurveTo(21.97f, 12.05f, 22f, 9.99f)
                curveTo(22.23f, 7.86f, 20.8f, 5.4f, 21.88f, 3.48f)
                close()
            }
        }.also { _Lemon = it}
