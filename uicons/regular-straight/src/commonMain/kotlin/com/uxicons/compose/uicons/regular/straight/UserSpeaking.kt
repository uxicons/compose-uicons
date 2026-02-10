package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSpeaking: ImageVector? = null

val Icons.Rs.UserSpeaking: ImageVector
    get() = _UserSpeaking ?: UXIcon(name = "UserSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.36f, 23.86f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(2.73f, -2.73f, 2.73f, -7.17f, 0f, -9.9f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                close()
                moveTo(18.53f, 13.97f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                close()
                moveTo(11.8f, 4.42f)
                curveTo(9.36f, 1.16f, 5.49f, -0.44f, 1.45f, 0.1f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.49f, 0.07f, -0.98f, 0.17f, -1.45f, 0.3f)
                lineTo(0f, 2.53f)
                curveToRelative(0.56f, -0.2f, 1.14f, -0.36f, 1.73f, -0.44f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(3.31f, -0.46f, 6.48f, 0.86f, 8.5f, 3.56f)
                curveToRelative(1.03f, 1.28f, 2.15f, 3.83f, 3.22f, 6.29f)
                lineToRelative(0.47f, 1.06f)
                horizontalLineToRelative(-1.99f)
                lineToRelative(-0.68f, 5.13f)
                curveToRelative(-0.07f, 0.5f, -0.49f, 0.87f, -0.99f, 0.87f)
                lineTo(6f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(8f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.98f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                lineToRelative(-0.72f, -1.65f)
                curveToRelative(-1.18f, -2.71f, -2.29f, -5.26f, -3.48f, -6.72f)
                close()
            }
        }.also { _UserSpeaking = it}
