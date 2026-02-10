package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteRight: ImageVector? = null

val Icons.Sc.DeleteRight: ImageVector
    get() = _DeleteRight ?: UXIcon(name = "DeleteRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.84f, 11.46f)
                curveToRelative(-2.01f, -3.15f, -4.61f, -5.91f, -7.73f, -8.2f)
                curveToRelative(-0.16f, -0.12f, -0.35f, -0.18f, -0.54f, -0.19f)
                curveToRelative(-0.79f, -0.04f, -1.64f, -0.07f, -2.57f, -0.07f)
                curveToRelative(-6.09f, 0f, -9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.3f, 0.1f, -0.53f, 0.33f, -0.63f, 0.63f)
                curveToRelative(-0.04f, 0.13f, -1.05f, 3.2f, -1.05f, 7.32f)
                reflectiveCurveToRelative(1.01f, 7.19f, 1.05f, 7.32f)
                curveToRelative(0.1f, 0.3f, 0.33f, 0.53f, 0.63f, 0.63f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 9.32f, 1.05f)
                curveToRelative(0.93f, 0f, 1.78f, -0.03f, 2.57f, -0.07f)
                curveToRelative(0.2f, -0.01f, 0.39f, -0.08f, 0.54f, -0.19f)
                curveToRelative(3.11f, -2.3f, 5.71f, -5.06f, 7.73f, -8.2f)
                curveToRelative(0.21f, -0.33f, 0.21f, -0.75f, 0f, -1.08f)
                close()
                moveTo(13.21f, 13.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                close()
            }
        }.also { _DeleteRight = it}
