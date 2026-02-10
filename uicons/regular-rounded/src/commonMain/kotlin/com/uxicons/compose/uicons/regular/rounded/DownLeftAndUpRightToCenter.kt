package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Rr.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 1.71f)
                lineToRelative(-5.41f, 5.41f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(0.51f, 0.51f, 0.14f, 1.38f, -0.58f, 1.38f)
                lineToRelative(-6.38f, 0.04f)
                curveToRelative(-0.45f, 0.0f, -0.81f, -0.36f, -0.8f, -0.8f)
                lineToRelative(0.04f, -6.38f)
                curveToRelative(0.01f, -0.72f, 0.88f, -1.09f, 1.38f, -0.58f)
                lineToRelative(2.46f, 2.46f)
                lineTo(22.29f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(10.2f, 13f)
                lineToRelative(-6.38f, 0.04f)
                curveToRelative(-0.72f, 0.01f, -1.09f, 0.88f, -0.58f, 1.38f)
                lineToRelative(2.46f, 2.46f)
                lineTo(0.29f, 22.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(5.41f, -5.41f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(0.51f, 0.51f, 1.38f, 0.14f, 1.38f, -0.58f)
                lineToRelative(0.04f, -6.38f)
                curveToRelative(0.0f, -0.45f, -0.36f, -0.81f, -0.8f, -0.8f)
                close()
            }
        }.also { _DownLeftAndUpRightToCenter = it}
