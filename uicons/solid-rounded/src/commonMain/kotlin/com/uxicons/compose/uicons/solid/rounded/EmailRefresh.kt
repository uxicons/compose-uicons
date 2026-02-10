package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailRefresh: ImageVector? = null

val Icons.Sr.EmailRefresh: ImageVector
    get() = _EmailRefresh ?: UXIcon(name = "EmailRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1.24f)
                lineTo(24f, 3.89f)
                curveToRelative(0f, 0.61f, -0.5f, 1.11f, -1.11f, 1.11f)
                horizontalLineToRelative(-2.65f)
                curveToRelative(-0.66f, 0f, -0.98f, -0.79f, -0.52f, -1.26f)
                lineToRelative(0.96f, -0.96f)
                curveToRelative(-0.61f, -0.5f, -1.38f, -0.78f, -2.2f, -0.78f)
                curveToRelative(-1.92f, 0f, -3.48f, 1.56f, -3.48f, 3.48f)
                reflectiveCurveToRelative(1.56f, 3.48f, 3.48f, 3.48f)
                curveToRelative(1.15f, 0f, 2.23f, -0.57f, 2.88f, -1.52f)
                curveToRelative(0.31f, -0.46f, 0.93f, -0.57f, 1.39f, -0.26f)
                curveToRelative(0.46f, 0.31f, 0.57f, 0.93f, 0.26f, 1.39f)
                curveToRelative(-1.02f, 1.5f, -2.72f, 2.39f, -4.53f, 2.39f)
                curveToRelative(-3.02f, 0f, -5.48f, -2.46f, -5.48f, -5.48f)
                reflectiveCurveTo(15.46f, 0f, 18.48f, 0f)
                curveToRelative(1.36f, 0f, 2.62f, 0.49f, 3.61f, 1.37f)
                lineToRelative(0.65f, -0.65f)
                curveToRelative(0.46f, -0.46f, 1.26f, -0.14f, 1.26f, 0.52f)
                close()
                moveTo(12f, 15.42f)
                curveToRelative(0.77f, 0f, 1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(-2.95f, -1.01f, -5.08f, -3.8f, -5.08f, -7.09f)
                curveToRelative(0f, -0.88f, 0.16f, -1.72f, 0.44f, -2.5f)
                lineTo(5f, 3f)
                curveToRelative(-1.81f, 0f, -3.38f, 0.97f, -4.26f, 2.41f)
                lineTo(9.88f, 14.55f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                close()
                moveTo(18.5f, 13f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.0f, 0f)
                lineToRelative(-2.96f, 2.96f)
                curveToRelative(-0.97f, 0.97f, -2.25f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(0.05f, 7.54f)
                curveToRelative(-0.01f, 0.15f, -0.05f, 0.3f, -0.05f, 0.46f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineToRelative(-0.01f, -8.4f)
                curveToRelative(-1.37f, 1.47f, -3.32f, 2.4f, -5.49f, 2.4f)
                close()
            }
        }.also { _EmailRefresh = it}
