package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessagesQuestion: ImageVector? = null

val Icons.Ss.MessagesQuestion: ImageVector
    get() = _MessagesQuestion ?: UXIcon(name = "MessagesQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 17f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(14.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.13f, 1.89f)
                curveToRelative(0.32f, 0.17f, 0.67f, 0.26f, 1.01f, 0.26f)
                curveToRelative(0.42f, 0f, 0.83f, -0.12f, 1.19f, -0.36f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(10.7f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.07f, 3.7f)
                curveToRelative(0.68f, -0.57f, 1.58f, -0.81f, 2.46f, -0.65f)
                curveToRelative(1.21f, 0.21f, 2.2f, 1.21f, 2.42f, 2.42f)
                curveToRelative(0.22f, 1.27f, -0.38f, 2.54f, -1.51f, 3.16f)
                curveToRelative(-0.45f, 0.25f, -0.45f, 0.49f, -0.45f, 0.87f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.31f, 1.04f, -1.88f, 1.48f, -2.12f)
                curveToRelative(0.29f, -0.16f, 0.59f, -0.54f, 0.5f, -1.07f)
                curveToRelative(-0.07f, -0.39f, -0.4f, -0.72f, -0.79f, -0.79f)
                curveToRelative(-0.31f, -0.06f, -0.6f, 0.02f, -0.83f, 0.22f)
                curveToRelative(-0.23f, 0.19f, -0.36f, 0.47f, -0.36f, 0.77f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.07f, -2.3f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(14.85f)
                curveToRelative(0f, 0.79f, -0.43f, 1.52f, -1.13f, 1.89f)
                curveToRelative(-0.32f, 0.17f, -0.67f, 0.26f, -1.01f, 0.26f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.12f, -1.19f, -0.36f)
                lineToRelative(-3.96f, -2.64f)
                lineTo(6f, 21f)
                verticalLineToRelative(-0.73f)
                lineToRelative(1.91f, -1.27f)
                horizontalLineToRelative(12.09f)
                lineTo(20f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _MessagesQuestion = it}
