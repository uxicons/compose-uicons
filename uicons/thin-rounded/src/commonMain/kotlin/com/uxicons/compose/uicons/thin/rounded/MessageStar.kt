package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageStar: ImageVector? = null

val Icons.Tr.MessageStar: ImageVector
    get() = _MessageStar ?: UXIcon(name = "MessageStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.56f, 0f, 4.5f, -2.94f, 4.5f, -4.5f)
                verticalLineToRelative(-7.5f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.14f, -0.06f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(16.99f, 10.02f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.06f, -2.85f)
                curveToRelative(-0.25f, -0.79f, -1.63f, -0.79f, -1.88f, 0f)
                lineToRelative(-1.06f, 2.85f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.92f, -0.03f, -1.35f, 1.2f, -0.63f, 1.77f)
                lineToRelative(2.36f, 1.92f)
                lineToRelative(-0.94f, 3.02f)
                curveToRelative(-0.29f, 0.86f, 0.78f, 1.66f, 1.52f, 1.14f)
                lineToRelative(2.71f, -1.81f)
                lineToRelative(2.75f, 1.79f)
                curveToRelative(0.75f, 0.51f, 1.81f, -0.29f, 1.5f, -1.16f)
                lineToRelative(-0.98f, -2.98f)
                lineToRelative(2.38f, -1.94f)
                curveToRelative(0.69f, -0.56f, 0.24f, -1.79f, -0.66f, -1.75f)
                close()
                moveTo(14.37f, 13.15f)
                curveToRelative(-0.16f, 0.13f, -0.22f, 0.35f, -0.16f, 0.54f)
                lineToRelative(1.08f, 3.32f)
                lineToRelative(-3.03f, -1.97f)
                curveToRelative(-0.17f, -0.11f, -0.39f, -0.11f, -0.55f, 0.0f)
                lineToRelative(-2.96f, 1.97f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(1.04f, -3.33f)
                curveToRelative(0.06f, -0.2f, -0.0f, -0.41f, -0.16f, -0.54f)
                lineToRelative(-2.63f, -2.13f)
                reflectiveCurveToRelative(0.0f, -0.0f, 0.01f, -0.0f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.21f, 0f, 0.4f, -0.13f, 0.47f, -0.33f)
                lineToRelative(1.19f, -3.17f)
                lineToRelative(1.18f, 3.17f)
                curveToRelative(0.07f, 0.2f, 0.26f, 0.33f, 0.47f, 0.33f)
                lineToRelative(3.37f, -0.01f)
                lineToRelative(-2.64f, 2.15f)
                close()
            }
        }.also { _MessageStar = it}
