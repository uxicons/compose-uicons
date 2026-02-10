package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashXmark: ImageVector? = null

val Icons.Br.TrashXmark: ImageVector
    get() = _TrashXmark ?: UXIcon(name = "TrashXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.56f, 11.56f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(24f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.62f)
            lineToRelative(-1.08f, 12.96f)
            curveToRelative(-0.23f, 2.83f, -2.64f, 5.04f, -5.48f, 5.04f)
            horizontalLineToRelative(-6.64f)
            curveToRelative(-2.84f, 0f, -5.25f, -2.21f, -5.48f, -5.04f)
            lineToRelative(-1.08f, -12.96f)
            horizontalLineToRelative(-0.62f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18.87f, 6f)
            lineTo(5.13f, 6f)
            lineToRelative(1.06f, 12.71f)
            curveToRelative(0.11f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
            horizontalLineToRelative(6.64f)
            curveToRelative(1.29f, 0f, 2.38f, -1.01f, 2.49f, -2.29f)
            lineToRelative(1.06f, -12.71f)
            close()
        }
    }.also { _TrashXmark = it }
