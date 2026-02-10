package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Sr.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-3.19f, -3.19f)
                curveToRelative(0.92f, -0.75f, 1.48f, -1.88f, 1.48f, -3.11f)
                verticalLineTo(6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineTo(6f)
                curveToRelative(-0.72f, 0f, -1.42f, 0.19f, -2.03f, 0.55f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(3.71f, 7.89f)
                curveToRelative(-0.28f, -0.29f, -0.72f, -0.38f, -1.09f, -0.22f)
                reflectiveCurveToRelative(-0.62f, 0.52f, -0.62f, 0.93f)
                verticalLineToRelative(7.41f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1.77f)
                lineToRelative(3.02f, 2.54f)
                curveToRelative(0.35f, 0.31f, 0.79f, 0.46f, 1.22f, 0.46f)
                curveToRelative(0.42f, 0f, 0.84f, -0.15f, 1.16f, -0.43f)
                lineToRelative(1.97f, -1.59f)
                curveToRelative(0.22f, -0.18f, 0.35f, -0.44f, 0.37f, -0.72f)
                curveToRelative(0.02f, -0.28f, -0.09f, -0.56f, -0.29f, -0.76f)
                lineTo(3.71f, 7.89f)
                close()
            }
        }.also { _MessageSlash = it}
