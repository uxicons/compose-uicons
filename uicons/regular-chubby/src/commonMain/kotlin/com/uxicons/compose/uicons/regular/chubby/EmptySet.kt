package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Rc.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 1.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.43f, 2.43f)
                curveToRelative(-1.61f, -1.17f, -3.86f, -1.73f, -6.86f, -1.73f)
                curveToRelative(-7.01f, 0f, -10f, 2.99f, -10f, 10f)
                curveToRelative(0f, 3.0f, 0.55f, 5.25f, 1.73f, 6.86f)
                lineToRelative(-2.43f, 2.43f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.43f, -2.43f)
                curveToRelative(1.61f, 1.17f, 3.86f, 1.73f, 6.86f, 1.73f)
                curveToRelative(7.01f, 0f, 10f, -2.99f, 10f, -10f)
                curveToRelative(0f, -3.0f, -0.55f, -5.25f, -1.73f, -6.86f)
                lineToRelative(2.43f, -2.43f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -5.91f, 2.09f, -8f, 8f, -8f)
                curveToRelative(2.4f, 0f, 4.17f, 0.35f, 5.42f, 1.16f)
                lineToRelative(-12.26f, 12.26f)
                curveToRelative(-0.81f, -1.26f, -1.16f, -3.02f, -1.16f, -5.42f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 5.91f, -2.09f, 8f, -8f, 8f)
                curveToRelative(-2.4f, 0f, -4.17f, -0.35f, -5.42f, -1.16f)
                lineToRelative(12.26f, -12.26f)
                curveToRelative(0.81f, 1.26f, 1.16f, 3.02f, 1.16f, 5.42f)
                close()
            }
        }.also { _EmptySet = it}
