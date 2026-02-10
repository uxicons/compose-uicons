package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Sc.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.57f, 1.66f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.61f, -2.12f, -0.03f)
                lineToRelative(-3.14f, 3.05f)
                curveToRelative(-1.18f, -0.73f, -2.36f, -1.04f, -2.43f, -1.05f)
                curveToRelative(-0.42f, -0.11f, -0.86f, 0.07f, -1.1f, 0.44f)
                curveToRelative(-2.05f, 3.27f, -1.52f, 6.65f, -1.49f, 6.79f)
                curveToRelative(0.11f, 0.57f, 0.57f, 0.79f, 0.87f, 0.83f)
                curveToRelative(2.1f, 0.27f, 4.79f, -0.13f, 6.92f, -1.46f)
                curveToRelative(0.38f, -0.24f, 0.57f, -0.7f, 0.44f, -1.13f)
                curveToRelative(-0.02f, -0.06f, -0.35f, -1.17f, -1.07f, -2.3f)
                lineToRelative(3.1f, -3.01f)
                curveToRelative(0.59f, -0.58f, 0.61f, -1.53f, 0.03f, -2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.42f, 22.34f)
                curveToRelative(0.58f, 0.59f, 1.53f, 0.61f, 2.12f, 0.03f)
                lineToRelative(3.14f, -3.05f)
                curveToRelative(1.18f, 0.73f, 2.36f, 1.04f, 2.43f, 1.05f)
                curveToRelative(0.42f, 0.11f, 0.86f, -0.07f, 1.1f, -0.44f)
                curveToRelative(2.05f, -3.27f, 1.52f, -6.65f, 1.49f, -6.79f)
                curveToRelative(-0.11f, -0.57f, -0.57f, -0.79f, -0.87f, -0.83f)
                curveToRelative(-2.1f, -0.27f, -4.79f, 0.13f, -6.92f, 1.46f)
                curveToRelative(-0.38f, 0.24f, -0.57f, 0.7f, -0.44f, 1.13f)
                curveToRelative(0.02f, 0.06f, 0.35f, 1.17f, 1.07f, 2.3f)
                lineToRelative(-3.1f, 3.01f)
                curveToRelative(-0.59f, 0.58f, -0.61f, 1.53f, -0.03f, 2.12f)
                close()
            }
        }.also { _DownLeftAndUpRightToCenter = it}
