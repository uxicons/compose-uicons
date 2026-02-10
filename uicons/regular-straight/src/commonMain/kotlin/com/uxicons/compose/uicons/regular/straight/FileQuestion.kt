package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileQuestion: ImageVector? = null

val Icons.Rs.FileQuestion: ImageVector
    get() = _FileQuestion ?: UXIcon(name = "FileQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(15f, 3.41f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12.93f, 10.09f)
                curveToRelative(1.25f, 0.33f, 2.23f, 1.36f, 2.49f, 2.64f)
                curveToRelative(0.33f, 1.56f, -0.4f, 3.1f, -1.79f, 3.84f)
                curveToRelative(-0.15f, 0.08f, -0.63f, 0.37f, -0.63f, 0.88f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -1.1f, 0.63f, -2.09f, 1.7f, -2.65f)
                curveToRelative(0.5f, -0.26f, 0.93f, -0.88f, 0.77f, -1.66f)
                curveToRelative(-0.11f, -0.52f, -0.54f, -0.98f, -1.04f, -1.11f)
                curveToRelative(-0.47f, -0.12f, -0.94f, -0.03f, -1.32f, 0.26f)
                curveToRelative(-0.38f, 0.29f, -0.6f, 0.75f, -0.6f, 1.22f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -1.09f, 0.52f, -2.14f, 1.38f, -2.81f)
                curveToRelative(0.86f, -0.67f, 1.97f, -0.89f, 3.05f, -0.61f)
                close()
            }
        }.also { _FileQuestion = it}
