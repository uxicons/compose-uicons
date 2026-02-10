package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeftAndUpRightToCenter: ImageVector? = null

val Icons.Br.DownLeftAndUpRightToCenter: ImageVector
    get() = _DownLeftAndUpRightToCenter ?: UXIcon(name = "DownLeftAndUpRightToCenter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 2.56f)
            lineToRelative(-4.29f, 4.29f)
            lineToRelative(2.54f, 2.54f)
            curveToRelative(0.57f, 0.57f, 0.16f, 1.56f, -0.66f, 1.57f)
            lineToRelative(-7.24f, 0.05f)
            curveToRelative(-0.51f, 0.0f, -0.91f, -0.4f, -0.91f, -0.91f)
            lineToRelative(0.05f, -7.24f)
            curveToRelative(0.01f, -0.82f, 1.0f, -1.23f, 1.57f, -0.66f)
            lineToRelative(2.54f, 2.54f)
            lineTo(21.44f, 0.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(10.09f, 13f)
            lineToRelative(-7.24f, 0.05f)
            curveToRelative(-0.82f, 0.01f, -1.23f, 0.99f, -0.66f, 1.57f)
            lineToRelative(2.54f, 2.54f)
            lineTo(0.44f, 21.44f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(4.29f, -4.29f)
            lineToRelative(2.54f, 2.54f)
            curveToRelative(0.57f, 0.57f, 1.56f, 0.16f, 1.57f, -0.66f)
            lineToRelative(0.05f, -7.24f)
            curveToRelative(0.0f, -0.51f, -0.4f, -0.91f, -0.91f, -0.91f)
            close()
        }
    }.also { _DownLeftAndUpRightToCenter = it }
