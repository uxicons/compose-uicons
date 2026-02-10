package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Bs.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.02f, 0.98f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.73f, -0.98f)
                curveToRelative(-1.8f, 0.18f, -8f, 1.09f, -12.35f, 5.44f)
                arcToRelative(28.49f, 28.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.49f, 12.46f)
                lineToRelative(-0.3f, 0.88f)
                lineToRelative(5.07f, 5.07f)
                lineToRelative(0.88f, -0.29f)
                arcToRelative(28.5f, 28.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.46f, -7.49f)
                curveToRelative(4.36f, -4.36f, 5.27f, -10.56f, 5.44f, -12.35f)
                arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -2.73f)
                close()
                moveTo(16.44f, 13.94f)
                arcToRelative(25.2f, 25.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.41f, 6.47f)
                lineToRelative(-0.16f, -0.16f)
                lineToRelative(11.69f, -11.69f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-11.69f, 11.69f)
                lineToRelative(-0.16f, -0.16f)
                arcToRelative(25.2f, 25.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.47f, -10.41f)
                curveToRelative(3.65f, -3.65f, 8.97f, -4.42f, 10.52f, -4.58f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.12f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, 0.32f)
                curveToRelative(-0.15f, 1.55f, -0.93f, 6.87f, -4.58f, 10.52f)
                close()
            }
        }.also { _Surfing = it}
