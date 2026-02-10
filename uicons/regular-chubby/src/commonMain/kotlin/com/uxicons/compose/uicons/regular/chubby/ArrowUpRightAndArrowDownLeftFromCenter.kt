package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null

val Icons.Rc.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() = _ArrowUpRightAndArrowDownLeftFromCenter ?: UXIcon(name = "ArrowUpRightAndArrowDownLeftFromCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.71f, 13.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-6.17f, 6.17f)
                curveToRelative(-0.19f, -1.13f, -0.24f, -2.86f, 0.43f, -4.97f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                curveToRelative(-1.46f, 4.59f, 0.01f, 7.78f, 0.07f, 7.92f)
                curveToRelative(0.1f, 0.21f, 0.27f, 0.38f, 0.47f, 0.47f)
                curveToRelative(0.09f, 0.04f, 1.55f, 0.72f, 3.89f, 0.72f)
                curveToRelative(1.15f, 0f, 2.51f, -0.16f, 4.03f, -0.65f)
                curveToRelative(0.53f, -0.17f, 0.82f, -0.73f, 0.65f, -1.26f)
                curveToRelative(-0.17f, -0.53f, -0.73f, -0.82f, -1.26f, -0.65f)
                curveToRelative(-2.11f, 0.67f, -3.83f, 0.62f, -4.97f, 0.43f)
                lineToRelative(6.17f, -6.17f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.29f, 10.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(6.17f, -6.17f)
                curveToRelative(0.19f, 1.13f, 0.24f, 2.86f, -0.43f, 4.97f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(0.53f, 0.17f, 1.09f, -0.12f, 1.26f, -0.65f)
                curveToRelative(1.46f, -4.59f, -0.01f, -7.78f, -0.07f, -7.92f)
                curveToRelative(-0.1f, -0.21f, -0.27f, -0.38f, -0.47f, -0.47f)
                curveToRelative(-0.09f, -0.04f, -1.55f, -0.72f, -3.89f, -0.72f)
                curveToRelative(-1.15f, 0f, -2.51f, 0.16f, -4.03f, 0.65f)
                curveToRelative(-0.53f, 0.17f, -0.82f, 0.73f, -0.65f, 1.26f)
                curveToRelative(0.17f, 0.53f, 0.73f, 0.82f, 1.26f, 0.65f)
                curveToRelative(2.11f, -0.67f, 3.83f, -0.62f, 4.97f, -0.43f)
                lineToRelative(-6.17f, 6.17f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _ArrowUpRightAndArrowDownLeftFromCenter = it}
