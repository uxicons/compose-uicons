package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Rc.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.8f, 12.4f)
                curveToRelative(-0.01f, 0f, -0.01f, -0.0f, -0.02f, -0.0f)
                curveToRelative(-0.64f, -0.1f, -3.98f, -0.46f, -7.26f, 1.54f)
                curveToRelative(-0.38f, 0.23f, -0.56f, 0.7f, -0.44f, 1.13f)
                curveToRelative(0.02f, 0.08f, 0.46f, 1.58f, 1.45f, 2.92f)
                lineToRelative(-3.23f, 3.17f)
                curveToRelative(-0.39f, 0.39f, -0.41f, 1.03f, -0.01f, 1.42f)
                curveToRelative(0.51f, 0.5f, 1.17f, 0.28f, 1.42f, 0.01f)
                lineToRelative(3.25f, -3.19f)
                curveToRelative(1.45f, 1.05f, 3.04f, 1.47f, 3.27f, 1.47f)
                curveToRelative(0.34f, -0.01f, 0.67f, -0.17f, 0.85f, -0.47f)
                curveToRelative(2.14f, -3.45f, 1.59f, -7.01f, 1.56f, -7.16f)
                curveToRelative(-0.07f, -0.43f, -0.41f, -0.76f, -0.84f, -0.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.2f, 11.6f)
                curveToRelative(0.01f, 0f, 0.01f, 0.0f, 0.02f, 0.0f)
                curveToRelative(0.64f, 0.1f, 3.98f, 0.46f, 7.26f, -1.54f)
                curveToRelative(0.38f, -0.23f, 0.56f, -0.7f, 0.44f, -1.13f)
                curveToRelative(-0.02f, -0.08f, -0.46f, -1.58f, -1.45f, -2.92f)
                lineToRelative(3.23f, -3.17f)
                curveToRelative(0.39f, -0.39f, 0.41f, -1.03f, 0.01f, -1.42f)
                curveToRelative(-0.51f, -0.5f, -1.17f, -0.28f, -1.42f, -0.01f)
                lineToRelative(-3.25f, 3.19f)
                curveToRelative(-1.45f, -1.05f, -3.04f, -1.47f, -3.27f, -1.47f)
                curveToRelative(-0.34f, 0.01f, -0.67f, 0.17f, -0.85f, 0.47f)
                curveToRelative(-2.14f, 3.45f, -1.59f, 7.01f, -1.56f, 7.16f)
                curveToRelative(0.07f, 0.43f, 0.41f, 0.76f, 0.84f, 0.83f)
                close()
            }
        }.also { _DownLeftAndUpRightToCenter = it}
