package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Tr.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 8.72f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.95f, -1.09f, -2.33f, -1.72f, -3.77f, -1.72f)
                horizontalLineToRelative(-4.87f)
                lineToRelative(0.81f, -2.83f)
                curveToRelative(0.57f, -3.01f, -3.89f, -4.45f, -5.15f, -1.6f)
                lineToRelative(-2.8f, 4.43f)
                horizontalLineToRelative(-2.48f)
                curveTo(2.02f, 7f, 0f, 9.02f, 0f, 11.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13.79f)
                curveToRelative(2.48f, 0f, 4.61f, -1.85f, 4.95f, -4.3f)
                lineToRelative(0.7f, -5f)
                curveToRelative(0.2f, -1.44f, -0.23f, -2.88f, -1.18f, -3.98f)
                close()
                moveTo(1f, 17.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.01f, 13f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22.96f, 12.56f)
                lineToRelative(-0.7f, 5f)
                curveToRelative(-0.28f, 1.96f, -1.98f, 3.44f, -3.96f, 3.44f)
                lineTo(8f, 21f)
                lineToRelative(0.01f, -13.75f)
                lineToRelative(2.65f, -4.19f)
                curveToRelative(0.77f, -1.87f, 3.6f, -0.98f, 3.31f, 0.9f)
                lineToRelative(-0.98f, 3.41f)
                curveToRelative(-0.04f, 0.15f, -0.01f, 0.31f, 0.08f, 0.44f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.2f, 0.4f, 0.2f)
                horizontalLineToRelative(5.53f)
                curveToRelative(2.36f, -0.05f, 4.34f, 2.23f, 3.96f, 4.56f)
                close()
            }
        }.also { _SocialNetwork = it}
