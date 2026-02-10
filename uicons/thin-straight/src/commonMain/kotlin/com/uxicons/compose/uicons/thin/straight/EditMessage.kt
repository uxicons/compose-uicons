package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditMessage: ImageVector? = null

val Icons.Ts.EditMessage: ImageVector
    get() = _EditMessage ?: UXIcon(name = "EditMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7.36f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(13.64f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                lineTo(0f, 20f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(15.14f)
                lineToRelative(-1f, 1f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 19f)
                lineTo(7.47f, 19f)
                lineToRelative(4.19f, 3.53f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0.01f)
                lineToRelative(4.28f, -3.54f)
                horizontalLineToRelative(6.39f)
                lineTo(23.0f, 7.36f)
                close()
                moveTo(11f, 9.46f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.98f, -0.98f, 2.56f, -0.97f, 3.54f, 0f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                reflectiveCurveToRelative(-0.26f, 1.3f, -0.73f, 1.77f)
                lineTo(14.54f, 13f)
                horizontalLineToRelative(-3.54f)
                verticalLineToRelative(-3.54f)
                close()
                moveTo(12f, 12.0f)
                horizontalLineToRelative(2.12f)
                lineTo(22.56f, 3.56f)
                curveToRelative(0.28f, -0.28f, 0.44f, -0.66f, 0.44f, -1.06f)
                reflectiveCurveToRelative(-0.16f, -0.78f, -0.44f, -1.06f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineTo(12f, 9.88f)
                verticalLineToRelative(2.12f)
                close()
            }
        }.also { _EditMessage = it}
