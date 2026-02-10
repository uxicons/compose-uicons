package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailRefresh: ImageVector? = null

val Icons.Ss.EmailRefresh: ImageVector
    get() = _EmailRefresh ?: UXIcon(name = "EmailRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                lineTo(24f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.96f, -1.96f)
                curveToRelative(-0.63f, -0.64f, -1.5f, -1.04f, -2.46f, -1.04f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0f, 2.58f, -0.82f, 3.15f, -2f)
                horizontalLineToRelative(2.14f)
                curveToRelative(-0.66f, 2.31f, -2.77f, 4f, -5.29f, 4f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveTo(15.47f, 0f, 18.5f, 0f)
                curveToRelative(1.52f, 0f, 2.88f, 0.62f, 3.88f, 1.62f)
                lineToRelative(1.62f, -1.62f)
                close()
                moveTo(18.09f, 12.98f)
                lineToRelative(-2.56f, 2.56f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(0f, 7.07f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.59f)
                curveToRelative(-1.37f, 1.48f, -3.32f, 2.41f, -5.5f, 2.41f)
                curveToRelative(-0.14f, 0f, -0.27f, -0.01f, -0.41f, -0.02f)
                close()
                moveTo(14.12f, 14.12f)
                lineToRelative(1.64f, -1.64f)
                curveToRelative(-2.79f, -1.09f, -4.76f, -3.8f, -4.76f, -6.98f)
                curveToRelative(0f, -0.88f, 0.16f, -1.72f, 0.44f, -2.5f)
                lineTo(3f, 3f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineTo(9.88f, 14.12f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
            }
        }.also { _EmailRefresh = it}
