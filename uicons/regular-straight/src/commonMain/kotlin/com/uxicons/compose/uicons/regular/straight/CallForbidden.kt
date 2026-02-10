package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallForbidden: ImageVector? = null

val Icons.Rs.CallForbidden: ImageVector
    get() = _CallForbidden ?: UXIcon(name = "CallForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.4f, 0f, 4.6f, 0.85f, 6.33f, 2.26f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-1.59f, -1.27f, -3.56f, -1.97f, -5.62f, -1.97f)
                verticalLineToRelative(2f)
                curveToRelative(1.53f, 0f, 2.98f, 0.49f, 4.19f, 1.4f)
                lineToRelative(-1.44f, 1.44f)
                curveToRelative(-0.81f, -0.54f, -1.76f, -0.83f, -2.75f, -0.83f)
                verticalLineToRelative(2f)
                curveToRelative(0.45f, 0f, 0.89f, 0.11f, 1.29f, 0.3f)
                lineToRelative(-4.1f, 4.1f)
                curveToRelative(-0.42f, -0.56f, -0.79f, -1.19f, -1.07f, -1.92f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -0.8f, 1.25f, -0.8f, 1.96f)
                curveToRelative(0f, 1.66f, 0.92f, 3.47f, 2.24f, 5.01f)
                lineToRelative(-1.98f, 1.98f)
                curveToRelative(-1.41f, -1.73f, -2.26f, -3.93f, -2.26f, -6.33f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.4f, 0f, -4.6f, -0.85f, -6.32f, -2.26f)
                lineTo(19.74f, 5.68f)
                curveToRelative(1.41f, 1.73f, 2.26f, 3.93f, 2.26f, 6.32f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(13.29f, 15.12f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -1.25f, 0.8f, -1.96f, 0.8f)
                curveToRelative(-1.07f, 0f, -2.19f, -0.38f, -3.27f, -0.99f)
                lineToRelative(3.89f, -3.89f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.82f, -0.14f, -1.6f, -0.41f, -2.35f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(0.57f, 1.19f, 0.88f, 2.51f, 0.88f, 3.88f)
                close()
            }
        }.also { _CallForbidden = it}
