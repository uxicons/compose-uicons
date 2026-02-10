package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSpeaking: ImageVector? = null

val Icons.Ss.UserSpeaking: ImageVector
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
                moveTo(15.28f, 11.14f)
                lineToRelative(0.72f, 1.65f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.98f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 0.41f)
                curveTo(0.48f, 0.28f, 0.96f, 0.17f, 1.45f, 0.11f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                curveTo(5.49f, -0.44f, 9.36f, 1.16f, 11.8f, 4.42f)
                curveToRelative(1.18f, 1.46f, 2.3f, 4.02f, 3.48f, 6.72f)
                close()
            }
        }.also { _UserSpeaking = it}
