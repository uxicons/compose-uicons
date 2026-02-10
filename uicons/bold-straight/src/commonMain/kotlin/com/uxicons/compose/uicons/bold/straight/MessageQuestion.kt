package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageQuestion: ImageVector? = null

val Icons.Bs.MessageQuestion: ImageVector
    get() = _MessageQuestion ?: UXIcon(name = "MessageQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.74f)
                lineToRelative(3.6f, 3.03f)
                curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
                curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
                lineToRelative(3.71f, -3.06f)
                horizontalLineToRelative(6.67f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 17f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.24f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                lineTo(3f, 17f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(10.5f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15.87f, 6.96f)
                curveToRelative(0.49f, 1.89f, -0.43f, 3.86f, -2.19f, 4.67f)
                curveToRelative(-0.09f, 0.04f, -0.18f, 0.2f, -0.18f, 0.4f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.35f, 0.75f, -2.58f, 1.92f, -3.12f)
                curveToRelative(0.38f, -0.17f, 0.69f, -0.61f, 0.54f, -1.2f)
                curveToRelative(-0.08f, -0.31f, -0.36f, -0.59f, -0.67f, -0.67f)
                curveToRelative(-0.44f, -0.11f, -0.76f, 0.06f, -0.9f, 0.17f)
                curveToRelative(-0.25f, 0.19f, -0.39f, 0.48f, -0.39f, 0.79f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.25f, 0.56f, -2.4f, 1.55f, -3.16f)
                curveToRelative(0.98f, -0.76f, 2.25f, -1.02f, 3.49f, -0.7f)
                curveToRelative(1.36f, 0.35f, 2.47f, 1.46f, 2.83f, 2.83f)
                close()
            }
        }.also { _MessageQuestion = it}
