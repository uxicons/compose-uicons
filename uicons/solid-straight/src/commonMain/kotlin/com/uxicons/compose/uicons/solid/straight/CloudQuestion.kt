package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudQuestion: ImageVector? = null

val Icons.Ss.CloudQuestion: ImageVector
    get() = _CloudQuestion ?: UXIcon(name = "CloudQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 7.2f)
                curveToRelative(-0.82f, -3.58f, -4.05f, -6.2f, -7.8f, -6.2f)
                curveTo(5.59f, 1f, 2f, 4.59f, 2f, 9f)
                curveToRelative(0f, 1.29f, 0.3f, 2.54f, 0.88f, 3.66f)
                curveToRelative(-1.75f, 0.94f, -2.88f, 2.79f, -2.88f, 4.84f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.74f, -2.62f, -6.97f, -6.2f, -7.8f)
                close()
                moveTo(12f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.68f, 14.63f)
                curveToRelative(-0.41f, 0.19f, -0.68f, 0.67f, -0.68f, 1.2f)
                verticalLineToRelative(0.17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.17f)
                curveToRelative(0f, -1.32f, 0.72f, -2.5f, 1.84f, -3.02f)
                curveToRelative(0.73f, -0.34f, 1.39f, -1.22f, 1.09f, -2.37f)
                curveToRelative(-0.17f, -0.66f, -0.72f, -1.21f, -1.38f, -1.38f)
                curveToRelative(-0.64f, -0.17f, -1.27f, -0.04f, -1.77f, 0.34f)
                curveToRelative(-0.49f, 0.38f, -0.78f, 0.96f, -0.78f, 1.58f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.25f, 0.57f, -2.4f, 1.55f, -3.16f)
                curveToRelative(0.99f, -0.77f, 2.26f, -1.02f, 3.5f, -0.7f)
                curveToRelative(1.36f, 0.35f, 2.46f, 1.46f, 2.81f, 2.81f)
                curveToRelative(0.49f, 1.9f, -0.43f, 3.87f, -2.19f, 4.68f)
                close()
            }
        }.also { _CloudQuestion = it}
