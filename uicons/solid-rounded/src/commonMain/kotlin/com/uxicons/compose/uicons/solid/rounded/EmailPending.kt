package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Sr.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(19.59f, 7f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.59f)
                lineToRelative(1f, 1f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
                moveTo(9.98f, 14.12f)
                lineTo(0.95f, 5.09f)
                curveToRelative(0.91f, -1.26f, 2.38f, -2.09f, 4.05f, -2.09f)
                horizontalLineToRelative(7.29f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.06f, 1.98f, 5.67f, 4.73f, 6.62f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                close()
                moveTo(24f, 9.89f)
                verticalLineToRelative(9.11f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.32f, 0.04f, -0.64f, 0.1f, -0.94f)
                lineToRelative(8.48f, 8.48f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(3.54f, -3.54f)
                curveToRelative(1.88f, -0.05f, 3.58f, -0.84f, 4.81f, -2.1f)
                close()
            }
        }.also { _EmailPending = it}
