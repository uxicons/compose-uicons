package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorCircle: ImageVector? = null

val Icons.Br.VectorCircle: ImageVector
    get() = _VectorCircle ?: UXIcon(name = "VectorCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.61f, 9.1f)
            curveToRelative(-1.02f, -3.73f, -3.97f, -6.68f, -7.71f, -7.71f)
            curveToRelative(-0.26f, -0.81f, -1.01f, -1.39f, -1.91f, -1.39f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.89f, 0f, -1.65f, 0.58f, -1.91f, 1.39f)
            curveToRelative(-3.73f, 1.02f, -6.68f, 3.97f, -7.71f, 7.71f)
            curveToRelative(-0.81f, 0.26f, -1.39f, 1.01f, -1.39f, 1.91f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.89f, 0.58f, 1.65f, 1.39f, 1.91f)
            curveToRelative(1.02f, 3.73f, 3.97f, 6.68f, 7.71f, 7.71f)
            curveToRelative(0.26f, 0.81f, 1.01f, 1.39f, 1.91f, 1.39f)
            horizontalLineToRelative(2f)
            curveToRelative(0.89f, 0f, 1.65f, -0.58f, 1.91f, -1.39f)
            curveToRelative(3.73f, -1.02f, 6.68f, -3.97f, 7.71f, -7.71f)
            curveToRelative(0.81f, -0.26f, 1.39f, -1.01f, 1.39f, -1.91f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.89f, -0.58f, -1.65f, -1.39f, -1.91f)
            close()
            moveTo(14.92f, 19.45f)
            curveToRelative(-0.24f, -0.84f, -1.01f, -1.45f, -1.92f, -1.45f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.91f, 0f, -1.68f, 0.61f, -1.92f, 1.45f)
            curveToRelative(-2.06f, -0.81f, -3.71f, -2.46f, -4.53f, -4.53f)
            curveToRelative(0.84f, -0.24f, 1.45f, -1.01f, 1.45f, -1.92f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.91f, -0.61f, -1.68f, -1.45f, -1.92f)
            curveToRelative(0.81f, -2.06f, 2.46f, -3.71f, 4.53f, -4.53f)
            curveToRelative(0.24f, 0.84f, 1.01f, 1.45f, 1.92f, 1.45f)
            horizontalLineToRelative(2f)
            curveToRelative(0.91f, 0f, 1.68f, -0.61f, 1.92f, -1.45f)
            curveToRelative(2.06f, 0.81f, 3.71f, 2.46f, 4.53f, 4.53f)
            curveToRelative(-0.84f, 0.24f, -1.45f, 1.01f, -1.45f, 1.92f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.91f, 0.61f, 1.68f, 1.45f, 1.92f)
            curveToRelative(-0.81f, 2.06f, -2.46f, 3.71f, -4.53f, 4.53f)
            close()
        }
    }.also { _VectorCircle = it }
