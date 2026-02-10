package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Rr.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 6.48f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.98f, -1.39f)
                curveTo(18.62f, 0.69f, 15.75f, 0f, 14f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                curveToRelative(1.17f, 0f, 2.69f, 0.35f, 2.96f, 3.1f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.05f)
                curveTo(11.98f, 13.34f, 10.52f, 15f, 8.52f, 15f)
                curveToRelative(-0.59f, 0f, -2.39f, 0f, -3.3f, -3.94f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.65f, 9f)
                curveToRelative(-5.31f, 0.48f, -1.61f, 9.52f, 0.94f, 11.56f)
                arcTo(12.44f, 12.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.22f, 24f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.63f)
                arcTo(6.21f, 6.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.95f, 6.48f)
                close()
                moveTo(17.43f, 7.04f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 0.76f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.73f, 0f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.43f, 7.04f)
                close()
                moveTo(22f, 11.63f)
                curveToRelative(-0.5f, 13.83f, -19.87f, 13.64f, -19.99f, -0.01f)
                arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.26f, -0.11f)
                curveTo(4.31f, 16.05f, 6.7f, 17f, 8.52f, 17f)
                curveToRelative(3.1f, 0f, 5.46f, -2.55f, 5.49f, -5.94f)
                arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, -1.66f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.28f, -0.03f)
                arcTo(4.88f, 4.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11.63f)
                close()
            }
        }.also { _Pepper = it}
